package Controller.GameMenuController;

import Service.GameMenuServices.AccountSignIn;
import Service.GameMenuServices.AccountSignUp;


public class AuthenticationMenuSelection {

  AccountSignUp accountSignUp;
  AccountSignIn accountSignIn;

  public  boolean checkMenuSelection(String menuNumber){

    if (menuNumber.equals("1")){
      accountSignIn = new AccountSignIn();
      accountSignIn.accountSignIn();

    }else if (menuNumber.equals("2")){
      accountSignUp = new AccountSignUp();
      accountSignUp.creatingANewAccount();
    }else{
      System.out.println("You can only enter the numbers that are available.");
      AuthenticationMenu authenticationMenu = new AuthenticationMenu();
      authenticationMenu.authenticationScreen();
    }
    return true;
  }

  //This method checks the menu option that is selected.






}
