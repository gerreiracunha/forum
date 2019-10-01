package br.com.spring.forum.controle.Dto;

public class ErroFormularioDto {

	String nome;
	String erro;

	public ErroFormularioDto(String nome, String erro) {
		this.nome = nome;
		this.erro = erro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

}
