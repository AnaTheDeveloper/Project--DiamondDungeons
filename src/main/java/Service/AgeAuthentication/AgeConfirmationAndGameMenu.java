package Service.AgeAuthentication;

import Controller.GameAgeAuthentication;
import Controller.NewUserDetailsAuthentication;
import java.util.Scanner;

public class AgeConfirmationAndGameMenu {

  //This class confirms that the user is over 18
  //Once confirmed it opens up the initial game menu: LOG IN or SIGN UP

  public static Boolean ageCheckerAndGameMenu() {

    System.out.println("Hello player!");
    System.out.println("Welcome to Diamond Dungeons!");
    System.out.println("=====================================");

    System.out.println("Please enter you're age to continue: ");

    Scanner userAge = new Scanner(System.in);
    Integer userAgeResponse = Integer.valueOf(userAge.nextLine()); //intergeer.valueOf() <---Turns string to int

    GameAgeAuthentication gameAgeAuthentication = new GameAgeAuthentication();
    Boolean areTheyOver18 = gameAgeAuthentication.gameAgeAuthentication(userAgeResponse);
    return areTheyOver18;
  }
}
