
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File obj = new File("C:\\Users\\basav.singhal\\Desktop\\myFile.txt");
			if(obj.createNewFile())
			{
				System.out.println("New Filer created "+obj.getName());
			}
			else
			{
				System.out.println("Already exists");
			}
			
			FileWriter wrt = new FileWriter("C:\\Users\\basav.singhal\\Desktop\\myFile.txt");
			wrt.write("This is File created by Java code");
			wrt.close();
			System.out.println("Succesfully written");
			
			Scanner rdr = new Scanner(obj);
			while(rdr.hasNextLine())
			{
				String data = rdr.nextLine();
				System.out.println(data);
			}
			rdr.close();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		

	}

}
