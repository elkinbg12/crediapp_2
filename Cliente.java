public class Cliente {
   
    private int id;
    private String nome;
    private String cpf;
    private String celular;
    private String rua;
    private String numero;
    private String bairro;
    private String complemento;
    
    Cliente () {}

    Cliente (int id, String nome, String cpf, String celular,
            String rua, String numero, String bairro, String complemento) {

                this.id = id;
                this.nome = nome;
                this.cpf = cpf;
                this.celular = celular;
                this.rua = rua;
                this.numero = numero;
                this.bairro = bairro;
                this.complemento = complemento;
            }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

            


}
