package trabalho7pc3CarolinaAtaide.persistence;

import java.sql.Connection;

public class Teste {

	public static void main(String[] args) {

		  Connection con = ConnectionFactory.getConnection();
		 

		// Testando o método Save
		/*
		 * AlunoDaoImp ad = new AlunoDaoImp(); Aluno a = new Aluno(); a.setMatricula(6);
		 * a.setNome("Maria Paula"); a.setRa("Taguatinga");
		 * System.out.println(ad.save(a));
		 */

		/*
		 * Testando o método update AlunoDaoImp ad = new AlunoDaoImp(); Aluno a = new
		 * Aluno(); a.setMatricula(6); a.setNome("Maria Paula Almeida");
		 * a.setRa("Taguatinga Norte"); System.out.println(ad.update(a));
		 */

		/*
		 * Testando o delete AlunoDaoImp ad = new AlunoDaoImp();
		 * System.out.println(ad.delete(6));
		 */

		/*
		 * Testando o metodo list AlunoDaoImp ad = new AlunoDaoImp(); List<Aluno> alunos
		 * = ad.list(); if (alunos != null) { for (Aluno al : alunos) {
		 * System.out.println("Aluno: " + al.getNome()); } }
		 */

		/*
		 * Testando a pesquisa por matrícula AlunoDaoImp ad = new AlunoDaoImp(); Aluno
		 * aluno = ad.findByMatricula(3); if(aluno != null){
		 * System.out.println(aluno.getNome()); }
		 */
	}

}
