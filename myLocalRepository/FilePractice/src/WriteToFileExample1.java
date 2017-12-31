import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample1 
{

	private static final String FILENAME = "E:\\test\\filename.txt";

	public static void main(String[] args) 
	{

		BufferedWriter bw = null;
		FileWriter fw = null;

		try 
		{

			String content = "This me changing the past!\n";

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(content);

			System.out.println("Done");

		} 
		catch (IOException e) 
		{

			e.printStackTrace();

		} 
		finally 
		{

			try 
			{

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} 
			catch (IOException ex) 
			{

				ex.printStackTrace();

			}
		}
	}
}