package controller;

import model.UsuarioGOFFM;
import model.Formulario;
import model.UsuarioReceituario;

public class FabricaReceituario implements FabricaDeFormulario {

	@Override
	public Formulario criarFormulario() {
		return new UsuarioReceituario();
	}

}
