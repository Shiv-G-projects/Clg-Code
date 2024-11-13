import java.util.*;
public class Time {
    private int hour;
    private int minute;
    private int second;
    private int year;
    private int day;
    private int month;
    private Boolean error;

    public void input(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the year: ");
        year =  keyboard.nextInt();
        System.out.println("Enter the month: ");
        month =  keyboard.nextInt();
        System.out.println("Enter the day: ");
        day =  keyboard.nextInt();
        System.out.println("Enter the hour: ");
        hour =  keyboard.nextInt();
        System.out.println("Enter the minute: ");
        minute =  keyboard.nextInt();
        System.out.println("Enter the second: ");
        second =  keyboard.nextInt();
        errorChecking();
        if (error == true){
            input();
        }
    }
    public void print(){
        System.out.println(hour + ":" + minute + ":" + second);
    }
    public void PrintStandardTime(){
        int standardHour;
        String half;
        if (hour > 12){
            standardHour = hour % 12;
            half = "PM";
        }
        else {
            standardHour = hour;
            half = "AM";
        }
        System.out.println("Based on your entry, the Standard time is " + month + "-" + day + "-" + year + ", " + standardHour + ":" + minute + ":" + second +" "+ half);
    }
    public void PrintMilitaryTime(){
        System.out.println("Based on your entry, the Military time is " + day + "-" + month + "-" + year + ", " + hour + ":" + minute + ":" + second);
    }
    private Boolean errorChecking(){
        error = false;
        if (hour >= 24){
            System.out.println("Hour entry is invalid");
            error = true;
        }
        if (month >= 13){
            System.out.println("Month entry is invalid");
            error = true;
        }
        if (minute >= 60){
            System.out.println("Minute entry is invalid");
            error = true;
        }
        if (second >= 60){
            System.out.println("Second entry is invalid");
            error = true;
        }
        if (day >= 32){
            System.out.println("Day entry is invalid");
            error = true;
        }
        return error;
    }
}
