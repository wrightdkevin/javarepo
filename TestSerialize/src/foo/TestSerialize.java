package foo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Robot implements Serializable{
	
	
}

public class TestSerialize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this program should serialize something");
		try {
			FileOutputStream fos = new FileOutputStream("robot.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject( new Robot());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
