package chipmunk.java;

public abstract class Shape {
	protected Vec2 vertices[];
	protected Vec2 currentPosition[];
	protected Body body;
	protected Object collisionType;
	
	public Object getCollisionType(){
		return collisionType;
	}
	
	public void setCollisionType( Object collisionType_ ){
		collisionType = collisionType_;
	}	
	
	public Body getBody(){
		return body;
	}
	
	public boolean collides(Shape otherShape) {
		return false;
	}

}
