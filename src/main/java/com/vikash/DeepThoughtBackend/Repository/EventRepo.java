package com.vikash.DeepThoughtBackend.Repository;

import com.vikash.DeepThoughtBackend.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends JpaRepository<Event,String> {
}
