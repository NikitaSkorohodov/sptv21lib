/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import entity.Book;
import entity.Reader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class bookManager {
    private Scanner scanner;
    

    public bookManager() {
        scanner=new Scanner(System.in);
        
    }
    
    
    public void printListBooks(Book[]books){
    System.out.println("6. Список книг");
                    for (int i = 0; i < books.length; i++) {
                        System.out.print(i+1+". "+books[i].getBookName()+". ");
                        for (int j = 0; j < books[i].getAuthors().length; j++) {
                            System.out.printf("%s %s %d. ", 
                                    books[i].getAuthors()[j].getFirstname(),
                                    books[i].getAuthors()[j].getLastname(),
                                    books[i].getAuthors()[j].getBirthday());
                            
                        }System.out.println();}
                    
    }
   
    
}


