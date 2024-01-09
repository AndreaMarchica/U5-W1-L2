package andreamarchica.U5W1L2.entities;

import lombok.Generated;
import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@ToString
@Getter
public class Order {
    @Generated
    private long id;
    private long tableId;
    private OrderStatus status;
    private int numberOfPeople;
    private LocalDate orderDate;
    private List<Item> order;
    //private double price;
    @Value("${coverPrice}")
    private double coverPrice;

    public Order(long tableId, OrderStatus status, int numberOfPeople, LocalDate orderDate, List<Item> order){
        this.tableId = tableId;
        this.status = status;
        this.numberOfPeople = numberOfPeople;
        this.order = order;

    }

    public double getTotalPrice() {
        double totalPrice = 0.0;

        if (order != null) {
            for (Item item : order) {
                totalPrice += item.getPrice();
            }
        }
        double totalCoverPrice = numberOfPeople * coverPrice;

        return totalPrice + totalCoverPrice;
    }
}
