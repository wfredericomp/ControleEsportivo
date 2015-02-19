package com.br.esporte.model.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import com.br.esporte.model.Atleta;
import com.br.esporte.util.Categoria;
import com.br.esporte.util.Sexo;
import com.br.esporte.util.Utilidades;

public class Evento implements Comparable<Evento> {
	private String nome;
	private String data;
	private String responsavel;
	private Atleta atleta = new Atleta();
	static ArrayList<Evento> lista = new ArrayList<Evento>();
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Atleta getAtleta() {
		return atleta;
	}

	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}

	public Evento() {
		super();
	}

	public Evento(String nome, String data, String responsavel, Atleta atleta) {
		super();
		this.nome = nome;
		this.data = data;
		this.responsavel = responsavel;
		this.atleta = atleta;
	}

	public static void dadosAtleta() {
		Evento e1 = new Evento();
		e1.setNome("Olimpiadas da Alemanha");
		e1.setData("01/12/2010");
		e1.setResponsavel("Michael Forlan");
		e1.getAtleta().setMatricula(123456);
		e1.getAtleta().setNome("Waldivino Frederico");
		e1.getAtleta().setApelido("Fred");
		e1.getAtleta().setCategoria(Categoria.corrida);
		e1.getAtleta().setEquipe("Ferrari");
		e1.getAtleta().setIdade(26);
		e1.getAtleta().setSexo(Sexo.masculino);
		e1.getAtleta().setTotPontos(pontuarAtleta());
		e1.inscreverAtleta(e1);
		// ======================================================
		Evento e2 = new Evento();
		e2.setNome("Olimpiadas da Alemanha");
		e2.setData("01/12/2014");
		e2.setResponsavel("Patrik Vans");
		e2.getAtleta().setMatricula(424457);
		e2.getAtleta().setNome("Hugo Portela");
		e2.getAtleta().setApelido("Hung");
		e2.getAtleta().setCategoria(Categoria.handball);
		e2.getAtleta().setEquipe("Brasil");
		e2.getAtleta().setIdade(29);
		e2.getAtleta().setSexo(Sexo.masculino);
		e2.getAtleta().setTotPontos(pontuarAtleta());
		e2.inscreverAtleta(e2);
		// ======================================================
		Evento e3 = new Evento();
		e3.setNome("Olimpiadas da Alemanha");
		e3.setData("01/12/2018");
		e3.setResponsavel("Denis Forlan");
		e3.getAtleta().setMatricula(623458);
		e3.getAtleta().setNome("Rafael Elias");
		e3.getAtleta().setApelido("Frank");
		e3.getAtleta().setCategoria(Categoria.futebol);
		e3.getAtleta().setEquipe("Alemanha");
		e3.getAtleta().setIdade(33);
		e3.getAtleta().setSexo(Sexo.masculino);
		e3.getAtleta().setTotPontos(pontuarAtleta());
		e3.inscreverAtleta(e3);
		// ======================================================
		Evento e4 = new Evento();
		e4.setNome("Olimpiadas da Alemanha");
		e4.setData("01/12/2022");
		e4.setResponsavel("Mich Juds");
		e4.getAtleta().setMatricula(223456);
		e4.getAtleta().setNome("Kaiane Azevedo");
		e4.getAtleta().setApelido("Kai");
		e4.getAtleta().setCategoria(Categoria.natação);
		e4.getAtleta().setEquipe("França");
		e4.getAtleta().setIdade(23);
		e4.getAtleta().setSexo(Sexo.feminino);
		e4.getAtleta().setTotPontos(pontuarAtleta());
		e4.inscreverAtleta(e4);
		// ======================================================
		Evento e5 = new Evento();
		e5.setNome("Olimpiadas da Alemanha");
		e5.setData("01/12/2026");
		e5.setResponsavel("Michael Tinder");
		e5.getAtleta().setMatricula(123410);
		e5.getAtleta().setNome("Okida TakaraSuja");
		e5.getAtleta().setApelido("Oki");
		e5.getAtleta().setCategoria(Categoria.luta);
		e5.getAtleta().setEquipe("Japão");
		e5.getAtleta().setIdade(28);
		e5.getAtleta().setSexo(Sexo.masculino);
		e5.getAtleta().setTotPontos(pontuarAtleta());
		e5.inscreverAtleta(e5);
		// ======================================================
		Evento e6 = new Evento();
		e6.setNome("Olimpiadas da Alemanha");
		e6.setData("01/12/2026");
		e6.setResponsavel("Michael Tinder");
		e6.getAtleta().setMatricula(123410);
		e6.getAtleta().setNome("Okida TakaraSuja");
		e6.getAtleta().setApelido("Oki");
		e6.getAtleta().setCategoria(Categoria.luta);
		e6.getAtleta().setEquipe("Japão");
		e6.getAtleta().setIdade(28);
		e6.getAtleta().setSexo(Sexo.masculino);
		e6.getAtleta().setTotPontos(pontuarAtleta());
		e6.inscreverAtleta(e6);

	}

	public boolean estaInscrito(Evento pojo) {
		boolean naoEsta = true;
		for (Evento pojoList : lista) {
			if (pojo.getAtleta().getNome()
					.equalsIgnoreCase(pojoList.getAtleta().getNome())) {
				System.out.println("\n\nO atleta " + pojo.getAtleta().getNome()
						+ " já está inscrito !\n\n\n");
				naoEsta = false;
			}
		}
		return naoEsta;
	}

	private void inscreverAtleta(Evento pojo) {
		if (estaInscrito(pojo)) {
			lista.add(pojo);
		}

	}

	public static long pontuarAtleta() {
		Random random = new Random();
		long pontos = (long) random.nextInt(101);
		return pontos;
	}

	public static void listarAtletas() {
		System.out.println("***************************************");
		for (Evento obj : lista) {
			System.out.println("Evento: " + obj.getNome());
			System.out.println("Data: " + obj.getData());
			System.out.println("Responsável: " + obj.getResponsavel());
			System.out.println("Matricula: " + obj.getAtleta().getMatricula());
			System.out.println("Nome: " + obj.getAtleta().getNome());
			System.out.println("Apelido: " + obj.getAtleta().getApelido());
			System.out.println("Categoria: " + obj.getAtleta().getCategoria());
			System.out.println("Equipe: " + obj.getAtleta().getEquipe());
			System.out.println("Idade: " + obj.getAtleta().getIdade());
			System.out.println("Sexo: " + obj.getAtleta().getSexo());
			System.out.println("Pontos recebidos: "
					+ obj.getAtleta().getTotPontos());
			System.out.println("***************************************");
		}
	}

	public static void removerAtleta(String nome) {
		int i = 0;
		for (Evento evento : lista) {
			if (evento.getAtleta().getNome().equalsIgnoreCase(nome)) {
				lista.remove(i);
				System.out.println("\nAtleta " + nome
						+ " removido com sucesso!\n\n");
				break;
			}
			i++;

		}
	}

	public static void exibirAtleta(long matricula) {
		for (Evento obj : lista) {
			if (obj.getAtleta().getMatricula() == matricula) {
				System.out.println("==============Exibir Atleta=============");
				System.out.println("Evento: " + obj.getNome());
				System.out.println("Data: " + obj.getData());
				System.out.println("Responsável: " + obj.getResponsavel());
				System.out.println("Matricula: "
						+ obj.getAtleta().getMatricula());
				System.out.println("Nome: " + obj.getAtleta().getNome());
				System.out.println("Apelido: " + obj.getAtleta().getApelido());
				System.out.println("Categoria: "
						+ obj.getAtleta().getCategoria());
				System.out.println("Equipe: " + obj.getAtleta().getEquipe());
				System.out.println("Idade: " + obj.getAtleta().getIdade());
				System.out.println("Sexo: " + obj.getAtleta().getSexo());
				System.out.println("Pontos recebidos: "
						+ obj.getAtleta().getTotPontos());
				System.out
						.println("===========================================");
			}
		}
	}

	public static void exibirVencedor() {
		Evento pojo = null;
		long pontos = 0;
		for (Evento evento : lista) {
			if (evento.getAtleta().getTotPontos() >= pontos) {
				pontos = evento.getAtleta().getTotPontos();
				pojo = evento;
			}
		}

		System.out.println("==============Exibir Vencedor=============");
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
		System.out.println("===========================================");

	}

	public static void ordenarAtletasPorPonto() {
		Collections.sort(lista);
		for (Evento pojo : lista) {
			System.out
					.println("==============Exibir Pontos Ordenadosr=============");
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
					.println("===================================================");
		}
	}

	// Ajuda a ordenar os pontos nos objetos
	public int compareTo(Evento evento) {
		if (this.getAtleta().getTotPontos() > evento.getAtleta().getTotPontos()) {
			return 1;
		}

		else if (this.getAtleta().getTotPontos() < evento.getAtleta()
				.getTotPontos()) {
			return -1;
		}
		int valor = this.getNome().compareTo(evento.getNome());
		return (valor != 0 ? valor : 1);
	}
	
	
	public static void ordenaPorNomes(){
		Utilidades.ordenarAtletas(lista);
	}


}
