package controller;

import model.UsuarioGOFFM;
import model.Formulario;
import model.UsuarioExame;

public class FabricaExame implements FabricaDeFormulario {

	@Override
	public Formulario criarFormulario() {
		return new UsuarioExame();
	}

}
