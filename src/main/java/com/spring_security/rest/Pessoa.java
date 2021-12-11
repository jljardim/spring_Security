package com.spring_security.rest;

public class Pessoa {
  private String nome;
  private String idade;
  private String peso;
  private String altura;
  
  
  
public Pessoa(String nome, String idade, String peso, String altura) {
	this.nome = nome;
	this.idade = idade;
	this.peso = peso;
	this.altura = altura;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getIdade() {
	return idade;
}
public void setIdade(String idade) {
	this.idade = idade;
}
public String getRua() {
	return peso;
}
public void setRua(String peso) {
	this.peso = peso;
}
public String getBairro() {
	return altura;
}
public void setBairro(String altura) {
	this.altura = altura;
}
  
}
