package br.com.heitorsiqueira.model.repository;

import br.com.heitorsiqueira.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
