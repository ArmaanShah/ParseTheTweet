/*
 *  * ParseTheTweet.java
 * Author: Armaan Shah 
 * Submission Date: September 12th
 *
 * Purpose:The following program parses through a tweet that is inputted by a user and divides up to information into sections based on the type of information. 
 * Each one of these sections is then manipulated to make it easier to read, and the results are then printed. 
 * Statement of Academic Honesty:


import java.util.Scanner;

public class ParseTheTweet {
	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);

		// Declaration of all variables

		String tweet;
		int start;
		int finish;
		String type;
		String detail;
		String location;
		double latitude;
		double longitude;

		// Stores user input into "tweet" variable

		System.out.println("Enter a tweet below:");

		tweet = Input.nextLine();

		// searching for "#typ" and storing information inside "type"
		start = tweet.indexOf("#typ") + 5;
		finish = tweet.indexOf(";", start);
		type = tweet.substring(start, finish).trim().toUpperCase();
		tweet = tweet.substring(finish + 1);//Discards the #typ information in the string

		// searching for "det" and storing information inside "details"
		start = tweet.indexOf("#det") + 5;
		finish = tweet.indexOf(";", start);
		detail = tweet.substring(start, finish).trim();
		detail = detail.replace(",", "-"); 
		tweet = tweet.substring(finish + 1); //Discards the #det information in the string

		  // searching for "#loc" and storing the information inside "location"
        start = tweet.indexOf("#loc") + 5;
        finish = tweet.indexOf(";", start);
        location = tweet.substring(start, finish).trim(); 
        location = location.replace(",", "-");
        tweet = tweet.substring(finish + 1); //Discards the #loc information in the string
        
		  // searching for "#lat" and storing the information inside "latitude"
        start = tweet.indexOf("#lat") + 5; 
        finish = tweet.indexOf(";", start);
        latitude = Double.parseDouble(tweet.substring(start, finish).trim()); // Extract and convert to double
        tweet = tweet.substring(finish + 1); //Discards the #lat information in the string

		  // searching for "#lng" and storing the information inside "longitude"
        start = tweet.indexOf("#lng") + 5; 
        finish = tweet.indexOf(";", start); 
        longitude = Double.parseDouble(tweet.substring(start, finish).trim()); // Extract and convert to double
          // Printing results
        System.out.println("Type:\t\t" + type);
        System.out.println("Detail:\t\t" + detail);
        System.out.println("Location:\t" + location);
        System.out.println("Latitude:\t" + latitude);
        System.out.println("Longitude:\t" + longitude);

	}
}
