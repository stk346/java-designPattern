package chainOfResponsibility;

public class LimitSupport extends Support {

    private int limit; // 이 번호 미만이면 해결할 수 있음

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        }
        return false;
    }
}
