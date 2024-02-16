package array.ex;

import java.util.Scanner;

public class ArrayEx5Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        System.out.println(count + "개의 정수를 입력하세요:");
        int sum = 0;
        int[] numArray = new int[count];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = scanner.nextInt();
            sum += numArray[i];
        }
        double avg = (double) sum / count;
        System.out.println("합:" + sum);
        System.out.println("평균:" + avg);

    }
}
