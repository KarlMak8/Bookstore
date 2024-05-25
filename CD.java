public class CD {
    private int numRock;
    private int numPop;
    private int numHipHop;
    private int numElectronic;
    private int numJazz;

    private double price;

    public CD(int numRock, int numPop, int numHipHop, int numElectronic, int numJazz, double price) {
        this.numRock = numRock;
        this.numPop = numPop;
        this.numHipHop = numHipHop;
        this.numElectronic = numElectronic;
        this.numJazz = numJazz;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void addItem(int genre) {
        switch (genre) {
            case 1:
                if (this.numRock < 10) {
                    this.numRock += 1;
                    System.out.println("CD added to Rock.");
                } else {
                    System.out.println("Sorry, the storage is full for Rock.");
                }
                break;
            case 2:
                if (this.numPop < 10) {
                    this.numPop += 1;
                    System.out.println("CD added to Pop.");
                } else {
                    System.out.println("Sorry, the storage is full for Pop.");
                }
                break;
            case 3:
                if (this.numHipHop < 10) {
                    this.numHipHop += 1;
                    System.out.println("CD added to Hip Hop.");
                } else {
                    System.out.println("Sorry, the storage is full for Hip Hop.");
                }
                break;
            case 4:
                if (this.numElectronic < 10) {
                    this.numElectronic += 1;
                    System.out.println("CD added to Electronic.");
                } else {
                    System.out.println("Sorry, the storage is full for Electronic.");
                }
                break;
            case 5:
                if (this.numJazz < 10) {
                    this.numJazz += 1;
                    System.out.println("CD added to Jazz.");
                } else {
                    System.out.println("Sorry, the storage is full for Jazz.");
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
                if (this.numRock > 0) {
                    this.numRock -= 1;
                    System.out.println("Thank you for your purchase!");
                    return true;
                } else {
                    System.out.println("Sorry, there are no more in stock.");
                }
                break;
            case 2:
                if (this.numPop > 0) {
                    this.numPop -= 1;
                    System.out.println("Thank you for your purchase!");
                    return true;
                } else {
                    System.out.println("Sorry, there are no more in stock.");
                }
                break;
            case 3:
                if (this.numHipHop > 0) {
                    this.numHipHop -= 1;
                    System.out.println("Thank you for your purchase!");
                    return true;
                } else {
                    System.out.println("Sorry, there are no more in stock.");
                }
                break;
            case 4:
                if (this.numElectronic > 0) {
                    this.numElectronic -= 1;
                    System.out.println("Thank you for your purchase!");
                    return true;
                } else {
                    System.out.println("Sorry, there are no more in stock.");
                }
                break;
            case 5:
                if (this.numJazz > 0) {
                    this.numJazz -= 1;
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
                this.numRock += 1;
                break;
            case 2:
                this.numPop += 1;
                break;
            case 3:
                this.numHipHop += 1;
                break;
            case 4:
                this.numElectronic += 1;
                break;
            case 5:
                this.numJazz += 1;
                break;
            default:
                break;
        }
    }
    
    @Override
    public String toString() {
        return "\n1. Rock: " + numRock +
                "\n2. Pop: " + numPop +
                "\n3. Hip Hop: " + numHipHop +
                "\n4. Electronic: " + numElectronic +
                "\n5. Jazz: " + numJazz;
    }
}