package Model;

import java.util.Random;

public class UidGenerator {

  public int generateUniqueUid(){

    String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";

    String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;

    StringBuilder sb = new StringBuilder();

    Random random = new Random();

    int length = 10;

    for(int i = 0; i < length; i++) {

      int index = random.nextInt(alphaNumeric.length());

      char randomChar = alphaNumeric.charAt(index);

      sb.append(randomChar);
    }

    String randomString = sb.toString();
    System.out.println("UID is: " + randomString);

    return length;
  }
}

