public class ArithmeticMeanArbitrary {
    public static void main(String[] args) {
        if ( args.length<2 ) {
            System.out.println("Syntax: ArithmeticMeanArbitrary <Number 1> <Number 2> ... <Number n>");
        } else {
            float valueSum=0;
            for (String a: args) valueSum=valueSum+Float.valueOf(a).floatValue();
            System.out.println("Arithmetic mean: " + valueSum/args.length);
        }
    }
}