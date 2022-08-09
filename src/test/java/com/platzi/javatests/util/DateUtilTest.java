package com.platzi.javatests.util;

import static org.hamcrest.MatcherAssert.*;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class DateUtilTest {

    @Test
    public void testDateUtil_GiveYearDivisibleBy400_ShouldReturnTrue() {
        assertThat(DateUtil.isLeapYear(1600), CoreMatchers.is(true));
        assertThat(DateUtil.isLeapYear(2000), CoreMatchers.is(true));
        assertThat(DateUtil.isLeapYear(2400), CoreMatchers.is(true));
    }

    @Test
    public void testDataUtil_GivenYearDivisibleBy100ButNotBy400_ShouldReturnFalse() {
        assertThat(DateUtil.isLeapYear(1700), CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(1800), CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(1900), CoreMatchers.is(false));
    }

    @Test
    public void testDataUtil_GivenYearDivisibleByFourButNotBy100_ShouldReturnTrue() {
        assertThat(DateUtil.isLeapYear(1996), CoreMatchers.is(true));
        assertThat(DateUtil.isLeapYear(2004), CoreMatchers.is(true));
        assertThat(DateUtil.isLeapYear(2008), CoreMatchers.is(true));
    }

    @Test
    public void testDataUtil_GivenYearIsNotDivisibleByFour_ShouldReturnFalse() {
        assertThat(DateUtil.isLeapYear(2017), CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(2018), CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(2019), CoreMatchers.is(false));
    }
}