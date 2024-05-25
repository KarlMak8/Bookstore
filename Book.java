public class Book {
    private int numFiction;
    private int numNonFiction;
    private int numMystery;
    private int numFantasy;
    private int numRomance;

    private double price;

    public Book(int numFiction, int numNonFiction, int numMystery, int numFantasy, int numRomance, double price) {
        this.numFiction = numFiction;
        this.numNonFiction = numNonFiction;
        this.numMystery = numMystery;
        this.numFantasy = numFantasy;
        this.numRomance = numRomance;
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
   public void addItem(int genre) {
        switch (genre) {
            case 1:
                if (this.numFiction < 10) {
                    this.numFiction += 1;
                    System.out.println("Book added to Fiction.");
                } else {
                    System.out.println("Sorry, the storage is full for Fiction.");
                }
                break;
            case 2:
                if (this.numNonFiction < 10) {
                    this.numNonFiction += 1;
                    System.out.println("Book added to Non-Fiction.");
                } else {
                    System.out.println("Sorry, the storage is full for Non-Fiction.");
                }
                break;
            case 3:
                if (this.numMystery < 10) {
                    this.numMystery += 1;
                    System.out.println("Book added to Mystery.");
                } else {
                    System.out.println("Sorry, the storage is full for Mystery.");
                }
                break;
            case 4:
                if (this.numFantasy < 10) {
                    this.numFantasy += 1;
                    System.out.println("Book added to Fantasy.");
                } else {
                    System.out.println("Sorry, the storage is full for Fantasy.");
                }
                break;
            case 5:
                if (this.numRomance < 10) {
                    this.numRomance += 1;
                    System.out.println("Book added to Romance.");
                } else {
                    System.out.println("Sorry, the storage is full for Romance.");
                }
                break;
            default:
                System.out.println("Please enter a number between 1 and 5.");
                break;
        }
    }
    public boolean subtractItem(int item) {
        switch (item) {
            case 1:
                if (this.numFiction > 0) {
                    this.numFiction -= 1;
                    System.out.println("Thank you for your purchase!");
                    return true;
                } else {
                    System.out.println("Sorry, there are no more in stock.");
                }
                break;
            case 2:
                if (this.numNonFiction > 0) {
                    this.numNonFiction -= 1;
                    System.out.println("Thank you for your purchase!");
                    return true;
                } else {
                    System.out.println("Sorry, there are no more in stock.");
                }
                break;
            case 3:
                if (this.numMystery > 0) {
                    this.numMystery -= 1;
                    System.out.println("Thank you for your purchase!");
                    return true;
                } else {
                    System.out.println("Sorry, there are no more in stock.");
                }
                break;
            case 4:
                if (this.numFantasy > 0) {
                    this.numFantasy -= 1;
                    System.out.println("Thank you for your purchase!");
                    return true;
                } else {
                    System.out.println("Sorry, there are no more in stock.");
                }
                break;
            case 5:
                if (this.numRomance > 0) {
                    this.numRomance -= 1;
                    System.out.println("Thank you for your purchase!");
                    return true;
                } else {
                    System.out.println("Sorry, there are no more in stock.");
                }
                break;
            default:
                break;
        }
        return false;
    }
    
    public void add(int genre) {
        switch (genre) {
            case 1:
                this.numFiction += 1;
                break;
            case 2:
                this.numNonFiction += 1;
                break;
            case 3:
                this.numMystery += 1;
                break;
            case 4:
                this.numFantasy += 1;
                break;
            case 5:
                this.numRomance += 1;
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return  "1. Fiction: " + numFiction +
                "\n2. Non-Fiction: " + numNonFiction +
                "\n3. Mystery: " + numMystery +
                "\n4. Fantasy: " + numFantasy +
                "\n5. Romance: " + numRomance;
    }
}