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
public class Process {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E://ei.txt");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(file)));
			String info = reader.readLine();
			int count = 1;
			while(info!=null){
				if(info.trim().startsWith("9")){
					info = reader.readLine();
					while(!info.startsWith("10"))
						info = reader.readLine();
				}else{
				info = reader.readLine();
				System.out.println(count+".");
				count++;
				
					
					for(int i=0;i<3;i++){
						System.out.println(info);
						info = reader.readLine();
					}
					while(!info.trim().startsWith("Source title"))
						info = reader.readLine();
					System.out.println(info);
					info = reader.readLine();
					info = reader.readLine();
					while(!info.trim().startsWith("Language")){
						if(info.trim().startsWith("Monograph"))
							info = reader.readLine();
						else
						System.out.print(info+"  ");
						info = reader.readLine();
					}
					System.out.println();
					while(!info.trim().startsWith("Compilation"))
						info = reader.readLine();
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
