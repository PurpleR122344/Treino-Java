
package com.mycompany.aula2;

public class aula2 {
public static int somarPontos(int pontoA, int pontoB){
        return pontoA + pontoB;
}
public static void codeIfElse (int pontos){
        if (pontos >= 60 && pontos < 80 && pontos <100){
            System.out.println ("passou do teste!!! ( maior que 60)");
        } else if(pontos >= 80 && pontos < 100)
        {
            System.out.println ("passou com nota alta!!! (maior que 80)");
        }else if (pontos == 100){
            System.out.println(" passou com nota MÁXIMA!!! (100)");
        }else{
           System.out.println ("Não passou... (menor que 60)");
        }    
}
public static void codeWhile (int energia){
        while(energia >= 0){
            System.out.println ("energia:" + energia );
            energia --;
        }
}
public static void codeFor (iint i = 1; i < 6; i++){
            System.out.println ("aluno " + i );
            if (i == 5 ){
                System.out.println(" Ultimo aluno");
                //fim do for    
    }
}
public static void main(String[] args) {
        
        codeFor (100);
        
    }
}


