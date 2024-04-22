/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author ltd13
 */
public class Bai1Tuan1 {

   public static void main(String[] args) {
        int[] a = {2, 3, 5, 6, 4, 8, 9, 11};
        
        int sum = 0;
        for (int x: a)
            if (UtilsBai1Tuan1.ktNt(x) == true)
                sum += x;
        
        System.out.println(sum);
    }
}
