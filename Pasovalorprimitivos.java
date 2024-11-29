
public class Pasovalorprimitivos {
    public static void main(String[] args) {
     int numero =3;
      cambiarNumero(numero);
      System.out.println("despues de llamar a cambiar numero: "+numero);
      
    }
    public static void cambiarNumero(int num){
        num = 5;
        System.out.println("dentro de cambiar numero: "+num);
        
    }
}
