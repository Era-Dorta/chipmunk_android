package chipmunk.java;

public class Poly extends Shape {
	
	public Poly(Body body_, Vec2[] vertices_, Vec2 offset) {
		vertices = vertices_;
		currentPosition = new Vec2[vertices.length];
		body = body_;
	}

	public boolean collides(Poly poly) {

		currentPosition[0].setX(body.getP().getX() + vertices[1].getX());
		currentPosition[0].setY(body.getP().getY() + vertices[1].getY());				
		currentPosition[1].setX(body.getP().getX() + vertices[3].getX());
		currentPosition[1].setY(body.getP().getY() + vertices[3].getY());	
		Vec2 otherObjectPosition[] = new Vec2[2];
		otherObjectPosition[0].setX(poly.body.getP().getX() + poly.vertices[0].getX());
		otherObjectPosition[0].setY(poly.body.getP().getY() + poly.vertices[0].getY());				
		otherObjectPosition[1].setX(poly.body.getP().getX() + poly.vertices[1].getX());
		otherObjectPosition[1].setY(poly.body.getP().getY() + poly.vertices[1].getY());
		
        if(currentPosition[0].getX() < otherObjectPosition[1].getX() && otherObjectPosition[0].getX() < currentPosition[1].getX() &&
        		currentPosition[0].getY() < otherObjectPosition[0].getY() && otherObjectPosition[1].getY() < currentPosition[1].getY()){
        	
        }else{
        	return false;
        }
		return false;
	}	
	
	public boolean collides(Segment segment) {
		return false;
	}

	public boolean collides(Circle circle) {
		return false;
	}
			
}