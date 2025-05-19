public class NomeIniciaCom implements Criterio<Planeta> {
    private String prefixo;

    public NomeIniciaCom(String prefixo) {
        this.prefixo = prefixo;
    }

   @Override
    public boolean atende(Planeta planeta){
        return planeta.getNomePlaneta().startsWith(prefixo);
    }

}
