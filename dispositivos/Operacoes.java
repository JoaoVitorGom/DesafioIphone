package dispositivos;

import dispositivos.operacoes.Reprodutor.ReprodutorMusical;
import dispositivos.operacoes.aparelho.AparelhoTelefonico;
import dispositivos.operacoes.navegador.NavegadorInternet;

public class Operacoes implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void atender() {
        System.out.println("Atendendo");
        
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
        
    }

    @Override
    public void ligarCorreioVoz() {
        System.out.println("Ligando correio de voz");
        
    }

    @Override
    public void exibirPagina(){
        System.out.println("Exibindo página");
      };
    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
      }
    @Override  
    public void atualizarPagina(){
        System.out.println("Atualizando página");
      }
    
      @Override
      public void pausar() {
          System.out.println("Pausando");
          
      }
  
      @Override
      public void selecionar() {
          System.out.println("Selecionando");
          
      }
  
      @Override
      public void tocar() {
          System.out.println("Tocando");
          
      }
    
    

    
}
