/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciseries;

import java.util.Scanner;

/**
 *
 * @author M N Khakse
 */
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0, b=1, sum, n;
        
        Scanner s= new Scanner(System.in);
        System.out.print("How many additions do you want to perform?= ");
        n=s.nextInt();
        
        System.out.print(a+" "+b);
        for(int i=1; i<n; i++){
            sum= a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }
    }
    
}
