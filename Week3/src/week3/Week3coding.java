//I had an issue with pushing the code to github from eclipse
//that is why I pushed the code late. I'm still working on the
//issue. Sorry
package week3;

import java.util.Arrays;

	public class Week3coding {

		 public static void main(String[] args) {
			  
			  int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 34};  //Create an array of int called ages containing values 3, 9, 23, 64, 2, 8, 28, 93
			  int Last = (ages[ages.length-1]) - ages[0]; //Add a new age (34) 
			  System.out.println("The last positon minus the first positon is: " + Last);
			  int ageSum = 0;
			  for (int i=0; i<ages.length; i++) {
			  			ageSum += ages[i];
		}
			  System.out.println("The average age is: " + ageSum / ages.length); //average age
			  System.out.println();
		    
			  String[] names = {"Sam", "Tommy", "Sally", "Buck", "Bob"}; //Create an array of String with names
			  int letters = 0;
			  for (String name: names) {
		      letters += name.length();
		      
		    } 
			 int avgLetters = letters / names.length;
		    System.out.println("The average letters are: " + avgLetters);
		    
		    int i = 0;//Use a loop to iterate names again
		    String listNames = "";
		    while (i<names.length) {
		      listNames += names[i];
		      i++; 
		      	if (i == names.length) {
		    	  
		      }listNames += ", ";
		    } System.out.println("The names are as follows: " + listNames);
		      System.out.println();
		      
		    //3. How to access last element of any array? You use this "array.length -1" to access the last element 
		    //4. Access first element? You would user "array[0]" to access the first element 
		  
		    int[] nameLengths = new int [names.length];//Create new array of nameLengths
		    int j = 0;
		    for (String name : names) {     
		      nameLengths[j] = names[j].length();
		      System.out.println(nameLengths[j]);
		      System.out.println();
		      j++;
		      } System.out.println(Arrays.toString(nameLengths));
		        System.out.println();
		
		    int nameSum = 0;//Write loop to iterate nameLengths, calculate sum of all elements, print to console
		    for (int k = 0; k < nameLengths.length; k++) {
		      nameSum += nameLengths[k];
		      } System.out.println("The sum of the names are: " + nameSum);
		      	System.out.println();
		      
		      System.out.println(getFullName("Amier", "Hajyassin "));
		      System.out.println();
		      System.out.println(checkSumGreaterThan100(ages)); // I used the ages[] since i have an array written out 
		      System.out.println();
		    
		      //Write a method that takes an array of double and returns the average of all the elements in the array.
		       double[] myArr = new double[3];

				myArr[0] = 8.99;
				myArr[1] = 7.65;
				myArr[2] = 10.45;

				System.out.println(averageDouble(myArr));
				System.out.println(); 
				
				double[] aArray = new double[2];
				// value of 2 elements in array

				aArray[0] = 5.4;
				aArray[1] = 3.2;

				double[] bArray = new double[2];

				bArray[0] = 2.5;
				bArray[1] = 1.2;

				System.out.println(isGreaterAverage(aArray, bArray));
				System.out.println(); 
				
				
				//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
				//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
				
				System.out.println(willBuyDrink(true, 21.54));
				System.out.println();
				
				String word = "Hey"; // Method that prints a string a number of times 
			    int times = 5;	  // I did this because I didn't number stand it in the homework and I wanted to do it so I can understand it. 		
			    String concatWord = concatWordInt(word, times);
			    System.out.println(concatWord);
			    System.out.println();
			  	
		      
}
		 public static String concatWordInt(String word, int times) {
		    String concattedWord = "";
		    int numTimes = 0;
		    do {
		    	
		      concattedWord += word;
		      numTimes++;
		      
		    }while (numTimes < times);
		    	return concattedWord;
		    	
		  	}
		 public static String getFullName(String firstName, String lastName) {
				return(firstName + " " + lastName);
		 	}
		 public static Boolean checkSumGreaterThan100(int[] arr) {
				return Arrays.stream(arr).sum() > 100;
			}
		 public static double averageDouble(double arr[]) {
				double sum = 0.0;
				for (double num : arr) {

					sum += num;
				}
				return sum / arr.length;

			}
		 public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {

				return ((isHotOutside == true) && (10.5 < moneyInPocket));

	}
		 public static boolean isGreaterAverage(double aArray[], double bArray[]) {

				double sum1 = 0.0;
				for (double num1 : aArray) {

					sum1 += num1;
				}
				double average1 = sum1 / aArray.length;

				double sum2 = 0.0;
				for (double num2 : bArray) {

					sum2 += num2;
				}
				double average2 = sum2 / bArray.length;

				if (average1 > average2) {
					return true;

				} else {

					return false;
				}
		  
	
	}
}
