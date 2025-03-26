import Assignment1.Movie;
import Assignment2.Store;
import Assignment3.Company;
import Assignment3.Manager;
import Assignment4.Animal;
import Assignment4.Zoo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Opdracht1");
        Movie inception = new Movie("Inception", "Christopher Nolan", LocalDate.of(2010, 7, 16), "Thriller");
        inception.giveInfo();

        System.out.println("Opdracht2");
        Store store = new Store();
        store.addCrisps(3);
        store.addRedBull(5);
        store.printStock();

        System.out.println("Opdracht3");
        Company company = new Company("Tesla");
        Manager manager = new Manager("Elon Musk", 53);
        company.manager(manager);
        company.getInfo();

        System.out.println("Opdracht4");
        Animal lion = new Animal("Mufasa", "Leeuw", "Vlees", "Leeuwenverblijf");
        Animal tiger = new Animal("Nala", "Tijger", "Vlees", "Leeuwenverblijf");
        Animal elephant = new Animal("Sjaak", "Olifant", "Bladeren", "Leeuwenverblijf");
        Zoo zoo = new Zoo(lion, tiger, elephant);
        zoo.zooInfo();

    }
}