// classe Temporario
public class Temporario extends Funcionario{

  private int tempoMeses;
  private float salario;
    public Temporario(int id, float salario, int tempoMeses) {
      super(id, salario);
      this.tempoMeses = tempoMeses;
    }

    @Override
    public float valormensal() {
        float deps = this.verificade_pendentes_por_funcionario(18) * 50;
        float anos = this.tempoMeses * 50;
        System.out.printf("Valor Mensal: " + (deps + anos + this.salario));
        return deps + anos + this.salario;
    }

}



