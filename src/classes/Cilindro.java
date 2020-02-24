package classes;

public class Cilindro {

    private float raio = 0;
    private float altura = 0;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calculaAreaLateral() throws Exception {

        return (2 * 3.1415f * raio * altura);
    }

    public float calculaAreaTotal() throws Exception {

        return (2 * 3.1415f * raio * (altura + raio));
    }

    public float calculaVolume() throws Exception {

        return ((1.0f / 3.0f) * 3.1415f * raio * raio  * altura);   
     
    }

}
