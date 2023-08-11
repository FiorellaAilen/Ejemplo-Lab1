package ejemplo.lab1;
public class Robot {
    private Bateria bateria;
    private int num;
    private boolean despierto;

    public Robot(Bateria bateria, int num, boolean despierto) {
        this.bateria = bateria;
        this.num = num;
        this.despierto = despierto;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isDespierto() {
        return despierto;
    }

    public void setDespierto(boolean despierto) {
        this.despierto = despierto;
    }
    
}
