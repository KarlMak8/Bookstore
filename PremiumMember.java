public class PremiumMember {

    private double discountRate;

    public PremiumMember() {
        this.discountRate = 0.1;  // 10% discount for premium members
    }

    public double applyDiscount(double originalPrice) {
        return originalPrice * (1 - discountRate);
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
