//Marshal Chen Period 1
import java.util.Scanner;
public class romanNumerals {
	public static void main(String[] args) {
		Scanner lk = new Scanner(System.in);
		System.out.print("Enter the number you want to translate: ");
		int rec = lk.nextInt();
		int temp = 0;
		temp = rec;
		String firstdigit = romanDigit(rec%10,"I","V","X");
		rec = rec/10;
		String seconddigit = romanDigit(rec%10, "X", "L", "C");
		rec = temp/100;
		String thirddigit = romanDigit(rec%10,"C","D","M");
		System.out.println(thirddigit+seconddigit+firstdigit);
	}
	public static String romanDigit(int n, String one, String five, String ten) {
		String finalone = "";
		if (n<4) {
			for(int x = 0; x<n;x++) {
			finalone += one;
			}
		}
		else if (n==4) {
			finalone = one+five;
		}
		else if (n== 5) {
			finalone = five;
		}
		else if(n>5 && n<9) {
			finalone = five;
			for (int x = 0; x<(n-5);x++) {
			finalone +=one;
			}
		}
		else if(n==10) {
			finalone = ten;
		}
		else if(n==9) {
			finalone = one+ten;
		}
		return finalone;
	}
}
