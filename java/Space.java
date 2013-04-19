package chipmunk.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Space {
	//List of all bodies in space
	private ArrayList<Body> body_list = new ArrayList<Body>();
	//List of all shapes in space
	private ArrayList<Shape> shape_list = new ArrayList<Shape>();
	//List of all methods to be called when two objects collied
	private ArrayList<ChipmunkRunnable> function_list = new ArrayList<ChipmunkRunnable>();
	//Hash of shapes, each entry is: key -> collision_type, val -> list of all shapes with that collision type
	private Map<Object, ArrayList<Shape> > objects_by_collision_type = new HashMap<Object, ArrayList<Shape>>();
	//List of pairs of collision_types we must check
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
    		//Collision function has not been defined for this type
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
    	//Get a pair of types we must check
    	for( Object[] collision_pair: collisions_to_do ){
    		//Get a shape of each type and check collision
    		for( Shape shape0: objects_by_collision_type.get(collision_pair[0])){
    			for( Shape shape1: objects_by_collision_type.get(collision_pair[1])){
	    			if(shape0 != shape1 && shape0.collides( shape1 )){
	    				function_list.get(i).run(shape0, shape1);
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
    
    public class EmptyRunnable implements ChipmunkRunnable {
		public void run(Shape shape0, Shape shape1) {
		// No implementation necessary
		}

		@Override
		public void run() {
			// No implementation necessary			
		}
    }
    
    private void add_collision_func_internal(Object type0, Object type1){
    	collisions_to_do.add( new Object[] {type0, type1});
    	
    	ArrayList<Shape> list = objects_by_collision_type.get(type0);
    	if(list == null){
    		list = new ArrayList<Shape>();
    		objects_by_collision_type.put(type0, list);
    	}    	
    	list = objects_by_collision_type.get(type1);
    	if(list == null){
    		list = new ArrayList<Shape>();
    		objects_by_collision_type.put(type1, list);
    	}  	
    }
    
    public void add_collision_func( Object type0, Object type1){
    	function_list.add(new EmptyRunnable());
    	add_collision_func_internal(type0, type1);
    }    
    
    public void add_collision_func( Object type0, Object type1, ChipmunkRunnable function){
    	function_list.add(function);
    	add_collision_func_internal(type0, type1);
    }
    
    public void setDamping( float val ){
    	
    }
}
