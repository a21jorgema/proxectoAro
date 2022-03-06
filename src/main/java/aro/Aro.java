package aro;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 *
 * @author Jorge Magariños
 */
public class Aro {

    /**
     * LIMITERADIO é unha constante que define
     * o límite inferior para o valor do radio
     * Ten un valor fixo de 0.0
     */
    public static final double LIMITERADIO = 0.0;

    /**
     * MINIMOO é unha constante que define
     * o mínimo valor que pode ter o radio
     * Ten un valor fixo de 0.0
     */
    public static final double MINIMO = LIMITERADIO;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio < MINIMO ? MINIMO : radio;
    }

    /**
     * Construtor da clase por defecto 
     **/
    public Aro() {
    }

    /**
     * Construtor parametrizado con tres parámetros:
     * @param valorX: valor da coordenada X do centro do Aro
     * @param valorY: valor da coordenada Y do centro do Aro
     * @param valorRadio: valor do radio do Aro
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     * Devolve o diámetro do Aro
     * @return o valor do diámetro=(radio*2)
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     * Calcula a lonxitude do Aro
     * @return circunferencia do Aro
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Calcula o área do Aro
     * @return superficie interna do Aro
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     * Devolve unha cadea de texto coas coordenadas do centro do Aro e o seu radio 
     * @return unha cadea de texto
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Despraza as coordenadas do centro do Aro
     * @param trasladarX
     * @param trasladarY
     */
    public void trasladarCentro(int trasladarX, int trasladarY) {
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}
