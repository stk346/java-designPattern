package chainOfResponsibility;

public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return false; // 자신은 아무것도 해결하지 않음.
    }
}
