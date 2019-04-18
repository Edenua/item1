package com.wuancake.algorithm;

import org.junit.Test;



/**
 * Time：2019/4/16 0016 14:17
 * Description：<描述>
 */
public class Algorithm {
    private static final double x=Math.sqrt(5);
    private static final double q=0.5*(1+x);
    private static final double q2=0.5*(1-x);
    /*欧几里得递归算法*/
    public void Swap(int a,int b){
        int c=a;a=b;b=c;
    }
    public int RGcd(int m,int n){
        if(m==0) return n;
        return RGcd(n%m,m);
    }

    public int Gcd(int m,int n){

        if(m>n) Swap(m,n);
        return RGcd(m,n);
    }
    /*欧几里得迭代算法*/
    public int Gcd2(int m,int n){
        if(m==0)return n;
        if (n==0)return m;
        if(m>n)Swap(m,n);
        while(m>0){
            int c=n%m;n=m;m=c;
        }
        return n;
    }
    /*连续整数检测算法*/
    public int Gcd3(int m,int n){
        if(m==0)return n;if(n==0)return m;
        int t=m>n?n:m;
        while((n%t==0||m%t==0)) t--;

        return t;
    }
    /*斐波那契数列*/
    public long Fib(long n){
        if(n<=1){ return n; }
        return Fib(n-1)+Fib(n-2);
    }
    /*逆序*/
    public void printD(int n){
        System.out.print(n%10);
        if(n/10!=0) printD(n/10);
    }
    /*C（M,N）= C（M,N）+ C（M-1,N-1）= n!/m!(n-m)!*/
     public int Recursion(int n){
         if(n==1) return n;
         return n*Recursion(n-1);
     }
     public int Rec(int n,int m){
         if(n<m)Swap(n,m);

         return Recursion(n)/Recursion(m)*(Recursion(n-m));
     }

    @Test
    public void mn() {
        System.out.println("欧几里得递归算法："+Gcd(9,15));
        System.out.println("欧几里得迭代算法："+Gcd2(9,15));
        System.out.println("连续整数检测算法"+Gcd3(6,15));
        System.out.println("斐波那契数列：");
        for (int i = 0; i < 10; i++) {
            System.out.print(Fib(i)+" ");
        }
        System.out.println("\n逆序：");printD(123456);
        System.out.println("\n递归："+Rec(5,4));
    }


}
