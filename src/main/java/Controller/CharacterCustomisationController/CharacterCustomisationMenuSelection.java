package Controller.CharacterCustomisationController;



public class CharacterCustomisationMenuSelection {

  //TODO: Save info to characters live profile and to the database
  //CharacterCustomisation characterCustomisation;


  public boolean customisationMenuSelection(String menuNumber){

    if (menuNumber.equals("1")){
      System.out.println("What is your characters name?");

      //save this tot he current live varibale so its attached to their profile, using the iud
    }else if (menuNumber.equals("2")){
      System.out.println("What is your characters hair colour?");
    }else if (menuNumber.equals("3")){
      System.out.println("Select your weapon");
    }else{
      System.out.println("Please enter the number options that are available.");
      CharacterCustomizationMenu characterCustomizationMenu = new CharacterCustomizationMenu();
      characterCustomizationMenu.createCustomCharacter();
    }
    return true;
  }

}
