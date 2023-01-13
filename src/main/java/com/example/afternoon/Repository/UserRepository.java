package com.example.afternoon.Repository;

import com.example.afternoon.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
