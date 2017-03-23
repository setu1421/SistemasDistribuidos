package o0pavel0o.buycars;
import o0pavel0o.buycars.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	
	
	Categoria findByTipoCategoria(String cat);

}
