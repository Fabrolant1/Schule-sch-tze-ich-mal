public class Boss extends Rollenspiel{
    
    private int angriffswert;
    private int lebenspunkte;
    private String name;
    
    public Boss(String Name, int aw, int lp){
        name = Name;
        angriffswert = aw;
        lebenspunkte = lp;
       
    }
 
   
    public int getAngriffswert() {
        return angriffswert;
    }

   
    public void setAngriffswert(int angriffswert) {
        this.angriffswert = angriffswert;
    }

   
    public int getLebenspunkte() {
        return lebenspunkte;
    }

    
    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }
    
    public String getName() {
        return name;
    }
    
    
}
