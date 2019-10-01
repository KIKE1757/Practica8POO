package ejer4;
public class RelacionJerarquica{

    public static void main(String[] args) {
        Punto punto = new Punto(30,50);
        Circulo circulo = new Circulo(120,89, 2.7);
        
        System.out.println("Llamando a toString de Punto con referencia " 
                            + "a la superclase apuntado al objeto de la superclase:\n"
                            + punto.toString());
        System.out.println("Llamando a toString de Circulo con referencia " 
                            + "a la subclase apuntado al objeto de la subclase:\n"
                            + circulo.toString());
        Punto refPunto = circulo;
        System.out.println("Llamando a toString de Circulo con referencia " 
                            + "a la superclase apuntado al objeto de la subclase:\n"
                            + refPunto.toString());
        circulo=(Circulo)punto;  
    }
    
}

