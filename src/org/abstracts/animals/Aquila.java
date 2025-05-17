package org.abstracts.animals;

public class Aquila extends Animale implements IVolante {

    public Aquila(String nome) {
        super(nome);
    }

    @Override
    void verso() {
        System.out.println("Strido");

    }
}
