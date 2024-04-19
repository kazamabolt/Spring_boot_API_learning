package com.springapi.springapi.API.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springapi.springapi.API.model.Order;
import com.springapi.springapi.API.model.User;
import com.springapi.springapi.Service.UsesrService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class UserController {
    private UsesrService userService;

    @Autowired
    public UserController(UsesrService userService)
    {
        this.userService=userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam Integer id)
    {
        return userService.getUser(id);
        

    }

    @GetMapping("/order")
    public Order getOrder(@RequestParam Integer orderId)
    {
        return userService.getOrder(orderId);
    }
}
