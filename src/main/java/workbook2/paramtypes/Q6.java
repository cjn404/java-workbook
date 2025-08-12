package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q6 {
    // TODO: addExclamation(String s)와 addExclamation(StringBuilder sb) 메서드 작성
    // 불변 객체의 매개 변수 전달
    public void addExclamation(String s) {
        s += "!";
    }

    // 가변 객체의 매개 변수 전달
    public void addExclamation(StringBuilder sb) {
        sb.append("!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(sc.next());

        Q6 q6 = new Q6();

        q6.addExclamation(s); // TODO: addExclamation(String s) 메서드 작성 후 주석 해제
        q6.addExclamation(sb); // TODO: addExclamation(StringBuilder sb) 메서드 작성 후 주석 해제

        // TODO: s와 sb 출력
        System.out.println(s + " " + sb);

        sc.close();

    }
}