/**
 * 
 */
package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Anupam Biswas
 * 2020-02-04 01:32:49.325
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
