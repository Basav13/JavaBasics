import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class BuffInpStrm {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("C:\\Users\\basav.singhal\\Desktop\\myFile.txt");
		BufferedInputStream buff = new BufferedInputStream(fin);
		System.out.println("Number of bytes that can be read at a time : "+buff.available());
		boolean b = buff.markSupported();
		if(b)
		{
			buff.mark(buff.available());
		}
		buff.skip(4);
		int ch;
		while((ch = buff.read()) != -1)
		{
			System.out.print((char)ch);
		}
		buff.reset();
		System.out.println();
		System.out.println();
		while((ch = buff.read()) != -1)
		{
			System.out.print((char)ch);
		}
		if(buff != null)
			buff.close();
		if(fin != null)
			fin.close();
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\basav.singhal\\Desktop\\outFile.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		byte[] bt = {75,76,77,78,79};
		bout.write(bt);
		bout.flush();
		bout.close();
		fout.close();
		
	}

}
