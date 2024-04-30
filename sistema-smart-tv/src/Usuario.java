public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: " +smartTv.ligada);
        System.out.println("Canal Atual: " +smartTv.canal);
        System.out.println("Volume Atual: " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status da TV: " +smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status da TV: " +smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " +smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " +smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " +smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " +smartTv.canal);

        smartTv.mudarCanal(16);
        System.out.println("Canal Atual: " +smartTv.canal);



    }
    
}
