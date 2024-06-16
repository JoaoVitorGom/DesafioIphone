package dispositivos;

import operacoes.Reprodutor.ReprodutorMusical;
import operacoes.aparelho.AparelhoTelefonico;
import operacoes.navegador.NavegadorInternet;

public class Iphone {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();
        AparelhoTelefonico aparelhoTelefonico = op;
        NavegadorInternet navegadorInternet = op;
        ReprodutorMusical reprodutorMusical = op;

        aparelhoTelefonico.atender();
        navegadorInternet.adicionarNovaAba();
        reprodutorMusical.selecionar();
        
    }

    
}
