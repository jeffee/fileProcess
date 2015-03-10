/**
 * 相同文件查找
 */
package com.jeffee.file;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jeffee
 * 
 */
public class SimilarFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("D:\\");
		File file2 = new File("D:/");
		String fileType = ".docx";
		SimilarFile similarFile = new SimilarFile(file1, file2, fileType);
		similarFile.check();
	}

	private File fileStubA;

	private File fileStubB;

	private String fileType;

	private List<File> fileList;
	
	private List<File> similarFileList;
	public SimilarFile(File fileStubA, File fileStubB, String fileType) {
		this.fileStubA = fileStubA;
		this.fileStubB = fileStubB;
		this.fileType = fileType;
		fileList = new LinkedList<File>();
		similarFileList = new LinkedList<File>();
	}

	public void check() {
		getFileList(fileStubA);
		System.out.println("********************************************");
		System.out.println("get "+fileList.size()+" files");
		
		for (int i = 0; i < fileList.size(); i++) {
			File fileA = fileList.get(i);
			for(int j=i+1; j<fileList.size(); j++){
			
				File fileB = fileList.get(j);
				if (fileA.getName().equals(fileB.getName()) && !fileA.getPath().equals(fileB.getPath()) && fileA.length()==fileB.length()){
					similarFileList.add(fileA);
					fileList.remove(j);
					System.out.println(fileA.getPath()+": "+fileB.getPath());
				}
			}
		}
	}

	public void getFileList(File fileStub) {

		if (fileStub.isDirectory()) {
			System.out.println("FIleStub: " + fileStub);
			File[] fileArray = fileStub.listFiles();
			if (fileArray != null)
				for (int i = 0; i < fileArray.length; i++)
					getFileList(fileArray[i]);
		} else {
			if (fileType.equals("") || fileStub.getName().endsWith(fileType))
					fileList.add(fileStub);
			// System.out.println("FIle: " + fileStub);
		}
	}

}
