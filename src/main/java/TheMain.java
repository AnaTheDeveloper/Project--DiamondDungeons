
import Controller.MenuController;
import GlobalVariables.CurrentLogInScreenModelInUse;
import Service.AgeAuthentication.AgeConfirmationAndGameMenu;
import auth.Authentication;
import java.util.Scanner;


public class TheMain {

  public static void main(String[] args) {

    Boolean areTheyOfAge = AgeConfirmationAndGameMenu.ageCheckerAndGameMenu();
    if (areTheyOfAge == false) {
      System.exit(0);
    }

    Authentication authentication = new Authentication();
    authentication.authenticationScreen();


    //------------------------------------------------------------





    boolean continueForever = true;

    while (continueForever == true) {
      System.out.println("Welcome "+ CurrentLogInScreenModelInUse.accessTheCurrentLiveVariable().getUsername());
      System.out.println("What would you like to do?");
      System.out.println("---------------------------");
      System.out.println("[1] PLAY DIAMOND DOUNGENS");
      System.out.println("[2] Customise character");
      System.out.println("[3] Settings");
      System.out.println("[9] Exit");

      Scanner res = new Scanner(System.in);
      Integer responce = Integer.valueOf(res.nextLine());

      if (responce == 9) {
        System.out.println("Thanks for playing");
        System.exit(0);
      }

      MenuController menuController = new MenuController();
      menuController.menuNumberSelection(responce.toString());




    }




  }

}

//Once the program console ends you cannot access the username and password that was stored in the database.
//TODO: Review thought - move game menu into its own controller