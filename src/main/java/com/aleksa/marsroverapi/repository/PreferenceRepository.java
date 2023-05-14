package com.aleksa.marsroverapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.aleksa.marsroverapi.dto.HomeDto;

public interface PreferenceRepository extends JpaRepository<HomeDto, Long> {

    
    HomeDto findByUserId(Long userId);
    
}
