package br.com.spring.forum.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring.forum.model.Curso;

public  interface CursoRepository extends JpaRepository<Curso,Long> {

	Curso findByNome(String nomeCurso);

}
