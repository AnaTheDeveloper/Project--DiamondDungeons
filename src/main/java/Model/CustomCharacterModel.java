package Model;

import static GlobalVariables.CurrentLogInScreenModelInUse.accessTheCurrentLiveVariable;

public class CustomCharacterModel {

  private String characterInGameName;
  private String characterHairColour;
  private String characterWeapon;
  private String uid;

  LogInScreen logInScreen;

  public CustomCharacterModel(String characterInGameName, String characterHairColour,
      String characterWeapon) {
    this.characterInGameName = characterInGameName;
    this.characterHairColour = characterHairColour;
    this.characterWeapon = characterWeapon;
    this.uid = accessTheCurrentLiveVariable().getUid();

    // is equal to the log in screen one using getter
  }

  public String getCharacterInGameName() {
    return characterInGameName;
  }

  public void setCharacterInGameName(String characterInGameName) {
    this.characterInGameName = characterInGameName;
  }

  public String getCharacterHairColour() {
    return characterHairColour;
  }

  public void setCharacterHairColour(String characterHairColour) {
    this.characterHairColour = characterHairColour;
  }

  public String getCharacterWeapon() {
    return characterWeapon;
  }

  public void setCharacterWeapon(String characterWeapon) {
    this.characterWeapon = characterWeapon;
  }

  @Override
  public String toString() {
    return "CustomCharacterModel{" +
        "characterInGameName='" + characterInGameName + '\'' +
        ", characterHairColour='" + characterHairColour + '\'' +
        ", characterWeapon='" + characterWeapon + '\'' +
        '}';
  }
}
