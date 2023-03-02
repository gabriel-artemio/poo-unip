package login;
import interfaceLogin.LoginInterface;
import javax.swing.JOptionPane;

public class Login {
    
    public String usuario;
    public String senha;
    
    public static void main(String[] args) {
        // TODO code application logic here
        LoginInterface app = new LoginInterface();
        
        app.setVisible(true);
        app.setTitle("Login Java");
        app.setResizable(false);
        app.setLocationRelativeTo(null);
    }
    
    public void Logar(String usuario, String senha){
        try {
            if ("admin".equals(usuario) && "123".equals(senha)) {
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Dados incorretos");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
}