package org.abstracts.animals;

public class Aquila extends Animale implements IVolante {

    public Aquila(String nome) {
        super(nome);
    }

    @Override
    public void verso() {
        System.out.println("Strido");

    }
}
