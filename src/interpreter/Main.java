package interpreter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            List<String> texts = List.of(
                    "program end",
                    "program go end",
                    "program go right go right go right go right end",
                    "program repeat 4 go right end end",
                    "program repeat 4 repeat 3 go right go left end right end end"
            );
            for (String text : texts) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
