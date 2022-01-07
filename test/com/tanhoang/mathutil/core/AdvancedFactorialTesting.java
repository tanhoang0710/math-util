/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tanhoang.mathutil.core;

import static com.tanhoang.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author DELL
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTesting {
    
    // tách toàn bộ data cần test gồm đầu vào/input
    // và expected/output
    // ra 1 chỗ để quản lí/dễ theo dõi/dễ thống kê đủ các tình huống
    // cần test hay chưa
    
    
    // ta co the dat bo data nay o file txt, csv, excel, database
    @Parameters
    public static Object[][] initData() { // ten ham tu do
        // int a[][] = {{2, 4}, {6, 8}};
        return new Integer[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }
    
    // chuan bi 2 bien de hung data, sau do truyen vao ham Test
    @Parameter(value = 0)
    public int input;
    @Parameter(value = 1)
    public long expected;
    
    @Test
    public void checkFactorialGivenCorrectArgumentReturnsWell() {
        assertEquals(expected, getFactorial(input));
    }
}
