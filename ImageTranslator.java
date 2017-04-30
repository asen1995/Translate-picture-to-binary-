package asen.lang;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ImageTranslator {

	private static final String FILE_PATH = "basic_linux_commands.png";

	public static void main(String[] args) throws IOException {

		ImageTranslator translator = new ImageTranslator();
		translator.translateImageToBIN(FILE_PATH);
	

	}

	
	private void translateImageToBIN(String filePath) throws IOException {
		BufferedReader st = null;
		st = new BufferedReader(new FileReader(new File(FILE_PATH)), 1024);
		String line = st.readLine();
		while (line != null) {
			for (int i = 0; i < line.length(); i++) {
				System.out.print(Integer.toBinaryString((int) (line.charAt(i))) + " ");
			}
			line = st.readLine();

			System.out.println();

		}
		st.close();
	}

}
