/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuong.mathutil.test;

import com.phuong.mathutil.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {
    
    
   // dat te nha theo chuan dan test phan mem, QA/QC
    @Test //bien ham nay thanh main(), SHIFT F6 de chay
   public void testFactorialGivenRightArgumentReturnsGoodResult(){
       int n = 5;
       long expected = 120;
       long actual = MathUtility.getFactorial(n);
       assertEquals(expected, actual);
       
       // 22/03/2021
       
        assertEquals(720, MathUtility.getFactorial(6)); //6! dung la 720?
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        /* màu đỏ đến theo 2 nghĩa
        + hàm tính đúng, kì vọng sai
        + hàm tính sai, kì vọng đúng
        mỗi lời gọi hàm ở trên là 1 test case - 1 tình huống test
        với 1 đầu vào và nhận đầu ra
        
        */
   }
   
   /*
   Các ngoại lệ thì test như thế nào??
   vì khi ngoại lệ xảy ra, app dừng liền, màu đỏ, vì có 1 điều không ổn
   Thêm nữa, ngoại lệ không phải là một value để so sánh
   không biết nó là số mấy, ngoại lệ chỉ có thể ước lượng, chạm nó khi nó xảy ra 
   
   Test ngoại lệ nên được đọc/diễn giải như sau:
   đưa vào các tình huống dữ liệu cà chớn, ví dụ -5, 22, 40 
   muốn nhìn xem ngoại lệ có xảy ra trong tình huống này hay không? nếu có xảy ra, thì ok
   vì app/hàm này đúng như thiết kế
   => tức là nếu getFactorial(-5) mà ném ra ngoại lệ
   IllegalArgumentException, có nghĩa là hàm đúng => MÀU XANH (đừng bối rối)
   XANH vì thiết kế nói rằng tình huống -5 phải có ngoại lệ, và nếu có ngoại lệ thì hàm đúng
   */
    
   @Test(expected = IllegalArgumentException.class) //Exception là cha của SQLException và IllegalArgumentException
   public void testFactorialGivenWrongArgumentThrowsException(){
       MathUtility.getFactorial(-5); //chạy hàm
       MathUtility.getFactorial(21); // biết rằng những hàm này là exception
       MathUtility.getFactorial(-1); // ta phải chụp lại
       MathUtility.getFactorial(40); // nếu có thật, hàm đúng, XANH
   }
}

/*
test dufng mau sac, dung thu vien Unit Test co quy uoc
neu tat ca cac cap expected va actual khop nhau (equals)
=> ham chay dung moi tinh huong ta da test -> XANH

neu tat ca cac cap ma ta test, co it nhat mot cap khong khop nhau
- it nhat 1 mau DO
=> coi nhu ham khong on - ĐỎ CHUNG

Điều này để ddarm bảo rằng, hàm mà đã test các tình huống thì phải đúng hết

Nói cách khác, những gì ta chủ động liệt kê, thì phải đúng
*/