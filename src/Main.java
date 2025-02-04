//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) {
        Eat food = new Eat("Apple", 0.99, 10, "Fruit");
        double totalPrice = food.iCalculate();
        double discount = food.calculateDiscount(10);
        double totalCost = food.calculateTotalCost(10);
        System.out.println("Total price: " + totalPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Total cost:  "+ totalCost);
    }
    public static class Eat {
        private String name;

        @Override
        public String toString() {
            return "Eat{" +
                    "name='" + name + '\'' +
                    '}';
        }

        private double price;
        private int quantity;
        private String category;
        public Eat(String name, double price, int quantity, String category)
        {
            this.name = name;
            this.price = price;

            this.quantity = quantity;
            this.category = category;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public int getQuantity() {
            return quantity;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
        public String getCategory() {
            return category;
        }
        public void iSetCategory(String category) {
            this.category = category;
        }
        public double iCalculate() {
            return price * quantity;
        }
        public double calculateDiscount(double discountPercentage) {
            return iCalculate() * (discountPercentage / 100);
        }
        public double calculateTotalCost(double discountPercentage) {
            return iCalculate();
        }
    }
}