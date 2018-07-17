public class Fornecedor {
    private String razaoSocial;
    private String nomeFantasia;
    private long cnpj;
    private String telefone;
    private String endereco;
    private long cpf;

    public boolean isPessoaFisica() {
        return false;
    }
}