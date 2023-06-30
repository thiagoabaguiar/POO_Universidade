package cursojava.universidade;

public class Bolsita extends Aluno {

    public float bolsa;

    public void renovarBolsa() {
    }

    /**
     *
     */
    @Override
    public void pagarMensalidade() {
        System.out.println("Paguei na classe Bolsista");
    }
}
