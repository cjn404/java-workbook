package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q1 {
    // TODO: primitiveParam 메서드 작성 (int x를 받아 x에 10을 더함)
    public int primitiveParam(int x) {
        x += 10;
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        Q1 q1 = new Q1();

        int result = q1.primitiveParam(x); // TODO: primitiveParam 메서드 작성 후 주석 해제

        // TODO: 원래 x와 메서드 반환 값 출력
        System.out.println("main 메서드 원래 x: " + x);
        System.out.println("primitiveParam 메서드 반환 값: " + result);

        sc.close();

    }
}