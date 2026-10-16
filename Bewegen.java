import java.util.Scanner;

public class Bewegen extends Rollenspiel{

    public char ESGIBTKEINZURÜCK;

    private String[] Bewegung = {
        "Norden",
        "Osten",
        "Süden",
        "Westen",
        "oben"
    };

    private char[] bewegung = {
        'N',
        'O',
        'S',
        'W',
        'o'
    };

    private wuerfel wuerfel6;
    private wuerfel wuerfel10;

    public Bewegen(wuerfel s, wuerfel z){
        wuerfel6  = s;
        wuerfel10 = z;
        Kampfregel real = new Kampfregel();
    }

    public void Schritt_anfrage(){
        System.out.println("Wohin wollen Sie gehen?");
        for (int i=0; i<Bewegung.length; i++){
            System.out.println(i+ ": " + Bewegung[i]);
        }
        System.out.println("(Nummer eingeben)");
        char Bewegung = Schrittauswahl();
        switch (Bewegung) {
            case 'N':
                if(ESGIBTKEINZURÜCK == 'S'){
                    System.out.println("DU DARFST NICHT ZURÜCK!");
                    Schritt_anfrage();
                    break;
                }else{
                    ESGIBTKEINZURÜCK = Bewegung;
                    Schritt_nach_Norden();
                    break;
                }
            case 'O':
                if(ESGIBTKEINZURÜCK == 'W'){
                    System.out.println("DU DARFST NICHT ZURÜCK!");
                    Schritt_anfrage();
                    break;
                }else{
                    ESGIBTKEINZURÜCK = Bewegung;
                    Schritt_nach_Osten();
                    break;
                }
            case 'S':
                if(ESGIBTKEINZURÜCK == 'N'){
                    System.out.println("DU DARFST NICHT ZURÜCK!");
                    Schritt_anfrage();
                    break;
                }else{
                    ESGIBTKEINZURÜCK = Bewegung;
                    Schritt_nach_Süden();
                    break;
                }
            case 'W':
                if(ESGIBTKEINZURÜCK == 'O'){
                    System.out.println("DU DARFST NICHT ZURÜCK!");
                    Schritt_anfrage();
                    break;
                }else{
                    ESGIBTKEINZURÜCK = Bewegung;
                    Schritt_nach_Westen();
                    break;
                }
            case 'o':
                Schritt_nach_Oben();
                break;
            case '0':
                Schritt_anfrage();
                break;
        }
    }

    public void Schritt_nach_Norden(){
        Randomraum(false);
    }

    public void Schritt_nach_Osten(){
        Randomraum(false);
    }

    public void Schritt_nach_Süden(){
        Randomraum(false);
    }

    public void Schritt_nach_Westen(){
        Randomraum(false);
    }

    public void Schritt_nach_Oben(){
        Randomraum(true);
    }

    public void Randomraum(boolean Bossraum){
        if(Bossraum == false){
            int random = wuerfel6.wuerfeln();
            if(random<3){
                spawn_Monster();
            }else if(random<5){

            }else if (random<7){

            }
        }else{
            int random = wuerfel10.wuerfeln();
            if(random<10){
                
            }else{

            }
        }
    }

    public void spawn_Monster(){
        
    }



    public char Schrittauswahl(){
        Scanner input = new Scanner(System.in);
        int i= input.nextInt();
        if(i<Bewegung.length){
            return bewegung[i];
        }
        else{
            System.out.println("Das kannst du noch nicht");
            return '0';
        } 
    }




}
