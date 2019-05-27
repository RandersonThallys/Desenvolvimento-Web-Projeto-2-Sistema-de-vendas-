
package Classes;

/**
 *
 * @author RandersonThallys
 */


public class Dados {
    
    
    
    private Usuario Musuarios[]= new Usuario [50];
    private int countusuario = 0;
    
    
public Dados(){
    Usuario Musuario = new Usuario("Randerson", "Randerson1", "Randerson", "123456", "1");
    Musuarios[countusuario]=Musuario;
    countusuario ++;
}
    public Usuario[] getUsuarios(){
        return Musuarios;
    }
    public boolean validarUsuario(String usuario, String senha){
        boolean x = false;
        for(int i=0;i <countusuario; i++){
            
        if (Musuarios[i].getCodusuario().equals(usuario)&& Musuarios[i].getSenha().equals(senha)){
        return true;
        
        
          
        }
        }
        return false;
    }  
}

    
 