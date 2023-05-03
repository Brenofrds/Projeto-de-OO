package Acertei;
import java.time.LocalDate;

public class MenuPrincipal {

	public static void main(String[] args) {
		Questao q[] = new Questao[50];

		Edital e[] = new Edital[50];
		
		q[0] = new Questao("O Sol é uma estrela", "Astronomia");
		q[1] = new Questao("A água ferve a 100 graus Celsius ao nível do mar.", "quimica");
		q[2] = new Questao("O Brasil tem atualmente 27 estados e um Distrito Federa", "Geografia");
		q[2] = new Questao("A Constituição Federal de 1988 prevê a pena de morte como forma de punição para crimes graves", "Direito Constitucional");
		q[3] = new Questao("A carga elétrica do próton é negativa.", "Fisica");
		q[4] = new Questao("O Império Romano durou cerca de 500 anos.", "Historia");
		q[5] = new Questao("A Lei de Newton que diz que toda ação tem uma reação igual e oposta é a primeira Lei de Newton", "Fisica");
		q[6] = new Questao("O oxigênio é um gás inflamável.", "Química");
		q[7] = new Questao("A Revolução Francesa ocorreu no século XVIII.", "Historia");
			
		e[0] = new Edital("Bombeiro",
		        LocalDate.of(2023, 3, 25), // data de abertura das inscrições
		        LocalDate.of(2023, 2, 26), // data de encerramento das inscrições
		        LocalDate.of(2023, 5, 2), // data de realização da prova
		        63, "Superior", 3500);		
		e[1] = new Edital("Banco do Brasil",
		        LocalDate.of(2023,3,24), // data de abertura das inscrições
		        LocalDate.of(2023,7,14), // data de encerramento das inscrições
		        LocalDate.of(2023,8,01), // data de realização da prova
		        63, "Médio", 3500);	
		e[2] = new Edital("Policia",
		        LocalDate.of(2023,2,12 ), // data de abertura das inscrições
		        LocalDate.of(2023,6,07), // data de encerramento das inscrições
		        LocalDate.of(2023,7,12), // data de realização da prova
		        63, "Superior", 3500);	
		e[3] = new Edital("PG-DF",
		        LocalDate.of(2023,03,25), // data de abertura das inscrições
		        LocalDate.of(2023,06,13), // data de encerramento das inscrições
		        LocalDate.of(2023,07,15), // data de realização da prova
		        63, "Superior", 3500);	
		e[4] = new Edital("MPU",
		        LocalDate.of(2023,04,12 ), // data de abertura das inscrições
		        LocalDate.of(2023,06,12 ), // data de encerramento das inscrições
		        LocalDate.of(2023,07,11 ), // data de realização da prova
		        63, "Superior", 3500);	
		e[5] = new Edital("Professor",
		        LocalDate.of(2023,04,01 ), // data de abertura das inscrições
		        LocalDate.of(2023,07,04), // data de encerramento das inscrições
		        LocalDate.of(2023,10,30), // data de realização da prova
		        63, "Superior", 3500);	
		e[6] = new Edital("Policial penal",
		        LocalDate.of(2023,06,07), // data de abertura das inscrições
		        LocalDate.of(2023,9,04), // data de encerramento das inscrições
		        LocalDate.of(2023,10,12), // data de realização da prova
		        63, "Superior", 3500);	
		
        
	} 
	
	public static void listarTodasQuestoes(Questao[] questoes) {
        for (int i = 0; i < questoes.length; i++) {
            if (questoes[i] != null) {
            	System.out.println("------------------------------------------------");
                System.out.println((i+1) + ") Questão: " + questoes[i].getQuestao());
            }
        }
	
	}	
	public static void buscarQuestoesPorMateria(Questao[] questoes, String materia) {
	    System.out.println("Questões de " + materia + ":");
	    for (int i = 0; i < questoes.length; i++) {
	        if (questoes[i] != null && questoes[i].getMateria().equalsIgnoreCase(materia)) {
	        	System.out.println("--------------------------------------------------");
	            System.out.println((i) + ") " + questoes[i].getQuestao());
	        }
	    }
	}
	public static void listarEditaisComInscricoesAbertas(Edital[] editais) {
	    LocalDate hoje = LocalDate.now();
	    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	    System.out.println("Editais com inscrições abertas:");
	    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	    for (int i = 0; i < editais.length; i++) {
	        if (editais[i] != null && editais[i].getDataInscricao() != null && hoje.isAfter(editais[i].getDataInscricao()) && hoje.isBefore(editais[i].getDataFimInscricao())) {
	            System.out.println("--------------------------------------------------");
	            System.out.println("Edital: " + editais[i].getNome());
	            System.out.println("Data de abertura: " + editais[i].getDataInscricao());
	            System.out.println("Data de encerramento: " + editais[i].getDataFimInscricao());
	            System.out.println("Data da prova: " + editais[i].getDataProva());
	            System.out.println("Número de vagas: " + editais[i].getVagas());
	            System.out.println("Nível de escolaridade: " + editais[i].getEscolaridade());
	            System.out.println("Salário: R$" + editais[i].getValorInscricao());
	        }
	    }
	}
	public static void listarEditaisComInscricoesQueAbrirá(Edital[] editais) {
	    LocalDate hoje = LocalDate.now();
	    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	    System.out.println("Editais que ainda iram abrir: ");
	    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	    for (int i = 0; i < editais.length; i++) {
	        if (editais[i] != null && editais[i].getDataInscricao() != null && hoje.isBefore(editais[i].getDataInscricao()) && hoje.isBefore(editais[i].getDataFimInscricao())) {
	            System.out.println("Edital: " + editais[i].getNome());
	            System.out.println("Data de abertura: " + editais[i].getDataInscricao());
	            System.out.println("Data de encerramento: " + editais[i].getDataFimInscricao());
	            System.out.println("Data da prova: " + editais[i].getDataProva());
	            System.out.println("Número de vagas: " + editais[i].getVagas());
	            System.out.println("Nível de escolaridade: " + editais[i].getEscolaridade());
	            System.out.println("Salário: R$" + editais[i].getValorInscricao());
	            System.out.println("--------------------------------------------------");
	        }
	    }
	}


}