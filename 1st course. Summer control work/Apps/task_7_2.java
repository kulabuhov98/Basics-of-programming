/*
 * Вариант: 7. Номер зачетной книжки: 21-677.
 *
 * Автор: Кулабухов Александр Максимович, ЗИТ-21
 * Дата: 21.05.2022
 *
 * По данному натуральному n ≤ 9 выведите лесенку из n ступенек, 
 * i-я ступенька состоит из чисел от 1 до i без пробелов.
 */

import java.util.InputMismatchException; /* Класс для обработки исключения */
import java.util.Scanner; /* Класс для взаимодействия с пользователем */

public class task_7_2 {
    public static void main(String[] args) {
        System.out.print("Количество ступенек лесенки:"); /* Сообщение пользователю */
        Scanner scanner = new Scanner(System.in); /* Объект класса */
        
        try {
            int n = scanner.nextInt(); /* Количество ступенек лесенки */
            
            if (n > 9 || n <= 1) {
                System.out.print("Количество ступенек лесенки должно быть больше 1 и меньше 10."); /* Сообщение пользователю */
            } else {
                System.out.print("Лесенка из " + n + " ступенек:"); /* Сообщение пользователю */
                for (int i = 0; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }
        } catch (InputMismatchException e) { /* Обработка исключения */
            System.out.println(e.getMessage()); /* Сообщение пользователю */
        }
    }
}