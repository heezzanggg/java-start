package array.ex;

import java.util.Scanner;

public class ArrayEx6Ref {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = sc.nextInt();

        int[] numbers = new int[count];
        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }

        int minNum = numbers[0];
        int maxNum = numbers[0];

        for (int number : numbers) {
            if (number > maxNum) {
                maxNum = number;
            }
            if (number < minNum){
                minNum = number;
            }
        }

        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수: " + maxNum);
    }
}
