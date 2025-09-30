package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroPorAreaMayorA extends Filtro{
    private final Integer tamanioASuperar;
    @Override
    public Boolean apply(Pais pais) {
        return pais.getArea() > tamanioASuperar; 
    }
    public FiltroPorAreaMayorA(Integer tamanioASuperar) {
        this.tamanioASuperar = tamanioASuperar;
    }

    
    
    
}
