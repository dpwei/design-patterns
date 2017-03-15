package com.lewiswei.abstractfactory;

public class OrcKingdomFactory implements KingdomFactory {

    @Override
    public King createKing() {
        return new OrcKing();
    }
}
