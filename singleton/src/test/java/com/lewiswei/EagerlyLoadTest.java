package com.lewiswei;

import com.lewiswei.singleton.EagerlyLoad;

/**
 * Created by Lewis Wei on 17/3/4.
 */
public class EagerlyLoadTest extends AppTest<EagerlyLoad> {

    public EagerlyLoadTest() {
        super(EagerlyLoad::getInstance);
    }
}
