package fileMixer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Handler {

	public void writeToFile(String inputFilePath1, String inputFilePath2, String outputFilePath) {
		BufferedReader reader1 = null;
		BufferedReader reader2 = null;
		FileReader fileReader1 = null;
		FileReader fileReader2 = null;
		BufferedWriter writer = null;
		FileWriter fileWriter = null;
		try {
			fileReader1 = new FileReader(inputFilePath1);
			reader1 = new BufferedReader(fileReader1);
			fileReader2 = new FileReader(inputFilePath2);
			reader2 = new BufferedReader(fileReader2);
			fileWriter = new FileWriter(outputFilePath);
			writer = new BufferedWriter(fileWriter);
			String currentLine;
			String currentLine2;
			while ((currentLine = reader1.readLine()) != null | (currentLine2 = reader2.readLine()) != null) {
				if (currentLine != null) {
					writer.write(currentLine + System.getProperty("line.separator"));
				}
				if (currentLine2 != null) {
					writer.write(currentLine2 + System.getProperty("line.separator"));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader1 != null)
					reader1.close();
				if (fileReader1 != null)
					fileReader1.close();
				if (reader2 != null)
					reader2.close();
				if (fileReader2 != null)
					fileReader2.close();
				if (writer != null)
					writer.close();
				if (fileWriter != null)
					fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
