import java.util.*;
import java.io.*;
class FileWriting{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		try{
			FileWriter fs = new FileWriter("output.txt");
			fs.write(str);
			fs.close();
			System.out.println("Data written successfully into file!");
		}
		catch(IOException e){
			System.out.println("Error, while writing into file!");
		}
	}
}