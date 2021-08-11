package DataAccessLayer;

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


  public static void addingNewAccountToTheDatabase(LogInScreen newUsersProfile){

    ArrayList<LogInScreen> usersAccountInformation = databaseAccess();

    usersAccountInformation.add(newUsersProfile);

    for (LogInScreen logInScreen : diamondDungeonsDatabase){
      System.out.println(logInScreen.toString());
    }
    //This method adds a new account to the database
  }



  public static void removingAnAccountFromTheDatabase(){

    //Get the into first then .remove()

  }

  public static void viewTheDatabase(){

    for (LogInScreen view : diamondDungeonsDatabase) {
      System.out.println(view);
    }

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

        System.out.println("This username is correct. Please enter your password.");
        emergencyTemporaryProfileHolder = databaseProfiles;

      } else {
        System.out.println("This username does not exist.");
        emergencyTemporaryProfileHolder = new LogInScreen("UNAVAILABLE", "");
      }
    }
    return emergencyTemporaryProfileHolder;
  }

  //This method checks the database for the username that the user inputted.




}
