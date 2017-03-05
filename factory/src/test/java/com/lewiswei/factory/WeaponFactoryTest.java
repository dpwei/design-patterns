package com.lewiswei.factory;

import com.lewiswei.factory.model.Axe;
import com.lewiswei.factory.model.Bow;
import com.lewiswei.factory.model.Sword;
import com.lewiswei.factory.model.Weapon;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Lewis Wei on 17/3/6.
 */
public class WeaponFactoryTest {

    private WeaponFactory factory;

    @Before
    public void init() {
        factory = WeaponFactory.factory(builder -> {
            builder.add(WeaponType.AXE, Axe::new);
            builder.add(WeaponType.BOW, Bow::new);
            builder.add(WeaponType.SWORD, Sword::new);
        });
    }

    @Test
    public void testAxe() {
        Weapon weapon = factory.create(WeaponType.AXE);
        Assert.assertTrue(Axe.class.isInstance(weapon));
    }

    @Test
    public void testBow() {
        Weapon weapon = factory.create(WeaponType.BOW);
        Assert.assertTrue(Bow.class.isInstance(weapon));
    }

    @Test
    public void testSword() {
        Weapon weapon = factory.create(WeaponType.SWORD);
        Assert.assertTrue(Sword.class.isInstance(weapon));
    }
}
