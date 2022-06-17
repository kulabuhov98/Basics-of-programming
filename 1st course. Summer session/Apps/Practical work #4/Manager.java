/*
 * Вариант: 20. Номер зачетной книжки: 21-677.
 *
 * Автор: Кулабухов Александр Максимович, ЗИТ-21
 * Дата: 17.06.2022
 *
 * Учет представлений цирка. Создать родительский класс «Цирк» (название представления, город, 
 * дата премьеры, период проведения, цена билета, автор, жанр, количество актеров) и дочерние классы:
 * «акробатические представления» (тип акробатики (силовая акробатика, парная силовая, групповая силовая, пластическая, 
 * одинарная и т.д.), количество актеров, инвентарь);
 * «дрессировка» (вид дрессировки (крупные животные, мелкие животные, птицы, хищники), количество животных, количество актеров);
 * «фокусы» (вид фокусов (иллюзия, манипуляция), количество актеров, инвентарь)
 * Реализовать класс для хранения списка представлений с методом добавления нового представления и методом печати списка представлений.
 */

package circus;

import java.util.ArrayList; /* Класс для работы со списками (динамическими массивами) */

public class Manager {
	private ArrayList<Circus> listOfCircusPerformances;

	/* Метод хранения списка цирковых представлений */
	public Manager(ArrayList<Circus> listOfCircusPerformances) {
		this.listOfCircusPerformances = listOfCircusPerformances;
	}
	
	/* Метод добавления нового циркового представления */
	public void addCircusPerformances(Circus circus) {
		listOfCircusPerformances.add(circus);
	}
	
	/* Метод печати списка цирковых представлений */
	public ArrayList<Circus> printCuircusPerformances() {
		return listOfCircusPerformances;
	}
	
	public static void main(String[] args) {
		ArrayList<Circus> listOfCircusPerformances = new ArrayList<>();
		Manager manager = new Manager(listOfCircusPerformances);
		
		String title = "Большое шоу иллюзий"; /* Название представления */
		String city = "Воронеж"; /* Город */
	    String date = "18 июня 2022 года"; /* Дата премьеры */
	    String period = "с 18 июня по 23 августа"; /* Период проведения */
	    Integer price = 1500; /* Цена билета */
	    String author = "Михаил Цителашвили"; /* Автор */
	    String genre = "иллюзий"; /* Жанр */
	    Integer numberActors = 25; /* Количество актеров */
	    
	    String typeAcrobatics = "Силовая акробатика"; /* тип акробатики (силовая акробатика, парная силовая, групповая силовая, пластическая, одинарная и т.д.) */
		Integer numberActorsAcrobatics = 3; /* Количество актеров */
		String inventoryAcrobatics = "Стандартный инвертарь, необходимый для выполнения номера"; /* Инвентарь */
		AcrobaticPerformances acrobaticPerformances = new AcrobaticPerformances(title, city, date, period, price, author, genre, numberActors, 
				typeAcrobatics, numberActorsAcrobatics, inventoryAcrobatics);
		manager.addCircusPerformances(acrobaticPerformances);
		
		String typeTraining = "Крупные животные, хищники"; /* вид дрессировки (крупные животные, мелкие животные, птицы, хищники) */
		Integer numberAnimals = 5; /* Количество животных */
		Integer numberActorsTraining = 5; /* Количество актеров */
		Training training = new Training(title, city, date, period, price, author, genre, numberActors,
				typeTraining, numberAnimals, numberActorsTraining);
		manager.addCircusPerformances(training);
		
		String typeMagicTricks = "Иллюзия"; /* Вид фокусов (иллюзия, манипуляция) */
		Integer numberMagicTricks = 10; /* Количество актеров */
		String inventoryMagicTricks = "Стандартный инвертарь, необходимый для выполнения номера"; /* Инвентарь */
		MagicTricks magicTricks = new MagicTricks(title, city, date, period, price, author, genre, numberActors,
				typeMagicTricks, numberMagicTricks, inventoryMagicTricks);
		manager.addCircusPerformances(magicTricks);
		
		System.out.print(manager.printCuircusPerformances());
	}
}