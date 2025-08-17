package main.java.workbook2.varscope;

public class Q4 {
    // static 초기화(클래스가 처초 메모리 로딩 시 한번만)
    static {
        System.out.println("static block");
    }
    // 인스턴스 초기화(객체 생성 시마다)
    {
        System.out.println("instance block");
    }
    // 생성자
    Q4() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        // 객체 생성 후 참조 변수 d에 저장
        Q4 d = new Q4();
    }
}