package com.example.demo.models;

public class Usuario {
	private String email;
	private String password;
	
	public Usuario() {}

	public Usuario(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", password=" + password + "]";
	}
}
