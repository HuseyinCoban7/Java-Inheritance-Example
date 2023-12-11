
package tasit;

public class KaraTasiti extends Tasit{
    String Sname;
    public KaraTasiti(int tekerlek,String Sname) {
        super(tekerlek);
        this.Sname=Sname;
    }

    @Override
    public void showInfos() {
        super.showInfos(); 
        System.out.println("Soforun Ismi: "+this.Sname);

     
    }
}
