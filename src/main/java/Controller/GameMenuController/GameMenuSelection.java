package Controller.GameMenuController;

import Controller.CharacterCustomisationController.CharacterCustomizationMenu;
import Service.DeletePlayer.DeleteProfile;
import Service.GameMenuServices.GameSettings;
import Service.GameMenuServices.PlayDiamondDungeons;

public class GameMenuSelection {

  PlayDiamondDungeons playDiamondDungeons;
  GameSettings gameSettings;
  CharacterCustomizationMenu characterCustomizationMenu;


  public boolean menuNumberSelection(String menuNumber){

    if (menuNumber.equals("1")){
      playDiamondDungeons = new PlayDiamondDungeons();
      playDiamondDungeons.enterDungeon();
    }else if (menuNumber.equals("2")){
      characterCustomizationMenu = new CharacterCustomizationMenu();
      characterCustomizationMenu.createCustomCharacter();
    }else if (menuNumber.equals("3")){
      gameSettings = new GameSettings();
      gameSettings.settings();
    } else if (menuNumber.equals("5")) {
      DeleteProfile deleteProfile = new DeleteProfile();
      deleteProfile.deleteAllProfilesByUID();
      AuthenticationMenu authenticationMenu = new AuthenticationMenu();
      authenticationMenu.authenticationScreen();
      GameMenu gameMenu = new GameMenu();
      gameMenu.gameMenu();

    }

    else{
      System.out.println("Please enter the number options that are available.");
      GameMenu gameMenu = new GameMenu();
      gameMenu.gameMenu();
    }
    return true;

  }

  //Once in the game menu, this method checks which option was selected.

}
