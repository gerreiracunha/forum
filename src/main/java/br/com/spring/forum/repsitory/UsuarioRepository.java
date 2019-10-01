package br.com.spring.forum.repsitory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring.forum.model.Usuario;

public  interface UsuarioRepository extends JpaRepository<Usuario,Long> {

	Optional<Usuario> findByEmail(String email);

}
