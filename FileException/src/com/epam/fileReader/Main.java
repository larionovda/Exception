package com.epam.fileReader;

import com.epam.fileReader.exception.FileIsEmptyException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Полина on 03.12.2016.
 */
public class Main {

    public static void main (String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("read.txt");
            Scanner scanner = new Scanner(fileReader);
            if (!scanner.hasNext()) {
                throw new FileIsEmptyException();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (FileIsEmptyException e) {
            e.printStackTrace();
        }
        finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Good result!");
    }
}
