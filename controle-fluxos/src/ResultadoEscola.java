public class ResultadoEscola {
    public static void main(String[] args) {
        int nota = 6;
        
        // if(nota >= 7){
        //     System.out.println("Aprovado");
        // }else if(nota > 5 && nota < 7){
        //     System.out.println("Recuperação");
        // }else{
        //     System.out.println("Reprovado");
        // }

        String resultado = nota >= 7 ? "Aprovado" : nota < 7 && nota >5 ? "Recuperacao" : "Reprovado";
        System.out.println(resultado);
        
    }
}
