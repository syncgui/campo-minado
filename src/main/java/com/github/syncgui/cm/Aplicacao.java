package com.github.syncgui.cm;

import com.github.syncgui.cm.modelo.Tabuleiro;
import com.github.syncgui.cm.visao.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {

    Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
    new TabuleiroConsole(tabuleiro);
    }
}
