public class DVD {
    private int numAction;
    private int numDrama;
    private int numComedy;
    private int numSciFi;
    private int numFantasy;

    private double price;

    public DVD(int numAction, int numDrama, int numComedy, int numSciFi, int numFantasy, double price) {
        this.numAction = numAction;
        this.numDrama = numDrama;
        this.numComedy = numComedy;
        this.numSciFi = numSciFi;
        this.numFantasy = numFantasy;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    public void addItem(int genre) {
        switch (genre) {
            case 1:
                if (this.numAction < 10) {
                    this.numAction += 1;
                    System.out.println("DVD added to Action.");
                } else {
                    System.out.println("Sorry, the storage is full for Action.");
                }
                break;
            case 2:
                if (this.numDrama < 10) {
                    this.numDrama += 1;
                    System.out.println("DVD added to Drama.");
                } else {
                    System.out.println("Sorry, the storage is full for Drama.");
                }
                break;
            case 3:
                if (this.numComedy < 10) {
                    this.numComedy += 1;
                    System.out.println("DVD added to Comedy.");
                } else {
                    System.out.println("Sorry, the storage is full for Comedy.");
                }
                break;
            case 4:
                if (this.numSciFi < 10) {
                    this.numSciFi += 1;
                    System.out.println("DVD added to Sci-Fi.");
                } else {
                    System.out.println("Sorry, the storage is full for Sci-Fi.");
                }
                break;
            case 5:
                if (this.numFantasy < 10) {
                    this.numFantasy += 1;
                    System.out.println("DVD added to Fantasy.");
                } else {
                    System.out.println("Sorry, the storage is full for Fantasy.");
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
                if (this.numAction > 0) {
                    this.numAction -= 1;
                    System.out.println("Thank you for your purchase!");
                    return true;
                } else {
                    System.out.println("Sorry, there are no more in stock.");
                }
                break;
            case 2:
                if (this.numDrama > 0) {
                    this.numDrama -= 1;
                    System.out.println("Thank you for your purchase!");
                    return true;
                } else {
                    System.out.println("Sorry, there are no more in stock.");
                }
                break;
            case 3:
                if (this.numComedy > 0) {
                    this.numComedy -= 1;
                    System.out.println("Thank you for your purchase!");
                    return true;
                } else {
                    System.out.println("Sorry, there are no more in stock.");
                }
                break;
            case 4:
                if (this.numSciFi > 0) {
                    this.numSciFi -= 1;
                    System.out.println("Thank you for your purchase!");
                    return true;
                } else {
                    System.out.println("Sorry, there are no more in stock.");
                }
                break;
            case 5:
                if (this.numFantasy > 0) {
                    this.numFantasy -= 1;
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
                this.numAction += 1;
                break;
            case 2:
                this.numDrama += 1;
                break;
            case 3:
                this.numComedy += 1;
                break;
            case 4:
                this.numSciFi += 1;
                break;
            case 5:
                this.numFantasy += 1;
                break;
            default:
                break;
        }
    }
    @Override
    public String toString() {
        return "\n1. Action: " + numAction +
                "\n2. Drama: " + numDrama +
                "\n3. Comedy: " + numComedy +
                "\n4. Sci-Fi: " + numSciFi +
                "\n5. Fantasy: " + numFantasy;
    }
}