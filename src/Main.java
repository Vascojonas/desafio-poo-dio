import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Descricao  curso java");
		curso1.setCargaHoraria(8);
		curso1.setTitulo("Curso de Java");

		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso de JS");
		curso2.setDescricao("Descricao  curso Js");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descricao da mentoria de Java");
		mentoria.setData(LocalDate.now());
		
		
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java developer");
		bootcamp.setDescricao("Descricao bootcamp Java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		
		Dev devVasco = new Dev();
		devVasco.setNome("Vasco Jonas Mabui");
		devVasco.inscreverBootcamp(bootcamp);

		System.out.println("-------------Antes da progressao");
		System.out.println("Conteudos inscritos "+ devVasco.getConteudosInscritos());
		System.out.println("Conteudos Concluidos "+ devVasco.getConteudosConcluidos());
		System.out.println("XP: "+devVasco.calcularTotalXp());
		
		devVasco.progredir();
		devVasco.progredir();
		System.out.println("--------------Depois da progressao");
		System.out.println("Conteudos inscritos "+ devVasco.getConteudosInscritos());
		System.out.println("Conteudos Concluidos "+ devVasco.getConteudosConcluidos());
		System.out.println("XP: "+devVasco.calcularTotalXp());
		
		
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		
		System.out.println("-------------Antes da progressao");
		System.out.println("Conteudos inscritos "+ devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluidos "+ devCamila.getConteudosConcluidos());
		System.out.println("XP: "+devCamila.calcularTotalXp());
		
		devCamila.progredir();
		System.out.println("--------------Depois da progressao");
		System.out.println("Conteudos inscritos "+ devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluidos "+ devCamila.getConteudosConcluidos());
		System.out.println("XP: "+devCamila.calcularTotalXp());
		
		
		
		
		
	}

}
