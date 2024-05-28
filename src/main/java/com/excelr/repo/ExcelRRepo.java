package com.excelr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.entity.Devices;

public interface ExcelRRepo extends JpaRepository<Devices, Integer> {

}
