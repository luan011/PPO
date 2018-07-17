public class Cliente {
    private String nome;
    private String sobrenome;
    private long cpf;
    private String endereco;
    private int dataNasc;
    private String email;
    private String telefone;
    private String razaoSocial;
    private String nomeFantasia;

    public boolean isPessoaFisica() {
        return false;
    }
}