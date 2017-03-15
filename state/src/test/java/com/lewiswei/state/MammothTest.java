package com.lewiswei.state;

import com.lewiswei.state.AngryState;
import com.lewiswei.state.Mammoth;
import com.lewiswei.state.PeacefulState;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MammothTest {

    @Test
    public void defaultState() {
        Mammoth mammoth = new Mammoth();
        assertEquals(PeacefulState.class, mammoth.getState());
    }

    @Test
    public void switchState() {
        Mammoth mammoth = new Mammoth();
        mammoth.timePasses();
        mammoth.observe();
        assertEquals(AngryState.class, mammoth.getState());
    }

    @Test
    public void switchMultipleState() {
        Mammoth mammoth = new Mammoth();

        mammoth.timePasses();
        mammoth.observe();
        assertEquals(AngryState.class, mammoth.getState());

        mammoth.timePasses();
        mammoth.observe();
        assertEquals(PeacefulState.class, mammoth.getState());

    }
}
