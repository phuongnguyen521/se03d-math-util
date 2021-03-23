/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuong.mathutil;

/**
 *
 * @author DELL
 */
public class MathUtility {
    //tao cac ham torng class nay y chang class Math cua JDK
    // cac ham se xai chung o nhieu noi, dung chung
    // dung chung: STATIC
    public static final double PI = 3.1415; //MathUlitity.PI
    
    
    /*
    ham tinh n! = 1.2.3.4.5...
    0! = 1! = 1
    khong co giai thua am
    vi giai thua tang cuc nhanh ve gia tri, 21 kieu tran kieu long
    ta se khong che n dau vao cua ham tu 0 - 20
    kieu long: 10^18, 18 con so toi da
    */
    public static long getFactorial(int n){
       if (n < 0 || n > 20){
           throw new IllegalArgumentException("Invalid argument, n must be between 0...20");
       }
       if (n == 0 || n == 1){
           return 1;
       }
       long result = 0;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
}
