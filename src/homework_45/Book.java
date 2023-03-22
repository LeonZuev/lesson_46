package homework_45;
/*
+Создайте класс Book (книга), в конструктор которого передайте:
+автора, название книги и количество страниц.
+Реализуйте интерфейс для сравнения книг:
+они должны сортироваться по авторам,
+а если авторы совпадают - по названиям
(и там, и там - по алфавиту, "в словарном порядке").
 */

public class Book implements Comparable<Book> {
  private String author;
  private String title;
  private int numPages;

  public Book(String author, String title, int numPages) {
    this.author = author;
    this.title = title;
    this.numPages = numPages;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getNumPages() {
    return numPages;
  }

  public int compareTo(Book other) {
    if (author != other.author) {
      return author.compareTo(other.author);
    }
    return title.compareTo(other.title);
  }

}
