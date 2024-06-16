package operacoes.aparelho;

public class Telefone implements AparelhoTelefonico {
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
    
    
}
