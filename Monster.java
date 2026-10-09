public class Monster {
    
    private int angriffswert;
    private int lebenspunkte;
    
    
    public Monster(int aw, int lp){
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
    
    
}