package dispositivos.operacoes.Reprodutor;

public class Reprodutor implements ReprodutorMusical {

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
