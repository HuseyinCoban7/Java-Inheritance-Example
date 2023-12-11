
package tasit;


public class Mobilet extends MotorluKaraTasiti{
    
    public int cc;

    public Mobilet(int teker, int silindir, int tekerlek, String Sname) {
        super(silindir, tekerlek, Sname);
        this.cc = cc;
    }

    @Override
    public void showInfos() {
        super.showInfos(); 
        System.out.println("Motorun cc Degerini Giriniz: "+this.cc);
    }
    
    
    

}
