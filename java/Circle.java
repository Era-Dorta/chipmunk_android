package chipmunk.java;

public class Circle extends Shape {
	private float r;
	public Circle(Body body_, float r_, Vec2 p) {
		super(1);
		r = r_;
		vertices[0] = p;
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