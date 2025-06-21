package dados;

import entidades.Livro;
import entidades.Usuario;
import java.util.List;

public final class DadosMockados {
    public static List<Livro> getLivrosIniciais() {
        return List.of(
                new Livro(1, "1984", "George Orwell", "Ficção Distópica", 1949),
                new Livro(2, "O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia", 1954),
                new Livro(3, "Dom Quixote", "Miguel de Cervantes", "Romance", 1605),
                new Livro(4, "Orgulho e Preconceito", "Jane Austen", "Romance", 1813),
                new Livro(5, "Crime e Castigo", "Fiódor Dostoiévski", "Romance Psicológico", 1866),
                new Livro(6, "Cem Anos de Solidão", "Gabriel García Márquez", "Realismo Mágico", 1967),
                new Livro(7, "A Revolução dos Bichos", "George Orwell", "Sátira Política", 1945),
                new Livro(8, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Fábula", 1943),
                new Livro(9, "Hamlet", "William Shakespeare", "Tragédia", 1603),
                new Livro(10, "A Divina Comédia", "Dante Alighieri", "Poema Épico", 1320)
        );
    }

//    public static List<Usuario> getUsuariosIniciais() {
//        return List.of(
//                new Usuario(1, "Felipe Silva", "felipe@email.com"),
//                new Usuario(2, "Maria Oliveira", "maria@email.com"),
//                new Usuario(3, "Carlos Pereira", "carlos@email.com"),
//                new Usuario(4, "Ana Santos", "ana@email.com"),
//                new Usuario(5, "Pedro Costa", "pedro@email.com")
//        );
//    }
}