package Acertei;

public class Questao {
	//Atributos
	private String questao;
	private String materia;
	
	//Metodos Publicos
	
	//apresentarQuestao()
	public void apresentar() {
		System.out.println("Quest�o: " + this.getQuestao());
		System.out.println("Materia: " + this.getMateria());
	}
	
	//removerQuestao()
	public void removerQuestao() {
		this.setQuestao("Quest�o removida");
		this.setMateria("Materia removida");
	}
	
	//Construtor
	public Questao(String questao, String materia) {
		this.questao = questao;
		this.materia = materia;
	}
	
	//Metodos Especiais
	public String getQuestao() {
		return questao;
	}
	public void setQuestao(String questao) {
		this.questao = questao;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	

}