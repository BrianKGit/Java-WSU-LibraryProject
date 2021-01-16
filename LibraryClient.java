/**
 * @author Brian Klein
 */
public class LibraryClient {
    
    public static void main(String [] args) {
        
        //create a library card object
        LibraryCard card1;
        
        card1 = new LibraryCard(new Student(12345, "Brian", "Klein"), 
                new Date(9, 6, 2017), 
                0);
        
        //print the card information
        System.out.println(card1);
        
        //check out 5 books
        card1.checkOut(5);
        System.out.println("\n" + card1);
        
        //check in 3 books
        card1.checkIn(3);
        System.out.println("\n" + card1);
        
        
    }
    
}
