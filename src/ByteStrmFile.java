import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class ByteStrmFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\basav.singhal\\Desktop\\myFile.txt");
			File otp = new File("C:\\Users\\basav.singhal\\Desktop\\outFile.txt");
			if(otp.createNewFile())
			{
				System.out.println("outFile created");
			}
			else
			{
				System.out.println("Already exixts");
			}
			FileOutputStream fos = new FileOutputStream(otp);
			int temp;
			while(fis.read() != -1)
			{
				temp = fis.read();
				fos.write(temp);
				System.out.println(temp);
			}
			Scanner rdr = new Scanner(otp);
			while(rdr.hasNextLine())
			{
				String data = rdr.nextLine();
				System.out.println(data);
			}
			rdr.close();
			if(fis != null)
			{
				fis.close();
			}
			if(fos != null)
			{
				fos.close();
			}
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}

	}

}
