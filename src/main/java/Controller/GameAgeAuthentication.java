package Controller;

public class GameAgeAuthentication {

  public Boolean gameAgeAuthentication(Integer age){

    if (age < 18){
      System.out.println("You are not eligible to play this game");
      System.out.println("You are not old enough");
      return false;
    }else{
      System.out.println("Welcome player!");
      System.out.println("-----------------------------------------");

    return true;

    }
  }
}
