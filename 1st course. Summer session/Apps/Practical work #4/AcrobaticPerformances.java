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

public class AcrobaticPerformances extends Circus {
	private String typeAcrobatics; /* тип акробатики (силовая акробатика, парная силовая, групповая силовая, пластическая, одинарная и т.д.) */
	private Integer numberActorsAcrobatics; /* Количество актеров */
	private String inventoryAcrobatics; /* Инвентарь */
	
	public AcrobaticPerformances(String title, String city, String date, String period, Integer price, String author, String genre, Integer numberActors,
									String typeAcrobatics, Integer numberActorsAcrobatics, String inventoryAcrobatics) {
		super(title, city, date, period, price, author, genre, numberActors);
		this.typeAcrobatics = typeAcrobatics;
		this.numberActorsAcrobatics = numberActorsAcrobatics;
		this.inventoryAcrobatics = inventoryAcrobatics;
	}
	
    public String getTypeAcrobatics() { return typeAcrobatics; } /* Метод для получения значения атрибута */
    public void setTypeAcrobatics(String typeAcrobatics) { this.typeAcrobatics = typeAcrobatics; } /* Метод для изменения значения атрибута */
    
    public Integer getNumberActorsAcrobatics() { return numberActorsAcrobatics; } /* Метод для получения значения атрибута */
    public void setNumberActorsAcrobatics(Integer numberActorsAcrobatics) { this.numberActorsAcrobatics = numberActorsAcrobatics; } /* Метод для изменения значения атрибута */
    
    public String getInventoryAcrobatics() { return inventoryAcrobatics; } /* Метод для получения значения атрибута */
    public void setInventoryAcrobatics(String inventoryAcrobatics) { this.inventoryAcrobatics = inventoryAcrobatics; } /* Метод для изменения значения атрибута */

    /* Переопределенный стандартный метод для представления объекта в виде строке с более подробной информацией */
    public String toString() {
        return "\n" + super.toString() +
        		"\nТип акробатики: " + typeAcrobatics +
        		"\nКоличество актеров в акробатических представлениях: " + numberActorsAcrobatics +
        		"\nИнвентарь в акробатических представлениях: " + inventoryAcrobatics;
    }
}