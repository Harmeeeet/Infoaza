package com.info.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.demo.model.Infoaza;

public interface InfoRepo extends JpaRepository<Infoaza,String>{

}
