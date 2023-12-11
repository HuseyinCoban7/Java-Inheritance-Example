
package tasit;

public class Bisiklet extends MotorsuzKaraTasiti{
    public int vites;

    public Bisiklet(int vites, String guc, int tekerlek, String Sname) {
        super(guc, tekerlek, Sname);
        this.vites = vites;
    }

    @Override
    public void showInfos() {
        super.showInfos(); 
        System.out.println("Vites Sayisini Giriniz: "+this.vites);
    }
    
    
    
    
}
