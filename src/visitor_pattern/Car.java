package visitor_pattern;

public class Car extends Vehicle {
	public Car(){
		super();
		this.wheels = new Wheel[]{
				  new Wheel("front left")
				, new Wheel("front right")
	            , new Wheel("back left")
	            , new Wheel("back right")
	            };
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitCar(this);
	}
}
