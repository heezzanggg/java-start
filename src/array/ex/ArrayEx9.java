package array.ex;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {

        int maxProductsCount = 10;
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0; //현재 등록된 상품의 개수

        Scanner sc = new Scanner(System.in);

        while (true) {

            getForm();
            int menuNum = sc.nextInt();
            sc.nextLine();
            if(menuNum == 1){
                if (productCount >= maxProductsCount) {
                    System.out.println("더이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = sc.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = sc.nextInt();

                productCount++;
            } else if (menuNum == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            } else if (menuNum == 3) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("잘못된 메뉴 선택");

            }
        }
    }

    private static void getForm() {
        System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
        System.out.print("메뉴를 선택하세요:");
    }
}
