package org.abstracts.animals;

public class Main {
    public static void main(String[] args) {
        Aquila aquila1 = new Aquila("aquiletta");
        Cane cane1 = new Cane("Cagnolino");
        Passerotto passerotto1 = new Passerotto("Passerottino");
        Delfino delfino1 = new Delfino("Delfinetto");

        System.out.println(aquila1.nome);
        aquila1.verso();
        aquila1.dormi();
        faiVolare(aquila1);
        System.out.println(cane1.nome);
        cane1.verso();
        faiNuotare(cane1);
        System.out.println(passerotto1.nome);
        passerotto1.verso();
        faiVolare(passerotto1);
        System.out.println(delfino1.nome);
        delfino1.verso();
        faiNuotare(delfino1);

    }

    public static void faiVolare(IVolante animale) {
        animale.vola();
    }

    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }

}
