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

	public abstract boolean collides(Poly poly);
	
	public abstract boolean collides(Segment segment);

	public abstract boolean collides(Circle circle);
	
	public boolean collides(Shape shape){
		if(shape instanceof Poly ){
			return this.collides((Poly)shape);
		}else if(shape instanceof Segment){
			return this.collides((Segment)shape);
		}else if(shape instanceof Circle){
			return this.collides((Circle)shape);
		}else{
			return false;
		}
	}

}
