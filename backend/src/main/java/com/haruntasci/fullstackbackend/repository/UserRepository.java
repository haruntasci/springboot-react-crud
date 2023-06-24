package com.haruntasci.fullstackbackend.repository;

import com.haruntasci.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
