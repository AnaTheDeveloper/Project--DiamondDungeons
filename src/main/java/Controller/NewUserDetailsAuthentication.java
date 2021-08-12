package Controller;

import Service.LogInAndSignUpServices.AccountSignIn;
import Service.LogInAndSignUpServices.AccountSignUp;

public class NewUserDetailsAuthentication {

  AccountSignUp accountSignUp;
  AccountSignIn accountSignIn;

  public boolean checkMenuSelection(String menuNumber){

    if (menuNumber.equals("1")){
      accountSignIn = new AccountSignIn();
      accountSignIn.accountSignIn();

    }else if (menuNumber.equals("2")){
      accountSignUp = new AccountSignUp();
      accountSignUp.creatingANewAccount();
    }else if (menuNumber.equals("3")) {
      System.out.println("You can only enter the numbers that are available.");
    }
    return true;
  }

  //This method checks the menu option that is selected.






}
