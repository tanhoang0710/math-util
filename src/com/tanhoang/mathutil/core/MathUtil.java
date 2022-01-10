/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tanhoang.mathutil.core;

/**
 *
 * @author DELL
 */
public class MathUtil {

    // ta viết hàm tính giai thừa
    // 21! tràn kiểu long(18 số 0)
    // ko tính âm giai thừa
    // 0! = 1! = 1 quy ước
    // TDD - Test Driven Development - viet test truoc khi viet code
    // Test First Development, suy nghi, viet ve bo test case/ cac tinh huong
    // ham truoc khi viet ham
    
    
    
//    public static long getFactorial(int n) {
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("n must be between 0 ... 20");
//        
//        if(n == 0 || n == 1) return 1; // n dac biet
//        
//        long product = 1; // khoi dau gia thua la 1
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//        return product;
//    }
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20) 
            throw new IllegalArgumentException("n must be between 0..20");
        
        if(n == 0 || n == 1)
            return 1;
        
        return n * getFactorial(n - 1);
    }
}
