package main.java.workbook2.varscope;

public class Q2 {
    static void showLocal() {
        String msg = "inside";
        System.out.println(msg);
    }
    public static void main(String[] args) {
        showLocal();

        // TODO: msg 변수에 접근하려고 하면 컴파일 오류
        /** 문제: Cannot resolve symbol 'showLocal'
         * 자바 컴파일러가 'showLocal' 인식 못 한다는 의미
         * 메서드 showlocal() 내부의 지역 변수 msg를 외부(main 메서드)에서 출력 시도하여 발생
         */
         // System.out.println(showLocal);
    }
}