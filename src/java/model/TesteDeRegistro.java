package model;

import java.util.Iterator;
import java.util.Vector;
import model.UsuarioModel;
import model.UsuarioModelDAO;

public class TesteDeRegistro {

    public static void main(String[] args) {
        UsuarioModel usuariomodel = new UsuarioModel();
        UsuarioModelDAO usuariomodeldao = new UsuarioModelDAO();
        usuariomodel.setMatricula("1");
        usuariomodel.setNome("Ramide");
        usuariomodel.setSobrenome("Dantas");
        usuariomodel.setIdPessoal01("38316227100");
        usuariomodel.setIdPessoal02("542789");

        usuariomodeldao.insere(usuariomodel);

        Vector<UsuarioModel> resultado = usuariomodeldao.buscar("38316227100");

        for (Iterator<UsuarioModel> iterator = resultado.iterator();
                iterator.hasNext();) {
            UsuarioModel p = iterator.next();
            System.out.println("Registro encontrado: " + p.getNome());
        }
        usuariomodel.setNome("Ramide");

        usuariomodeldao.atualizar(usuariomodel);

        resultado = usuariomodeldao.buscar("38316227100");

        for (Iterator<UsuarioModel> iterator = resultado.iterator(); iterator
                .hasNext();) {
            UsuarioModel p = iterator.next();
            System.out.println("Registro encontrado: " + p.getNome());
        }

        usuariomodeldao.apagar("38316227100");

        resultado = usuariomodeldao.buscar("38316227100");

        if (resultado.size() == 0) {
            System.out.println("Registro apagado com sucesso");
        } else {
            System.out.println("O registro permanece no banco de dados");
        }

    }
}
