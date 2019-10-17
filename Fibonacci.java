package com.company;
import java.util.Scanner;
public class Fibonacci {
public static int feibonac(int num) {
         if (num==1||num==2) {
             return 1;
         }else {
             return feibonac(num-1)+feibonac(num-2);
         }
     }

     public static void main(String[] args) {
         int sum = 0;
         Scanner scan = new Scanner(System.in);
         System.out.println("请输入:");
         int n = scan.nextInt();
         for (int i=1;i<=n;i++) {
             System.out.println("第"+i+"="+feibonac(i));
             sum += feibonac(i);
         }
         System.out.println("总和为:"+sum);
     }
 }
 /*若输入n为10，则运行结果为
 请输入:
10
第1=1
第2=1
第3=2
第4=3
第5=5
第6=8
第7=13
第8=21
第9=34
第10=55
总和为:143
*/
