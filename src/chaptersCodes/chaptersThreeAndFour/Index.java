package chaptersCodes.chaptersThreeAndFour;
// revision for file scanner and printWriter
// reviosion for try catch statements

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Index{
    public static void main(String[] args) {
        Student [] students = {
                new Student("mohamed" , "alex"),
                new Student ("ahemd", " behara ")
        };
        File file = new File ("names.txt");
        Scanner input = null;
        try {
            input = new  Scanner(file);
            input.useDelimiter(",");
            while(input.hasNext()){
                String value = input.next();
                System.out.println(value);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }finally{
            if(input != null){
                input.close();
            }
        }
    }
}