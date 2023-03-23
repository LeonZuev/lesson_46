package homework_45;
/*
Используйте класс Book (книга) из предыдущего домашнего задания.
Создайте компаратор, который позволит сортировать книги по названию,
при одинаковых названиях - по автору (и там, и там - по алфавиту)
 */

import java.util.Comparator;

public class TitleAuthorComparator implements Comparator<Book> {
  @Override
  public int compare(Book o1, Book o2) {
    String book1 = o1.getTitle();
    String book2 = o2.getTitle();
    if(!book1.equals(book2)) {
      return book1.compareTo(book2);
    }
    return o1.getAuthor().compareTo(o2.getAuthor());
  }
}
