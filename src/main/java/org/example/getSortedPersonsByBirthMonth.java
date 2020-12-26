package org.example;

import java.io.File;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class getSortedPersonsByBirthMonth {

     public static void getFile(String input, Integer month, String output) throws IOException {

          Files.write(Paths.get(output), Files.lines(Paths.get(input))
                  .map(line -> line.replaceAll("[.$|/|\\-]", "."))
                  .map(line -> line.replaceAll(line.substring(line.indexOf(",", line.indexOf(",")+1)+1), line.substring(line.indexOf(".")+1, line.indexOf(".")+3)))
                  .filter(e -> Integer.parseInt(e.substring(e.indexOf(",", e.indexOf(",")+1)+1))==month)
                  .map(a -> a.replaceAll(a.substring(a.indexOf(",", a.indexOf(",")+1)), ""))
                  .sorted()
                  .collect(Collectors.toList()));

     }


}
