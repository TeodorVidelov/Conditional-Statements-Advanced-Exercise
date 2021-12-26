import java.util.Scanner;
public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (10 <= degrees && degrees <= 18){
            if ("Morning".equals(timeOfDay)){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }
            else if ("Afternoon".equals(timeOfDay)){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if ("Evening".equals(timeOfDay)){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        else if (18 < degrees && degrees <= 24){
            if ("Morning".equals(timeOfDay)){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if ("Afternoon".equals(timeOfDay)){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
            else if ("Evening".equals(timeOfDay)){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        else if (degrees >= 25){
            if ("Morning".equals(timeOfDay)){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
            else if ("Afternoon".equals(timeOfDay)){
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
            else if ("Evening".equals(timeOfDay)){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        System.out.printf("It's %s degrees, get your %s and %s.",degrees,outfit,shoes);
    }
}