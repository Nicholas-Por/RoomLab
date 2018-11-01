package People;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Person represents the player as they move through the game.
 */


public class Person {
	String firstName;
	String familyName;
	int xLoc, yLoc;


	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public Person (String firstName, String familyName, int xLoc, int yLoc)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}
	//inv is representative of the players inventory, and various items.
	//List function creates a list, to store inventory objects
	public static void main(String[] args)
	{
		List<String> inv = new ArrayList<String>();
	}

}
