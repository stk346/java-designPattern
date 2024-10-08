package visitor;

public class ListVisitor extends Visitor {

    // 현재 방문한 디렉터리 이름
    private String currentdir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        for (Entry entry : directory) {
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
