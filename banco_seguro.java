
/**
 * Escreva a descrição da classe banco_seguro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.*;
public class banco_seguro
{
   public static void main()
     {
       
       Scanner input = new Scanner(System.in);
       
        int acrescentarpessoa,retirarnome,esvaziarfila,sair;
      
       char nome,fila,voltar;
       int opcao;
       int contador;
       int i;
       boolean exit=false;
       
       int array[]=new int [8];
       
       int extensaofila=0;
       String[]fila1=new String[8];
       
       
        Scanner sc;
	sc = new Scanner(System.in);
        do{
        System.out.println();
        System.out.println("****** Banco Seguro ********");
        System.out.println();
        System.out.println("1.Acrescentar uma Pessoa");
        System.out.println();
        System.out.println("2.Retirar um Nome");
        System.out.println();
        System.out.println("3.Esvaziar a Fila");
        System.out.println();
        System.out.println("0.Sair");
       
        opcao = sc.nextInt();
        if(opcao<0==opcao>4){
      
        switch(opcao){
           
            case 1:{
               if (extensaofila == 8)
               System.out.println("Fila Cheia");

              else {
                 for(i=0;i<extensaofila;i++){
                   System.out.println(fila1[i] + " ");
                }

               System.out.println("****** Banco Seguro ********");
               System.out.println();
               System.out.print("Acrescentar uma Pessoa: ");
               System.out.println();
               System.out.println("Nome:");
               fila1[extensaofila] = new Scanner (System.in).next();
               extensaofila++;
                

            }
             
                break;
            }
        
          
            case 2:{
                
                System.out.println("****** Banco Seguro ********");
                System.out.println();
                System.out.println("Retirar um nome");
                System.out.println();
                for(i=0;i<extensaofila;i++){
               
                   System.out.println(fila1[i] + " ");
                }
                
                System.out.println();
                System.out.println("Nome:");
                nome=input.next().charAt(0);
                
             if (extensaofila == 0)
               extensaofila = 0;

            if (extensaofila > 0) {

                for (i=0; i < (extensaofila - 1); ++i){
                    fila1[i] = fila1[i+1];
                }

                extensaofila--;
                

            }
            break;
        }
              
              
            
          case 3:{
               
                for(i=0;i<extensaofila;i++){
               
                   System.out.println(fila1[i] + " ");
                }
                System.out.println("****** Banco Seguro ********");
                System.out.println();
                System.out.println("A Limpar ...");
                
                System.out.println();
                
                System.out.println("Fila Limpa!");
                extensaofila = 0;
                
                break;
         }
      
            default:
            System.exit(0);
            
      }
     }
   }while(opcao<0==opcao>3);
  }
}
          
 










    
        
    


        
        
         
    



         
                
     
    





    



           
       
       
       
       

       
       
       
    



