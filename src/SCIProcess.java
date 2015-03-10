import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * 
 */

/**
 * @author Jeffee
 * 
 */
public class SCIProcess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E://sci.txt");
		BufferedReader reader = null;
		LinkedList<String> list = new LinkedList<String>();
		list.add("CT");
		list.add("CY");
		list.add("UT");


		try {
			reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(file)));
			String info = reader.readLine();

			while (info != null) {
				while (!info.trim().startsWith("AU"))
					info = reader.readLine();
				System.out.print(info);
				info = reader.readLine();
				while (!info.trim().startsWith("AF") && !info.trim().startsWith("ED")) {
					
						System.out.print(";  " + info);
					info = reader.readLine();
				}
				System.out.println();
				while(!info.trim().startsWith("TI"))
					info = reader.readLine();
				System.out.println(info);
				while (!info.trim().startsWith("ER")) {
					String str = info.trim().substring(0, 2);

					if (list.contains(str))
						System.out.println(info);
					info = reader.readLine();
				}
				System.out.println("  --------------------------------------------------------------------------------");
				info  = reader.readLine();
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
