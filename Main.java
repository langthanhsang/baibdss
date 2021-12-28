package baitapabc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerHuman managerHuman = new ManagerHuman();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("*******menu******");
            System.out.println("1.hiển thị tất cả: ");
            System.out.println("2.hiển thị tất cả nam");
            System.out.println("3.hiển tất cả nữ");
            System.out.println("4. hiển thị tất cả người dưới 20 tuổi: ");
            System.out.println("5.thêm 1 người: ");
            System.out.println("6. xoá người theo tên: ");
            System.out.println("7. sủa theo tên: ");
            System.out.println("8.hiên thị theo tên nhập:  ");
            System.out.println("0.exit");
            choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("1.hiển thị tất cả: ");
                    managerHuman.displayllHuman();
                    break;
                case 2:
                    System.out.println("2.hiển thị tất cả nam");
                    managerHuman.displayMale();
                    break;
                case 3:
                    System.out.println("3.hiển tất cả nữ");
                    managerHuman.displayfeelMale();
                    break;
                case 4:
                    System.out.println("4. hiển thị tất cả người dưới 20 tuổi: ");
                    managerHuman.displaylessThan20();
                    break;

                case 5:
                    System.out.println("5.thêm 1 người: ");
                    managerHuman.addHuman();
                    break;
                case 6:
                    System.out.println("6. xoá người theo tên: ");
                    managerHuman.deleteByName();
                case 7:
                    System.out.println("7. sủa theo tên: ");
                    managerHuman.displayByName();

                case 8:
                    System.out.println("8.tìm theo ten");
                    managerHuman.searchByName();

                case 0:
                    System.out.println("0. exit");

            }

        }while (choice != 0) ;
    }
}
