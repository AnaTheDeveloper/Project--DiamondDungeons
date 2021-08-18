import Controller.GameMenuController.GameMenu;
import Controller.AgeAuthenticationController.AgeAuthentication;
import Controller.GameMenuController.AuthenticationMenu;


public class TheMain {

  public static void main(String[] args) {

    Boolean areTheyOfAge = AgeAuthentication.ageCheckerAndGameMenu();
    if (areTheyOfAge == false) {
      System.exit(0);
    }

    AuthenticationMenu authenticationMenu = new AuthenticationMenu();
    authenticationMenu.authenticationScreen();

    GameMenu gameMenu = new GameMenu();
    gameMenu.gameMenu();

  }
}

