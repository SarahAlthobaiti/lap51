// Sarah Mohammed Althobaiti / class 6 / 444004881.
import java.util.Arrays;
import java.util.Scanner;

/** 
   This program creates a list of songs for a CD by reading from a file. */ 

public class CompactDisc 
{ 
   public static void main(String[] args)
   { 
   
     Scanner input = new Scanner(System.in);
     String title; 
     String artist; 


     // add code line: Declare an array of Song objects, called cd, with a size of 6 

      Song[] cd = new Song[6];
	 
	 
     for (int i = 0; i < cd.length; i++) 
    {  
         System.out.print("Enter song title #" + (i+1)+": ");
	   //add code line: read title as input from user
         title = input.nextLine();
 
	   System.out.print("Enter the song artist: " );
	   //add code line: read artist name as input from user
         artist = input.nextLine();
 
         System.out.println();
   
         //add code lines:
	   // Fill the array by creating a new song with 
	   // the title and artist and storing it in the 
	   // appropriate position in the array 
	    cd[i] = new Song(title,artist);
	 
    } 

    System.out.println("Contents of Classics:"); 

     for (int i = 0; i< cd.length; i++) 
     { 
    
	   // add code line: Print the contents of the array to the console
				System.out.print(cd[i].toString());
	
     } 
   } 
} 
