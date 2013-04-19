package chipmunk.java;

public class Poly extends Shape {
	private Vec2[] segmentPosition = new Vec2[] { new Vec2(), new Vec2()};;
	public Poly(Body body_, Vec2[] vertices_, Vec2 offset) {
		super(vertices_.length);
		vertices = vertices_;
		body = body_;
	}

	public boolean collides(Poly poly) {
		return false;
	}	
	
	public boolean collides(Segment segment) {
		currentPosition[0].setX(body.getP().getX() + vertices[1].getX());
		currentPosition[0].setY(body.getP().getY() - vertices[1].getY());				
		currentPosition[1].setX(body.getP().getX() + vertices[3].getX());
		currentPosition[1].setY(body.getP().getY() - vertices[3].getY());	
		segmentPosition[0].setX(segment.body.getP().getX() - segment.vertices[0].getX());
		segmentPosition[0].setY(segment.body.getP().getY() - segment.vertices[0].getY());				
		segmentPosition[1].setX(segment.body.getP().getX() + segment.vertices[0].getX());
		segmentPosition[1].setY(segment.body.getP().getY() + segment.vertices[0].getY());	
        if(currentPosition[0].getX() < segmentPosition[1].getX() && segmentPosition[0].getX() < currentPosition[1].getX() &&
        		currentPosition[0].getY() < segmentPosition[0].getY() && segmentPosition[1].getY() < currentPosition[1].getY()){
        	return true;
        }else{
        	return false;
        }
	}

	public boolean collides(Circle circle) {
		return false;
	}
			
}