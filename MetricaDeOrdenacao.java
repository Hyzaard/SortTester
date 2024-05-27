public class MetricaDeOrdenacao {

    private double comparacoes;
    private double trocas;
    private double tempo; // em milissegundos

    public MetricaDeOrdenacao() {
        this.comparacoes = 0;
        this.trocas = 0;
        this.tempo = 0;
    }

    public void addComparacoes() {
        comparacoes++;
    }

    public void addTroca() {
        trocas++;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public void setComparacoes(double comparacoes) {
        this.comparacoes = comparacoes;
    }

    public void setTrocas(double trocas) {
        this.trocas = trocas;
    }

    public double getComparacoes() {
        return comparacoes;
    }

    public double getTrocas() {
        return trocas;
    }

    public double getTempo() {
        return tempo;
    }

    public double getTempoSegundos() {
        return tempo / 1000.0;
    }

    public double getTempoMinutos() {
        return tempo / (1000.0 * 60);
    }

    @Override
    public String toString() {
        return String.format("Comparacoes: %.0f, Trocas: %.0f, Tempo: %.2fms (%.2fs, %.2fmin)",
                comparacoes, trocas, tempo, getTempoSegundos(), getTempoMinutos());
    }
}

