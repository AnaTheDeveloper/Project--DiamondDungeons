import Controller.GameMenuController.GameMenu;
import Controller.AgeAuthenticationController.AgeAuthentication;
import Controller.GameMenuController.AuthenticationMenu;
import Model.UidGenerator;


public class TheMain {

  public static void main(String[] args) {

    Boolean areTheyOfAge = AgeAuthentication.ageCheckerAndGameMenu();
    if (areTheyOfAge == false) {
      System.exit(0);
    }

    //This checks if the user is old enough to play the game.

    AuthenticationMenu authenticationMenu = new AuthenticationMenu();
    authenticationMenu.authenticationScreen();

    //Once confirmed they are then let into the lobby menu

    GameMenu gameMenu = new GameMenu();
    gameMenu.gameMenu();

    //Then the game menu.








    /*Testing to see if the uid generator is working
      UidGenerator uidGenerator = new UidGenerator();
      uidGenerator.generateUniqueUid();

     */

  }
}

