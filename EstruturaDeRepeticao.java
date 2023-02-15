public class EstruturaDeRepeticao {

public static void main(String args[]){
    int soma=0;
    int fatorial=1;
    //for(int i=0; i<17; i+=2){
       // System.out.println(i);
   // }

   //for (int i=150; i<=300; i++){
    //System.out.println(i);
  // }

    // for (int i=1; i<=1000; i++){
       // soma = soma + i;
   // }System.out.println(soma);

   //for (int i=3; i<100; i+=3){
    //System.out.println(i);
  // }

    //for (int n=1; n<=10; n++){
    //    System.out.println(n);
   // }
int fatResult = 1;
   for (int i=0; i>1; i--){
    if(i ==0){
        fatResult = 1;
        break;
    }else{
        fatResult = i * fatResult;
    }
   }
   System.out.println(fatResult);





}
}