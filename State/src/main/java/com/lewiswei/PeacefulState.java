package com.lewiswei;

/**
 * 子类实现状态转换后的业务
 */
public class PeacefulState implements State {

    private final Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void onEnterState() {
        System.out.printf("%s calm down\n", mammoth);
    }

    @Override
    public void observe() {
        System.out.printf("%s is calm and peaceful\n", mammoth);
    }
}
