import java.util.ArrayList;

public class Bookstore {
    private ArrayList<Book> bookList;
    private ArrayList<CD> cdList;
    private ArrayList<DVD> dvdList;
    public ArrayList<Member> members;
    public Member currentMember;
    public PremiumMember premiumMember;

    public Bookstore() {
        members = new ArrayList<>();
        premiumMember = new PremiumMember();

        bookList = new ArrayList<>();
        bookList.add(new Book(5, 5, 5, 5, 5, 10.0));

        cdList = new ArrayList<>();
        cdList.add(new CD(5, 5, 5, 5, 5, 15.0));

        dvdList = new ArrayList<>();
        dvdList.add(new DVD(5, 5, 5, 5, 5, 20.0));
    }

    public void browse(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Here are the list of books that are currently in stock:");
                System.out.println(bookList.get(0));
                break;
            case 2:
                System.out.println("Here are the list of CDs that are currently in stock:");
                System.out.println(cdList.get(0));
                break;
            case 3:
                System.out.println("Here are the list of DVDs that are currently in stock:");
                System.out.println(dvdList.get(0));
                break;
        }

    }

    public void addItem(int category, int item) {
        switch (category) {
            case 1: // book
                bookList.get(0).addItem(item);
                break;
            case 2: // cd
                cdList.get(0).addItem(item);
                break;
            case 3: // DVD
                dvdList.get(0).addItem(item);
                break;
        }
    }
    public void purchase(int category, int item) {
        double price;  // Store the final price
        switch (category) {
            case 1: // book
                price = bookList.get(0).getPrice();
                if (currentMember.isPremium()) {
                    price = premiumMember.applyDiscount(price);
                }
                if (bookList.get(0).subtractItem(item)) {
                    currentMember.addBook(item);
                    currentMember.addToTotalPrice(price);
                }
                break;
            case 2: // cd
                price = cdList.get(0).getPrice();
                if (currentMember.isPremium()) {
                    price = premiumMember.applyDiscount(price);
                }
                if (cdList.get(0).subtractItem(item)) {
                    currentMember.addCD(item);
                    currentMember.addToTotalPrice(price);
                }
                break;
            case 3: // DVD
                price = dvdList.get(0).getPrice();
                if (currentMember.isPremium()) {
                    price = premiumMember.applyDiscount(price);
                }
                if (dvdList.get(0).subtractItem(item)) {
                    currentMember.addDVD(item);
                    currentMember.addToTotalPrice(price);
                }
                break;
        }
    }

    public void addMember(Member member){

        members.add(member);
        System.out.println("New member added to the database!");
    }

    public boolean isMember(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                return true;
            }
        }
        return false;

    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public ArrayList<CD> getCdList() {
        return cdList;
    }

    public ArrayList<DVD> getDvdList() {
        return dvdList;
    }
    
}