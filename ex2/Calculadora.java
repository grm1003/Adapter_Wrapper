package ex2;

public class Calculadora {
    CalculadoraBinariaMercado bin = new CalculadoraBinariaMercado();
    int somar(int numero1, int numero2, boolean Ehbinario){
        String binario = null;
        int result = 0;
        if(Ehbinario) binario = bin.soma(String.valueOf(numero1),String.valueOf(numero2));
        else result = numero1+numero2;
        if(binario == null)return result;
        else return Integer.parseInt(binario);
    }

    int subtrair(int numero1, int numero2, boolean Ehbinario){
        String binario = null;
        int result = 0;
        if(Ehbinario) binario = bin.subtrair(String.valueOf(numero1),String.valueOf(numero2));
        else result = numero1-numero2;
        if(binario == null)return result;
        else return Integer.parseInt(binario);
    }
    int multiplicar(int numero1, int numero2, boolean Ehbinario){
        int n1 = Integer.parseInt(Integer.toBinaryString(numero1),2);
        int n2 = Integer.parseInt(Integer.toBinaryString(numero2),2);
        String binario = null;
        int result = 0;
        if(Ehbinario) binario = String.valueOf(n1*n2);
        else result = numero1*numero2;
        if(binario == null)return result;
        else return Integer.parseInt(binario);
    }


}
