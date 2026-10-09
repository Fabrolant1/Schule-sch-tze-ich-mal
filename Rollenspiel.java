
public class Rollenspiel {

    public static void main(String[] args) {
        wuerfel sechs = new wuerfel(6);
        wuerfel zehn = new wuerfel(10);
        Kampfregel real = new Kampfregel(sechs, zehn);
        Held J = new Held("Jadon", 0, 2, 10);
        Monster L = new Monster(2, 12);
        Waffe W0 = new Waffe("Holzschwert", "Plastik", 0);
        Waffe W1 = new Waffe("Eisenschwert", "Holz", 1);
        Waffe W2 = new Waffe("Goldschwert", "Diamant", 3);
        Waffe W3 = new Waffe("Diamantschwert", "Gummi", (-4));
        J.ersteWaffe(W0);
        J.neueWaffe(W1);
        J.neueWaffe(W2);
        J.neueWaffe(W3);
        real.Kampfanfrage(J, L);
        real.Kampfanfrage(J, L);
    }
}