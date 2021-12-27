import java.util.Scanner;
public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String typeVacation = "";
        String destination = "";
        if (budget <= 100){
            destination = "Bulgaria";
            if ("summer".equals(season)){
                budget *= 0.30;
                typeVacation = "Camp";
            }
            if ("winter".equals(season)){
                budget *= 0.70;
                typeVacation = "Hotel";
            }
        }
        else if (budget > 100 && budget <= 1000){
            destination = "Balkans";
            if ("summer".equals(season)){
                budget *= 0.40;
                typeVacation = "Camp";
            }
            if ("winter".equals(season)){
                budget *= 0.80;
                typeVacation = "Hotel";
            }
        }
        else if (budget > 1000){
            destination = "Europe";
            if ("summer".equals(season)){
                budget *= 0.90;
                typeVacation = "Hotel";
            }
            if ("winter".equals(season)){
                budget *= 0.90;
                typeVacation = "Hotel";
            }
        }
        System.out.printf("Somewhere in %s\n",destination);
        System.out.printf("%s - %.2f",typeVacation,budget);
    }
}