import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int month = in.nextInt();
        int day = in.nextInt();
        int[] dayInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfTheMonth = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        int totalDays = day;
        for (int i = 0; i < month - 1; i++) {
            totalDays += dayInMonth[i];
        }
        System.out.println(dayOfTheMonth[totalDays % 7]);
    }
}