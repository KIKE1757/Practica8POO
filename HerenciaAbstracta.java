import java.text.DecimalFormat;
public class HerenciaAbstracta {
    public static void main(String[] args) {
        DecimalFormat dosDigitos=new DecimalFormat("0.00");
        //Crear objetos Punto, Circulo y Cilindro
        Punto punto = new Punto (7,11);
        Circulo circulo= new Circulo (22,8,3.5);
        Cilindro cilindro = new Cilindro (20,30,3.3,10.75);
        //Obtener nombre y representación de cadena de cada objeto
        System.out.println("Nombre y representación de cadena: ");
        System.out.println(punto.obtenerNombre()+": "+punto+"\n"+circulo.obtenerNombre()+": "+cilindro+"\n"+cilindro.obtenerNombre()+": "+cilindro+"\n");
        //Crear un arreglo de Figuras
        Figura arregloDeFiguras[]= new Figura[3];
        //Apuntar arregloDeFiguras[0] al objeto de la subclase Punto
        arregloDeFiguras[0]=punto;
        //Apuntar arregloDeFiguras[1] al objeto de la subclase Punto
        arregloDeFiguras[1]=circulo;
        //Apuntar arregloDeFiguras[2] al objeto de la subclase Punto
        arregloDeFiguras[2]=cilindro;
        //iterar a través del arreglo para ibtener nombre, 
        //representación de cadena, área y volumen de cada 
        //Figura en el arreglo.
        System.out.println("\nNombre e invocaciones: ");
        for (int i=0;i<arregloDeFiguras.length;i++){
            System.out.println(arregloDeFiguras[i].obtenerNombre());
            System.out.println(arregloDeFiguras[i].toString());
            System.out.println(arregloDeFiguras[i].obtenerArea());
            System.out.println(arregloDeFiguras[i].obtenerVolumen());
            System.out.println("\n");
        }
    } 
}
