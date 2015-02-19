package com.br.esporte.model;

import com.br.esporte.util.Categoria;
import com.br.esporte.util.Sexo;

public class Atleta{
	private String nome;
	private Categoria categoria;
	private String apelido;
	private Sexo sexo;
	private int idade;
	private String equipe;
	private long matricula;
	private long totPontos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public long getTotPontos() {
		return totPontos;
	}

	public void setTotPontos(long totPontos) {
		this.totPontos = totPontos;
	}

	public Atleta() {
		super();
	}

	public Atleta(String nome, Categoria categoria, String apelido,
			Sexo sexo, int idade, String equipe, long matricula,
			long totPontos) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.apelido = apelido;
		this.sexo = sexo;
		this.idade = idade;
		this.equipe = equipe;
		this.matricula = matricula;
		this.totPontos = totPontos;
	}

	public Atleta(String nome, String apelido, Sexo sexo, int idade) {
		super();
		this.nome = nome;
		this.apelido = apelido;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	// Ajuda a ordenar po nome nos objetos
		public int compareTo(Atleta atleta) {
			int valor = this.getNome().compareToIgnoreCase(atleta.getNome()) * 1; // idade
																					// //
																					// crescente
			// se for igual, comparar por nome
			if (valor == 0) {
				return this.getNome().compareTo(atleta.getNome());
			}
			return valor;
		}

		

}