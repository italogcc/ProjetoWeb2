package controller;

import model.UsuarioGOFFM;
import model.Formulario;
import model.UsuarioProntuario;

public class FabricaProntuario implements FabricaDeFormulario {

	@Override
	public Formulario criarFormulario() {
		return new UsuarioProntuario();
	}

}