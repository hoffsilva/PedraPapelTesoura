package Model;

import java.util.Random;

public class Jogo {


    private int opcaoUsuario;
    private int opcaoComputador;



    public Jogo(int opcao) {
        this.opcaoUsuario = opcao;
        Random random = new Random();
        this.opcaoComputador = random.nextInt(2) + 1;
    }

    public int jogar() {
        
    }


}
