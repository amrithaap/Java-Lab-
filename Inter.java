import java.io.*;
import java.util.*;

 interface Team
{
  String teamHomeGround="Santiago Bernabeu";
  String teamName=" Real Madrid";
  void read();
  void display();
}

 interface Sports 
{
  byte numberOfPlayers=16;
}

class Player implements Sports,Team
{
  public char sportType;
  public String sportName;
  public String playerName, playerPosition;
  public boolean value=true;
  public float salary;
  public byte noOfHoursPlayed;


  public void read()
  {
    try{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the Name of the Player :  ");
    playerName=br.readLine();
    System.out.println("Enter the Type of the Sport (I: Individual Game / T: Team Game) : ");
    sportType=(char)br.read();
    br.skip(2);

    if(sportType=='T' || sportType=='t')
    value=true;
    else if(sportType=='i' || sportType=='I')
    value=false;



    if (value==true)
    {
  //  System.out.println("Name of the Team the Player Plays for : ");
    //teamName=br.readLine();
    //System.out.println("Team Home Ground : ");
    //teamHomeGround=br.readLine();
    System.out.println("Game the Player Plays:  ");
    sportName=br.readLine();
    System.out.println("Enter the Position that the Player plays at:");
    playerPosition=br.readLine();


    System.out.println("Number of Hours Played: ");
    noOfHoursPlayed=Byte.parseByte(br.readLine());
    System.out.println("Enter the Salary of the Player:");
    salary=Float.parseFloat(br.readLine());
    }

    if(value==false){
      System.out.println("Number of Hours Played: ");
      noOfHoursPlayed=Byte.parseByte(br.readLine());
      System.out.println("Enter the Salary of the Player:");
      salary=Float.parseFloat(br.readLine());
    }

  }
catch(Exception e1){
    System.out.println(e1);
    e1.printStackTrace();
}
}


  public void display()
  {
    System.out.println("\nPlayer Name : "+playerName);
    System.out.println("\nSports Type (I: Individual Game / T: Team Game) : "+sportType);
    System.out.println("\nName of the Sport : "+sportName);
    System.out.println("\nPosition of the Player:"+playerPosition);
    System.out.println("Number of Hours Played:  "+noOfHoursPlayed);
    System.out.println("\nPlayer Salary:"+salary);
  }

}


public class Inter
{
  public static void main(String[] args) {
    Player pl=new Player();
    pl.read();
    pl.display();
  }
}
