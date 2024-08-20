package state;

// 상태에 따라 처리가 변화하는 메소드를 모아 상태에 따라 클래스로 구현함
public interface State {

    void doClock(Context context, int hour);
    void doUse(Context context);
    void doAlarm(Context context);
    void doPhone(Context context);
}
