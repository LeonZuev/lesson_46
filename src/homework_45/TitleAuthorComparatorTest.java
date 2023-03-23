package homework_45;
import homework_45.Book;
import homework_45.TitleAuthorComparator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

/*
Напишите автотесты с использованием JUnit для задачи 1 из предыдущего домашнего задания.
Проверьте краевые случаи, предусмотрите разные варианты.
    a:null               b:"space "
title 0:0 author 0:0  title 0:0 author 0:0
      1:0        1:0        1:0        1:0
      0:1        0:1        0:1        0:1
 */

public class TitleAuthorComparatorTest {

  @Test
  public void testTitleAuthorComparator() {
    Book book1 = new Book("", "",1);
    Book book2 = new Book("", "A",1);
    Book book3 = new Book("A", "",1);

    List<Book> actual = new ArrayList<>();
    actual.add(book1);
    actual.add(book2);
    actual.add(book3);

    List<Book> expected = new ArrayList<>();
    expected.add(book1);
    expected.add(book2);
    expected.add(book3);

    actual.sort(new TitleAuthorComparator());

    assertEquals(expected, actual);
  }

}
