package chipmunk.java;

public class Shape {
	private Vec2 vertices[];
	private Vec2 currentPosition[];
	private Body body;
	private int collisionType;
	


	public int getCollisionType(){
		return collisionType;
	}
	
	public void setCollisionType( int collisionType_ ){
		collisionType = collisionType_;
	}	
	
	public Body getBody(){
		return body;
	}
	
	public boolean collides(Shape otherShape) {
		return false;
	}
	
	public class Segment extends Shape {

		public Segment( Body body_, Vec2 vertices_[], Vec2 offset ){
			vertices = vertices_;
			currentPosition = new Vec2[vertices_.length];
			body = body_;
		}		
		
	}	
	
	public class Poly extends Shape {


		
		public Poly( Body body_, Vec2 vertices_[], Vec2 offset ){
			vertices = vertices_;
			currentPosition = new Vec2[vertices_.length];
			body = body_;
		}
		
		@Override
		public boolean collides(Shape otherShape) {
			currentPosition[0].setX(body.getP().getX());
	        if(center[0] - size < other_object.top_limit[0] and other_object.bottom_limit[0] < center[0] + size and
	        center[1] - size < other_object.bottom_limit[1] and other_object.top_limit[1] < center[1] + size){
	        	
	        }else{
	        	return false;
	        }
			return false;
		}		
				
	}	

}
