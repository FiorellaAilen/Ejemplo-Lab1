
package ejemplo.lab1;


public class Bateria {
    private String tipoBat;
    private int carga;

    public Bateria(String tipoBat, int carga) {
        this.tipoBat = tipoBat;
        this.carga = carga;
    }

    public String getTipoBat() {
        return tipoBat;
    }

    public void setTipoBat(String tipoBat) {
        this.tipoBat = tipoBat;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public Bateria(){
        carga=1000;
    }
    
}
