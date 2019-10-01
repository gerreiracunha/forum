package br.com.spring.forum.repsitory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico,Long> {

	Page<Topico> findByCursoNome(String nomeCurso,Pageable page);

}
