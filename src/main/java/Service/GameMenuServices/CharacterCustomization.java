package Service.GameMenuServices;

import DataAccessLayer.GameDatabase;
import Model.CustomCharacterModel;
import java.util.Scanner;

public class CharacterCustomization {

  public void createCustomCharacter(){


    System.out.println("Here you can customise your character!");

    System.out.println("Enter the name of your character:");
    Scanner characterNameInput = new Scanner(System.in);
    String characterNameInputResponse = characterNameInput.nextLine();

    System.out.println("How old is your character?:");
    Scanner characterAgeInput = new Scanner(System.in);
    String characterAgeInputResponse = characterAgeInput.nextLine();

    System.out.println("What hair style does your character have?:");
    Scanner characterHairStyleInput = new Scanner(System.in);
    String characterHairStyleInputResponse = characterHairStyleInput.nextLine();

    System.out.println("What colour is your characters hair?:");
    Scanner characterHairColourInput = new Scanner(System.in);
    String characterHairColourInputResponse = characterHairColourInput.nextLine();

    System.out.println("What colour is your characters eyes?:");
    Scanner characterEyeColourInput = new Scanner(System.in);
    String characterEyeColourInputResponse = characterEyeColourInput.nextLine();

    System.out.println("What outfit is your character wearing?:");
    Scanner characterOutfitInput = new Scanner(System.in);
    String characterOutfitInputResponse = characterOutfitInput.nextLine();

    System.out.println("What weapon does your character have?:");
    Scanner characterWeaponInput = new Scanner(System.in);
    String characterWeaponInputResponse = characterWeaponInput.nextLine();

    System.out.println("What armour does your character have?:");
    Scanner characterArmourInput = new Scanner(System.in);
    String characterArmourInputResponse = characterArmourInput.nextLine();



    CustomCharacterModel customCharacterModel = new CustomCharacterModel(characterNameInputResponse, characterAgeInputResponse, characterHairStyleInputResponse, characterHairColourInputResponse, characterEyeColourInputResponse, characterOutfitInputResponse, characterWeaponInputResponse, characterArmourInputResponse);

    GameDatabase.addingNewCharacterProfileToTheDatabase(customCharacterModel);



  }

}
