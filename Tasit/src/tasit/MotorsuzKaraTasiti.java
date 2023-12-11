
package tasit;


public class MotorsuzKaraTasiti extends KaraTasiti{
    String guc;

    public MotorsuzKaraTasiti(String guc, int tekerlek, String Sname) {
        super(tekerlek, Sname);
        this.guc = guc;
    }

    @Override
    public void showInfos() {
        super.showInfos(); 
        System.out.println("Guc Kaynagini Yaziniz: "+this.guc);
    }
    
    
   
    
}
