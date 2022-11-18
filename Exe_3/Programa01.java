public class Programa01 {
    public static void main (String entrada[])
    {
        int NumInt;
        double NumReal, Soma;
        char Caracter;

        NumInt = Integer.parseInt(entrada[0]);
        NumReal = Double.parseDouble(entrada[1]);
        Caracter = (entrada[2]).charAt(0);

        Soma = (double)NumInt + NumReal;

        System.out.println((double)NumInt + " + " + NumReal + " = " + Soma + " sinal " + Caracter);

        System.exit(0);
    }
}
