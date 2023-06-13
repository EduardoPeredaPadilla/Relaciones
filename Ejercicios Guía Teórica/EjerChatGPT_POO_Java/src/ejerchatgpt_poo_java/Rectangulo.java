package ejerchatgpt_poo_java;


public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int calcularArea(int base, int altura) {
        int area;
        area = base * altura;
        return area;
    }
    
    public void imprimirInformacion(int base, int altura, int area, int perimetro) {
        System.out.println("La base del rectangulo es " + base);
        System.out.println("La altura del rectangulo es " + altura);
        System.out.println("El área del rectanguo es " + area);
        System.out.println("El perímetro del rectangulo es " + perimetro);
    }
    
    public int calcularPerimetro(int base, int altura) {
        int perimetro;
        perimetro = (2 *base + 2* altura);       
        return perimetro;
    }
    
    

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
}
