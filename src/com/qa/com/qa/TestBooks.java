package com.qa.com.qa;

public class TestBooks {
    public static void main(String[] args) {
        Book books[] = new Book[3];

        books[0] = new Book("Chernobyl", "Jeroslav", 20.2);
        books[1] = new Book("The Robots of dawn", "Asimov", 32.25);
        books[2] = new Book("The Naked Sun", "Asimov", 88.2);

        for (int i = 0; i < 3; i++) {
            System.out.println(books[i].toString());
        }

        Car car1 = new Car (2.4, 5, 1200, 4);
        


    }

}
