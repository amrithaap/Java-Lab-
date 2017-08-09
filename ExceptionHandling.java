import java.util.*;
import java.io.*;

/*
	Exceptions Caught:
		1. NumberFormatException 			DONE
		2. ArithmeticException				DONE
		3. ArrayIndexOutOfBoundsException 	DONE
		4. NullPointerException				DONE
		5. NegativeArraySizeException		DONE
		6. StringIndexOutOfBounds			DONE
		7. IOException 						DONE

	User Defined Exception:
		1. InvalidPhoneNumberException		DONE
		2. InvalidNameException				DONE
		3. PlayerUnderAgeException			DONE
*/

class Player {
	private int pID;
	private String pName;
	private int pAge;
	private String pContactNo;
	private String pSportType;
	private int pNoOfMatchesPlayed;
	private int pScoresForMatches[];
	private float pAverage;

	public void setData() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = new String();
		int tempI;

		try {
			System.out.println("Enter pID");
			pID = Integer.parseInt(br.readLine());

			System.out.println("Enter pName");
			temp = br.readLine();
			for(int i=0; i<temp.length(); i++)
				if(!(Character.isLetter(temp.charAt(i))))
					throw new InvalidNameException(i);
			pName = temp;

			System.out.println("Enter pAge");
			tempI = Integer.parseInt(br.readLine());
			if(tempI < 18)
				throw new PlayerUnderAgeException(tempI);
			pAge = tempI;

			System.out.println("Enter Phone Number");
			temp = br.readLine();
			if(temp.length() == 10)
				for(int i=0; i<temp.length(); i++) {
					if(!(Character.isDigit(temp.charAt(i))))
						throw new InvalidPhoneNumberException(temp, i);
				}
			else
				throw new InvalidPhoneNumberException(temp.length());
			pContactNo = temp;

			System.out.println("Enter Sport Type");
			temp = br.readLine();
			for(int i=0; i<temp.length(); i++)
				if(!(Character.isLetter(i)))
					throw new InvalidNameException(i);
			pSportType = temp;

			System.out.println("Enter pNoOfMatchesPlayed");
			pNoOfMatchesPlayed = Integer.parseInt(br.readLine());
			pScoresForMatches = new int[pNoOfMatchesPlayed];

			System.out.println("Enter the Scores For Matches");
			for(int i=0; i<pNoOfMatchesPlayed; i++){
				tempI = Integer.parseInt(br.readLine());
				pScoresForMatches[i] = tempI;
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(NegativeArraySizeException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("All Exceptions have been Caught.");
		}
	}

	public void calcAverage() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, sum=0;
		float iAverage;
		try {
			System.out.println("Enter total Matches Played...");
			n = Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++)
				sum+=pScoresForMatches[i];

			iAverage = sum / n;
			pAverage = iAverage;
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NegativeArraySizeException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("All Exceptions Caught.");
		}
	}

	public void changeName() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pos;
		char c;

		try	{
			System.out.println("Enter the position of the Charcter to be changed...");
			pos = Integer.parseInt(br.readLine());

			System.out.println("Enter the character to be changed...");
			c = (char)br.read();
			br.skip(2);

			StringBuilder str = new StringBuilder(pName);
			str.setCharAt(pos, c);
			pName = new String(str);

			System.out.println("changed Name is...\t" + pName);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("All Exceptions have been Caught.");
		}
	}

	public void changeScore() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pos, temp;
		try {
			System.out.println("Scores Array...");
			for(int i=0; i<pNoOfMatchesPlayed; i++) {
				System.out.println(pScoresForMatches[i]);
			}

			System.out.println("Enter the score index...");
			pos = Integer.parseInt(br.readLine());

			System.out.println("Current Score...\t" + pScoresForMatches[pos]);
			System.out.println("Enter the score...");
			pScoresForMatches[pos] = Integer.parseInt(br.readLine());

			System.out.println("Score changed to...\t" + pScoresForMatches[pos]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("All Exceptions have been Caught.");
		}
	}

	public void getData() {
		System.out.println("pID...\t" + pID);
		System.out.println("pName...\t" + pName);
		System.out.println("pAge...\t" + pAge);
		System.out.println("pContactNo...\t" + pContactNo);
		System.out.println("pSportType...\t" + pSportType);
		System.out.println("pNoOfMatchesPlayed...\t" + pNoOfMatchesPlayed);
		for (int i=0; i<pNoOfMatchesPlayed; i++) {
			System.out.println(pScoresForMatches[i]);
		}
		System.out.println(pAverage);
	}
}

class InvalidNameException extends Exception {
	public InvalidNameException(int pos) {
		System.out.println("Name is Invalid. Invalid Charcter at " + pos);
	}
}

class PlayerUnderAgeException extends Exception {
	public PlayerUnderAgeException(int age) {
		System.out.println("Player is Under Age. Entered age is " + age);
	}
}

class InvalidPhoneNumberException extends Exception {
	public InvalidPhoneNumberException(String s, int pos) {
		System.out.println("length of Entered Phone Number is Invalid. Invalid Charcter " + s.charAt(pos));
	}

	public InvalidPhoneNumberException(int length) {
		System.out.println("length of Entered Phone Number is Invalid. length is " + length);
	}
}

public class ExceptionHandling {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean rep=true;
		String temp;

		Player p = new Player();
		while (rep) {
			try {
				System.out.println("\nEnter Player Data....");
				p.setData();
				System.out.println("\nCalculate Player Average....");
				p.calcAverage();
				System.out.println("\nChange character in Player Name");
				p.changeName();
				System.out.println("\nChange Player Score in Score Array...");
				p.changeScore();
				System.out.println("\n\nPlayer Data...");
				p.getData();

				System.out.println("Exit?? (Y/N)");
				temp = br.readLine();

				if(temp.equals("Y"))
					rep = false;

				p = null;
			}
			catch(IOException e) {
				System.out.println(e);
			}
			catch(NullPointerException e) {
				System.out.println(e);
				rep = false;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				System.out.println("All Exceptions have been Caught.");
			}
		}
	}
}