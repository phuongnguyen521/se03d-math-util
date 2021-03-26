/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuong.mathutil.main;

import com.phuong.mathutil.MathUtility;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // toi muon test 5! co bang 120 hay khong
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);
        
        System.out.println("5! expected: " + expected + "\nactual: " + actual);
        
        // xet truong hop thu 2: 0! = ?
        
        n = 0;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("1! expected: " + expected + "\nactual: " + actual);
    }
    
}

/*
Trong quy trinh lam PM, DEV phai co trach nhieu TEST tung ham 
tung Class ma minh viet ra truoc khi dong goi gui cho ben QA/QC TEST
doc lap, tung ham, tung class phai duoc test can than troc khi chung duoc dung de phoi hop
voi class khac, test ngay muc ham, muc class, vua hoan thien, chua them ban ve UI, thi muc do 
TEST som nay goi la UNIT TEST LEVEL - TEST TUNG DON THE , DON VI CODE

Vay lam sao de test tung ham, tung class?
C1. Dung sout(goi-ham-can-test()) de in ra gia tri xu li cua ham dung trong mon OOP

C2. Dung JOptionPane cua mon Java Desktop de pop-up mot cua so 
in ra ket qua xu li cua ham de kiem tra coi ham chay dung hay sai

C3. Dung LOG FILE, trang Web in ra ket qua xu li cua ham (mon Java Web)

du la cach nao hti ta cung can phai in ra gia tri ham da xu li goi la ACTUAL VALUE 
roi ta di so sanh cai gia tri tra ve cua ham co giong nhu ta tinh toan truoc do hay khong, 
cai ta hy vong ham se tra ve - goi la EXPECTED VALUE

Neu ACTUAL VALUE == EXPECTED VALUE -> HAM CHAY NGON
                 !=                -> HAM SAI
Nguyen tac cua viec test: So sanh ACTUAL voi EXPECTED

3 cach nay cung 1 nguyen tac
goi Ham de em ham xu li ket qua may 
sau do dung mat de so sanh ACTUAL va EXPECTED roi tu ket luan
Cach nay tiem an sai sot khi ta phai xem xet qua nhieu cap value

Vi du ham getFactorial(int n) phai TEST truong hop: 
<0, =0, =1, 18, 19, 20, >20

Moi n de test, ta goi la 1 tinh huong TEST CASE

C4: Lam bang may
May quet qua cac tinh huong cua expected va actual
neu tat ca deu khop, bao mau xanh
neu co xuat hien it nhat 1 TEST CASE khong khop, bao mau do
Muon lam duoc dieu nay, ta can thu vien phu tro
Java: JUnit, TestNG
C#: NUnit, NTest, NUnit
PHP: PHPUnit
... moi ngon ngu due co thu vien XANH DO giup canh bao ham tot hay khong
*/
