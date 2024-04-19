package com.springapi.springapi.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.springapi.springapi.API.model.Order;
import com.springapi.springapi.API.model.User;

@Service
public class UsesrService {

    private List<User> userList;
    private List<Order> orderList;

    public UsesrService()
    {
        userList=new ArrayList<>();
        orderList=new ArrayList<>();

        User user1=new User(1, "Vignesh", 23, "vicky@gmail.com");
        User user2=new User(2, "Robin", 23, "robin@gmail.com");
        User user3=new User(3, "Sathish", 22, "sathish@gmail.com");
        User user4=new User(4, "Ramji", 25, "ramji@gmail.com");
        User user5=new User(5, "Ram", 27, "gokulram@gmail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));

        Order order1=new Order(1111, "vignesh", "10/02/2024", "White Shirt", 643.70,"Cash");
        Order order2=new Order(2222, "Robin", "29/09/2023", "Steel Plate", 43.50,"Cash");
        Order order3=new Order(3333, "Ram", "20/02/2024", "Iphone 14", 56400.00,"EMI");
        Order order4=new Order(4444, "Sathish", "31/01/2024", "Ausu Laptop", 120000.00,"EMI");

        orderList.addAll(Arrays.asList(order1,order2,order3,order4));
    }

    public User getUser(Integer id) {
        for (User user : userList) {
            if(id==user.getId())
            {
                return user;
                
            }
        }
        return null;
    }

    public Order getOrder(Integer orderId)
    {
        for (Order order : orderList) {
            if(orderId==order.getOrderId())
            {
                return order;
            }
        }
        return null;
    }
   
}
