import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = 0;
        System.out.println("섭씨 온도를 입력하세요: ");
        temperature = sc.nextDouble();
        if (temperature > 15 && temperature < 30) {
            System.out.println("따뜻해요");
        } else if (temperature >-10 && temperature < 15) {
            System.out.println("쌀쌀해요");
        } else if(temperature< 40 && temperature > 30) {
                System.out.println("날씨가 더워요");
        } else {
                System.out.printf("날씨 앱을 보세요^^");
                }
            }
        }