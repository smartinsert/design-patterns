package decorator.ex1;

import java.util.ArrayList;
import java.util.List;

class MainApp {


    public static void main(String[] args) {

        // Create book

        Book book = new Book("Worley", "Inside ASP.NET", 10);

        book.Display();


        // Create video

        Video video = new Video("Spielberg", "Jaws", 23, 92);

        video.Display();


        // Make video borrowable, then borrow and display

        System.out.println("\nMaking video borrowable:");


        Borrowable borrowvideo = new Borrowable(video);

        borrowvideo.BorrowItem("Customer #1");

        borrowvideo.BorrowItem("Customer #2");


        borrowvideo.Display();


    }

}


abstract class LibraryItem {

    protected int numCopies;

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }


    public abstract void Display();

}


class Book extends LibraryItem {

    private String _author;

    private String _title;


    // Constructor

    public Book(String author, String title, int numCopies) {

        this._author = author;

        this._title = title;

        super.numCopies = numCopies;

    }


    public void Display() {

        System.out.println("\nBook ------ ");

        System.out.printf(" Author: {0}", _author);

        System.out.printf(" Title: {0}", _title);

        System.out.printf(" # Copies: {0}", super.numCopies);

    }

}


class Video extends LibraryItem {

    private String _director;

    private String _title;

    private int _playTime;


    // Constructor

    public Video(String director, String title,

                 int numCopies, int playTime) {

        this._director = director;

        this._title = title;

        super.numCopies = numCopies;

        this._playTime = playTime;

    }


    public void Display() {

        System.out.println("\nVideo ----- ");

        System.out.printf(" Director: {0}", _director);

        System.out.printf(" Title: {0}", _title);

        System.out.printf(" # Copies: {0}", numCopies);

        System.out.printf(" Playtime: {0}\n", _playTime);

    }

}

abstract class Decorator extends LibraryItem {

    protected LibraryItem libraryItem;


    // Constructor

    public Decorator(LibraryItem libraryItem) {

        this.libraryItem = libraryItem;

    }


    public void Display() {

        libraryItem.Display();

    }

}


class Borrowable extends Decorator {

    protected List<String> borrowers = new ArrayList<String>();


    // Constructor

    public Borrowable(LibraryItem libraryItem) {

        super(libraryItem);


    }


    public void BorrowItem(String name) {

        borrowers.add(name);

        libraryItem.numCopies--;

    }


    public void ReturnItem(String name) {

        borrowers.remove(name);

        libraryItem.numCopies++;

    }


    public void Display() {

        super.Display();


        for (String borrower : borrowers) {

            System.out.println(" borrower extends " + borrower);

        }

    }

}