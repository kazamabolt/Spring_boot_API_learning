package com.springapi.springapi.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.springapi.springapi.API.model.User;

@Service
public class UsesrService {

    private List<User> userList;

    public UsesrService()
    {
        userList=new ArrayList<>();

        User user1=new User(1, "Vignesh", 23, "vicky@gmail.com");
        User user2=new User(2, "Robin", 23, "robin@gmail.com");
        User user3=new User(3, "Sathish", 22, "sathish@gmail.com");
        User user4=new User(4, "Ramji", 25, "ramji@gmail.com");
        User user5=new User(5, "Ram", 27, "gokulram@gmail.com");


        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
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
}
