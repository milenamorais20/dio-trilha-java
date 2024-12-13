public class PlanoOperadora {
    public static void main(String[] args) {
        //PLANO BÁSICO:
            //100 MINUTOS DE LIGAÇÃO
        //PLANO MÉDIO:
            //100 MINUTOS DE LIGAÇÃO
            //WHATSAPP E INSTAGRAM DE GRACA
        //PLANO TURBO:
            //100 MINUTOS DE LIGAÇÃO
            //WHATSAPP E INSTAGRAM DE GRACA
            //5GB YOUTUBE

        String plano = "M";

        switch (plano) {
            case "T":
                System.out.println("5GB YOUTUBE");
            case "M":
                System.out.println("WHATSAPP E INSTAGRAM DE GRACA");
            case "B":
                System.out.println("100 MINUTOS DE LIGACAO");
        }
    }
}
