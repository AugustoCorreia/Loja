package models;

public class UserAuth {
    private Long id ;
    private String login ;
    private String senha ;
    private Boolean ativo ;

    public UserAuth() {}

    public UserAuth(Long id, String login, String senha, Boolean ativo) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "UserAuth{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
