package java50;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringFindReplace {
	

public static void main(String args[])
{
	

try
    {
    File file = new File("/Users/Sumathi/Desktop/java.docx");
    BufferedReader reader = new BufferedReader(new FileReader(file));
    String line = "", oldtext = "";
    while((line = reader.readLine()) != null)
        {
        oldtext += line + "\r\n";
    }
    reader.close();
    
    String newtext = oldtext.replaceAll("Java", "Python");
   
    FileWriter writer = new FileWriter("/Users/Sumathi/Desktop/Python.docx");
    writer.write(newtext);writer.close();
}
catch (IOException ioe)
    {
    ioe.printStackTrace();

}
}
}



