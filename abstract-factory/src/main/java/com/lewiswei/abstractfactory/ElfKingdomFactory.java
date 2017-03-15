package com.lewiswei.abstractfactory;

public class ElfKingdomFactory implements KingdomFactory {

    @Override
    public King createKing() {
        return new ElfKing();
    }

}
