//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        long nota1 = 10;
        long nota2 = 8;
        long nota3 = 1;
        long nota4 = 5;

        Long nota1Wrapper = Long.valueOf(nota1);
        Long nota2Wrapper = Long.valueOf(nota2);
        Long nota3Wrapper = Long.valueOf(nota3);
        Long nota4Wrapper = Long.valueOf(nota4);

        Long resultadoWrapper = nota1Wrapper + nota2Wrapper + nota3Wrapper + nota4Wrapper;

        long resultado = resultadoWrapper.longValue();

        System.out.println(resultado / 4);
    }
}