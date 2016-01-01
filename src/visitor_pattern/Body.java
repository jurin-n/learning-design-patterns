package visitor_pattern;

public class Body {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
