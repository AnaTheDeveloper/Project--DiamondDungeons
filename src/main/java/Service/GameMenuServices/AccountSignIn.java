package Service.GameMenuServices;

import DataAccessLayer.GameDatabase;
import GlobalVariables.CurrentLogInScreenModelInUse;
import Model.LogInScreen;
import Controller.GameMenuController.AuthenticationMenu;
import java.util.Scanner;

public class AccountSignIn {

  public void accountSignIn( ){

    //Asks for the username
    System.out.println("Enter your Username:");

    Scanner usersUsername = new Scanner(System.in);
    String usernameResponse = usersUsername.nextLine();

    LogInScreen foundLogInScreen =  GameDatabase.findUsernamesInTheDatabase(usernameResponse);

    if (foundLogInScreen.getUsername().equals("UNAVAILABLE")) {
      System.out.println("This username does not exist.");
      AuthenticationMenu authenticationMenu = new AuthenticationMenu();
      authenticationMenu.authenticationScreen();
    }


    System.out.println("This username is correct. Please enter your password.");

    Scanner usersPassword = new Scanner(System.in);
    String passwordResponse = usersPassword.nextLine();

    if (foundLogInScreen.getPassword().equals(passwordResponse)) {
      CurrentLogInScreenModelInUse.activateNewLiveVariable(foundLogInScreen);
    } else {
      System.out.println("Password does not match, please try again");
      AuthenticationMenu authenticationMenu = new AuthenticationMenu();
      authenticationMenu.authenticationScreen();
    }











    }





  }


