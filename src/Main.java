import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, IOException {
		
		
		if (args.length >= 1) {
			
		if (new File(args[0]).isDirectory()) {
			
		System.out.println("\n===== FileEncrypter by ProgrammAlex =====\n");
		
		String path = args[0];
		
		FileEncrypt pf = new FileEncrypt();
		Files.walkFileTree(Paths.get(path), pf);
		
		}	else {
			System.out.println("'" + args[0] + "' ist kein gültes Verzeichnis!");
		}
		}	else {
			System.out.println("java -jar FileEncrypter.jar <Verzeichnis>");
		}
		
		System.exit(0);
		
	}

}
