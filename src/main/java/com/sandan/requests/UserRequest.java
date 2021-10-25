package com.sandan.requests;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserRequest {

	//@NotBlank ne peut pas passe des champs vide  , @NotEmpty en peut passe dans le champs des esapces 
	@NotBlank(message = "ce champs ne doit pas etre null ")
	@Size(min = 3, max = 50, message = " ce champ doit etre entre 3 et 50 caractaire")
	private String firstName;

	@NotBlank(message = "ce champs ne doit pas etre null ")
	@Size(min = 3, max = 50, message = " ce champ doit etre entre 3 et 50 caractaire")
	private String lastName;

	@NotBlank(message = "ce champs ne doit pas etre null ")
	@Email
	private String email;

	@NotBlank(message = "ce champs ne doit pas etre null ")
	@Size(min = 4, message = " ce champ doit etre avoir au mois 4 caractaires")
	@Size(max = 16, message = " ce champ doit etre avoir au maximum 4 caractaires")
	@Pattern(regexp ="(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$" , message = "ce  mot de pass doit avoir correct format")
	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
