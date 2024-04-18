package one.digitalinovation.laboojava.entidade;

import one.digitalinovation.laboojava.entidade.constantes.Materias;

/**
 * Classe que representa um caderno, qual é uma especialização de um produto da loja.
 * @author rogelio
 */
public class Caderno extends Produto {

    
    /**
     * tipo do caderno.
     */
    private Materias materias;

    
    public Materias getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias = materias;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public double calcularFrete() {
        return (getPreco() * getQuantidade()) + ( materias.getFator());
    }

    @Override
    public String toString() {
        return "Caderno{" +
                "materias='" + materias + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preço='" + getPreco() + '\'' +
                '}';
    }
}
