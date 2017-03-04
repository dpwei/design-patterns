package com.lewiswei.singleton;

/**
 * Created by Lewis Wei on 17/3/4.
 */
public class LazyLoadByInnerClassTest extends AppTest<LazyLoadByInnerClass> {

    public LazyLoadByInnerClassTest() {
        super(LazyLoadByInnerClass::getInstance);
    }
}
