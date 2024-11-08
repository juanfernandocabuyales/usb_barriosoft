package co.edu.barriosoft.barriosoft.repository;

import co.edu.barriosoft.barriosoft.domain.CargueProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargueProductoRepository extends JpaRepository<CargueProducto,Integer> {
}
