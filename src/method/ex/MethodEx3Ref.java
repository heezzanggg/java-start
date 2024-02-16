package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;

        //입금 1000
        balance = deposit(1000, 10000);

        //출금 2000
        balance = withdraw(2000, balance);

        System.out.println("최종 잔액: " + balance + "원");
    }

    private static int deposit(int depositAmount, int balance) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    private static int withdraw(int withdrawAmount, int balance) {
        if (withdrawAmount > balance) {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance);
        }
        return balance;
    }
}
