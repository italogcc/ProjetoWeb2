// GOF FactoryMethod para prontuário, receituário e exames dos usuários

package model;

import controller.FabricaDeFormulario;
import controller.FabricaProntuario;
import controller.FabricaReceituario;
import controller.FabricaExame;

public class UsuarioGOFFM {
	public static void main(String[] args) {
		FabricaDeFormulario fabrica = new FabricaProntuario();
		Formulario formulario = fabrica.criarFormulario();
		formulario.exibirInfo();
		System.out.println();

		fabrica = new FabricaReceituario();
		formulario = fabrica.criarFormulario();
		formulario.exibirInfo();
		System.out.println();

		fabrica = new FabricaExame();
		formulario = fabrica.criarFormulario();
		formulario.exibirInfo();
		System.out.println();
	}
}