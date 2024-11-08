package co.edu.barriosoft.barriosoft.repository;

import co.edu.barriosoft.barriosoft.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
