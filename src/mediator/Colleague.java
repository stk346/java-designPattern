package mediator;

public interface Colleague {
    void setMediator(Mediator mediator);

    // Mediator에서 활성화 / 비활성화를 지시한다.
    void setColleagueEnabled(boolean enabled);
}
