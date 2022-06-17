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

public class MagicTricks extends Circus {
	private String typeMagicTricks; /* Вид фокусов (иллюзия, манипуляция) */
	private Integer numberMagicTricks; /* Количество актеров */
	private String inventoryMagicTricks; /* Инвентарь */
	
	public MagicTricks(String title, String city, String date, String period, Integer price, String author, String genre, Integer numberActors,
						String typeMagicTricks, Integer numberMagicTricks, String inventoryMagicTricks) {
		super(title, city, date, period, price, author, genre, numberActors);
		this.typeMagicTricks = typeMagicTricks;
		this.numberMagicTricks = numberMagicTricks;
		this.inventoryMagicTricks = inventoryMagicTricks;
	}
	
    public String getTypeMagicTricks() { return typeMagicTricks; } /* Метод для получения значения атрибута */
    public void setTypeMagicTricks(String typeMagicTricks) { this.typeMagicTricks = typeMagicTricks; } /* Метод для изменения значения атрибута */
    
    public Integer getNumberMagicTricks() { return numberMagicTricks; } /* Метод для получения значения атрибута */
    public void setNumberMagicTricks(Integer numberMagicTricks) { this.numberMagicTricks = numberMagicTricks; } /* Метод для изменения значения атрибута */
    
    public String getInventoryMagicTricks() { return inventoryMagicTricks; } /* Метод для получения значения атрибута */
    public void setInventoryMagicTricks(String inventoryMagicTricks) { this.inventoryMagicTricks = inventoryMagicTricks; } /* Метод для изменения значения атрибута */

    /* Переопределенный стандартный метод для представления объекта в виде строке с более подробной информацией */
    public String toString() {
        return "\n" + super.toString() +
        		"\nВид фокуса: " + typeMagicTricks +
        		"\nКоличество актеров в фокусах: " + numberMagicTricks +
        		"\nИнвентарь в фокусах: " + inventoryMagicTricks + "\n";
    }
}