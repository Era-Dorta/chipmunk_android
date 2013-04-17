package chipmunk.java;

public class Vec2 {
	private float vertices[];
	
    public Vec2( float x, float y){
    	vertices = new float[2];
    	vertices[0] = x;
    	vertices[1] = y;
    }
    
    public float getX(){
    	return vertices[0];
    }
    
    public float getY(){
    	return vertices[1];
    }    
    
    public void setX( float val){
    	vertices[0] = val;
    }
    
    public void setY(float val){
    	vertices[1] = val;
    }      
}
