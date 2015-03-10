import java.io.*;

/**
 * 
 */

/**
 * @author Jeffee
 *
 */
public class DataStreamDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] members = {new Member("Justin",10),
							new Member("jkjkj",20),};
		try{
			 File sub = new File("D:");
			  if(!sub.isDirectory())
			  {
			   sub.mkdirs();
			  }
			  //在子文件夹sub下创建一个文件
			  File file = new File(sub, "fileSub.txt");
			  
			  if(!file.isFile())
			  {
			   file.createNewFile();
			  }

			PrintStream outputStream = new PrintStream(new FileOutputStream(file));
			
			for(Member member: members){
				outputStream.print(member.getName());
				outputStream.println(member.getAge());
			}
			outputStream.flush();
			outputStream.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
