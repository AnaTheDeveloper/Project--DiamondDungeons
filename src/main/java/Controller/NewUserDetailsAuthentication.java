package Controller;

import Service.AccountSignIn;
import Service.NewAccountRequest;

public class NewUserDetailsAuthentication {

  NewAccountRequest newAccountRequest;
  AccountSignIn accountSignIn;

  public boolean checkMenuSelection(String menuNumber){

    if (menuNumber.equals("1")){
      accountSignIn = new AccountSignIn();
      accountSignIn.accountSignIn();

    }else if (menuNumber.equals("2")){
      newAccountRequest = new NewAccountRequest();
      newAccountRequest.creatingANewAccount();
    }else if (menuNumber.equals("3")) {
      System.out.println("You can only enter the numbers that are available.");
    }
    return true;
  }

  //This method checks the menu option that is selected.






}
