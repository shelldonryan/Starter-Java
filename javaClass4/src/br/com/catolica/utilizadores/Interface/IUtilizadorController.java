package br.com.catolica.utilizadores.Interface;

import java.util.ArrayList;
import br.com.catolica.utilizadores.Model.Utilizador;

public interface IUtilizadorController {
    boolean adicionarUtilizador(Utilizador obj);

    Utilizador buscarPorId(int id);

    ArrayList<Utilizador> listaTodosUtilizadores();

    boolean removerUtilizador(Utilizador utilizador);
}
