/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int Cents = Integer.parseInt(args[0]);
		int Quarters = Cents/25;
		int SingleCents = Cents%25;
		System.out.println("Use " + Quarters + " quarters and " + SingleCents + " cents");
	}
}