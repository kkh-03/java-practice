import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kor = 0, eng = 0, math = 0, science = 0;

        System.out.println("국어 점수를 입력하시오");
        kor = sc.nextDouble();
        System.out.println("영어 점수를 입력하시오");
        eng = sc.nextDouble();
        System.out.println("수학 점수를 입력하시오");
        math = sc.nextDouble();
        System.out.println("과학 점수를 입력하시오");
        science = sc.nextDouble();

        double sum = kor + eng + math + science;
        int intAvg= (int) (sum/4);
        double doubleAvg = sum/4;
        boolean boolResult = false;
        boolResult =intAvg == doubleAvg;

        System.out.println("총함 점수는= "+ sum);
        System.out.println("정수 평균점수는= " + intAvg);
        System.out.println("실수 평균 점수는= " + doubleAvg);
        System.out.println("두 평균값 논리=  " + boolResult);
    }
}