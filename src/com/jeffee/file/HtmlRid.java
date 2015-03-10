/**
 * 
 */
package com.jeffee.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 * @author Jeffee
 *
 */
public class HtmlRid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileStr = "D:\\Software\\txt";
		File[] inFile = new File(fileStr).listFiles();
		for(int i=0;i<inFile.length;i++){
			File outFile = new File("D:\\Software\\zang\\"+inFile[i].getName());
			HtmlRid rid = new HtmlRid();
			rid.getRidofHtml(inFile[i], outFile);
		}
		
	}
	public void getRidofHtml(File file, File outFile){
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile)));
			String info = reader.readLine();
			while(info!=null){
				info = info.replaceAll("&nbsp;", " ");
				info = info.replaceAll("<br>", "\r\n");
				info = info.replaceAll("&ldquo;", "\"");
				info = info.replaceAll("&rdquo;", "\"");
				info = info.replaceAll("<p>", "");
				writer.write(info.trim());
				writer.newLine();
				info = reader.readLine();
				//System.out.println(info);
			}
			writer.close();
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
