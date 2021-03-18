package M1_M2_M3.visibilitaCostruttoriGettersSetters;

public class Casa {
    private float metratura;
    private String nome;
    private int n;

    public static double costante =  10.34;

    public Casa(float metratura, String nome, int n) {
        this.metratura = metratura;
        this.nome = nome;
        this.n = n;
    }

    public Casa(float metratura) {
        this.metratura = metratura;
    }

    public float getMetratura() {
        return metratura;
    }

    public String getNome() {
        return nome;
    }

    public int getN() {
        return n;
    }

    public void setMetratura(float metratura) {
        this.metratura = metratura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "metratura=" + metratura +
                ", nome='" + nome + '\'' +
                ", n=" + n +
                '}';
    }
}
