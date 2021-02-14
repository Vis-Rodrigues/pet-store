package test;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import dto.DtoUser;

public class TesteUser  extends core.Base{
	
	@Test
	public void cadastraNovoUsuario() {
		// Criar um usuário e adicionar os dados no objeto
		System.out.println("Exercicio A - 1");
		DtoUser user = new DtoUser();
		user.id = 1;
		user.username = "lucia.nogueira";
		user.firstName = "Lucia";
		user.lastName = "Nogueira";
		user.email = "luci@gmail.com";
		user.password = "Pet@132456";
		user.phone = "970707070";
		user.userStatus = 1;

		given()
			.body(user)
		.when()
			.post("/user")
		.then()
			.statusCode(200).log().all();

	}
	
	@Test
	public void cadastraNovoUser()  {			
		
		DtoUser userDto = new DtoUser();
		userDto.id = 1;
		
		userDto.username = "Isadora ";
		
		userDto.firstName = "";
		
		userDto.lastName = "Oliveira";
		
		userDto.email = "isadora.oliveira@teste.com";
		
		userDto.password = "123456";
		
		userDto.phone = "11999999999";
		
		userDto.userStatus = 1;
		
		realizarPost(userDto,"/user");
			
		}
	

}
