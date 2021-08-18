package Controller.CharacterCustomisationController;

import Controller.GameMenuController.GameMenu;
import GlobalVariables.CurrentLogInScreenModelInUse;
import java.util.Scanner;

public class CharacterCustomizationMenu {

  public void createCustomCharacter(){

    System.out.println("Hi "+ CurrentLogInScreenModelInUse.accessTheCurrentLiveVariable().getUsername() + " Its time to customise your character!") ;

    System.out.println("[1] Name");
    System.out.println("[2] Hair Colour");
    System.out.println("[3] Weapon");
    System.out.println("[4] Back To Main Menu");
    System.out.println("[5] Exit");

    Scanner menuOption = new Scanner(System.in);
    String menuOptionResponse = String.valueOf(menuOption.nextLine());

    if (menuOptionResponse.equals("4")){
      GameMenu gameMenu = new GameMenu();
      gameMenu.gameMenu();
    }

    if (menuOptionResponse.equals("5")) {
      System.out.println("Thanks for playing");
      System.exit(0);
    }











  }

}
