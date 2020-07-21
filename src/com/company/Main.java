package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("E:/lessons/harry.txt")));

        String first200 = text.substring(0, 20); //сабстринг отрезали и вывели 200 символов

        System.out.println(first200);
        // освободили текст от муссора командой регекс
        String textTrashFree = text.replaceAll("[^A-Za-z'\\- ]", "");

        System.out.println();
        first200 = textTrashFree.substring(0, 200);
        System.out.println(first200);

        String[] wordsArray = textTrashFree.split(" ");
        System.out.println(wordsArray.length);


        for (int i = 0; i <wordsArray.length; i++) {

                    // все слова длина которых больше 3 или ровна согластно условии
            if ( (wordsArray[i].length() >= 3) && (wordsArray[i].charAt(0) == 'a') ) {//&& коньюнсия
                                                   //Первая буква charAt(0) солова "а"
                                                   // есть первая "нулевая"!!!! запомните!!
                                                    // charAt берется в одиночных кавычках
                


                System.out.print(i + ". ");// выводит номер слова
                System.out.println(wordsArray[i]);// это выводит слово на каком номере
            }
        }
    }
}
