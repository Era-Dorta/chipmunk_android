package chipmunk.java;

import java.util.ArrayList;

public class Space {
	private ArrayList<Body> body_list = new ArrayList<Body>();
	private ArrayList<Shape> shape_list = new ArrayList<Shape>();
	private ArrayList<Runnable> function_list = new ArrayList<Runnable>();
	
    public Space(){
    	body_list.ensureCapacity(25); 
    	shape_list.ensureCapacity(25); 
    }
    
    public void add_body( Body b ){
    	body_list.add(b);
    }
    
    public void add_shape( Shape s ){
    	shape_list.add(s);
    }    
    
    public void remove_body( Body b ){
    	body_list.remove(b);
    }
    
    public void remove_shape( Shape s ){
    	shape_list.remove(s);
    }  
    
    public void step( float dt ){
    	
    	//Detect collisions
    	//TODO Change ugly loop from shape shape to 
    	//list of shapes with collision_type 0
    	//list of shapes with collision_type 1
		for(Shape shape0: shape_list){
			for(Shape shape1: shape_list){
				if(shape0 != shape1){
					if(shape0.collides( shape1 )){
						//Call user defined method
						function_list.get(0).run();
					}
				}
			}

		}	    	
    	
		//Move objects
		for(Body body: body_list){
			body.step(dt);
		}	
	
    }
    
    public void add_collision_func( int type0, int type1, Runnable function){
    	function_list.add(function);
    }
}
