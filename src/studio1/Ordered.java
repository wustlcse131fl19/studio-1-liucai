package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");  //5
		int y = ap.nextInt("Value for y?");  //6
		int z = ap.nextInt("Value for z?");  //7
		boolean isOrdered = (x < y  && y < z) || (x >y  && y > z);


System.out.println(isOrdered);
	}

}
