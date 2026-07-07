import java.util.Scanner;

public class switch_9_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();

        /*
        String dayType;

        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "Weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "Weekend";
                break;
            default:
                dayType = "Unknown";
        }*/

        String dayType = switch (day){
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> {
                System.out.println("주중이므로 공부 ㄱ");
                yield "Weekday";
            }
            case "saturday", "sunday" -> {
                System.out.println("주말이어도 공부 ㄱ");
                yield "Weekend";
            }
            default -> "Unknown";
        };
    }
}