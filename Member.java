import java.util.ArrayList;

public class Member {

    public String name;
    private boolean isPremium; 

    private ArrayList<Book> bookList;
    private ArrayList<CD> cdList;
    private ArrayList<DVD> dvdList;

    private double totalPrice;

    public Member(String name, boolean isPremium) {
        this.name = name;
        this.isPremium = isPremium;
        bookList = new ArrayList<>();
        bookList.add(new Book(0, 0, 0, 0, 0, 0));

        cdList = new ArrayList<>();
        cdList.add(new CD(0, 0, 0, 0, 0, 0));
        
        dvdList = new ArrayList<>();
        dvdList.add(new DVD(0, 0, 0, 0, 0, 0));
        totalPrice = 0.0;
    }


    public boolean isPremium() {
        return isPremium;
    }
    public void addToTotalPrice(double price) {
        totalPrice += price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void printInventory() {
        System.out.println(bookList);
        System.out.println(cdList);
        System.out.println(dvdList);
    }
    public String getName() {
        return name;
    }
    public void addBook(int genre){
        bookList.get(0).add(genre);
    }

    public void addCD(int genre) {
        cdList.get(0).add(genre);
    }

    public void addDVD(int genre) {
        dvdList.get(0).add(genre);
    }
}