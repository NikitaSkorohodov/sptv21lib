/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

/**
 *
 * @author user
 */
 import entity.Book;
import entity.Reader;
import java.util.Arrays;
import java.util.Scanner;

public class ReaderManager {
  private Scanner scanner;  

/**
 *
 * @author user
 */

    public ReaderManager(){
        scanner=new Scanner(System.in);
                }

    public Reader createReader(){
        System.out.println("2. Добавить читателя");
        Reader reader = new Reader();
        System.out.print("Введите имя читателя: ");
        reader.setFirstname(scanner.nextLine());
        System.out.print("Введите фамилию читателя: ");
        reader.setLastname(scanner.nextLine());
        System.out.print("Введите телефон читателя: ");
        reader.setPhone(scanner.nextLine());
        return reader;
    }
    public void priRead(){
    
    }
}
                    
    




    

