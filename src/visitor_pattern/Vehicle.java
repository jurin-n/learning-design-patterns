package visitor_pattern;

public abstract class Vehicle {
    private Engine  engine;
    private Body    body;
    protected Wheel[] wheels;
    
    public Vehicle(){
    	engine = new Engine();
    	body   = new Body();
    }
    
    public Engine getEngine() {
        return this.engine;
    }
    public Body getBody() {
        return this.body;
    }
    public Wheel[] getWheels() {
        return this.wheels;
    }
    public abstract void accept(Visitor visitor);
}
