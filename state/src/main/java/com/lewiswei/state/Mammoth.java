package com.lewiswei.state;

public class Mammoth {

    private State state;

    public Mammoth() {
        this.state = new PeacefulState(this);
    }

    public Class getState() {
        return state.getClass();
    }

    /**
     * 状态切换
     */
    public void timePasses() {
        if (state.getClass().equals(PeacefulState.class)) {
            changeToState(new AngryState(this));
        } else if (state.getClass().equals(AngryState.class)) {
            changeToState(new PeacefulState(this));
        }
    }

    private void changeToState(State newState) {
        this.state = newState;
        this.state.onEnterState();
    }

    public void observe() {
        this.state.observe();
    }

    @Override
    public String toString() {
        return "mammoth";
    }

}