package facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

// 이 클래스는 title을 가장 먼저 출력해야 하는 제약을 가지고 있지만
// 창구가 되는 PageMaker 클래스가 이 제약을 지키도록 작성돼 있다.
public class HtmlWriter {

    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    // 타이틀 출력
    public void title(String title) throws IOException {
        writer.write("!DOCTYPE html>");
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("\n");
        writer.write("<h1>" + title + "</h1>");
        writer.write("\n");
    }

    // 단락 출력
    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p");
        writer.write("\n");
    }

    // 링크 출력
    public void link(String href, String caption) throws IOException {
        writer.write("<a href=\"" + href + "\">" + caption + "</a>");
    }

    // 이메일 주소 출력
    public void mailto(String mailaddr, String username) throws IOException {
        link("mailto:" + mailaddr, username);
    }

    // HTML 닫기
    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>");
        writer.write("\n");
        writer.close();
    }
}
