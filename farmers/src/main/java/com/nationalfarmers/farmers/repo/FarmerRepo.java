package com.nationalfarmers.farmers.repo;

import com.nationalfarmers.farmers.model.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmerRepo extends JpaRepository<Farmer, Long> {
}
