package com.lewiswei.singleton;


public class EnumTest extends AppTest<Enum> {

    public EnumTest() {
        super(() -> Enum.INSTANCE);
    }
}
