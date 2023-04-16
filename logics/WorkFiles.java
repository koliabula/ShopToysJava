package logics;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkFiles {
    
    public static String filePathDack = "data/dack.txt";
    public static String filePathCat = "data/cat.txt";
    public static String filePathEl = "data/el.txt";
    public static String filePathCar = "data/car.txt";


    public static void createFile(String fp, String text) throws IOException {
        File file = new File(fp);
        if(file.createNewFile()){
            myWriteFile(fp, text);
        }
    }
    
    public static void myWriteFile(String fp, String text) throws IOException{
        File f = new File(fp);
        FileWriter writer = new FileWriter (f);
        writer.write(text);
        writer.close();
    }
    
    public static int myReaderFile(String fp) {
        BufferedReader reader;
        int help = 0;
		try {
			reader = new BufferedReader(new FileReader(fp));
			String line = reader.readLine();

			while (line != null) {
                help = Integer.parseInt(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return help;
    }

    public static void createFiles() throws IOException{
        createFile(filePathDack, "0");
        createFile(filePathCat, "0");
        createFile(filePathEl, "0");
        createFile(filePathCar, "0");
    }

}
