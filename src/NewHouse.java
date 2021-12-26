import java.util.Scanner;
public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double Roses = 5;
        double Dahlia = 3.80;
        double Tulips = 2.80;
        double Narcissus = 3;
        double Gladiolus = 2.50;
        double totalSum = 0;

        if ("Roses".equals(typeFlowers)){
            totalSum = Roses * countFlowers;
            if (countFlowers > 80){
                totalSum *= 0.90;
            }
        }
        if ("Dahlias".equals(typeFlowers)){
            totalSum = Dahlia * countFlowers;
            if (countFlowers > 90){
                totalSum *= 0.85;
            }
        }
        if ("Tulips".equals(typeFlowers)){
            totalSum = Tulips * countFlowers;
            if (countFlowers > 80){
                totalSum *= 0.85;
            }
        }
        if ("Narcissus".equals(typeFlowers)){
            totalSum = Narcissus * countFlowers;
            if (countFlowers < 120){
                totalSum *= 1.15;
            }
        }
        if ("Gladiolus".equals(typeFlowers)){
            totalSum = Gladiolus * countFlowers;
            if (countFlowers < 80){
                totalSum *= 1.20;
            }
        }
        if (budget >= totalSum){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",countFlowers,typeFlowers,Math.abs(budget - totalSum));
        }
        else {
            System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(budget - totalSum));
        }
    }
}