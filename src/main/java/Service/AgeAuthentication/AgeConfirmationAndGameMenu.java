package Service.AgeAuthentication;

import Controller.GameAgeAuthentication;
import Controller.NewUserDetailsAuthentication;
import java.util.Scanner;

public class AgeConfirmationAndGameMenu {

  //This class confirms that the user is over 18
  //Once confirmed it opens up the initial game menu: LOG IN or SIGN UP

  public static void ageCheckerAndGameMenu() {

    System.out.println("Hello player!");
    System.out.println("Welcome to Diamond Dungeons!");
    System.out.println("=====================================");

    System.out.println("Please enter you're age to continue: ");

    Scanner userAge = new Scanner(System.in);
    Integer userAgeResponse = Integer.valueOf(userAge.nextLine());

    GameAgeAuthentication gameAgeAuthentication = new GameAgeAuthentication();
    Boolean areTheyOver18 = gameAgeAuthentication.gameAgeAuthentication(userAgeResponse);

    if (areTheyOver18 == true) {
      System.out.println("Type in a number to select your option:");
      System.out.println("[1] Log in");
      System.out.println("[2] Sign Up");

      Scanner menuOption = new Scanner(System.in);
      String menuOptionResponse = menuOption.nextLine();

      NewUserDetailsAuthentication newUserDetailsAuthentication = new NewUserDetailsAuthentication();
      newUserDetailsAuthentication.checkMenuSelection(menuOptionResponse);

      //Above cycles through the menu options.

    }
  }
}
