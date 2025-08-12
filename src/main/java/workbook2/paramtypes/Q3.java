package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q3 {
    // TODO: swapStrings 메서드 작성 (배열을 받아 두 문자열을 교환)
    // 기본형 매개변수를 이용한 교환
    public void swapPrimitive(String str1, String str2) {
        String temp = str1;
        str1 = str2;
        str2 = temp;
    }

    // 배열을 이용한 교환
    public void swapArray(String[] arr) {
        String temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        Q3 q3 = new Q3();

        // 기본형 매개변수를 이용한 교환
        q3.swapPrimitive(s1, s2);
        System.out.println("기본형 매개변수를 이용한 교환: " + s1 + " " + s2);

        // 배열을 이용한 교환
        String[] arr = {s1, s2};
        q3.swapArray(arr);
        System.out.println("배열을 이용한 교환: " + arr[0] + " " + arr[1]);

        sc.close();

        // swapStrings(arr); // TODO: swapStrings 메서드 작성 후 주석 해제
        // TODO: arr[0], arr[1] 출력
    }
}
