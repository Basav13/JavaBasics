import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;


public class ByteArrStrm {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		byte[] bt = {71,72,73,74,75};
		ByteArrayInputStream bai = new ByteArrayInputStream(bt);
		System.out.println("Number of availabel bytes : "+bai.available());
		System.out.println("Reading character : "+ (char)bai.read());
		System.out.println("Reading character : "+ (char)bai.read());
		System.out.println("Reading character : "+ (char)bai.read());
		bai.mark(0);
		bai.skip(1);
		System.out.println("---Skipped character J---");
		System.out.println("Reading character : "+ (char)bai.read());
		System.out.println("---Setting position back to J---");
		if(bai.markSupported())
		{
			bai.reset();
			System.out.println("Reading character : "+ (char)bai.read());
			System.out.println("Reading character : "+ (char)bai.read());
		}
		if(bai != null)
		{
			bai.close();
		}
		System.out.println("-----ByteArrayOutputStream-----");
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		byte[] buf = {'B','A','S','A','V'};
		for(byte x : buf)
		{
			bout.write(x);
		}
		System.out.println("Size : "+bout.size());
		//bout.reset();
		System.out.println(bout.toString());
		bout.close();
		
	}

}
