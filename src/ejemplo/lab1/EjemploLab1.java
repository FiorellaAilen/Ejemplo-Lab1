package ejemplo.lab1;
<<<<<<< Updated upstream
public class EjemploLab1 {  
    public static void main(String[] args) {
=======

import java.util.Scanner;

public class EjemploLab1 {

    static Scanner dato=new Scanner (System.in);
>>>>>>> Stashed changes
        
   public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        
        Bateria bat1= new Bateria ("philco",1000);
        Robot roboti=new Robot (bat1,123,false);
       
        System.out.println("Programa jugar con el robot");
        int opci, opcion;
        do{
            
            System.out.println("En este momento el unico Robort que puede utilizar es roboti de caracteristicas:");
            System.out.println("bateria: Philco");
            System.out.println("Bateria: 1000");
            System.out.println("ingrese su genero");
            String gen=dato.nextLine();
            System.out.println("ingrese su edad");
            int eda=dato.nextInt();
            System.out.println("ingrese su nombre");
           String nom=leer.nextLine();
            System.out.println("ingrese su apellido");
            String ape=leer.nextLine();
             Hombre pedro=new Hombre(roboti,gen,eda,nom,ape);
             System.out.println("Desea jugar con su robot? Si[1]/No[0]");
             opci=dato.nextInt();
             
             if(opci==1){
                 pedro.JugarConRobot();
                 
             }else{
                 System.out.println("usted salio del juego");
                 
             }
             System.out.println("Desea ingresar con otro usuario"
                     + "Si[1]/No[0]");
             opcion=dato.nextInt();
             
       
        }while (opcion!=0);
    }
    
}
