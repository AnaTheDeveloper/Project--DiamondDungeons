package Controller.GameMenuController;

import java.util.Scanner;

public class AuthenticationMenu {


  public void authenticationScreen() {

    System.out.println("Type in a number to select your option:");
    System.out.println("[1] Log in");
    System.out.println("[2] Sign Up");
    System.out.println("[3] Exit");

    Scanner menuOption = new Scanner(System.in);
    String menuOptionResponse = menuOption.nextLine();

    if (menuOptionResponse.equals("3")){
      System.out.println("Thanks for playing");
      System.exit(0);
    }

    AuthenticationMenuSelection authenticationMenuSelection = new AuthenticationMenuSelection();
    authenticationMenuSelection.checkMenuSelection(menuOptionResponse);

    //Above cycles through the menu options.

  }

}
