package ru.sysoevm.checkbytestream;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CheckByteStream {

    public static boolean isNumber(InputStream in) throws IOException {
        //Оборачивем в try-with-resources входящий поток in.
        try (BufferedInputStream bis = new BufferedInputStream(in)) {
            Scanner scanner = new Scanner(bis);
            //Проверяем, что имеется int значение.
            if (scanner.hasNextInt()) {
                //Проверяем, что это значение чётное.
                if (scanner.nextInt() % 2 == 0) {
                    System.out.println("Четное число");
                    return true;
                }
            }
            System.out.println("Нечетное число");
            return false;
            //Закрываем блок try.
        }
    }

}
