package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0; //잔액
        int inputAmount = 0; //입력받은 금액
        while (true){
            getForm();
            int choiceNumber = scanner.nextInt();
            switch (choiceNumber) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    inputAmount = scanner.nextInt();
                    balance = deposit(balance, inputAmount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    inputAmount = scanner.nextInt();
                    balance = withdraw(inputAmount, balance);
                    break;
                case 3:
                    System.out.println("현재 잔액: "+balance+"원");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 입력해주세요");
            }
        }

    }

    private static void getForm() {
        System.out.println("---------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("---------------------------------");
        System.out.print("선택: ");
    }

    private static int withdraw(int inputAmount, int balance) {
        if (inputAmount > balance) {
            System.out.println(inputAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            balance -= inputAmount;
            System.out.println(inputAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        }
        return balance;
    }

    private static int deposit(int balance, int inputAmount) {
        balance += inputAmount;
        System.out.println(inputAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }
}
