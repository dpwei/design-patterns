package com.lewiswei;

import com.lewiswei.singleton.LazyLoadByDoubleCheck;

/**
 * Created by Lewis Wei on 17/3/4.
 */
public class LazyLoadByDoubleCheckTest extends AppTest<LazyLoadByDoubleCheck> {

    public LazyLoadByDoubleCheckTest() {
        super(LazyLoadByDoubleCheck::getInstance);
    }
}
