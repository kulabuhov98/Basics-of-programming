/*
 * Вариант: 20. Номер зачетной книжки: 21-677.
 *
 * Автор: Кулабухов Александр Максимович, ЗИТ-21
 * Дата: 16.06.2022
 *
 * Создайте программу на языке Java для определения класса в предметной области представление цирка.
 * Описать свойства, конструктор, методы геттеры/сеттеры, перекрыть метод toString() для вывода
 * полной информации об объекте в отформатированной виде.
 */

package circus;

public class circus {
    private String title; /* Название представления */
    private String city; /* Город */
    private String date; /* Дата премьеры */
    private String period; /* Период проведения */
    private Integer price; /* Цена билета */
    private String author; /* Автор */
    private String genre; /* Жанр */
    private Integer numberActors; /* Количество актеров */
    
    public circus(String title, String city, String date, String period, Integer price, String author, String genre, Integer numberActors) {
        this.title = title;
        this.city = city;
        this.date = date;
        this.period = period;
        this.price = price;
        this.author = author;
        this.genre = genre;
        this.numberActors = numberActors;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    
    public String getPeriod() { return period; }
    public void setPeriod(String period) { this.period = period; }
    
    public Integer getPrice() { return price; }
    public void setPrice(Integer price) { this.price = price; }
    
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    
    public Integer getNumberActors() { return numberActors; }
    public void setNumberActors(Integer numberActors) { this.numberActors = numberActors; }
    
    public String toString() {
        return "Впервые с " + date + " в городе " + city + "! Цирковое представление \"" + title + "\" имени " + author + " и его команды " + numberActors +
                " актеров в жанре " + genre + "! \n" + "Спешите, период проведения " + period + ". Цена билета от " + price + " рублей.";
    }
}