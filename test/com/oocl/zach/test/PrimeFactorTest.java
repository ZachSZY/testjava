package com.oocl.zach.test;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by SHAZA on 6/5/2017.
 */
public class PrimeFactorTest {

    @Test
    public void GIVEN_a_num_WHEN_prime_factor_THEN_compare_result(){
        assertEquals(Arrays.asList(2),PrimeFactor.primeFactor(2));
        assertEquals(Arrays.asList(3),PrimeFactor.primeFactor(3));
        assertEquals(Arrays.asList(2,2),PrimeFactor.primeFactor(4));
        assertEquals(Arrays.asList(3,3),PrimeFactor.primeFactor(9));
        assertEquals(Arrays.asList(2,2,3),PrimeFactor.primeFactor(12));

    }
}