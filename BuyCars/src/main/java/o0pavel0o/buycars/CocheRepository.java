package o0pavel0o.buycars;

import org.springframework.data.jpa.repository.JpaRepository;




public interface CocheRepository extends JpaRepository<Coche, Long>  {

	Anuncio findByMatricula(String matricula);

	
}
