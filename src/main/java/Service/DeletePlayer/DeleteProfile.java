package Service.DeletePlayer;

import static DataAccessLayer.GameDatabase.removingAnAccountFromTheDatabase;
import static GlobalVariables.CurrentLogInScreenModelInUse.accessTheCurrentLiveVariable;
import static GlobalVariables.CurrentLogInScreenModelInUse.retireLiveVariable;

import Model.LogInScreen;

public class DeleteProfile {

  public void deleteAllProfilesByUID() {

    //GOAL:Delete all instances of a profile VIA its UID

    //Get the UID that is loadeddd

    LogInScreen profileToDelete = accessTheCurrentLiveVariable();

    String UIDofProfileToDelete = profileToDelete.getUid();

    //List all the databases TODO : WHEN I CREATE A NEW DATABASE, COME BACK HERE TO ADD REMOVAL
    removingAnAccountFromTheDatabase(UIDofProfileToDelete);
    System.out.println("Profile has been deleted:" + profileToDelete.toString());



    //remove that profile

    retireLiveVariable();



  }


}
