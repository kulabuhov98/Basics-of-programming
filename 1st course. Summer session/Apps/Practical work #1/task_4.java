/*
 * Номер зачетной книжки: 21-677.
 *
 * Автор: Кулабухов Александр Максимович, ЗИТ-21
 * Дата: 16.06.2022
 *
 * Ввести в качестве параметров имя пользователя и пароль. 
 * Проверить в методе main() соответствие введенных значений заранее определенным значениям. 
 * В случае полного соответствия вывести сообщение "Вас узнали. Добро пожаловать!", в
 * противном случае вывести сообщение "Данные не распознаны. Доступ запрещен!".
 */

package task_4;

public class task_4 {
    static String login = "Alexander";
    static String password = "12345";
	
    public static void main(String[] args) {
    	try {
	    	if ( (args[0].equals(login)) & (args[1].equals(password)) ) {
	             System.out.print("Вас узнали. Добро пожаловать!"); /* Сообщение пользователю */
	        } else {
	            System.out.print("Данные не распознаны. Доступ запрещен!"); /* Сообщение пользователю */
	        }
    	} catch (ArrayIndexOutOfBoundsException e) { /* Обработка исключения */
    		System.out.print("Данные не распознаны. Доступ запрещен! " + e.getMessage() + "!"); /* Сообщение пользователю */
    	}
    }
}
