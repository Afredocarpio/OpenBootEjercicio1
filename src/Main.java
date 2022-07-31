public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(2,4,5);
        System.out.println(resultado);


        coche sumPuerta = new coche();
        sumPuerta.addPuerta();
        System.out.println(coche.puerta);
        System.out.println(miCoche.puerta);

    }
    public static int suma ( int a, int b, int c){
        return (a + b + c);
    }
}
class coche {
    public static int puerta = 4;

    public void addPuerta(){
        puerta++;
    }
}
class miCoche{
    public static int puerta = 1;
}


/* no se si sea esto lo que querian gracias y no dure 5minutos tarde mas pensando que y como hacerlo y mirando codigo */