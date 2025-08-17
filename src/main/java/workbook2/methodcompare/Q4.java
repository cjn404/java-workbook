package main.java.workbook2.methodcompare;

import java.util.Scanner;

class StringUtil {
    static boolean isPalindrome(String s) {
        // TODO: 회문 여부 판단
        // StringBuffer 활용
//        StringBuffer sb = new StringBuffer(s);
//        if (sb.reverse().toString().equals(s)) {
//            return true;
//        } else {
//            return false;
//        }

        // StringBuilder 활용
        StringBuilder sb = new StringBuilder(s);
        if (sb.reverse().toString().equals(s)) {
            return true;
        } else {
            return false;
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // TODO: StringUtil.isPalindrome 호출 후 출력
        System.out.println(StringUtil.isPalindrome(str));

        sc.close();

    }
}
