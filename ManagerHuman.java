package baitapabc;

import btCandy.Candy;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerHuman {
    ArrayList<Human> humans = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addHuman() {
        System.out.println("nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập giới tính : ");
        String gender = scanner.nextLine();
        System.out.println("nhập địa chỉ: ");
        String address = scanner.nextLine();
        Human human = new Human(name, age, gender, address);
        humans.add(human);
    }

    public void displayllHuman() {
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    public void displaylessThan20() {
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getAge() < 20) {
                System.out.println(humans.get(i));
            }
        }
    }

    public void displayMale() {

        for (Human human : humans) {
            if (human.getGender().equalsIgnoreCase("male")) {
                System.out.println(human);
            }
        }
    }

    public void displayfeelMale() {

        for (Human human : humans) {
            if (human.getGender().equalsIgnoreCase("fellmale")) {
                System.out.println(human);
            }
        }
    }

    public void deleteByName() {
        String name = scanner.nextLine();
        humans.removeIf(human -> human.getName().equals(name));
    }

    public void displayByName() {
        String name = scanner.nextLine();
        for (Human human : humans) {
            if (human.getName().equals(name)) {
                System.out.println(human);
            }

        }
    }

    public void editByName(String name, Scanner scanner) {
        Human humanedit = null;
        for (Human human : humans) {
            humanedit = human;
            if (name == human.getName()) {
                System.out.println("nhập tên mới :");
                humanedit.setName(scanner.nextLine());
                System.out.println("nhập tuổi mới : ");
                humanedit.setAge(scanner.nextInt());
                System.out.println("nhập giới tính mới");
                humanedit.setGender(scanner.nextLine());
                System.out.println("nhâp đỉa chỉ mới:");
            }

        }

    }

    public void searchByName() {
        String name = scanner.nextLine();
        for (Human human : humans) {
            if (human.getName().equals(name)){
                System.out.println(human);
            }
        }
    }
}

