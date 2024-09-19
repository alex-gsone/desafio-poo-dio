import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("curso java", "descrição curso java", 8);
        Curso curso2 = new Curso("curso js", "descrição curso js", 4);
        Curso curso3 = new Curso("curso CS", "descrição curso cs", 4);
        Mentoria mentoria = new Mentoria("mentoria de java", "descrição mentoria java", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("mentoria cs", "descricao mentoria cs", LocalDate.now());

        List<Conteudo> cursosList = Arrays.asList(curso1, curso2, curso3, mentoria2);

        // Convertendo cursosList para um Set
        Set<Conteudo> cursosSet = new HashSet<>(cursosList);

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer",
                new HashSet<>(cursosList));
        Bootcamp bootcamp2 = new Bootcamp("Bootcamp CS Developer", "Descrição Bootcamp CS Developer",
                cursosSet);

        Dev devCamila = new Dev("Camila", bootcamp2);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev("Joao", bootcamp2);

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