package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    int cargaHoraria;

    public Curso(){}

    
    @Override
    public double calcularXP() {
        // TODO Auto-generated method stub
        return XP_PADRAO * cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + 
        ", descricao=" + getDescricao() + 
        ", cargaHoraria=" + cargaHoraria + "]";
    }

    
}
