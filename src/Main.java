import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescricao("descricao curso python");
        curso2.setCargaHoraria(8);
        System.out.println(curso2);

        Mentoria mento1 = new Mentoria();
        mento1.setTitulo("mentoria de java");
        mento1.setDescricao("mentoria de java");
        mento1.setData(LocalDate.now());
        System.out.println(mento1);
    }
}
