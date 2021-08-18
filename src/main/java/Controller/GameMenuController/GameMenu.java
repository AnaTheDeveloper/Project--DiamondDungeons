package Controller.GameMenuController;

import GlobalVariables.CurrentLogInScreenModelInUse;
import java.util.Scanner;

public class GameMenu {

public void gameMenu(){

    System.out.println("Welcome "+ CurrentLogInScreenModelInUse.accessTheCurrentLiveVariable().getUsername());
    System.out.println("What would you like to do?");
    System.out.println("---------------------------");

    System.out.println("[1] Play");
    System.out.println("[2] Customise Character");
    System.out.println("[3] Settings");
    System.out.println("[4] Exit Game");

    Scanner menuOption = new Scanner(System.in);
    String menuOptionResponse = String.valueOf(menuOption.nextLine());

    if (menuOptionResponse.equals("4")) {
      System.out.println("Thanks for playing");
      System.exit(0);
    }

    GameMenuSelection gameMenuSelection = new GameMenuSelection();
    gameMenuSelection.menuNumberSelection(menuOptionResponse);

  }
}





