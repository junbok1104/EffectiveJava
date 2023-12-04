package org.Item1;

public class Order {
    private boolean prime;
    private boolean urgent;
    private Product product;

/*public Order(Product product, boolean urgent) {
    this.product = product;
    this.urgent = urgent;
}

public Order(boolean urgent, Product product) {
    this.urgent = urgent;
    this.product = product;
}*/

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.product = product;
        order.prime = true;
        return order;
    }
}