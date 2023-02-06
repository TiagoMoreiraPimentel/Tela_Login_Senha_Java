package App.entities;

public class ValidarLogin {
    
    // atributos da classe
    private String login;
    private String senha;

    // construtor sem argumentos
    public ValidarLogin() {
    }

    // construtor com argumentos
    public ValidarLogin(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    // função responsavel por validar o acesso
    public boolean logar(String login, String senha){
        boolean validar;
        if(this.login.equals(login) && this.senha.equals(senha)){
            validar = true;
        }
        else{
            validar = false;
        }
        return validar;
    }

    // Getters and Setters
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
}
