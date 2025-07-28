import src.br.com.dio.desafio.dominio.Bootcamp;
import src.br.com.dio.desafio.dominio.Curso;
import src.br.com.dio.desafio.dominio.Dev;
import src.br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Aprenda os conceitos básicos de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Aprenda os conceitos básicos de JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Sessão de mentoria para tirar dúvidas sobre Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java do zero ao avançado");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuis = new Dev();
        devLuis.setNome("Luis");
        devLuis.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Luis:" + devLuis.getConteudosInscritos());
        devLuis.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Luis:" + devLuis.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Luis:" + devLuis.getConteudosConcluidos());
        System.out.println("XP: " + devLuis.calcularTotalXp());

        Dev devMichele = new Dev();
        devMichele.setNome("Michele");
        devMichele.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Michele:" + devMichele.getConteudosInscritos());
        devMichele.progredir();
        devMichele.progredir();
        devMichele.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Michele:" + devMichele.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Michele:" + devMichele.getConteudosConcluidos());
        System.out.println("XP: " + devMichele.calcularTotalXp());
        System.out.println("XP: " + devMichele.calcularTotalXp());
    }
}
