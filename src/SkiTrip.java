import java.util.Scanner;
public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysForStay = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String grade = scanner.nextLine();

        int countNightsAtHotel = daysForStay - 1;
        double price = 0;

        if ("room for one person".equals(typeRoom)){
            price = 18 * countNightsAtHotel;
        }
        else if ("apartment".equals(typeRoom)){
            price = 25 * countNightsAtHotel;
            if (countNightsAtHotel < 10){
                price *= 0.70;
            }
            else if (countNightsAtHotel > 10 && countNightsAtHotel <= 15){
                price *= 0.65;
            }
            else if (countNightsAtHotel > 15){
                price *= 0.50;
            }
        }
        else if ("president apartment".equals(typeRoom)){
            price = 35 * countNightsAtHotel;
            if (countNightsAtHotel < 10){
                price *= 0.90;
            }
            else if (countNightsAtHotel > 10 && countNightsAtHotel <= 15){
                price *= 0.85;
            }
            else if (countNightsAtHotel > 15){
                price *= 0.80;
            }
        }
        if ("positive".equals(grade)){
            price *= 1.25;
        }
        else if ("negative".equals(grade)){
            price *= 0.90;
        }
        System.out.printf("%.2f",price);
    }
}