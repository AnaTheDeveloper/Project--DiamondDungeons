package Service.GameMenuServices;

import DataAccessLayer.GameDatabase;
import Model.LogInScreen;
import Controller.GameMenuController.AuthenticationMenu;
import java.util.Scanner;

public class AccountSignUp {


  public void creatingANewAccount(){

    System.out.println("Please enter a username: ");
    Scanner usernameInput = new Scanner(System.in);
    String usernameSavedResponse = usernameInput.nextLine();

    System.out.println("Please Enter a Password");
    Scanner passwordInput = new Scanner(System.in);
    String passwordSavedResponse = passwordInput.nextLine();

    LogInScreen logInScreenProfile = new LogInScreen(usernameSavedResponse, passwordSavedResponse);

    GameDatabase.addingNewAccountToTheDatabase(logInScreenProfile);

    System.out.println("Thanks for signing up! Now sign in please:");

    AuthenticationMenu authenticationMenu = new AuthenticationMenu();
    authenticationMenu.authenticationScreen();
  }

  //This method takes in the new userinput and sends it to the database.

}
