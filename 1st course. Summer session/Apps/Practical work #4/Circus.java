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

public class Circus {
    private String title; /* Название представления */
    private String city; /* Город */
    private String date; /* Дата премьеры */
    private String period; /* Период проведения */
    private Integer price; /* Цена билета */
    private String author; /* Автор */
    private String genre; /* Жанр */
    private Integer numberActors; /* Количество актеров */
    
    public Circus(String title, String city, String date, String period, Integer price, String author, String genre, Integer numberActors) {
        this.title = title;
        this.city = city;
        this.date = date;
        this.period = period;
        this.price = price;
        this.author = author;
        this.genre = genre;
        this.numberActors = numberActors;
    }

    public String getTitle() { return title; } /* Метод для получения значения атрибута */
    public void setTitle(String title) { this.title = title; } /* Метод для изменения значения атрибута */
    
    public String getCity() { return city; } /* Метод для получения значения атрибута */
    public void setCity(String city) { this.city = city; } /* Метод для изменения значения атрибута */
    
    public String getDate() { return date; } /* Метод для получения значения атрибута */
    public void setDate(String date) { this.date = date; } /* Метод для изменения значения атрибута */
    
    public String getPeriod() { return period; } /* Метод для получения значения атрибута */
    public void setPeriod(String period) { this.period = period; } /* Метод для изменения значения атрибута */
    
    public Integer getPrice() { return price; } /* Метод для получения значения атрибута */
    public void setPrice(Integer price) { this.price = price; } /* Метод для изменения значения атрибута */
    
    public String getAuthor() { return author; } /* Метод для получения значения атрибута */
    public void setAuthor(String author) { this.author = author; } /* Метод для изменения значения атрибута */
    
    public String getGenre() { return genre; } /* Метод для получения значения атрибута */
    public void setGenre(String genre) { this.genre = genre; } /* Метод для изменения значения атрибута */
    
    public Integer getNumberActors() { return numberActors; } /* Метод для получения значения атрибута */
    public void setNumberActors(Integer numberActors) { this.numberActors = numberActors; } /* Метод для изменения значения атрибута */
    
    /* Переопределенный стандартный метод для представления объекта в виде строке с более подробной информацией */
    public String toString() {
        return "Название представления: " + title +
        		"\nГород: " + city +
        		"\nДата премьеры: " + date +
        		"\nЦена билета: " + price +
        		"\nАвтор: " + author +
        		"\nЖанр: " + genre +
        		"\nОбщее количество актеров: " + numberActors;
    }
}