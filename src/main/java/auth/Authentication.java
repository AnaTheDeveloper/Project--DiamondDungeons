package auth;

import Controller.NewUserDetailsAuthentication;
import java.util.Scanner;

public class Authentication {


  public void authenticationScreen() {

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
