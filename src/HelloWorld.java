/**
 * Created by opilane on 19.10.2016.
 */
public class HelloWorld {
    public static void main(String[]args){
        String firstLine="Hello, again!";
        System.out.println(firstLine);
        System.out.print("The value of first line is ");
        System.out.println(firstLine);
        int hour = 11;
        int minute = 59;
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");
        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 + minute);
        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute / 60);
        System.out.print("Percent of the hour that has passed: ");
        System.out.println(minute * 100 / 60);
        double pi;
        pi = 3.14159;

        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute / 60.0);



    }


}
