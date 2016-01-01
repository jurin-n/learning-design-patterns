package visitor_pattern;

public class PrintVisitor implements Visitor {

	@Override
	public void visit(Wheel wheel) {
		System.out.println("Visiting "+ wheel.getName()+ " wheel");
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Visiting engine");
	}

	@Override
	public void visit(Body body) {
		System.out.println("Visiting body");
	}

	@Override
	public void visitCar(Car car) {
		System.out.println("Visiting car");
        car.getEngine().accept(this);
        car.getBody().accept(this);
        for(Wheel wheel : car.getWheels()) {
            wheel.accept(this);
        }
	}

	@Override
	public void visitVehicle(Vehicle vehicle) {
		System.out.println("Visiting vehicle");
	}
}
