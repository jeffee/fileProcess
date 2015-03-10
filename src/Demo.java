import java.io.File;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;






public class Demo {

	
	public static void main(String[] args) {
		List<String> list = FileProcess.read(new File("E:\\Sina\\spams\\repost.sn"));
		String line = list.toString();
		Pattern pattern = Pattern.compile("http://weibo.com/(\\d*)/");
		Matcher matcher = pattern.matcher(line);
		while(matcher.find()){
			String uid = matcher.group(1);
			System.out.println(uid);
		}

		
	}

}
