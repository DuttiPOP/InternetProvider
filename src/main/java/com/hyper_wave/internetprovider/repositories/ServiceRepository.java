package com.hyper_wave.internetprovider.repositories;

import com.hyper_wave.internetprovider.objects.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
