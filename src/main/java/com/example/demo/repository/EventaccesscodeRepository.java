package com.example.demo.repository;

import com.example.demo.entity.Eventaccesscode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EventaccesscodeRepository extends JpaRepository<Eventaccesscode, Long>, JpaSpecificationExecutor<Eventaccesscode> {

}