
import DataAccessLayer.GameDatabase;
import Service.AgeAuthentication.AgeConfirmationAndGameMenu;


public class TheMain {

  public static void main(String[] args) {

AgeConfirmationAndGameMenu.ageCheckerAndGameMenu();

//Once the program console ends you cannot access the username and password that was stored in the database.

    System.out.println(GameDatabase.databaseAccess().size());





    }

  }

