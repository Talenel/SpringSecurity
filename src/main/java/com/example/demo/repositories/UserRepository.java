package com.example.demo.repositories;

/**
 * Created by student on 7/5/17.
 */
import com.example.demo.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>{

    User findByUsername(String username);
}