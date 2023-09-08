public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Marca? " + smartTv.marca);
        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Tv Canal? " + smartTv.canal);
        System.out.println("Tv Programa? " + smartTv.programacao);
        System.out.println("Tv Volume? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.desligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(10);

        smartTv.aumentarCanal();
        System.out.println("Novo Canal: " + smartTv.canal);
    }
}
