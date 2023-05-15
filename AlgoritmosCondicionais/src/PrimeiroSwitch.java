public class PrimeiroSwitch {
    public static void main(String[] args) {

        // switch (<variavel validando>) {
            //case <variavel seja igual a esse valor>:
                
            //    break;
    
            //default:
            //    break;
        // }

        String moeda = "EURO";

        switch (moeda) {
            case "REAL":
                System.out.println("R$");
                break;
            case "DOLAR":
                System.out.println("$");
                break;
            default:
                System.out.println("MOEDA INDEFINIDA");
                break;
        }

    }
}
