package core.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author nel
 */

@Entity
@Table(name="order_table")
public class Order implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if (this.OrderId != other.OrderId) {
            return false;
        }
        if (this.ownerId != other.ownerId) {
            return false;
        }
        return true;
    }

      @Id @GeneratedValue
    private int OrderId;
  //  private Date OrderDate;
    private int ownerId;
 //   private int[] orderList;
    
    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int OrderId) {
        this.OrderId = OrderId;
    }

//    public Date getOrderDate() {
//        return OrderDate;
//    }
//
//    public void setOrderDate(Date OrderDate) {
//        this.OrderDate = OrderDate;
//    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

//    public int[] getOrderList() {
//        return orderList;
//    }
//
//    public void setOrderList(int[] orderList) {
//        this.orderList = orderList;
//    }
//    
//  
    
}
