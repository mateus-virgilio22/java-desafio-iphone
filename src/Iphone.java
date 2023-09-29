public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar(); // Saída: Tocando música
        iphone.pausar(); // Saída: Pausando música
        iphone.selecionarMusica(); // Saída: Selecionando música

        iphone.ligar(); // Saída: Ligando
        iphone.atender(); // Saída: Atendendo
        iphone.iniciarCorreioVoz(); // Saída: Iniciando correio de voz

        iphone.exibirPagina(); // Saída: Exibindo página
        iphone.adicionarNovaAba(); // Saída: Adicionando nova aba
        iphone.atualizarPagina(); // Saída: Atualizando página
    }
    
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    public void ligar() {
        System.out.println("Ligando");
    }

    public void atender() {
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}


    

