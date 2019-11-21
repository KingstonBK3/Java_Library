/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18_library;

import Entity.Book;
import Entity.History;
import Entity.Reader;
import java.util.Date;
import java.util.Scanner;
import myclasses.BookProvider;

/**
 *
 * @author pupil
 */
public class App {
private Book book;
    public void run(){
        System.out.println("Консольная библиотека");
        OUTER:
        do {
            System.out.println("0. Выход из программы");
            System.out.println("1. Новая книга");
            System.out.println("2. Список книг");
            System.out.println("3. Новый читатель");
            System.out.println("4. Выдать книгу");
            System.out.println("5. Вернуть книгу");
            System.out.println("Выберите задачу: ");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            switch (task) {
                case 0:
                    System.out.println("Закрытие программы");
                    break OUTER;
            //Новая книга
                case 1:
                    BookProvider bookProvider = new BookProvider();
                    book = bookProvider.createBook();
                    break;
            //Список книг
                case 2:
                    break;
            //Новый читатель
                case 3:
                    ReaderProvider readerprovider = new ReaderProvider();
                    
                    break;
            //Выдать книгу
                case 4:
                    break;
            //Вернуть книгу
                case 5:
                    break;
                default:
                    System.out.println("Выберите существующую задачу");
                    break;
            }
        } while (true);
    }
}
