/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tanhoang.mathutil.core;

import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author DELL
 */
public class FactorialTest {
    
    @Test // viet code dung de test code chinh MathUtil
    // ten ham phai noi len muc dich viet test
    public void checkFactorialGivenCorrectArgumentReturnsWell() {
        // tui ki vong khi goi ham tinh 5! thi may tra ve 120
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        Assert.assertEquals(expected, actual);
        
        // đừng quên còn nhiều tình huống/test case xài hàm
        Assert.assertEquals(1720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
    }
    
    @Test(expected = IllegalArgumentException.class)
    // bien cai ham nay thanh public static void main() {...}
    // day la cu phap/quy tac cua bo thu vien JUnit
    public void checkFactorialGivenWrongArgumentThrowException() {
        MathUtil.getFactorial(-5);
        MathUtil.getFactorial(21);
        MathUtil.getFactorial(22);
    }
    // am ko tinh giai thua
    // >=21 bi tran long, ko tinh luon
    // 2 tinh huong nay ko co value tra ve, ko so sanh dc
    // ko assertEquals() so sanh xem co bang ko
}

// XANH ĐỎ QUY ƯỚC:
// HÀM ĐƯỢC ĐÁNH GIÁ LÀ XANH, NẾU TẤT CẢ CÁC TÌNH HUỐNG TEST PHẢI XANH
// TEST GÌ THÌ XANH ĐẤY, TỨC LÀ TEST GÌ, THÌ EXPECTED = ACTUAL
// ÁM CHỈ CÁC HÀM XỬ LÍ ĐÚNG

// CHỈ CẦN 1 CÁI ĐỎ, CẶP EXPECTED != ACTUAL, CÓ NGHĨA LÀ HÀM XỬ LÍ KO ĐÚNG
// HOẶC BẠN KÌ VỌNG SAI

// TA CẦN XEM XÉT LẠI CODE/TEST ĐỂ ĐẢM BẢO XANH HẾT, KẾT LUẬN HÀM ỔN
// CHO CÁC TÌNH HUỐNG ĐÃ TEST
