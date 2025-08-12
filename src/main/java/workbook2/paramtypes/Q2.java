package main.java.workbook2.paramtypes;

import java.util.Scanner;

public class Q2 {
    // TODO: addHundred 메서드 작성 (int[] arr의 첫 요소에 100을 더함)
    public int addHundred(int[] arr) {
        arr[0] += 100;
        return arr[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열 크기
        int n = sc.nextInt();
        // 크기가 n인 배열 생성
        int[] arr = new int[n];
        // 순서대로 정수 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Q2 q2 = new Q2();

        q2.addHundred(arr); // TODO: addHundred 메서드 작성 후 주석 해제

        // TODO: 변경된 arr 출력

        // 마지막 공백 O
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }

        // 마지막 공백 X
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(" ");
            }
        }

        sc.close();

    }
}