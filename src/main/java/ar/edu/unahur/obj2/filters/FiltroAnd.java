package ar.edu.unahur.obj2.filters;

import java.util.List;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroAnd extends FiltroCompuesto{

    public FiltroAnd(IFiltro filtro, IFiltro otroFiltro) {
        filtros.add(filtro);
        filtros.add(otroFiltro);
    }

    public FiltroAnd(List<IFiltro> filtrosNuevos){
        filtros.addAll(filtrosNuevos);
    }

    public FiltroAnd(IFiltro filtro) {
        filtros.add(filtro);
    }
    

    @Override
    public Boolean apply(Pais pais) {
        return filtros.stream().allMatch(f -> f.apply(pais));
    }

    @Override
    public IFiltro or(IFiltro filtro) {
        return new FiltroOr(this, filtro);
    }

    
    
}
