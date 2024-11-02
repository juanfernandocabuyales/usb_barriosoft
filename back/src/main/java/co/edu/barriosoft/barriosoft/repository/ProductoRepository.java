package co.edu.barriosoft.barriosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.barriosoft.barriosoft.domain.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
}
