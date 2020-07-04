// classe concursado 
public class Concursado extends Funcionario{

  private int tempoAnos;
  public float salario;

  public Concursado(int id, float salario, int tempoAnos) {
    super(id, salario);
    this.tempoAnos = tempoAnos;
  }

  @Override
  public float valormensal() {
        float deps = this.verificade_pendentes_por_funcionario(21) * 100;
        float anos = this.tempoAnos * 100;
        System.out.printf("Valor Mensal: " + (deps + anos + this.salario));
        return deps + anos + this.salario;
    }

}
