import java.util.Scanner;
public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int examSumMinutes = examHour * 60 + examMinutes;
        int arriveSumMinutes = arriveHour * 60 + arriveMinutes;

        int diff = Math.abs(examSumMinutes - arriveSumMinutes);
        int diffHour = diff / 60;
        int diffMinutes = diff % 60;

        if (examSumMinutes < arriveSumMinutes) {
            System.out.println("Late");
            if (diffHour == 0) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                System.out.printf("%d:%02d hours after the start", diffHour, diffMinutes);
            }
        }
        else if (examSumMinutes == arriveSumMinutes || diff <= 30){
            System.out.println("On time");
            if (diff != 0){
                System.out.printf("%d minutes before the start",diffMinutes);
            }
        }
        else {
            System.out.println("Early");
            if (diffHour == 0) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                System.out.printf("%d:%02d hours before the start", diffHour, diffMinutes);
            }
        }
    }
}