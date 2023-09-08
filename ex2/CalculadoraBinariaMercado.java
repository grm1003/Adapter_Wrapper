package ex2;

public class CalculadoraBinariaMercado {
    public String soma(String a, String b){

        int n1,n2, soma;
        n1 = Integer.parseInt(a,2);
        n2 = Integer.parseInt(b,2);
        soma = n1+n2;
        return Integer.toBinaryString(soma);
    }
    public String subtrair(String a, String b){
        int n1,n2, soma;
        n1 = Integer.parseInt(a,2);
        n2 = Integer.parseInt(b,2);
        soma = n1-n2;
        return Integer.toBinaryString(soma);
    }

}
