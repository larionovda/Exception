package com.epam.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Andrey_Vaganov on 12/5/2016.
 */
public class MainReader {

    /**
     * Формат даты
     */
    private static final String DATE_FORMAT_PATTERN = "dd.MM.yyyy";

    /**
     * Точка входа в программу
     * @param args
     */
    public static void main(String[] args) {
        //Открываем потоки на чтение из файла
        FileReader reader = new FileReader("file.txt");
        BufferedReader byfReader = new BufferedReader(reader);

        //Читаем первую строку из файла
        String strDate = byfReader.readLine();

        while(strDate != null) {
            //Преобразуем строку в дату
            Date date = parseDate(strDate);

            //Выводим дату в консоль в формате dd-mm-yy
            System.out.printf("%1$td-%1$tm-%1$ty \n", date);

            //Читаем следующую строку из файла
            strDate = byfReader.readLine();

        }
    }

    /**
     * Метод преобразует строковое представление даты в класс Date
     * @param strDate строковое представление даты
     * @return
     */
    public static Date parseDate(String strDate) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_FORMAT_PATTERN);
        return dateFormatter.parse(strDate);
    }
}
