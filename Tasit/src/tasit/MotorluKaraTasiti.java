
package tasit;


public class MotorluKaraTasiti extends KaraTasiti{
   public int silindir;

    public MotorluKaraTasiti(int silindir, int tekerlek, String Sname) {
        super(tekerlek, Sname);
        this.silindir = silindir;
    }

    @Override
    public void showInfos() {
        super.showInfos(); 
        System.out.println("Silindir Sayisi: "+this.silindir);
    }
    
    
   
}
