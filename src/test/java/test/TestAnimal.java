package test;

import org.junit.Test;

import dto.DtoCategory;
import dto.DtoPet;
import net.bytebuddy.utility.RandomString;

public class TestAnimal extends core.Base {

	@Test
	public void cadastraNovoPet() {
		
		System.out.println("Exercicio A - 2 " + RandomString.make(6));
		
		DtoCategory category = new DtoCategory().criarCategoriaDog();
		DtoPet pet = new DtoPet().criarPet(1,"Mel", category);
		
		realizarPost(pet, "/pet");

	}
	
}
