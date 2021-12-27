import java.util.Scanner;
public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFishermen = Integer.parseInt(scanner.nextLine());

        double priceRentingTheShip = 0;

        if ("Spring".equals(season)){
            priceRentingTheShip = 3000;
            if (countFishermen <= 6){
                priceRentingTheShip *= 0.90;
            }
            else if (countFishermen > 7 && countFishermen <= 11){
                priceRentingTheShip *= 0.85;
            }
            else if (countFishermen > 12){
                priceRentingTheShip *= 0.75;
            }
        }
        if ("Summer".equals(season) || "Autumn".equals(season)){
            priceRentingTheShip = 4200;
            if (countFishermen <= 6){
                priceRentingTheShip *= 0.90;
            }
            else if (countFishermen > 7 && countFishermen <= 11){
                priceRentingTheShip *= 0.85;
            }
            else if (countFishermen > 12){
                priceRentingTheShip *= 0.75;
            }
        }
        if ("Winter".equals(season)){
            priceRentingTheShip = 2600;
            if (countFishermen <= 6){
                priceRentingTheShip *= 0.90;
            }
            else if (countFishermen > 7 && countFishermen <= 11){
                priceRentingTheShip *= 0.85;
            }
            else if (countFishermen > 12){
                priceRentingTheShip *= 0.75;
            }
        }
        if (countFishermen % 2 == 0 && !"Autumn".equals(season)){
            priceRentingTheShip *= 0.95;
        }
        if (budget >= priceRentingTheShip){
            System.out.printf("Yes! You have %.2f leva left.",Math.abs(budget - priceRentingTheShip));
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva.",Math.abs(budget - priceRentingTheShip));
        }
    }
}