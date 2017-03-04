package com.lewiswei;

import com.lewiswei.singleton.LazyLoadBySynchronized;

/**
 * Created by Lewis Wei on 17/3/4.
 */
public class LazyLoadBySynchronizedTest extends AppTest<LazyLoadBySynchronized> {

    public LazyLoadBySynchronizedTest() {
        super(LazyLoadBySynchronized::getInstance);
    }
}
