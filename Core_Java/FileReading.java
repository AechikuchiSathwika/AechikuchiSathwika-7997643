import java.util.*;
import java.io.*;
class FileReading{
	public static void main(String args[]){
		try{
			File file = new File("output.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				System.out.println(line);
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Error! file is not found.");
		}
	}
}