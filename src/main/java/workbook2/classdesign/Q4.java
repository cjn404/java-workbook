package main.java.workbook2.classdesign;

import java.util.Scanner;

class Point {
    double x;
    double y;

    // TODO: 생성자 및 distanceTo 메서드 작성
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void distanceTo(Point other) {
        System.out.println(Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2)));
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Point p1 = new Point(x1, y1); // TODO: 생성자 작성 후 주석 해제
        Point p2 = new Point(x2, y2); // TODO: 생성자 작성 후 주석 해제

        // TODO: p1.distanceTo(p2) 출력
        p1.distanceTo(p2);

        sc.close();

    }
}