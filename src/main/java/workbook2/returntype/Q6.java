package main.java.workbook2.returntype;

import java.util.Scanner;

class Student {
    String name;
    int score;
    Student(String name, int score) {
        this.name = name; this.score = score;
    }
}

public class Q6 {
    // TODO: bestStudent 메서드 작성 (Student 세 명 중 최고 점수를 받은 학생 반환)
    public Student bestStudent(Student stu1, Student stu2, Student stu3) {
        Student best;

        if (stu1.score >= stu2.score) {
            if (stu1.score >= stu3.score) {
                best = stu1;
            } else {
                best = stu3;
            }
        } else {
            if (stu2.score >= stu3.score) {
                best = stu2;
            } else {
                best = stu3;
            }
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next(); int s1 = sc.nextInt();
        String n2 = sc.next(); int s2 = sc.nextInt();
        String n3 = sc.next(); int s3 = sc.nextInt();

        Q6 q6 = new Q6();

        Student st = q6.bestStudent(new Student(n1,s1), new Student(n2,s2), new Student(n3,s3)); // TODO: bestStudent 메서드 작성 후 주석 해제
        // TODO: st.name과 st.score 출력

        System.out.println(st.name + " " + st.score);

        sc.close();

    }
}
