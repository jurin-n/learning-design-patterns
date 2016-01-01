package visitor_pattern;

public class Engine {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
