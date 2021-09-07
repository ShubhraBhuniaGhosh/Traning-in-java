

import com.myanime.animemanagement.entity.Magic;
import com.myanime.animemanagement.entity.MagicArtifact;

/**
 * 
 * @author Shubhra
 * 
 * Come up with your own example to demonstrate the following concepts
 * 
 * Creation of Interfaces
 * Creation of interfaces by extending other interfaces
 * Creation of class by extending another class and implementing multiple interfaces
 * Creation of reference variable of an interface.
 * Creation of a class that implements above interface.
 * Store an object of class created in step e in the reference variable of the interface created in step d.
 * Call the methods of the object using interface reference variable
 *
 */


public class TestMain {
	public static void main(String[] args) {
		
		Magic thor;
		Magic mjolnir = new MagicArtifact();
		mjolnir.displayPowersDiscription();
		
	}
}
