package chipmunk.java;

public class Segment extends Shape {

	public Segment(Body body_, Vec2 p0, Vec2 p1, float radius) {
		super(1);
		vertices[0] = p0;
		vertices[0].setX( Math.abs(p1.getX() - p0.getX()) );
		vertices[0].setY( Math.abs(p1.getY() - p0.getY()));
		body = body_;
	}		
	
	public boolean collides(Poly poly) {
		return false;
	}	
	
	public boolean collides(Segment segment) {
		return false;
	}

	public boolean collides(Circle circle) {
		return false;
	}	
}	
