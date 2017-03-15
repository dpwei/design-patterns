package com.lewiswei.abstractfactory;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class AppTest {

    @Test
    public void getOrcKingdomFactory() {
        App app = new App();
        app.setKingdomFactory(new OrcKingdomFactory());
        assertEquals(OrcKingdomFactory.class, app.getKingdomFactory().getClass());
    }

    @Test
    public void getElfKingdomFactory() {
        App app = new App();
        app.setKingdomFactory(new ElfKingdomFactory());
        assertEquals(ElfKingdomFactory.class, app.getKingdomFactory().getClass());
    }

    @Test
    public void createOrcKing() {
        App app = new App();
        app.setKingdomFactory(new OrcKingdomFactory());
        app.createKingdom();
        assertTrue(app.getKing() instanceof OrcKing);
    }

    @Test
    public void createElfKing() {
        App app = new App();
        app.setKingdomFactory(new ElfKingdomFactory());
        app.createKingdom();
        assertTrue(app.getKing() instanceof ElfKing);
    }
}
