package ex2;

public class CalcMain {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int a = calc.somar(101,110,true);
        if(a == 1011)System.out.println("ok");
        int b = calc.subtrair(111,101,true);
        if(b == 10)System.out.println("ok");
        int c = calc.multiplicar(101,110,true);
        if(c == 11110) System.out.println("ok");
        int d = calc.somar(5,6,false);
        int e = calc.subtrair(7,5,false);
        int f = calc.multiplicar(5,6,false);
        if(Integer.parseInt(String.valueOf(a),2) == d)  System.out.println("ok");
        if(Integer.parseInt(String.valueOf(b),2) == e)  System.out.println("ok");
        if(Integer.parseInt(String.valueOf(c),2) == f)  System.out.println("ok");


    }
}
