package array.ex;

import java.util.Scanner;

public class ArrayEx3Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요:");
        int[] numArray = new int[5];
        for (int i = 0; i < 5; i++) {
            numArray[i] = scanner.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력");
//        int size = numArray.length;
//        for (int i = 0; i < size; i++) {
//            System.out.print(numArray[size-1-i]);
//            if(i<numArray.length -1){
//                System.out.print(",");
//            }
//        }
//
        for(int i = 4;i>=0;i--){
            System.out.print(numArray[i]);
            if(i>0){
                System.out.print(",");
            }
        }

    }
}
