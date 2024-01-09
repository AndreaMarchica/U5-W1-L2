package andreamarchica.U5W1L2.entities;

import lombok.Generated;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class Table {
    @Generated
    private long id;
    private int maxNumberOfSeats;
    private boolean Reserved;
    private long orderId;
}
