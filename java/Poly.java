package chipmunk.java;

public class Poly extends Shape {
	
	public Poly(Body body_, Vec2[] vertices_, Vec2 offset) {
		vertices = vertices_;
		currentPosition = new Vec2[vertices.length];
		body = body_;
	}

	@Override
	public boolean collides(Shape otherShape) {

		currentPosition[0].setX(body.getP().getX() + vertices[1].getX());
		currentPosition[0].setY(body.getP().getY() + vertices[1].getY());				
		currentPosition[1].setX(body.getP().getX() + vertices[3].getX());
		currentPosition[1].setY(body.getP().getY() + vertices[3].getY());	
		Vec2 otherObjectPosition[] = new Vec2[2];
		otherObjectPosition[0].setX(otherShape.body.getP().getX() + otherShape.vertices[0].getX());
		otherObjectPosition[0].setY(otherShape.body.getP().getY() + otherShape.vertices[0].getY());				
		otherObjectPosition[1].setX(otherShape.body.getP().getX() + otherShape.vertices[1].getX());
		otherObjectPosition[1].setY(otherShape.body.getP().getY() + otherShape.vertices[1].getY());
		
        if(currentPosition[0].getX() < otherObjectPosition[1].getX() && otherObjectPosition[0].getX() < currentPosition[1].getX() &&
        		currentPosition[0].getY() < otherObjectPosition[0].getY() && otherObjectPosition[1].getY() < currentPosition[1].getY()){
        	
        }else{
        	return false;
        }
		return false;
	}		
			
}