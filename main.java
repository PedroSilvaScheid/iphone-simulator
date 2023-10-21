// Classe ReprodutorMusical
class ReprodutorMusical {
    private String musicaSelecionada;

    public void tocar() {
        System.out.println("Tocando: " + musicaSelecionada);
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(int opcao) {
        String[] musicas = {"Música 1", "Música 2", "Música 3", "Música 4", "Música 5"};
        if (opcao >= 0 && opcao < musicas.length) {
            musicaSelecionada = musicas[opcao];
            System.out.println("Música selecionada: " + musicaSelecionada);
        } else {
            System.out.println("Opção inválida");
        }
    }
}

// Classe AparelhoTelefonico
class AparelhoTelefonico {
    public void ligar() {
        System.out.println("Ligando...");
    }
}

// Classe NavegadorInternet
class NavegadorInternet {
    private String paginaAtual;

    public void exibirPagina() {
        System.out.println("Exibindo página: " + paginaAtual);
    }

    public void adicionarNovaAba() {
        paginaAtual = "Página 2";
        System.out.println("Nova aba adicionada. Página atual: " + paginaAtual);
    }

    public void atualizarPagina() {
        paginaAtual = "Página 1";
        System.out.println("Página atualizada: " + paginaAtual);
    }
}

// Classe principal (main)
public class Main {
    public static void main(String[] args) {
        // Exemplo de uso das funcionalidades
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.selecionarMusica(3);
        reprodutor.tocar();
        reprodutor.pausar();

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar();

        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
