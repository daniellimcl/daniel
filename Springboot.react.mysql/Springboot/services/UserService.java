package com.example.demo.services;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.request.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
   @Autowired
    UserRepo userRepo;
    public int addition(int a, int b) {
        return a + b;
    }



    public boolean register(RegisterRequest registerRequest) {

        //  userRepo.getUserByEmail(registerRequest.getEmail());
        try {
            Optional<User> user = userRepo.getUserByEmail(registerRequest.getEmail());
            if (user.isPresent()) {

            }
            else {
                User user1 = new User();
                user1.setEmail(registerRequest.getEmail());
                user1.setPassword(registerRequest.getPassword());
                //  user1.setName(registerRequest.getName());
                userRepo.save(user1);
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return false;
    }

    public boolean login(RegisterRequest registerRequest) {
        //  userRepo.getUserByEmail(registerRequest.getEmail());
        try {
            Optional<User> user = userRepo.getUserByEmail(registerRequest.getEmail());
            if (user.isPresent()) {
               if (registerRequest.getEmail().equals(user.get().getEmail()) && registerRequest.getPassword().equals(user.get().getPassword())) {
                   return true;

               }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public List<User> getUsers() {
        //  userRepo.getUserByEmail(registerRequest.getEmail());

        List<User> userList = userRepo.findAll();
            return userList;
        }

    }





