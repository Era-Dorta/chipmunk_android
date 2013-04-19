package chipmunk.java;

public class Vec2 {
	private float coordinates[];
	
	public Vec2(){ 
		coordinates = new float[2];
	}
	
    public Vec2( float x, float y){
    	coordinates = new float[2];
    	coordinates[0] = x;
    	coordinates[1] = y;
    }
    
    public float getX(){
    	return coordinates[0];
    }
    
    public float getY(){
    	return coordinates[1];
    }    
    
    public void setX( float val){
    	coordinates[0] = val;
    }
    
    public void setY(float val){
    	coordinates[1] = val;
    }     

    public float get( int i){
    	return coordinates[i];
    }    
    
    public void set( int i, float val ){
    	coordinates[i] = val;
    }
    
    public void set( float[] array ){
    	coordinates[0] = array[0];
    	coordinates[1] = array[1];    	
    }
    
}
