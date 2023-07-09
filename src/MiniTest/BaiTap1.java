package MiniTest;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayInPrime(sc);

    }
    public static void PlayInPrime(Scanner sc){
        System.out.println("nhập vào số lượng số nguyên tố cần in ra");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 2; i < 10000; i++) {
            if (count < number) {
                boolean flag = true;
                for (int j = 2; j <=Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(i);
                    count++;
                }

            }

        }
    }

}
