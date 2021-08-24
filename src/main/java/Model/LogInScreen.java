package Model;

public class LogInScreen {

  private String username;
  private String password;
  private String uid;

  UidGenerator uidGenerator = new UidGenerator();



  public LogInScreen(String username, String password) {
    this.username = username;
    this.password = password;
    this.uid = uidGenerator.generateUniqueUid();

  //call method which will randomly generate
    //create random 6 letter string in java
  }

  public String getUid() {
    return uid;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public String toString() {
    return
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        ", uid=" + uid +
        '}';
  }
}
