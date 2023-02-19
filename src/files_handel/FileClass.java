package files_handel;

import java.io.*;
import java.util.Scanner;

public class FileClass {


    public static void main(String[] args) {
        // create new file
        File f = createFile("test.txt");
        //write some text in the file
        writeInFile(f, "Welcome to writing in file");
        //print the content on the screen
        readContentFile(f);
    }

    /**
     *
     * @implSpec create new file by using "createNewFile" method
     * @param name: file name (we create the file direct in the same path project
     * @return pointer for new file
     *
     */
    public static File createFile(String fileName){
        try {
            File f = new File("D://MyPrograms//Spring//test//src//files_handel//"+fileName);
            f.createNewFile();
            return f;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @implSpec method to add some content to specific file
     * @param f: file, which we want to write on it
     * @param text: the text, which we want to write it inside the file
     */
    public static void writeInFile(File f, String text){
        try {
            // append: ture, if the file already exists, I want to add new content without remove the old content
            FileWriter fr = new FileWriter(f,true);
            fr.write(text);
            // we dont have to forget close the stream
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @implSpec method to read the content of file and print it in the console
     * @param f the file, which we want to read it
     */
    public static void readContentFile(File f){
        if(f.length() == 0){
            System.out.println("The file is empty");
            return;
        }
        try {
            Scanner scanner = new Scanner(f);
            while(scanner.hasNext()){
                System.out.print(scanner.next()+" ");
            }
            scanner.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }


}
