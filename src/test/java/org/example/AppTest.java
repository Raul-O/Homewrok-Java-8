package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        String input = "myfile.txt";
        String output = "outputfile.txt";
        Integer month = 10;
        try {
            getSortedPersonsByBirthMonth.getFile(input,month,output);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            assertEquals(4, Files.lines(Paths.get(output)).count());
            assertEquals("Ana", Files.readAllLines(Paths.get(output)).get(0).substring(0,3));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
