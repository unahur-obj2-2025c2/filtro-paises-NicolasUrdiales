package ar.edu.unahur.obj2.filters;

import java.util.List;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroOr extends FiltroCompuesto{

    public FiltroOr(IFiltro filtro, IFiltro otroFiltro) {
        filtros.add(filtro);
        filtros.add(otroFiltro);
    }

    public FiltroOr(List<IFiltro> listaFiltros){
        filtros.addAll(listaFiltros);
    }

    public FiltroOr(IFiltro filtro) {
        filtros.add(filtro);
    }

    @Override
    public IFiltro and(IFiltro filtro) {
        return new FiltroAnd(this, filtro);
    }

    @Override
    public Boolean apply(Pais pais) {
        return filtros.stream().anyMatch(f -> f.apply(pais));
    }

}
