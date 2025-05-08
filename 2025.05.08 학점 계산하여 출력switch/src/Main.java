import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학점을 입력하세요");

        int score = sc.nextInt();
        String grade = "A,B,C,D,E,F";

        switch (score / 10) {
            case 10, 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            case 5, 4, 3, 2, 1:
                grade = "F";
                break;
            default:
                System.out.println("잘못된 점수입니다.");
                return;
        }
        System.out.println("학점은 " + grade + "입니다.");
    }
}