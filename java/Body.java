package chipmunk.java;

public class Body {
	private float mass;
	private float inertia;
	private Vec2 p;
	private Vec2 v;
	public float dt;
	
	public Vec2 getV() {
		return v;
	}

	public void setV(Vec2 v) {
		this.v = v;
	}

	public Vec2 getP() {
		return p;
	}

	public void setP(Vec2 p) {
		this.p = p;
	}

    public Body( float mass_, float inertia_){
    	mass = mass_;
    	inertia = inertia_;
    	dt = 0;
    }	
    
    public void step(float dt){
    	p.setX(p.getX() + v.getX()*dt);
    	p.setY(p.getY() + v.getY()*dt); 	
    }
    

}
