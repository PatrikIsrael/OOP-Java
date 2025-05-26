import entidades.Livro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("1984", "George Orwell", 001, false);
        Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes", 002, true);

        livro1.emprestar();
        System.out.println(livro1);
        System.out.println(livro2);
    }
}