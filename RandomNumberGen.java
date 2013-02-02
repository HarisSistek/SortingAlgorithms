import java.util.Random;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


/**
 *Create 1 million random numbers to the file "Number.txt"
 */
class RandomNumberGen {
        
    public static void main(String[] args){
	
	wirteNumbersToFile();

    }

    private static void wirteNumbersToFile() {
	Random r = new Random();

	try {
	    PrintWriter printOut = new PrintWriter(new FileWriter("Numbers.txt"));
	    
	    for (int i = 0; i < 1000000; i++) {
		printOut.println(r.nextInt());
	    }
	    
	    printOut.close();
	} catch (IOException ioe) {

	}
    }
}


