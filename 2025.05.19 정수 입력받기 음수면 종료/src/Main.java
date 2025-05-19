import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        System.out.println("정수를 입력하세요(종료하려면 음수를 입력): ");

    while(true) {
        num = sc.nextInt();
        if (num >= 0) {
            sum += num;
        } else if (sum == 0) {
            System.out.println("입력된 점수가 없습니다.");
            return;
        } else if (num < 0){
            break;
        }
    }
        System.out.println("점수의 총합은: " + sum);
    }
}