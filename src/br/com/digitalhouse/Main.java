package br.com.digitalhouse;

public class Main {
    public static String maeDe(Filho novoFilho) {
        return novoFilho.getMae();
    }

    public static String paiDe(Filho novoFilho) {
        return novoFilho.getPai();
    }

    public static boolean temAmesmaMae(Filho filhoUm, Filho filhoDois) {
        return maeDe(filhoUm) == maeDe(filhoDois);

    }

    public static boolean temOmesmoPai(Filho filhoum, Filho filhoDois) {
        if (paiDe(filhoUm) == paiDe(filho2)) {
            return true;
        } else {
            return false;

        }

    }
    public static boolean saoMeioIrmaos(Filho filhoUm, Filho filhoDois){
        return temAmesmaMae(filhoUm, filhoDois) && temOmesmoPai(filhoUm, filhoDois);

}


}
