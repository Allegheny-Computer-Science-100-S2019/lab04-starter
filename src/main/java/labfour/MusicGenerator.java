package labfour;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
* This class allow the user to play different pieces of music.
*/
public class MusicGenerator {

  /** The main method allows for user input,
  * then it plays the music selected by the user.
  */
  public static void main(String[] args) {

    // TODO: display the name of the programmer and the date
    // TODO: display the welcome message with your theme

    // declare the input file and scanner
    File inputFile = null;
    Scanner scanner = null;
    // connect the scanner to the user input file
    try {
      inputFile = new File("input/user_inputs.txt");
      scanner = new Scanner(inputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }

    // Read in an instrument and the tempo from the text file
    String instrument = scanner.next();
    String tempo = scanner.next();

    // TODO: declare the music string file and connect scanner to it

    // TODO: read in musical pieces from the text file
    // you can use nextLine command shown in an example below
    String music1 = scanner.nextLine();
    // read in all of your music strings from the file, one by one

    // TODO: generate three patterns using the music strings
    // The music in one of the patterns/pieces must be randomly generated
    // Incorporate user's input into each pattern

    // TODO: randomly play one of the three musical pieces
  }
}
