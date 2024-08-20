package mediator;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague {

    private Mediator mediator;

    public ColleagueButton(String cation) throws HeadlessException {
        super(cation);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Mediator에서 활성/비활성을 지시한다.
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
