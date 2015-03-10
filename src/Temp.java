import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Temp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*SimpleDateFormat format = new SimpleDateFormat("MM-dd hh:mm");
		Date date = new Date("12-12 20:44");*/
		
		String str = "id=3608787715463695&max_id=3609358082638324&filter=0&page=1\" c";
		Pattern pattern = Pattern.compile("(id=\\d*?&max_id.*?&page)");
		Matcher matcher = pattern.matcher(str);
		while(matcher.find())
		System.out.println(matcher.group(1));
		
	}
}