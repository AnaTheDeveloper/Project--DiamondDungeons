package Controller;

import Service.GameMenuServices.CharacterCustomization;
import Service.GameMenuServices.GameSettings;
import Service.GameMenuServices.PlayDiamondDungeons;

public class MenuController {

  PlayDiamondDungeons playDiamondDungeons;
  GameSettings gameSettings;
  CharacterCustomization characterCustomization;


  public boolean menuNumberSelection(String menuNumber){

    if (menuNumber.equals("1")){
      playDiamondDungeons = new PlayDiamondDungeons();
      playDiamondDungeons.enterDungeon();
    }else if (menuNumber.equals("2")){
      characterCustomization = new CharacterCustomization();
      characterCustomization.createCustomCharacter();
    }else if (menuNumber.equals("3")){
      gameSettings = new GameSettings();
      gameSettings.settings();
    }else{
      System.out.println("Please enter the number options that are available.");
    }
    return true;

  }

  //Once in the game menu, this method checks which option was selected.

}
