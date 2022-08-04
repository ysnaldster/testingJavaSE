package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat_GiveOneHello_ShouldOnceHello(){
        Assert.assertEquals("Hello", StringUtil.repeat("Hello",1));
    }

    @Test
    public void testRepeat_GiveMultipleHello_ShouldMultipleHelloTimes(){
        Assert.assertEquals("HelloHelloHello", StringUtil.repeat("Hello",3));
    }

    @Test
    public void testRepeat_GiveVoid_ShouldZeroTimes(){
        Assert.assertEquals("", StringUtil.repeat("Hello",0));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeat_GiveNegative_ShouldNegativeTimes(){
        StringUtil.repeat("Hello",-1);
    }
}