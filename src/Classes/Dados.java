
package Classes;

/**
 *
 * @author RandersonThallys
 */
public class Dados {
    
    public boolean validarUsuarios (String usuario, String senha){
        
        if(usuario.equals("Randerson")&& senha.equals("123456")){
            
         return true;
        }else{
            return false;
        }
    }
    
}
