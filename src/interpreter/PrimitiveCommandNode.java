package interpreter;

import java.text.ParseException;

// <primitive command> ::= go | right | left
public class PrimitiveCommandNode extends Node {

    private String name;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        if (name == null) {
            throw new IllegalArgumentException("Error: Missing <primitive command>");
        } else if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new IllegalArgumentException("Error: Unknown <primitive command>: ");
        }
        context.skipToken(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
