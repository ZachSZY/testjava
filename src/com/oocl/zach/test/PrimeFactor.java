package com.oocl.zach.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHAZA on 6/5/2017.
 */
public class PrimeFactor {
    public static List primeFactor(int num) {
        List result = new ArrayList();
//        result.add(2);
        if (num < 2) {
            return null;
        } else {
            int i = 2;
            while (i <= num) {
                if (num % i == 0) {
                    result.add(i);
                    num = num / i;
                } else {
                    i++;
                }
            }
        }
        return result;
    }
}
