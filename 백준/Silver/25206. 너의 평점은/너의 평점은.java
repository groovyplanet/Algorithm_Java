import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0; // 학점의 합을 저장할 변수
        double sum = 0.0; // (학점 * 평점)의 합을 저장할 변수

        for (int i = 0; i < 20; i++) {
            String[] index = scanner.nextLine().split(" ");
            double score = Double.parseDouble(index[1]);
            String grade = index[2];

            if (!grade.equals("P")) {
                switch (grade) {
                    case "A+":
                        sum += score * 4.5;
                        break;
                    case "A0":
                        sum += score * 4.0;
                        break;
                    case "B+":
                        sum += score * 3.5;
                        break;
                    case "B0":
                        sum += score * 3.0;
                        break;
                    case "C+":
                        sum += score * 2.5;
                        break;
                    case "C0":
                        sum += score * 2.0;
                        break;
                    case "D+":
                        sum += score * 1.5;
                        break;
                    case "D0":
                        sum += score * 1.0;
                        break;
                    case "F":
                        sum += score * 0.0;
                        break;
                }
                total += score; // 학점의 총합 계산
            }
        }

        if (total > 0) {
            double result = sum / total;
            System.out.printf("%.6f\n", result); // %.6f= 소수점 아래 6자리
        } else {
            System.out.println("0.000000");
        }

        scanner.close();
    }
}
