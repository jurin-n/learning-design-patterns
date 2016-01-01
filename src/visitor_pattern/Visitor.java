package visitor_pattern;

public interface Visitor {
	void visit(Wheel wheel);
	void visit(Engine engine);
	void visit(Body body);
	void visitCar(Car car);
	void visitVehicle(Vehicle vehicle);
}
