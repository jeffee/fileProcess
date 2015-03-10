import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Jeffee
 *
 */
public class Preprocess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 TODO Auto-generated method stub
		File file = new File("d://ei.txt");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(file)));
			String info = reader.readLine();
			int count = 1;
			while(info!=null){
				
				if(info.trim().equals(""))
					info = reader.readLine();
				else {
					System.out.println(info);
					info = reader.readLine();
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
