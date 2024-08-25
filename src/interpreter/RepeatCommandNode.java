package interpreter;

import java.text.ParseException;

// <repeat command> ::= repeat <number> <command list>
public class RepeatCommandNode extends Node {

    private int repeatCnt;
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        repeatCnt = context.getRepeatCnt();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[repeat " + repeatCnt + " " + commandListNode + "]";
    }
}
