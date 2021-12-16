package com.ventas.ventas.repository;

import com.ventas.ventas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jose Chavez
 */
public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
}
