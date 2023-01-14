package com.example.afternoon.repository;

import com.example.afternoon.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository  extends JpaRepository<Team, Long> {
}
