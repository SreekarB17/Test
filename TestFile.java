//Sahas Maduri and Sreekar Bheemavarapu -> 12/3/2025
import java.io.*;
public class TestFile
{
	public static void main(String [] args)
	{
		long start = System.nanoTime();

		// read file line
		changeFile("frankenstein.txt");
		changeFile("mobydick.txt");

		long end = System.nanoTime();

		System.out.println((end-start)/100000);
	}

	public static void changeFile(String path) {

		try(BufferedReader reader = new BufferedReader(new FileReader(path));
			BufferedWriter writer = new BufferedWriter(new FileWriter("output" + path)))
		{
			String line = "";
			while((line = reader.readLine()) !=null)
			{
				writer.write(line.toUpperCase());
				writer.newLine();
			}

			writer.close();
		}catch(IOException e)
		{
		}


	}
}
