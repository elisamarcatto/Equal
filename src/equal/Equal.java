/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package equal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Equal
{
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
    {
        String dirName = "aqui";

        String fileName = "test.txt";
        File dir = new File (dirName);
        File actualFile = new File (dir, fileName);
        
        PrintWriter writer = new PrintWriter("test.txt", "UTF-8");
        writer.write("The first lineeeee");
        writer.write("The second lineeeee");
        writer.close();

    }
    
//     public static void main(String[] args) throws IOException {
//        String text = "Hello world";
//        BufferedWriter output = null;
//        try {
//            File file = new File("example.txt");
//            output = new BufferedWriter(new FileWriter(file));
//            output.write(text);
//        } catch ( IOException e ) {
//            e.printStackTrace();
//        } finally {
//            if ( output != null ) output.close();
//        }
//    }    
}
