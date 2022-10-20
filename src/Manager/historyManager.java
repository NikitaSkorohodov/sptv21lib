/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.util.Scanner;
import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;
import sptv21librarry.App;
/**
 *
 * @author user
 */
public class historyManager {
    private final Scanner scanner;
    History history = null;
    private History[] histories;
    
    public historyManager() {
        scanner=new Scanner(System.in);
        
    }
    public History printHist(Book[] books,Reader[] readers){
    for (int i = 0; i < readers.length; i++) {
                        System.out.println(i+1+". "+readers[i].getFirstname()+" "+readers[i].getLastname());
                    }
                    System.out.print("Выбери читателя: ");
                    int numberReader = scanner.nextInt(); scanner.nextLine();
                    System.out.println("Список книг: ");
                    for (int i = 0; i < books.length; i++) {
                        System.out.print(i+1+". "+books[i].getBookName()+". ");
                        for (int j = 0; j < books[i].getAuthors().length; j++) {
                            System.out.printf("%s %s %d", 
                                    books[i].getAuthors()[j].getFirstname(),
                                    books[i].getAuthors()[j].getLastname(),
                                    books[i].getAuthors()[j].getBirthday());
                            
                        }
                        System.out.println();
                    }
                    System.out.print("Выбери номер книги: ");
                    int numberBook = scanner.nextInt();scanner.nextLine();
                    history = new History();
                    history.setBook(books[numberBook - 1]);
                    history.setReader(readers[numberReader-1]);
                    history.setTakeOnBook(new GregorianCalendar().getTime());
                    this.histories = Arrays.copyOf(this.histories, this.histories.length + 1);
                    this.histories[this.histories.length-1] = history;
                    return history;
    }}

