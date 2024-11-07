package school.sptech;
import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras;

    public Imagem(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public Imagem() {

    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {

        Double somaArea = 0.0;
        for (Figura figura : figuras) {
            somaArea += figura.calcularArea();
        }
        return somaArea;

    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> figuraMaior20 = new ArrayList<>();

        for (Figura figura : figuras) {
            if(figura.calcularArea() > 20.0) {
                figuraMaior20.add(figura);
            }

        }
        return figuraMaior20;
    }

    public  List<Figura> buscarQuadrados() {
        List<Figura> quadrados = new ArrayList<>();

        for (Figura figura : figuras) {
            if(figura instanceof Quadrado) {
                quadrados.add(figura);
            }

        }
        return quadrados;
    }
    }


