import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffReader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader rdr = new FileReader("C:\\Users\\basav.singhal\\Desktop\\myFile.txt");
		BufferedReader brd = new BufferedReader(rdr);
		if(brd.markSupported())
		{
			brd.mark(100);
		}
		brd.skip(4);
		if(brd.ready())
		{
			System.out.println(brd.readLine());
			System.out.println(brd.readLine());
			System.out.println(brd.readLine());
			brd.reset();
			char[] ch = new char[10];
			brd.read(ch);
			for(int i = 0 ; i < 5 ; i++)
			{
				System.out.print(ch[i]);
			}
			brd.reset();
			System.out.println();
			System.out.println(brd.readLine());
			System.out.println(brd.readLine());
			System.out.println(brd.readLine());
			
		}
		brd.close();
		rdr.close();
		System.out.println("---BufferedWriter---");
		
		FileWriter fwt = new FileWriter("C:\\Users\\basav.singhal\\Desktop\\outFile.txt");
		BufferedWriter bwt = new BufferedWriter(fwt);
		bwt.write("This is buffred writer");
		bwt.newLine();
		bwt.write("Use me to add new lines");
		System.out.println("Writtern Succesfully. Check your file");
		bwt.close();
		fwt.close();
		
	}

}
