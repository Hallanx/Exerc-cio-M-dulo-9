//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) {
        long nota1 = 10;
        long nota2 = 8;
        long nota3 = 1;
        long nota4 = 5;

        long resultado = nota1 + nota2 + nota3 + nota4;

        System.out.println(resultado / 4);

        // Agora vamos chamar o método da outra classe
        Wrappers.printAverage(); // Chama o método estático da classe Wrappers
    }
}

class Wrappers {
    public static void printAverage() {
        Long nota1 = 10l;
        Long nota2 = 8l;
        Long nota3 = 1l;
        Long nota4 = 5l;

        Long resultado = nota1 + nota2 + nota3 + nota4;

        System.out.println(resultado / 4);
    }
}