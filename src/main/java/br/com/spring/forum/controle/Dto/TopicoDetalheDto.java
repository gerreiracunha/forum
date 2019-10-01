package br.com.spring.forum.controle.Dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.spring.forum.model.StatusTopico;
import br.com.spring.forum.model.Topico;

public class TopicoDetalheDto {

	private long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAutor;
	private StatusTopico statusTopico;
	private List<RespostaDto> listaResposta;

	public TopicoDetalheDto() {
	}

	public TopicoDetalheDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
		this.nomeAutor = topico.getAutor().getNome();
		this.statusTopico = topico.getStatus();
		this.listaResposta = new ArrayList<RespostaDto>();
		this.listaResposta.addAll(topico.getRespostas().stream().map(RespostaDto::new).collect((Collectors.toList())));
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public StatusTopico getStatusTopico() {
		return statusTopico;
	}

	public void setStatusTopico(StatusTopico statusTopico) {
		this.statusTopico = statusTopico;
	}

	public List<RespostaDto> getListaResposta() {
		return listaResposta;
	}

	public void setListaResposta(List<RespostaDto> listaResposta) {
		this.listaResposta = listaResposta;
	}

}
