package mediator;

public interface Mediator {

    // Colleague를 생성한다
    void createColleagues();
    // Colleague의 상태가 변화했을 때 호출된다.
    void colleagueChanged();

}
