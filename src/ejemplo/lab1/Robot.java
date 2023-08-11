package ejemplo.lab1;
public class Robot {
    private Bateria bateria;
    private int num;
    private boolean dormido;

    public Robot(Bateria bateria, int num, boolean dormido) {
        this.bateria = bateria;
        this.num = num;
        this.dormido = dormido;
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

    public boolean isDormido() {
        return dormido;
    }

    public void setDormido(boolean dormido) {
        this.dormido = dormido;
    }
     
     public void Avanzar(int cantidadDePasos) {
        int consumo=(cantidadDePasos/100)*10;
        if (bateria.getCarga()>=consumo) {
            System.out.println("avanzo pasos "+cantidadDePasos);
            bateria.setCarga(bateria.getCarga()-consumo);
        } else {
            System.out.println("sin bateria");
            System.out.println("desea recargar s/n");
            
        }
    }

    public void Retroceder(int cantidadDePasos) {
     int consumo=(cantidadDePasos/100)*10;
        if (dormido=false) {
      
 
     if (bateria.getCarga()>=consumo) {
            System.out.println("retrocediendo pasos "+cantidadDePasos);
            bateria.setCarga(bateria.getCarga()-consumo);
        } else {
            System.out.println("sin bateria");
            System.out.println("desea recargar s/n");
    }
    } else {
            System.out.println("el robot esta dormido");
        }
    }
    
    public Robot() {
       bateria=new Bateria();
       dormido=false;
       
    
    }

    public void Dormir() {
        dormido=true;
        System.out.println("el robot esta durmiendo");
    }

    public void Despertar() {
        dormido=false;
        System.out.println("el robot esta despierto");
    }

    public void Recargar() {
        bateria.setCarga(1000);
      
       
    }

    public boolean bateriaLLena() {
        return bateria.getCarga()==1000;
    }

    public boolean bateriaVacia() {
         return bateria.getCarga()==0;
  
    }
    

    public int energiaActual() {
         return bateria.getCarga();
  
    }

    @Override
    public String toString() {
        return "Robot{" + "bateria=" + bateria + ", dormido=" + dormido + '}';
    }
    
}
