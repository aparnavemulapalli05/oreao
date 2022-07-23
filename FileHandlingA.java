package com.advance.filehandling;
import java.io.File;
import java.io.IOException;


public class FileHandlingA {

	public static void main(String[] args) {
		String FILE_HANDLING_DIRECTORY="src\\com\\advanced\\filehandling";
		File famousquotesfile=new File( FILE_HANDLING_DIRECTORY+"famousQuotes.txt");
		try {
			if(famousquotesfile.createNewFile()) {
				System.out.println("file is created");
			
			}
			
		}catch(IOException exception) {
			exception.printStackTrace();
		}
		File famousPersonQuotesFile=new File(FILE_HANDLING_DIRECTORY+"famousPersonQuotes.txt");
		if(famousquotesfile.renameTo(famousPersonQuotesFile)) {
			System.out.println("file is renamed");
		}
		if(famousPersonQuotesFile.delete()) {
			System.out.println("file is deleted");
		}
		

	}

}
