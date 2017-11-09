//Marshal Chen Period 1
import java.util.Scanner;
public class timeEnglish {
	public static void main(String args[]) {
		Scanner happy = new Scanner(System.in);
		System.out.print("Enter the hour you want to convert: ");
		int hours = happy.nextInt();
		System.out.print("Enter the minutes you want to convert: ");
		int minutes = happy.nextInt();
		String yy =getTimeName(hours,minutes);
		System.out.println(yy);
	}
	public static String getTimeName(int hours, int minutes) {
		String finalone;
			if (minutes == 0) {
				finalone = hours + "o' clock.";
			}
			else if (minutes == 15) {
				finalone = "a quarter past " + hours ;
			}
			else if (minutes == 30) {
				finalone = "half past " + hours;
			}
			else if (minutes == 45) {
				if (hours == 12) {
					finalone = "quarter til 1";
				}
				else {
					int realhour = hours + 1;
					finalone = "quarter till " +realhour;
				}
			}
			else {
				finalone = minutes + " past " + hours;
			}
			return finalone;
				
	}
}
