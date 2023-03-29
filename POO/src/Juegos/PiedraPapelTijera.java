package Juegos;
import java.util.Random;
import java.util.Scanner;
public class PiedraPapelTijera {
    private int opcion;
    private String nombreJugador;
    private int resultado;
    //capturar datos
    Scanner Sc=new Scanner(System.in);
    public void iniciar(){
        System.out.println("Ingrese el nombre del jugador " );
        nombreJugador=Sc.nextLine();
    }
    public void jugar(){
        System.out.println(nombreJugador+  " Haga su elección \n1.piedra \n2.papel \n3.tijera ");
        resultado=Sc.nextInt();
        Random aleatorio=new Random();
        opcion=aleatorio.nextInt(3)+1;

    }
    public void finalizar() {
        if(opcion==1 && resultado==1) {
         System.out.println("escojiste piedra, GANASTE " +nombreJugador);
        }else if(opcion==2 && resultado==2){
         System.out.println("escojiste papel, GANASTE " +nombreJugador);
        }else if(opcion==3 && resultado==3){
         System.out.println("escojiste tijeras, GANASTE " +nombreJugador); 
        }else if(opcion==1 && resultado==2){
         System.out.println("escojiste piedra, PERDISTE " +nombreJugador);  
        }else if(opcion==2 && resultado==3){
         System.out.println("escojiste papel, PERDISTE " +nombreJugador);  
        }else if(opcion==3 && resultado==1){
         System.out.println("escojiste tijeras, PERDISTE " +nombreJugador);  
        }
     }
}
