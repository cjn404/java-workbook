package main.java.workbook2.varscope;

class Sample {
    static String classVar = "class";   // 클래스 변수
    String instanceVar = "instance";    // 인스턴스 변수
    void printLocal() {
        String localVar = "local";      // 지역변수

        // TODO: localVar 출력
        System.out.print(localVar + " ");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.printLocal();

        // TODO: instanceVar와 classVar 출력
        System.out.print(s.instanceVar + " " + s.classVar);

        System.out.println();
    }
}