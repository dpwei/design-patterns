package com.lewiswei.abstractfactory;

public class App {

    private KingdomFactory kingdomFactory;

    private King king;

    public KingdomFactory getKingdomFactory() {
        return this.kingdomFactory;
    }

    public void setKingdomFactory(KingdomFactory kingdomFactory) {
        this.kingdomFactory = kingdomFactory;
    }

    public void createKingdom() {
        setKing(kingdomFactory.createKing());
    }

    public King getKing() {
        return king;
    }

    public void setKing(King king) {
        this.king = king;
    }


    public static void main(String[] args) {
        App app = new App();
        // Orc kingdom
        app.setKingdomFactory(new OrcKingdomFactory());
        app.createKingdom();
        System.out.println(app.getKing().description());

        // Elf kingdom
        app.setKingdomFactory(new ElfKingdomFactory());
        app.createKingdom();
        System.out.println(app.getKing().description());
    }
}
