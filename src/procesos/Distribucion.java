package procesos;

/*clase para manejar las distribuciones de probabilidad de los datos de entrada (valor, probabilidad, probabilidadAcumulada)
las probabilidades se ingresan en porcentajes de 1 a 100*/
public class Distribucion {
    
    private int valor;
    private double probabilidad;
    private double probAcumulada;

    public Distribucion(int valor, double probabilidad) {
        this.valor = valor;
        this.probabilidad = probabilidad;
    }
    
    public Distribucion(int valor, double probabilidad, double acum) {
        this.valor = valor;
        this.probabilidad = probabilidad;
        this.probAcumulada = acum;
    }
       
    @Override
    public String toString() {
        return String.format(" " + valor + " - " + probabilidad + " - " + probAcumulada + "\n");
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probDemanda) {
        this.probabilidad = probDemanda;
    }

    public double getProbAcumulada() {
        return probAcumulada;
    }

    public void setProbAcumulada(double probAcumulada) {
        this.probAcumulada = probAcumulada;
    }
    
    
}
