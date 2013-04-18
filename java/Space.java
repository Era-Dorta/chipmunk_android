package chipmunk.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Space {
	private ArrayList<Body> body_list = new ArrayList<Body>();
	private ArrayList<Shape> shape_list = new ArrayList<Shape>();
	private ArrayList<Runnable> function_list = new ArrayList<Runnable>();
	private Map<Object, ArrayList<Shape> > objects_by_collision_type = new HashMap<Object, ArrayList<Shape>>();
	private ArrayList<Object[]> collisions_to_do = new ArrayList<Object[]>();
	
    public Space(){
    	body_list.ensureCapacity(25); 
    	shape_list.ensureCapacity(25); 
    }
    
    public void add_body( Body b ){
    	body_list.add(b);
    }
    
    public void add_shape( Shape s ){
    	shape_list.add(s);
    	ArrayList<Shape> list = objects_by_collision_type.get(s.getCollisionType());
    	if(list == null){
    		//New type
    		list = new ArrayList<Shape>();
    		objects_by_collision_type.put(s.getCollisionType(), list);
    	}
    	list.add(s);
    }    
    
    public void remove_body( Body b ){
    	body_list.remove(b);
    }
    
    public void remove_shape( Shape s ){
    	shape_list.remove(s);
    	ArrayList<Shape> list = objects_by_collision_type.get(s.getCollisionType());
    	list.remove(s);     	
    }  
    
    public void step( float dt ){
    	
    	//Detect collisions
    	int i = 0;
    	for( Object[] collision_pair: collisions_to_do ){
    		for( Shape shape0: objects_by_collision_type.get(collision_pair[0])){
    			for( Shape shape1: objects_by_collision_type.get(collision_pair[1])){
	    			if(shape0.collides( shape1 )){
	    				function_list.get(i).run();
	    			}
    			}
    		}
    		i++;
    	}    	
    	
		//Move objects
		for(Body body: body_list){
			body.step(dt);
		}	
	
    }
    
    public class EmptyRunnable implements Runnable {
    	  public void run() {
    	  }
    	}
    
    public void add_collision_func( Object type0, Object type1){
    	System.out.printf("Empty %s %s\n", type0, type1);
    	function_list.add(new EmptyRunnable());
    	collisions_to_do.add( new Object[] {type0, type1});
    }    
    
    public void add_collision_func( Object type0, Object type1, Runnable function){
    	System.out.printf("%s %s %s\n", type0, type1, function);
    	function_list.add(function);
    	collisions_to_do.add( new Object[] {type0, type1});
    }
    
    public void setDamping( float val ){
    	
    }
}
