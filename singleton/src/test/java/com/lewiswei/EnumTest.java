package com.lewiswei;

import com.lewiswei.singleton.Enum;


public class EnumTest extends AppTest<Enum> {

    public EnumTest() {
        super(() -> Enum.INSTANCE);
    }
}
