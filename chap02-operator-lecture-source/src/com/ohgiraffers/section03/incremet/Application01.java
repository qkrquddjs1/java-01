package com.ohgiraffers.section03.incremet;

public class Application01 {
    public static void main(String[] args) {
        /* 증감 연산자에 대해 이해하고 활용할 수 있다. */
        /* 단항으로 사용될 때는 1 증가/1 감소의 의미를 가진다. */
        int num = 20;
        System.out.println("num : " + num);
        num++; //1 증가
        System.out.println("num : " + num);
        ++num; //1 증가
        System.out.println("num : " + num);
        num--; //1 감소
        System.out.println("num : " + num);
        --num; //1 감소
        System.out.println("num : " + num);

        /* 다른 연산자와 함꼐 증감 연산자를 사용하는 경우 */
        int firstNum =20;
        int result1 = firstNum++ * 3;
        System.out.println("result1 : " + result1);
        System.out.println("firstNum : " + firstNum);

        int secondNum = 20;
        int result2 = ++secondNum * 3;
        System.out.println("result2 : " + result2);
        System.out.println("secondNum :" + secondNum);

    }

}
