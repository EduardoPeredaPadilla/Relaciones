package ejerchatgpt_poo_java;


public class EjerChatGPT_POO_Java {


    public static void main(String[] args) {
        
        Rectangulo recta = new Rectangulo (10, 5);
        
        int area = recta.calcularArea(recta.getBase(), recta.getAltura());
        int perimetro = recta.calcularPerimetro(recta.getBase(), recta.getAltura());
        
        recta.imprimirInformacion(recta.getBase(), recta.getAltura(), area, perimetro);
    }

}
S