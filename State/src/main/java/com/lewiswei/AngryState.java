package com.lewiswei;

/**
 * 子类实现状态转换后的业务
 */
public class AngryState implements State {

    private Mammoth mammoth;

    public AngryState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        System.out.printf("%s getting angry\n", mammoth);
    }

    @Override
    public void observe() {
        System.out.printf("%s is angry\n", mammoth);
    }
}
