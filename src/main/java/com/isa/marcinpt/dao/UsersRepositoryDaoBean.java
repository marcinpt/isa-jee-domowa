package com.isa.marcinpt.dao;

import com.isa.marcinpt.model.User;
import com.isa.marcinpt.repository.UsersRepository;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class UsersRepositoryDaoBean {

    public User getUserByUserName(String uName) {
        return UsersRepository.getUsersRepository().stream().filter(user -> user.getUserName().equals(uName)).findFirst().orElse(null);
    }
}
