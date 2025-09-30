package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class PorIdioma  extends Filtro{
    private String idioma;
    @Override
    public Boolean apply(Pais pais) {
        return pais.getIdiomas().contains(idioma);
    }
    
}
