package common;

import enumerations.State;
import interfaces.Mission;


public class MissionImpl implements Mission {
    private String codeName;
    private State state;

    public MissionImpl(String codeName, State state) {
        this.codeName = codeName;
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format("Code name: %s State: %s", this.codeName, this.state);
    }
}
