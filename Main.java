import java.util.ArrayList;
import java.util.Scanner;



public class Main{
  public static void main(String []args){
          Scanner leitor = new Scanner(System.in);
          System.out.print("DIGITE O NUMERO DE FUNCIONARIOS: ");
          int cad_func = leitor.nextInt();
          for (int j = 0; j < cad_func ; j++) {  
            Funcionario f = null;
            
            System.out.print("DIGITE O ID DO FUNCIONARIO: ");
            int ID = leitor.nextInt();
            
            System.out.print("DIGITE O TIPO DO FUNCIONARIO: ");
            int TIPO_DO_FUNCIONARIO = leitor.nextInt();

            // salario 
            System.out.print("DIGITE O SALARIO : ");
            float salario = leitor.nextInt();

            // numero_de_dependente
            System.out.print("DIGITE O N_de _DEPENDENTES : ");
            int numero_de_dependente = leitor.nextInt();

            // tempo (anos quando e concursado e meses quando e temporario)
            System.out.print("DIGITE O TEMPO : "); // tratar como mes 
            int tempo = leitor.nextInt();

            // lista de dependentes 
            ArrayList<Dependente> dependentes = new ArrayList<>();

            
          
            if(TIPO_DO_FUNCIONARIO == 1)
            {

            f = new Concursado(ID,salario,tempo);
            //TEM UM CONSTRUTOR
            
            }
            else
            {
              f = new Temporario(ID,salario,tempo);
            //TEM UM CONSTRUTOR
            }
            
            for (int i = 0;( i < numero_de_dependente && i < 5 ); i++ ){
                Dependente dep = new Dependente();
                System.out.println("DIGITE A IDADE PLSE >///< : ");
                dep.setIdade(leitor.nextInt());
                dependentes.add(dep); // tipo append no python
            }
            f.setDep(dependentes);
            f.valormensal();
  }
 }
}







