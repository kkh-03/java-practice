import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("음료를 선택하세요: 1-아메리카노, 2-카페라떼, 3-카푸치노");
        int drink = scanner.nextInt();
        int price1=0, price2=0, price3=0;

        if (drink == 1) {
            price1 = 3000;
        }else if (drink == 2) {
            price1 = 4000;
        }else if (drink == 3) {
            price1 = 4500;
        }else {
            System.out.println("정해진 음료로 선택해주세요. 프로그램을 종료합니다");
             return;
        }

        System.out.println("크기를 선택하세요: 1-Small, 2-Medium, 3-Large ");
        int type = scanner.nextInt();

        if (type == 1) {
            price2 = 0;
        }else if (type == 2) {
            price2 = 500;
        }else if (type == 3) {
            price2 = 1000;
        }else {
            System.out.println("정해진 크기를 선택해주세요. 프로그램을 종료합니다.");
            return;
        }

        System.out.println("옵션을 선택해 주세요: 1-기본, 2-샷추가, 3-시럽추가, 4-샷과시럽모두추가");
        int addoption = scanner.nextInt();

        if (addoption == 1) {
            price3 = 0;
        }else if (addoption == 2) {
            price3 = 500;
        }else if (addoption == 3) {
            price3 = 300;
        }else if (addoption == 4) {
            price3 = 800;
        }else {
            System.out.println("정해진 옵션을 선택해주세요. 프로그램을 종료합니다.");
            return;
        }

        int finalprice = price1 + price2 + price3;
        System.out.println("최종가격은" + finalprice + "원 입니다. ");
        scanner.close();
        }
    }