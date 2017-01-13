package fileMixer;

public class FileMixer {
	private static final String inputFilePath1 = "src\\main\\files\\InputFile.txt";
	private static final String inputFilePath2 = "src\\main\\files\\InputFile2.txt";
	private static final String outputFilePath = "src\\main\\files\\OutputFile.txt";

	public static void main(String args[]) {
		new Handler().writeToFile(inputFilePath1, inputFilePath2, outputFilePath);
	}

}
