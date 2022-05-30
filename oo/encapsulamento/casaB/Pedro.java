package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	Ana mae = new Ana();
	void testarAcessos() {
	
		//System.out.println(mae.segredo);
		//System.out.println(mae.dentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSambem);
		System.out.println(mae.todosSambem);
	}

}
