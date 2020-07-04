import java.util.*;


class Funcionario{

  private int id;
  private float salario;
  public ArrayList<Dependente> dep;
  public void setDep (ArrayList<Dependente> dep )
  {
      this.dep = dep;
  }

  public Funcionario(int id, float salario){
    this.id = id;
    this.salario = salario;
  }

  public int verificade_pendentes_por_funcionario(int idade) {
        int quantidade_Dependentes = 0;

        for (Dependente de : this.dep) {
            if (de.getIdade() <= idade) {
                quantidade_Dependentes++;
            }

        }

        return quantidade_Dependentes;

    }

  public float valormensal() {
    return 0;
  }

   public void imprimefuncionario() {
        //System.out.println("ID: " + this.codigoFuncionario);
        //System.out.println("Salario: " + valorMensalFuncionario());
        for (Dependente de : dep) {
            System.out.println("idade dependente: " + de.getIdade());
        }
    }

}

