public class Usuario {
    
        public static void main(String[] args) throws Exception {
            SmartTv smartTv = new SmartTv();

            System.out.println("Tv ligada? " + smartTv.ligada);
            System.out.println("Canal padrao: " + smartTv.canal);
            System.out.println("Volume padrao: " + smartTv.volume);

            smartTv.ligarTv();
            System.out.println("\nTv ligada? " + smartTv.ligada);

            smartTv.desligarTv();
            System.out.println("Tv ligada? " + smartTv.ligada);

            System.out.println("\nCanal atual: " + smartTv.canal);

            smartTv.aumentarCanal();
            System.out.println("Canal depois de aumentar: " + smartTv.canal);

            smartTv.diminuirCanal();
            System.out.println("Canal depois de diminuir: " + smartTv.canal);

            smartTv.inserirCanal(13);
            System.out.println("Canal inserido: " + smartTv.canal);

            smartTv.aumentarVolume();
            System.out.println("\nVolume aumentado: " + smartTv.volume);

            smartTv.diminuirVolume();
            System.out.println("Volume diminuido: " + smartTv.volume);

            
    }
}
