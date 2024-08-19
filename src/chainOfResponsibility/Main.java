package chainOfResponsibility;

public class Main {

    public static void main(String[] args) {
        NoSupport 태경 = new NoSupport("태경");
        LimitSupport 영진 = new LimitSupport("영진", 100);
        SpecialSupport 재상 = new SpecialSupport("재상", 429);
        LimitSupport 건희 = new LimitSupport("건희", 200);
        OddSupport 건모 = new OddSupport("건모");
        LimitSupport 호준 = new LimitSupport("호준", 300);

        // 사슬 형성
        태경.setNext(영진).setNext(재상).setNext(건희).setNext(건모).setNext(호준);
        
        // 다양한 트러블 발생
        for (int i = 0; i < 500; i += 33) {
            태경.support(new Trouble(i));
        }
    }
}
