package chipmunk.java;

public class Circle extends Shape {
	private float r;
	public Circle(Body body_, float r_, Vec2 p) {
		vertices = new Vec2[1];
		r = r_;
		vertices[0] = p;
		currentPosition = new Vec2[vertices.length];
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