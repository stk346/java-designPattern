package composite;

public class Main {

    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");

        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);

        bindir.add(new File("vi", 10000));
        bindir.add(new File("latex", 20000));
        rootdir.printList();
        System.out.println();


        System.out.println("Making user entries...");
        Directory youngjin = new Directory("영진");
        Directory taegyung = new Directory("태경");
        Directory jaesang = new Directory("재상");
        usrdir.add(youngjin);
        usrdir.add(taegyung);
        usrdir.add(jaesang);

        youngjin.add(new File("diary.html", 100));
        youngjin.add(new File("Composite.java", 200));
        taegyung.add(new File("object.tex", 300));
        jaesang.add(new File("game.doc", 400));
        jaesang.add(new File("junk.mail", 500));

        rootdir.printList();
    }
}
