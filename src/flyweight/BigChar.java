package flyweight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {

    private char charname;

    private String fontdata; // 큰 문자를 표현하는 문자열
    public BigChar(char charname) {
        this.charname = charname;
        try {
            String filename = "big" + charname + ".txt";
            StringBuilder sb = new StringBuilder();
            for (String line : Files.readAllLines(Path.of(filename))) {
                sb.append(line);
                sb.append('\n');
            }
            this.fontdata = sb.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    public void print() {
        System.out.println(fontdata);
    }
}
