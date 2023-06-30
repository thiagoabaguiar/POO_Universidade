package cursojava.universidade;

/**
 * @author Thiago Aguiar
 */

public class Universidade {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Thiago 1");        
        System.out.println(pessoa.toString());
        
        Professor professor = new Professor();
        professor.receberAumento(1000f);
        
        Aluno aluno = new Aluno();
        aluno.setNome("Thiago 2");
        System.out.println(aluno.toString());       
        
    }
}
