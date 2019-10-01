package br.com.spring.forum.config.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.spring.forum.model.Usuario;
import br.com.spring.forum.repsitory.UsuarioRepository;

@Service
public class AutenticacaoService implements UserDetailsService {
	@Autowired
	UsuarioRepository UsuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<Usuario> usuario = UsuarioRepository.findByEmail(username);
		if (usuario.isPresent())
			return usuario.get();
		
	    throw new UsernameNotFoundException("Dados inválidos");
	}

}
