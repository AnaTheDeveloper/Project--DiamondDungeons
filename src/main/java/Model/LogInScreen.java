package Model;

public class LogInScreen {

  private String username;
  private String password;
  private int UID;


  public LogInScreen(String username, String password) {
    this.username = username;
    this.password = password;
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
    return "NewPlayerSignUp{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
