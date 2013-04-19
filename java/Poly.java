package chipmunk.java;

public class Poly extends Shape {
	
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
		currentPosition[0].setY(body.getP().getY() + vertices[1].getY());				
		currentPosition[1].setX(body.getP().getX() + vertices[3].getX());
		currentPosition[1].setY(body.getP().getY() + vertices[3].getY());	
		Vec2 otherObjectPosition[] = new Vec2[] { new Vec2(), new Vec2()};
		otherObjectPosition[0].setX(segment.body.getP().getX() + segment.vertices[0].getX());
		otherObjectPosition[0].setY(segment.body.getP().getY() + segment.vertices[0].getY());				
		otherObjectPosition[1].setX(segment.body.getP().getX() + segment.vertices[1].getX());
		otherObjectPosition[1].setY(segment.body.getP().getY() + segment.vertices[1].getY());
		
        if(currentPosition[0].getX() < otherObjectPosition[1].getX() && otherObjectPosition[0].getX() < currentPosition[1].getX() &&
        		currentPosition[0].getY() < otherObjectPosition[0].getY() && otherObjectPosition[1].getY() < currentPosition[1].getY()){
        	return true;
        }else{
        	return false;
        }
	}

	public boolean collides(Circle circle) {
		return false;
	}
			
}