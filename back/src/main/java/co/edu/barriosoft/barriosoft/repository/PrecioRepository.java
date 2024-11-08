package co.edu.barriosoft.barriosoft.repository;


import co.edu.barriosoft.barriosoft.domain.Precio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecioRepository extends JpaRepository<Precio,Integer> {
}
