package Service.UpdateInfo;

import static DataAccessLayer.GameDatabase.updatingAnAccountInTheDatabase;
import static GlobalVariables.CurrentLogInScreenModelInUse.accessTheCurrentLiveVariable;
import static GlobalVariables.CurrentLogInScreenModelInUse.retireLiveVariable;

import Controller.GameMenuController.GameMenu;
import Model.LogInScreen;
import java.util.Scanner;

public class ChangeUsername {


  public void changeUsernameByUid(){

    LogInScreen profileToUpdate = accessTheCurrentLiveVariable();

    String UIDofProfileToUpdate = profileToUpdate.getUid();

    //Ask what username they want:

    System.out.println("Enter a new username: ");

    Scanner newUsername = new Scanner(System.in);
    String newUsernameResponce = String.valueOf(newUsername.nextLine());


    //sending information
    updatingAnAccountInTheDatabase(UIDofProfileToUpdate, newUsernameResponce);

    System.out.println(profileToUpdate.toString() + "has been updated.");

    GameMenu gameMenu = new GameMenu();
    gameMenu.gameMenu();




  }





}
