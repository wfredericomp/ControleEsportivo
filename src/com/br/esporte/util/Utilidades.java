package com.br.esporte.util;

import java.util.ArrayList;

import com.br.esporte.model.Atleta;
import com.br.esporte.model.dao.Evento;

public class Utilidades {
	static ArrayList<Evento> listaOrdena = new ArrayList<Evento>();
	private String nome;
	private Atleta atleta = new Atleta();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Atleta getAtleta() {
		return atleta;
	}

	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}

	public Utilidades() {
		super();
	}

	public Utilidades(String nome) {
		super();
		this.nome = nome;

	}

	public static void ordenarAtletas(ArrayList<Evento> lista) {
		for (Evento pojo : lista) {
			System.out
					.println("==============Exibir Nomes Ordenadosr=============");
			System.out.println("Evento: " + pojo.getNome());
			System.out.println("Data: " + pojo.getData());
			System.out.println("Responsável: " + pojo.getResponsavel());
			System.out.println("Matricula: " + pojo.getAtleta().getMatricula());
			System.out.println("Nome: " + pojo.getAtleta().getNome());
			System.out.println("Apelido: " + pojo.getAtleta().getApelido());
			System.out.println("Categoria: " + pojo.getAtleta().getCategoria());
			System.out.println("Equipe: " + pojo.getAtleta().getEquipe());
			System.out.println("Idade: " + pojo.getAtleta().getIdade());
			System.out.println("Sexo: " + pojo.getAtleta().getSexo());
			System.out.println("Pontos recebidos: "
					+ pojo.getAtleta().getTotPontos());
			System.out
					.println("=================================================");
		}
	}

}
