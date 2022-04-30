/*
 * Вариант: 7. Номер зачетной книжки: 21-677.
 *
 * Автор: Кулабухов Александр Максимович, ЗИТ-21
 * Дата: 30.04.2022
 *
 * Задание 7. Произведите расчет суммы чисел введенных
 * пользователем (остановка сложение при вводе "0").
 */

import java.util.InputMismatchException; /* Класс для обработки исключения */
import java.util.Scanner; /* Класс для взаимодействия с пользователем */

public class task_7 {
    public static void main(String[] args) {
        float result = 0; /* Переменная для расчета суммы чисел */
        while (true) {
            System.out.print("Введите число: "); /* Сообщение пользователю */
            Scanner scanner = new Scanner(System.in); /* Объект класса */
            try {
                float i = scanner.nextFloat(); /* Переменная с введенным числом */
                result += i; /* Расчет суммы чисел */
                if (i == 0) { /* Если введенное число 0, останавливаем цикл */
                    break;
                }
            } catch (InputMismatchException e) { /* Обработка исключения */
                System.out.println(e.getMessage()); /* Сообщение пользователю */
            }
        }
        System.out.print("Сумма введенных чисел = " + result); /* Сообщение пользователю */
    }
}