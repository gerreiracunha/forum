package br.com.spring.forum.controle.Dto;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoguinFormDto {

	private String senha;
	private String email;

	public LoguinFormDto() {

	}

	public UsernamePasswordAuthenticationToken convert() {
		return new UsernamePasswordAuthenticationToken(email, senha);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
