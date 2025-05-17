package org.abstracts.animals;

public class Cane extends Animale implements INuotante {

    public Cane(String nome) {
        super(nome);
    }

    @Override
    void verso() {
        System.out.println("Abbaia");
    }

}
