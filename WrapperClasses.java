//Mason Jenkins

import java.util.Scanner;

public class WrapperClasses {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Values to sort: ");
		Integer v = Integer.parseInt(scnr.next());
		
		Integer[] array = new Integer[v];
		for (int i = 0; i < v; i++) {
			System.out.println("Integer number " + i + ": ");
			Integer x = Integer.parseInt(scnr.next());
			array[i] = x;
		}
		
		System.out.println("");
		System.out.println("Bubble sorting values.");
		
		for (int j = 0; j < array.length - 1; j++) {
			for (int k = 0; k < array.length - j - 1; k++) {
				if (array[k + 1].compareTo(array[k]) < 0) {
					Integer swap = array[k];
					array[k] = array[k + 1];
					array[k + 1] = swap;
				}
			}
		}
		
		System.out.println("Sorted list: ");
		for (int l = 0; l < array.length; l++) {
			System.out.print(array[l] + "  ");
		}
	}
}
