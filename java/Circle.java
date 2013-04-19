package chipmunk.java;

public class Circle extends Shape {
	public Circle(Body body_, float r, Vec2 offset) {
		super(1);
		vertices[0] = new Vec2(r,r);	
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