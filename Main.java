public class Main {
    public static void main(String[] args) {
        try {
            PatoDomestico quac = new PatoDomestico();
            quac.Brincar();
            quac.Voar();
            quac.Grasnar();
            PavaoAzul blue = new PavaoAzul();
            blue.Cantar();
            blue.mostrarCor();
            System.out.println("tudo ok");
        }catch (Exception e){
            System.out.println("erro");
        }
    }
}