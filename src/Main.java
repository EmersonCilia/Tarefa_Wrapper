public class Main {

    public static void main(String[] args) {

        int valorPrimitivo = 42;
        System.out.println("Numero primitivo: "+valorPrimitivo);

        Integer valorWrapper = Integer.valueOf(valorPrimitivo);
        System.out.println("Numero wrapper: "+valorWrapper);

    }
}