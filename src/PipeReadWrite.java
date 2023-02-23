import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.IOException;

public class PipeReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PipedReader prt = new PipedReader();
		PipedWriter pwt = new PipedWriter();
		prt.connect(pwt);
		pwt.write("Basav");
		pwt.write("Singhal");
		char[] carr = new char[12];
		prt.read(carr);
		
		for(int i = 0 ; i < carr.length ; i++)
		{
			System.out.print(carr[i]);
		}
		prt.close();
		pwt.close();
	}

}
