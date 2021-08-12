package Service.LogInAndSignUpServices;

import DataAccessLayer.GameDatabase;
import java.util.Scanner;

public class AccountSignIn {

  public void accountSignIn( ){

    //Asks for the username
    System.out.println("Enter your Username:");

    Scanner usersUsername = new Scanner(System.in);
    String usernameResponse = usersUsername.nextLine();

    GameDatabase.findUsernamesInTheDatabase(usernameResponse);
    }





  }


