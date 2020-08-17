package com.example.demo;

import com.example.demo.entity.Item;
import com.example.demo.entity.User;
import com.example.demo.entity.UserItemVO;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ItemRepository itemRepository;
    @GetMapping("/insert")
    public void get(){
        // for (int i = 0; i < 10; i++) {
        //     User user = new User();
        //     user.setName("my name is " + i);
        //     User userResult = userRepository.save(user);
        //     Item u = new Item();
        //     u.setUserId(userResult.getUserId());
        //     u.setItemName("my item is " + i);
        //     itemRepository.save(u);
        // }
        // List<User> all1 = userRepository.findAll();
        // List<Item> all  = itemRepository.findAll();
        // all1.forEach(System.out::println);
        // all.forEach(System.out::println);
        // return all;
        List<UserItemVO> bySql = userRepository.findBySql();
        bySql.forEach(System.out::println);
        // return bySql;
    }

}
