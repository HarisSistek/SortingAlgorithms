import java.util.Scanner;

import java.io.File;
import java.io.IOException;

class Sorting {
    
    static int nr;
    static int[] numbers;
    static int[] copy;
    
    Sorting() {
	
    }
    
    private static void readInNumbers() {
	nr = 1000000;
	numbers = new int[nr];
	Scanner sc;
	
	try {
	    sc = new Scanner(new File("Numbers.txt"));

	    int i = 0;
	    while (sc.hasNext()) {
		numbers[i++] = sc.nextInt();
		//System.out.println(numbers[i-1]);
	    }
	    
	    System.out.println("Number of random numbers " + i);
	} catch (IOException ioe) {}	
	
    }

    public static void main (String[] args) {
	long start, stop;

	start = System.nanoTime();
	readInNumbers();
	stop = System.nanoTime() - start;
	System.out.println("Time to read file: " + stop/1000000 + " ms or about " + (stop/1000000)/1000 + " s");
	
	start = System.nanoTime();
	InsertionSort(false);///////longer than 3 min, not worth the wait :P	
	stop = System.nanoTime() - start;
	System.out.println("Time to sort with insertion: " + stop/1000000 + " ms or about " + (stop/1000000)/1000 + " s");
	
    }

    /**
     *Im missing something, finish later
     */
    private static void InsertionSort(boolean b) {
	if (!b)
	    return;
	
	copy = numbers;

	for (int i = 0; i < copy.length; i++) {//for the length of the array of the numbers
	    int j = i;//rember the postion
	    int tmp = copy[i];//rember the number
	    
	    while ((j > 0) && (copy[j-1] > tmp)) {//search for a above 0 
		copy[j] = copy[j-1];
		j--;
	    }
	}
    }
    
}
