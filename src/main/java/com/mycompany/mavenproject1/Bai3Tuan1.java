package com.mycompany.mavenproject1;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Bai3Tuan1 {
    
    public static int sumFrom1ToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static String checkEvenOdd(int n) {
        if (n % 2 == 0) {
            return "Tổng là số chẵn.";
        } else {
            return "Tổng là số lẻ.";
        }
    }
    
    public static boolean validateInput(String input) {
        // Sử dụng isNumeric từ StringUtils để kiểm tra xem chuỗi có phải là số hay không
        return StringUtils.isNumeric(input) && Integer.parseInt(input) >= 0;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Chương trình tính tổng các số từ 1 đến n.");
        System.out.print("Nhập số n: ");
        String input = scanner.nextLine();
        
        if (validateInput(input)) {
            int n = Integer.parseInt(input);
            int sum = sumFrom1ToN(n);
            
            System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);
            System.out.println(checkEvenOdd(sum));
        } else {
            System.out.println("Nhập không hợp lệ. Vui lòng nhập một số nguyên dương.");
        }
        
        scanner.close();
    }
}