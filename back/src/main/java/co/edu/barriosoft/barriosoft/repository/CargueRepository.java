package co.edu.barriosoft.barriosoft.repository;

import co.edu.barriosoft.barriosoft.domain.Cargue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargueRepository extends JpaRepository<Cargue, Integer> {
}
