import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
	public static void main(String[] args) {
		try {
			File file = new File("/Users/kinaseryota/java/test.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0; i < 5; i++) {
				bw.write("[" + i + "]¥r¥n");
			}
			bw.close();
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}

