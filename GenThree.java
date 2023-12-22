/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int Range2 = Integer.parseInt(args[1]);
		int Range1 = Integer.parseInt(args[0]);
		int RangeDifference = Math.abs(Range1 - Range2);
		int RangeMin = Math.min(Range1, Range2);
		int RandomNum1 = (int) ((Math.random() * RangeDifference) + RangeMin);
		int RandomNum2 = (int) ((Math.random() * RangeDifference) + RangeMin);
		int RandomNum3 = (int) ((Math.random() * RangeDifference) + RangeMin);
		System.out.println(RandomNum1);
		System.out.println(RandomNum2);
		System.out.println(RandomNum3);
		int MinRandomNum1_2 = Math.min(RandomNum1, RandomNum2);
		int MinRandomNum1_2_3 = Math.min(MinRandomNum1_2, RandomNum3);
		System.out.println("The minimal generated number was " + MinRandomNum1_2_3);
	}
}
