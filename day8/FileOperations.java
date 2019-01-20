package pl.sda.javastart.day8;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {
    private static final String PATH_TO_FILE = "C:\\Users\\Admin\\Desktop\\wiersz.txt"; //wczywywanie danych z pliku znajdującego się na kompie

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader(PATH_TO_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader); // wstawienie zmiennej ctrl+alt+v
            String line;//tworzymy zmienna gdzie zpaisujemy po kolei linijki z tekstu
            List<String> lines = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) { //sprawdzamy czy zmianna-linijka nie jest nullem
                lines.add(line);
            }
            printCapitalized(lines);

        } catch (IOException e) {
            System.out.println(e.getMessage());
            //ABSOLUTNIE NIGDY NIE ZOSTAWIAĆ PUSTEGO CATCHA!
        }
    }

    private static void printCapitalized(List<String> lines) {
        for (String s : lines) {
            String c = String.valueOf(s.charAt(0));
            String upperCased = c.toUpperCase();
            String restOfLine = s.substring(1);
            System.out.println(upperCased + restOfLine);
            // StringUtils.capitalize();

        }
    }
}
