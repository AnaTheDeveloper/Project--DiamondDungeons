package DataAccessLayer;

import static GlobalVariables.CurrentLogInScreenModelInUse.accessTheCurrentLiveVariable;
import static GlobalVariables.CurrentLogInScreenModelInUse.activateNewLiveVariable;

import Model.CustomCharacterModel;
import Model.LogInScreen;
import java.util.ArrayList;
import java.util.Iterator;

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



  public static void removingAnAccountFromTheDatabase(String Uid) {
    //get database
    ArrayList<LogInScreen> usersAccountInformation = databaseAccess();
    //Use Iterator method to go through list.
    Iterator<LogInScreen> iterator = usersAccountInformation.iterator();
    //loop
    while (iterator.hasNext()) {
      LogInScreen profilesIMightDelete = iterator.next();

      if (profilesIMightDelete.getUid().equals(Uid)) {
        iterator.remove();
      }

    }
  }


  public static void updatingAnAccountInTheDatabase(String Uid, String newUsername){
    //Find the profile in the database

     //get database
      ArrayList<LogInScreen> usersAccountInformation = databaseAccess();

      LogInScreen currentProfile = accessTheCurrentLiveVariable();

      //assign new profile name to their uid

     currentProfile.setUsername(newUsername);

      //Delete the old version

    removingAnAccountFromTheDatabase(Uid);

     //save new profile to database

    addingNewAccountToTheDatabase(currentProfile);

     //refresh live variable

    activateNewLiveVariable(currentProfile);



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




}
