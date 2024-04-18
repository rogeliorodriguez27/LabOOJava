package one.digitalinovation.laboojava.entidade.constantes;

/**
 * Materias dos cadernos vendidos.
 * @author rogelio
 */
public enum Materias {

    M2(2),

    M5(5),

    M10(5);

    private int fator;

    /**
     * Construtor.
     * @param fator Valor por tipo que influencia no cálculo do frete.
     */
    Materias(int fator) {
        this.fator = fator;
    }

    public int getFator() {
        return fator;
    }
}
