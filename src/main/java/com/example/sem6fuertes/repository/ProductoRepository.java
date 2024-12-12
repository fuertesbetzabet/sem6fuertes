/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.sem6fuertes.repository;

import com.example.sem6fuertes.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author BETZABET
 */
public interface ProductoRepository extends JpaRepository<Producto, Long>  {
    
}
