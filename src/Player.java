
import java.util.Scanner;
 

public class Player extends Actor {
	private static final Readable IOStream = null;

    /**
     * We are going to want initial statistic values set in the constructor for this class and later on in the ones for
     * each class
     */

	//Allows the player to enter a name for their character
	public void getName() {
		Scanner in = new Scanner(IOStream);
		name = in.next();
		in.close();
	}
	
	//Sets health at 100
	public void setHealth() {
		health = 100;
	}
	
	
	public void setDefense() {
		defense = 100;
	}
	
	public void setAttack() {
		attack = 70;
	}
	
	//Damage is calculated in Battle
	public void damage() {
		//damage = (((((2 * level)/5)+2)*power*(attack/defence))/50)+2; 
		//What would Power be?
	}
	
	//Speed is determined in Battle
	public void setSpeed() {
		speed = 1.0;
	}
	
	//level starts at 1
	public void setLevel() {
		level = 1;
	}
	
	
	//Keeps track of Exp to level up with
	public int Exp;
	
	//Checks if Exp is enough to level up.
	public void levelUp(){
		if (this.Exp > 100) {
			System.out.println("Level Up!!!");
			level = level+1;
		}
		else{};
	}
	
	
}
