package chipmunk.java;

public class Segment extends Shape {

	public Segment(Body body_, Vec2 p0, Vec2 p1, float radius) {
		super(1);
		vertices[0] = p0;
		vertices[0].setX((p1.getX() - p0.getX())*(float)0.5);
		vertices[0].setY((p1.getY() - p0.getY())*(float)0.5);
		System.out.printf("Vertex segment %f %f\n", vertices[0].getX(), vertices[0].getY() );
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
