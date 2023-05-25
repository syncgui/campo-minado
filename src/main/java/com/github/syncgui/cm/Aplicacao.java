package com.github.syncgui.cm;

import com.github.syncgui.cm.modelo.Tabuleiro;

public class Aplicacao {

    public static void main(String[] args) {

    Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

    tabuleiro.abrir(3, 3);
    tabuleiro.alternarMacacao(4, 4);
    tabuleiro.alternarMacacao(4, 5);

    System.out.println(tabuleiro);
    }
}
