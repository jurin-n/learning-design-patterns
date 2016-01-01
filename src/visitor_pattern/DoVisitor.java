package visitor_pattern;

public class DoVisitor implements Visitor {

	@Override
    public void visit(Wheel wheel) {
        System.out.println("Steering my wheel");
    }
	@Override
    public void visit(Engine engine) {
        System.out.println("Starting my engine");
    }
	@Override
    public void visit(Body body) {
        System.out.println("Moving my body");
    }
	@Override
    public void visitCar(Car car) {
        System.out.println("Starting my car");
        car.getEngine().accept(this);
        car.getBody().accept(this);
        for(Wheel wheel : car.getWheels()) {
            wheel.accept(this);
        }
    }
	@Override
    public void visitVehicle(Vehicle vehicle) {
        System.out.println("Starting my vehicle");
    }
}
