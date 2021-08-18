package GlobalVariables;

import Model.LogInScreen;

public class CurrentLogInScreenModelInUse {

  private static LogInScreen currentActiveLiveVariable;

  // This is the name we have given to the live variable which is active on the stage

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
