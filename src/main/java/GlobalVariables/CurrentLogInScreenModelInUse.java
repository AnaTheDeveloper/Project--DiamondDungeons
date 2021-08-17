package GlobalVariables;

import Model.LogInScreen;

public class CurrentLogInScreenModelInUse {

  private static LogInScreen currentActiveLiveVariable;




  public static LogInScreen accessTheCurrentLiveVariable() {
    return currentActiveLiveVariable;
  }

  public static void activateNewLiveVariable(LogInScreen logInScreen) {
    currentActiveLiveVariable = logInScreen;
  }

  public static void retireLiveVariable() {
    currentActiveLiveVariable = null;
  }






}
