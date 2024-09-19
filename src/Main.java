import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("curso java", "descrição curso java", 8 );
//        curso1.setTitulo("curso java");
//        curso1.setDescricao("descrição curso java");
//        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso("curso js", "descrição curso js", 4);
//        curso2.setTitulo("curso js");
//        curso2.setDescricao("descrição curso js");
//        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso("curso CS", "descrição curso cs", 4);

        Mentoria mentoria = new Mentoria("mentoria de java", "descrição mentoria java", LocalDate.now());
//        mentoria.setTitulo("mentoria de java");
//        mentoria.setDescricao("descrição mentoria java");
//        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria("mentoria cs", "descricao mentoria cs", LocalDate.now());
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);

        List<Conteudo> cursosList = Arrays.asList(curso1, curso2, curso3);

        // Convertendo para um Set
        Set<Conteudo> cursosSet = new HashSet<>(cursosList);


        Bootcamp bootcamp2 = new Bootcamp("Bootcamp CS Developer", "Descrição Bootcamp CS Developer", cursosSet);
//        bootcamp2.getConteudos().add(curso1);
//        bootcamp2.getConteudos().add(curso2);
//        bootcamp2.getConteudos().add(curso3);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
//        System.out.println(devCamila.getNome());
        devCamila.inscreverBootcamp(bootcamp2);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
