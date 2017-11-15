/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import View.TelaAtendente;
import View.TelaGerente;
import View.TelaLogin;
import View.TelaMecanico;
import View.TelaPecas;

/**
 *
 * @author Bruna Leonel
 */
    public class main{
        public static void main(String Args[]){
            new TelaLogin().setVisible(true);
            new TelaAtendente().setVisible(true);
            new TelaGerente().setVisible(true);
            new TelaMecanico().setVisible(true);
            new TelaPecas().setVisible(true);
        }
    }

