import java.util.Scanner;
public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeProjection = scanner.nextLine();
        int countRows = Integer.parseInt(scanner.nextLine());
        int countColumns = Integer.parseInt(scanner.nextLine());

        double Premiere = 12.00;
        double Normal = 7.50;
        double Discount = 5.00;
        double totalSum = 0;

        if ("Premiere".equals(typeProjection)){
            totalSum = Premiere * countColumns * countRows;
        }
        else if ("Normal".equals(typeProjection)){
            totalSum = Normal * countColumns * countRows;
        }
        else if ("Discount".equals(typeProjection)){
            totalSum = Discount * countColumns * countRows;
        }
        System.out.printf("%.2f",totalSum);
    }
}