package Model;

public class Usuario {
    String nomeUsuario;
    String senhaUsuario;

    public Usuario(String usuario, String senha) {
        this.nomeUsuario = usuario;
        this.senhaUsuario = senha;
    }

    public void autenticar(String nomeUsuario, String senha) {
        try {
            if ((!nomeUsuario.equals(nomeUsuario) || !senhaUsuario.equals(senha))) {
                throw new AutenticacaoException();
            }
        } catch (AutenticacaoException e) {
            System.err.println(e);
        }
    }
}
