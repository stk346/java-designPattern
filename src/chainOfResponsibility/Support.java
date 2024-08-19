package chainOfResponsibility;

public abstract class Support {

    private String name;
    private Support next; // 떠넘길 곳

    public Support(String name) {
        this.name = name;
        this.next = null;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    // 트러블 해결 절차를 진행
    public void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
            return;
        }
        if (next != null) {
            next.support(trouble);
            return;
        }
        fail(trouble);
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

    // 해결하려고 한다
    public abstract boolean resolve(Trouble trouble);

    // 해결했다
    public void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    // 해결되지 않았다.
    public void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved");
    }
}
