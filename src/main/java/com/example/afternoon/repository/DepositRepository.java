package com.example.afternoon.repository;

import com.example.afternoon.entity.Deposit;
import com.example.afternoon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositRepository extends JpaRepository<Deposit, Long> {
}
