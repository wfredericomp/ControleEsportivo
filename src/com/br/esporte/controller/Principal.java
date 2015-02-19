package com.br.esporte.controller;

import com.br.esporte.model.dao.Evento;

public class Principal {

	public static void main(String[] args) {
		Evento.dadosAtleta();
		Evento.listarAtletas();
		Evento.removerAtleta("Okida TakaraSuja");
		Evento.exibirAtleta(123456);
		Evento.exibirVencedor();
		Evento.ordenarAtletasPorPonto();
		Evento.ordenaPorNomes();
		//egit
	}

}
