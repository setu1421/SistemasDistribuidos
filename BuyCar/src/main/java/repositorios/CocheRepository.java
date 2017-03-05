package repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Coche;



public interface CocheRepository extends JpaRepository<Coche, Long> {

}
