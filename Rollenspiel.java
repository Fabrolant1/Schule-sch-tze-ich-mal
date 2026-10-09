
public class Rollenspiel {

    public static void main(String[] args) {
        wuerfel sechs = new wuerfel(6);
        wuerfel zehn = new wuerfel(10);
        Kampfregel real = new Kampfregel(sechs, zehn);
        Held J = new Held("Jadon", 0, 2, 10000000);
        Monster L = new Monster(2, 10000002);
        Waffe H = new Waffe("Holzschwert", "Plastik", 0);
        J.ersteWaffe(H);
        real.Kampfanfrage(J, L);
         
    }
}