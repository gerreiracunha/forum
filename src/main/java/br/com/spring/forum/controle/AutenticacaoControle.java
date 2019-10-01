package br.com.spring.forum.controle;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.forum.Dto.TokenDto;
import br.com.spring.forum.config.security.TokenService;
import br.com.spring.forum.controle.Dto.LoguinFormDto;

@RestController
@RequestMapping("/auth")
public class AutenticacaoControle {

	@Autowired
	private AuthenticationManager authManager;
	@Autowired
	private TokenService tokenService;

	@PostMapping()
	public ResponseEntity<?> autenticar(@Valid @RequestBody LoguinFormDto loginfrom) {
		
		try {
			UsernamePasswordAuthenticationToken dadosLogin = loginfrom.convert();
			Authentication auteAuthentication = authManager.authenticate(dadosLogin);
			String token=tokenService.gerarToken(auteAuthentication);
			
			System.out.println(token);
			return ResponseEntity.ok(new TokenDto(token,"Bearer"));
		} catch (AuthenticationException e) {
			return ResponseEntity.badRequest().build();
		}

	}

}
