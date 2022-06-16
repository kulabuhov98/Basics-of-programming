/*
 * Номер зачетной книжки: 21-677.
 *
 * Автор: Кулабухов Александр Максимович, ЗИТ-21
 * Дата: 16.06.2022
 *
 * Передавать в качестве параметров два целочисленных числа. 
 * Вывести на экран как сами значения, так и их сумму "3 + 2 = 5". 
 * Если количество параметров не равно 2, вывести сообщение "Неверное количество параметров!".
 */

package task_3;

public class task_3 {
    public static void main(String[] args) {
    	try {
	        if (args.length == 2) { /* Если в качестве параметров передано два целочисленных числа */
	            int i = Integer.parseInt(args[0]); /* Целочисленное число в качестве первого аргумента */
	            int j = Integer.parseInt(args[1]); /* Целочисленное числе в качестве второго аргумента */
	            int result = i + j; /* Сумма двух целочисленных чисел */
	        
	            System.out.print(i + " + " + j + " = " + result); /* Значение двух целочисленных чисел и их сумма */
	        } else {
	            System.out.print("Неверное количество параметров!"); /* Сообщение пользователю */
	        }
        } catch (NumberFormatException e) { /* Обработка исключения */
            System.out.println(e.getMessage() + "!"); /* Сообщение пользователю */
        }
    }
}