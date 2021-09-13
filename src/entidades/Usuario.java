package entidades;

public abstract class Usuario {

    private String nome, nomeInstituicao;

    public Usuario() {
    }

    public Usuario(String nome, String nomeInstituicao) {
        super();
        this.nome = nome;
        this.nomeInstituicao = nomeInstituicao;
    }

    public Usuario(String nome) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public abstract void agradecer();


}
