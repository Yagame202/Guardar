package Aula.construtor;

public enum TamanhoCalca {
    Pequeno( 38),
    Medio( 40),
    Grande( 42),
    Extra_Grande( 44);

    private Integer valor;

    TamanhoCalca(Integer valor) {
        this.valor = valor;
    }
       public Integer getValor() {
            return valor;
        }
            public void setValor(Integer valor) {
                this.valor = valor;
    }
}
