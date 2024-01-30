public class MadLibs {
/*
This program generates a story
author: John
Date: 30/1/2024
 */
	  public static void main(String[] args) {

	    // Declare and initialize variables
	    String name1 = "Alex"; // Protagonist's name
	    String adjective1 = "happy";
	    String adjective2 = "exciting";
	    String adjective3 = "curious";
	    String verb1 = "dance";
	    String noun1 = "flowers";
	    String noun2 = "books";
	    String noun3 = "music";
	    String noun4 = "birds";
	    String noun5 = "ice cream";
	    String noun6 = "robots";
	    String name2 = "Emily";
	    int number = 2050; // Any whole number
	    String place1 = "Mars";

	    // The template for the story
	    String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a " + adjective2
	        + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores. They began to " + verb1
	        + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3 + ". Concerned, " + name1
	        + " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen "
	        + noun5 + ". " + name1 + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

	    // Print the story
	    System.out.println(story);
	  }
}
