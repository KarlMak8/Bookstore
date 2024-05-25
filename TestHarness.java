import java.util.Scanner;

public class TestHarness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bookstore!");
        Bookstore bookstore = new Bookstore();
        boolean loggedIn = false;
        String name = "";

        while (true) {
            System.out.println("[----------] Menu [----------]");
            System.out.println("Please select an option:");
            System.out.println("1. Make a Purchase");
            System.out.println("2. Create a new member");
            System.out.println("3. Add a Product to Inventory");
            System.out.println("4. Browse Inventory");
            System.out.println("5. User Inventory");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (!loggedIn) {
                        System.out.println("Please log in with your name:");
                        name = scanner.nextLine();
                        if (!bookstore.isMember(name)) {
                            System.out.println("That name is not in our database yet! Create a new member.");
                            break;
                        }
                        for (Member member : bookstore.members) {
                            if (member.getName().equals(name)) {
                                bookstore.currentMember = member;
                            }
                        }
                        loggedIn = true;
                    }

                    if (loggedIn) {
                        System.out.println("What would you like to look at? We offer:");
                        System.out.println("1. Books");
                        System.out.println("2. CDs");
                        System.out.println("3. DVDs");

                        int category = scanner.nextInt();
                        scanner.nextLine();  // Consume newline

                        switch (category) {
                            case 1:
                                System.out.println("Book prices:");
                                double bookPrice = bookstore.getBookList().get(0).getPrice();
                                if (bookstore.currentMember != null && bookstore.currentMember.isPremium()) {
                                    bookPrice = bookstore.premiumMember.applyDiscount(bookPrice);
                                }
                                System.out.println("1. Fiction: $" + bookPrice);
                                System.out.println("2. Non-Fiction: $" + bookPrice);
                                System.out.println("3. Mystery: $" + bookPrice);
                                System.out.println("4. Fantasy: $" + bookPrice);
                                System.out.println("5. Romance: $" + bookPrice);
                                break;
                        
                            case 2:
                                System.out.println("CD prices:");
                                double cdPrice = bookstore.getCdList().get(0).getPrice();
                                if (bookstore.currentMember != null && bookstore.currentMember.isPremium()) {
                                    cdPrice = bookstore.premiumMember.applyDiscount(cdPrice);
                                }
                                System.out.println("1. Rock: $" + cdPrice);
                                System.out.println("2. Pop: $" + cdPrice);
                                System.out.println("3. Hip Hop: $" + cdPrice);
                                System.out.println("4. Electronic: $" + cdPrice);
                                System.out.println("5. Jazz: $" + cdPrice);
                                break;
                        
                            case 3:
                                System.out.println("DVD prices:");
                                double dvdPrice = bookstore.getDvdList().get(0).getPrice();
                                if (bookstore.currentMember != null && bookstore.currentMember.isPremium()) {
                                    dvdPrice = bookstore.premiumMember.applyDiscount(dvdPrice);
                                }
                                System.out.println("1. Action: $" + dvdPrice);
                                System.out.println("2. Drama: $" + dvdPrice);
                                System.out.println("3. Comedy: $" + dvdPrice);
                                System.out.println("4. Sci-Fi: $" + dvdPrice);
                                System.out.println("5. Fantasy: $" + dvdPrice);
                                break;
                        
                            default:
                                System.out.println("Invalid category.");
                                break;
                        }
                        

                        System.out.println("What would you like to buy?");
                        int item = scanner.nextInt();
                        scanner.nextLine();  // Consume newline

                        bookstore.purchase(category, item);
                    }
                    break;

                case 2:
                    System.out.println("What is your name?");
                    String userName = scanner.nextLine();

                    System.out.println("Would you like to be a Premium Member? ($15 per month)\n1. Yes\n2. No");
                    int memberChoice = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    if (memberChoice == 1) {
                        bookstore.addMember(new Member(userName, true));
                    } else {
                        bookstore.addMember(new Member(userName, false));
                    }
                    break;

                case 3:
                    System.out.println("Choose a category:");
                    System.out.println("1. Books");
                    System.out.println("2. CDs");
                    System.out.println("3. DVDs");

                    int category = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    bookstore.browse(category);

                    System.out.println("Choose a genre:");
                    int item = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    bookstore.addItem(category, item);
                    break;

                case 4:
                    System.out.println("Choose a category:");
                    System.out.println("1. Books");
                    System.out.println("2. CDs");
                    System.out.println("3. DVDs");

                    category = scanner.nextInt();
                    scanner.nextLine();  // Consume newline

                    bookstore.browse(category);
                    System.out.println("Enter any key to continue.");
                    scanner.nextLine();
                    break;

                case 5:
                    if (!loggedIn) {
                        System.out.println("Please log in with your name:");
                        name = scanner.nextLine();
                        if (!bookstore.isMember(name)) {
                            System.out.println("That name is not in our database yet! Create a new member.");
                            break;
                        }
                        loggedIn = true;
                    }
                    for (Member member : bookstore.members) {
                        if (member.getName().equals(name)) {
                            member.printInventory();
                            System.out.println("Total price of your inventory: $" + member.getTotalPrice());
                        }
                    }
                    break;

                default:
                    System.out.println("Please enter a number that is 1 to 5");
            } // end switch
        } // end while
    } // end main
} // end class
