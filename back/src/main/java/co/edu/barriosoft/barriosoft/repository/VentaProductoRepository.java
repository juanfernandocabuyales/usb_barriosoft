package co.edu.barriosoft.barriosoft.repository;

import co.edu.barriosoft.barriosoft.domain.VentaProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaProductoRepository extends JpaRepository<VentaProducto,Integer> {
}
