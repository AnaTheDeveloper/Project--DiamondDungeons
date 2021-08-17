package DataAccessLayer;

import Model.CustomCharacterModel;
import Model.LogInScreen;
import java.util.ArrayList;

public class GameDatabase {

  private static ArrayList<LogInScreen> diamondDungeonsDatabase;

  //Name of my database is: diamondDungeonsDatabase

  public static ArrayList<LogInScreen> databaseAccess(){

    if (diamondDungeonsDatabase == null){
      diamondDungeonsDatabase = new ArrayList<>();
    }
    return diamondDungeonsDatabase;
  }

  //This method checks if there is anything in the database, if not it creates a new ArrayList.

  //Crud operations below:


  public static void addingNewAccountToTheDatabase(LogInScreen newUsersProfile){

    ArrayList<LogInScreen> usersAccountInformation = databaseAccess();

    usersAccountInformation.add(newUsersProfile);

    for (LogInScreen logInScreen : diamondDungeonsDatabase){
      System.out.println(logInScreen.toString());
    }
    //This method adds a new account to the database
  }



  public static void removingAnAccountFromTheDatabase(){

    /* 1: Ask user which is the account name
       2: Compare usersresponse with whats int he database
     */

  }

  public static void viewTheDatabase(ArrayList<LogInScreen> viewDatabase){

//    for (int database = 0; database < viewDatabase.size(); database++){
//      System.out.println(viewDatabase.get(database) + " ");
//    }
//    System.out.println();
  }

  public static void updateTheDatabase(){

    //Using .set methodd


  }

  //This method updates the database


  public static LogInScreen findUsernamesInTheDatabase(String usernameResponse) {

    LogInScreen emergencyTemporaryProfileHolder = null;

    //This for loop goes through each database profile.

    for(LogInScreen databaseProfiles: databaseAccess()) {

      if (databaseProfiles.getUsername().equals(usernameResponse)) {


        emergencyTemporaryProfileHolder = databaseProfiles;

      } else {
        emergencyTemporaryProfileHolder = new LogInScreen("UNAVAILABLE", "");
      }
    }
    return emergencyTemporaryProfileHolder;
  }

  //This method checks the database for the username that the user inputted.

  public static void addingNewCharacterProfileToTheDatabase(CustomCharacterModel newCharacterProfile){

//    ArrayList<CustomCharacterModel> customCharacter = databaseAccess();
//
//    customCharacter.add(newCharacterProfile);
//
//    for (CustomCharacterModel customCharacterModel : diamondDungeonsDatabase){
//      System.out.println(customCharacterModel.toString());
//    }
    //This method adds a new character to the database
    //DO I NEED A NEW DATABASE TO HOLD THIS NEW INFO??
  }


}
