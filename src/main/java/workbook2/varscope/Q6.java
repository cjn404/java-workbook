package main.java.workbook2.varscope;

import java.util.Scanner;

class Bank {
    static int totalBalance = 0;       // 클래스 변수(모든 계좌 총액)
    int balance;                       // 인스턴스 변수(계좌 잔액)
    Bank(int balance) {                // 생성자(초기 입금)
        this.balance = balance;
        totalBalance += balance;       // 총액 갱신
    }
    void deposit(int amount) {
        // TODO: balance와 totalBalance 증가
        balance += amount;
        totalBalance += amount;
    }
    void withdraw(int amount) {
        // TODO: balance와 totalBalance 감소
        balance -= amount;
        totalBalance -= amount;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal1 = sc.nextInt();       // 첫 번째 계좌
        int bal2 = sc.nextInt();       // 두 번째 계좌
        Bank acc1 = new Bank(bal1);    // 첫 번째 계좌 생성
        Bank acc2 = new Bank(bal2);    // 두 번째 계좌 생성

        // 첫 번째 연산 처리
        String op1 = sc.next();
        int id1 = sc.nextInt();
        int amt1 = sc.nextInt();

        if (op1.equals("deposit")) {
            if (id1 == 1) acc1.deposit(amt1);
            else acc2.deposit(amt1);
        } else if (op1.equals("withdraw")) {
            if (id1 == 1) acc1.withdraw(amt1);
            else acc2.withdraw(amt1);
        }

        // 두 번째 연산 처리
        String op2 = sc.next();
        int id2 = sc.nextInt();
        int amt2 = sc.nextInt();

        if (op2.equals("deposit")) {
            if (id2 == 1) acc1.deposit(amt2);
            else acc2.deposit(amt2);
        } else if (op2.equals("withdraw")) {
            if (id2 == 1) acc1.withdraw(amt2);
            else acc2.withdraw(amt2);
        }

        // Bank.totalBalance 출력
        System.out.println(Bank.totalBalance);

        sc.close();

    }
}
