import java.util.Scanner;
public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;

        if ("May".equals(month) || "October".equals(month)){
            priceStudio = 50 * countNights;
            priceApartment = 65 * countNights;
            if (countNights > 7 && countNights < 14){
                priceStudio *= 0.95;
            }
            else if (countNights > 14){
                priceStudio *= 0.70;
            }
        }
        else if ("June".equals(month) || "September".equals(month)){
            priceStudio = 75.20 * countNights;
            priceApartment = 68.70 * countNights;
            if (countNights > 14){
                priceStudio *= 0.80;
            }
        }
        else if ("July".equals(month) || "August".equals(month)){
            priceStudio = 76 * countNights;
            priceApartment = 77 * countNights;
        }
        if (countNights > 14){
            priceApartment *= 0.90;
        }
        System.out.printf("Apartment: %.2f lv.\n",priceApartment);
        System.out.printf("Studio: %.2f lv.",priceStudio);
    }
}