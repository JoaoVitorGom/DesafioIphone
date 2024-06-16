package dispositivos;

import dispositivos.operacoes.Reprodutor.ReprodutorMusical;
import dispositivos.operacoes.aparelho.AparelhoTelefonico;
import dispositivos.operacoes.navegador.NavegadorInternet;

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
