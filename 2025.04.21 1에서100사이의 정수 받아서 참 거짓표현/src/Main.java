import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        System.out.println("숫자를 입력해주세요: ");
        num = sc.nextInt();

        if (num >= 1 && num <= 100)
            System.out.println("1에서 100사이의 값입니다.");
         else System.out.println("1에서 100사이의 값이 아닙니다.");
    }
}