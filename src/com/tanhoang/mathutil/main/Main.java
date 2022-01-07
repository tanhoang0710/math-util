/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tanhoang.mathutil.main;

import com.tanhoang.mathutil.core.MathUtil;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        // test = tay, manual testing nè
        //try {
            MathUtil.getFactorial(-5);
        //} catch (IllegalArgumentException e) {
            //System.out.println(e);
        //}
        
        System.out.println("0!: 1? " + MathUtil.getFactorial(0));
        System.out.println("1!: 1? " + MathUtil.getFactorial(1));
        System.out.println("2!: 2? " + MathUtil.getFactorial(2));
        System.out.println("5!: 120? " + MathUtil.getFactorial(5));
        // muốn thấy xh ngoại lệ hay ko thì cần Try catch
    }
}
