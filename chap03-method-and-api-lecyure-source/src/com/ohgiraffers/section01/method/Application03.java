package com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args) {
        /* 메소드 전달 인자(arhument)와 매개변수 (parameter)에 대해 이해하고 메소드 호출 시 사용할수 있다. */

        /* 1. 전달 인자로 값 전달 테스트*/
        /* 호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형, 갯수, 순서가 일치하게 값을 넣어 호출해야한다.*/
        Application03 app3 = new Application03();
        app3.testMethoo(40);
        app3.testMethoo(30);
        // app3.testMethoo("10");
        // app3.testMethoo(20, 30);
        //app3.testMethoo();

        /* 2. 변수에 저장한 값 전달 테스트 */
        int age = 20;
        app3.testMethoo(age);

        /* 3. 자동 형변환을 이용한 값 전달 테스트*/
        byte byteAge = 10;
        app3.testMethoo(byteAge);

        /* 4. 강제 형변환을 이용한 값 전달 테스트*/
        long longAge = 80;
        app3.testMethoo((int)longAge);

        /* 5. 연산 결과를 이용한 값 전달 테스트*/
        app3.testMethoo(age * 3);


    }
    /* int 타입의 매개변수를 전달 받는 메소든 선언*/
    public void testMethoo(int age){
        System.out.println("당신의 나이는 " + age + "세 입니다.");

    }

}
