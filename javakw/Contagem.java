import java.util.Scanner;

public class Contagem{
  
 Scanner prompt = new Scanner(System.in);
  
  
    public void Contar(){
      int cont = 0, i = 0;
      System.out.print("Quantidade de Alunos: ");
      int n = prompt.nextInt();

      while (i < n){
        i = i + 1;
        System.out.print("Nota do Aluno " + i + ": ");
        int nota = prompt.nextInt();
        if (nota >= 50){
          cont++;
        }
        
      }
      System.out.println("São " + n + " alunos");
      System.out.println("São " + cont + " aprovado(s)");
 }

}