package visitor_pattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class VisitorTest {

	@Test
	public void test() {
        Car car = new Car();
        Visitor printVisitor = new PrintVisitor();
        Visitor doVisitor = new DoVisitor();
        System.out.println("*** " + printVisitor.getClass().getName() + " ***");
        car.accept(printVisitor);

        System.out.println("*** " + doVisitor.getClass().getName() + " ***");
        car.accept(doVisitor);
	}
}
