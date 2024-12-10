public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        int idade= 123;
        short ano = 2021;
        int cep = 21070333; // Se começar com zero, trocar o int por string, pois talvez o código não entenda
        long cpf = 12345678911L;// Se começar com zero, trocar o int por string, pois talvez o código não entenda
        float pi = 3.14F; // Sempre por o F no final, pois sem ele, o código entende como se fosse double e pode dar erro
        double salarioMinimo = 2500.33;

        short numeroShort1 = 1;
        int numeroInt = numeroShort1;
        short numeroShort2 = (short) numeroInt;
        

    }
}
