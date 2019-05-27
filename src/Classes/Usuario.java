
package Classes;

/**
 *
 * @author RandersonThallys
 */
public class Usuario {
    
    private String codusuario;
    private String nome;
    private String sobrenome;
    private String senha;
    private String perfil;

    public Usuario(String codusuario, String nome, String sobrenome, String senha, String perfil) {
        this.codusuario = codusuario;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(String codusuario) {
        this.codusuario = codusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
   
    
    
    
    
}
