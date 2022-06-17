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

public class Training extends Circus {
	private String typeTraining; /* вид дрессировки (крупные животные, мелкие животные, птицы, хищники) */
	private Integer numberAnimals; /* Количество животных */
	private Integer numberActorsTraining; /* Количество актеров */
	
	public Training(String title, String city, String date, String period, Integer price, String author, String genre, Integer numberActors,
					String typeTraining, Integer numberAnimals, Integer numberActorsTraining) {
		super(title, city, date, period, price, author, genre, numberActors);
		this.typeTraining = typeTraining;
		this.numberAnimals = numberAnimals;
		this.numberActorsTraining = numberActorsTraining;
	}
	
    public String getTypeTraining() { return typeTraining; } /* Метод для получения значения атрибута */
    public void setTypeTraining(String typeTraining) { this.typeTraining = typeTraining; } /* Метод для изменения значения атрибута */
    
    public Integer getNumberAnimals() { return numberAnimals; } /* Метод для получения значения атрибута */
    public void setNumberAnimals(Integer numberAnimals) { this.numberAnimals = numberAnimals; } /* Метод для изменения значения атрибута */
    
    public Integer getNumberActorsTraining() { return numberActorsTraining; } /* Метод для получения значения атрибута */
    public void setNumberActorsTraining(Integer numberActorsTraining) { this.numberActorsTraining = numberActorsTraining; } /* Метод для изменения значения атрибута */

    /* Переопределенный стандартный метод для представления объекта в виде строке с более подробной информацией */
    public String toString() {
        return "\n" + super.toString() +
        		"\nВид дрессировки: " + typeTraining +
        		"\nКоличество животных в дрессировках: " + numberAnimals +
        		"\nКоличество актеров в дрессировках: " + numberActorsTraining + "\n";
    }
}