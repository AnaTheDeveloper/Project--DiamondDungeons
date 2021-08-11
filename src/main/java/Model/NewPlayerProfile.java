package Model;

public class NewPlayerProfile {

  private String profileName;
  private String profileGender;     //Male, Female or Ungendered
  private String profileHunter;     //Assassin, Mage, Knight

  public NewPlayerProfile(String profileName, String profileGender, String profileHunter) {
    this.profileName = profileName;
    this.profileGender = profileGender;
    this.profileHunter = profileHunter;
  }

  public String getProfileName() {
    return profileName;
  }

  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }

  public String getProfileGender() {
    return profileGender;
  }

  public void setProfileGender(String profileGender) {
    this.profileGender = profileGender;
  }

  public String getProfileHunter() {
    return profileHunter;
  }

  public void setProfileHunter(String profileHunter) {
    this.profileHunter = profileHunter;
  }

  @Override
  public String toString() {
    return "NewPlayerProfile{" +
        "profileName='" + profileName + '\'' +
        ", profileGender='" + profileGender + '\'' +
        ", profileHunter='" + profileHunter + '\'' +
        '}';
  }
}
