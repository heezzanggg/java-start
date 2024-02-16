package array.ex;

import java.sql.Array;
import java.util.Scanner;

public class ArrayEx2Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요:");
        int[] numArray = new int[5];
        for (int i = 0; i < 5; i++) {
            numArray[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i]);
            if(i<numArray.length -1){
                System.out.print(",");
            }
        }

    }
}
