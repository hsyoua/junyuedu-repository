package org.yugutou.springcloud.server.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yugutou.springcloud.server.model.User;

@RestController
public class UserController {

    @PostMapping("/say")
    public void sayHello(){
        System.out.println("hello World");
        User user = new User();
        user.setName("哈哈");//修改测试
    }
}
