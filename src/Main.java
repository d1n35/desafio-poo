import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescricao("descricao curso python");
        curso2.setCargaHoraria(8);

        Mentoria mento1 = new Mentoria();
        mento1.setTitulo("mentoria de java");
        mento1.setDescricao("mentoria de java");
        mento1.setData(LocalDate.now());
        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mento1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Java Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mento1);

        Dev devMario = new Dev();
        devMario.setNome("Mario");
        devMario.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devMario.getConteudosIncritos());
        devMario.progredir();
        System.out.println("Conteudos inscritos " + devMario.getConteudosIncritos());
        System.out.println("Conteudos concluidos " + devMario.getConteudosConcluidos());
        System.out.println("XP: " + devMario.calcularTotalXP());

        System.out.println("----------------------------------");

        Dev devBala = new Dev();
        devBala.setNome("Bala");
        devBala.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devBala.getConteudosIncritos());
        devBala.progredir();
        devBala.progredir();
        devBala.progredir();
        System.out.println("Conteudos inscritos " + devBala.getConteudosIncritos());
        System.out.println("Conteudos concluidos " + devBala.getConteudosConcluidos());
        System.out.println("XP: " + devBala.calcularTotalXP());
    }
}
