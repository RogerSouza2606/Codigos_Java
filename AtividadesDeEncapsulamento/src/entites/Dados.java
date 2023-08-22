package entites;

public class Dados {

	private String nome;
	private String e_mail;
	private String senha;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return e_mail;
	}
	public void setEmail(String email) {
		this.e_mail = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void obterDadosUsuarios() {
		System.out.println("Nome do usuário: " + nome);
		System.out.println("e-mail do usuário: " + e_mail);
		
	}
	
	
	
	
}
