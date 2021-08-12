package Model;

public class CustomCharacterModel {

  private String characterInGameName;
  private int characterAge;
  private String characterHairStyle;
  private String characterHairColour;
  private String characterEyeColour;
  private String characterOutfit;
  private String characterWeapon;
  private String characterArmour;

  public CustomCharacterModel(String characterInGameName, int characterAge,
      String characterHairStyle, String characterHairColour, String characterEyeColour,
      String characterOutfit, String characterWeapon, String characterArmour) {

    this.characterInGameName = characterInGameName;
    this.characterAge = characterAge;
    this.characterHairStyle = characterHairStyle;
    this.characterHairColour = characterHairColour;
    this.characterEyeColour = characterEyeColour;
    this.characterOutfit = characterOutfit;
    this.characterWeapon = characterWeapon;
    this.characterArmour = characterArmour;
  }

  public String getCharacterInGameName() {
    return characterInGameName;
  }

  public void setCharacterInGameName(String characterInGameName) {
    this.characterInGameName = characterInGameName;
  }

  public int getCharacterAge() {
    return characterAge;
  }

  public void setCharacterAge(int characterAge) {
    this.characterAge = characterAge;
  }

  public String getCharacterHairStyle() {
    return characterHairStyle;
  }

  public void setCharacterHairStyle(String characterHairStyle) {
    this.characterHairStyle = characterHairStyle;
  }

  public String getCharacterHairColour() {
    return characterHairColour;
  }

  public void setCharacterHairColour(String characterHairColour) {
    this.characterHairColour = characterHairColour;
  }

  public String getCharacterEyeColour() {
    return characterEyeColour;
  }

  public void setCharacterEyeColour(String characterEyeColour) {
    this.characterEyeColour = characterEyeColour;
  }

  public String getCharacterOutfit() {
    return characterOutfit;
  }

  public void setCharacterOutfit(String characterOutfit) {
    this.characterOutfit = characterOutfit;
  }

  public String getCharacterWeapon() {
    return characterWeapon;
  }

  public void setCharacterWeapon(String characterWeapon) {
    this.characterWeapon = characterWeapon;
  }

  public String getCharacterArmour() {
    return characterArmour;
  }

  public void setCharacterArmour(String characterArmour) {
    this.characterArmour = characterArmour;
  }

  @Override
  public String toString() {
    return "CustomCharacterModel{" +
        "characterInGameName='" + characterInGameName + '\'' +
        ", characterAge=" + characterAge +
        ", characterHairStyle='" + characterHairStyle + '\'' +
        ", characterHairColour='" + characterHairColour + '\'' +
        ", characterEyeColour='" + characterEyeColour + '\'' +
        ", characterOutfit='" + characterOutfit + '\'' +
        ", characterWeapon='" + characterWeapon + '\'' +
        ", characterArmour='" + characterArmour + '\'' +
        '}';
  }
}
