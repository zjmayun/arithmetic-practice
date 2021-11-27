package com.jackey.arithmetic.recursion;

/**
 * 递归2大条件
 * 1.递归出口
 * 2.递归表达式
 */
public class Sum {

    public static int sum(int n) {
        if(n == 1) {
            return 1;
        } else {
            return sum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(4));
    }
}
