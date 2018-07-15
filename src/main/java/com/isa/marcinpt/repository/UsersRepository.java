package com.isa.marcinpt.repository;

import com.isa.marcinpt.model.User;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {
    private static List<User> usersRepository = new ArrayList<>();

    public static List<User> getUsersRepository() {
        if (usersRepository.size()==0) {
            initRepositoryWithFirstObject();
        }
        return usersRepository;
    }

    public static void initRepositoryWithFirstObject(){
        User u1 = new User("Marcin Piatek","emememsy");
        usersRepository.add(u1);
    }
}
