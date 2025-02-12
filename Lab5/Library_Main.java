package Lab5;

class Library_Item {
    void BookReturn(){
        System.out.println("Book Returned to the library");
    }
    void BookChecking(){
        System.out.println("Book Checked out from the library");
    }
}

class Book extends Library_Item{
    @Override
    void BookReturn(){
        System.out.println("Book Returned to the Book Shelf");    
    }

    @Override
    void BookChecking(){
        System.out.println("Book Checked out from the Book Shelf");    
    }
}

class DVD extends Library_Item{
    void DvdReturn(){
        System.out.println("DVD Returned to the DVD Shelf");    
    }
    void DvdChecking(){
        System.out.println("DVD Checked out from the DVD Shelf");    
    }
}
class Journal extends Book{
    void JournalReturn(){
        System.out.println("Journal Returned to the Book Shelf");    
    }
    void JournalChecking(){
        System.out.println("Journal Checked out from the Book Shelf");    
    }

}




public class Library_Main{
    public static void main(String arg[]){
        Book b1 = new Book();
        Journal j1 = new Journal();
        DVD dvd1 = new DVD();

        b1.BookChecking();
        j1.JournalReturn();
        dvd1.BookReturn();

    }
}