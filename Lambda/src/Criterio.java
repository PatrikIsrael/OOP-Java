import java.util.function.BiPredicate;
import java.util.function.Predicate;

public interface Criterio<T> {
    boolean atende(T elemento);

    // Operações lógicas
    default Criterio<T> and(Criterio<T> outro) {
        return elemento -> this.atende(elemento) && outro.atende(elemento);
    }

    default Criterio<T> or(Criterio<T> outro) {
        return elemento -> this.atende(elemento) || outro.atende(elemento);
    }

    default Criterio<T> negate() {
        return elemento -> !this.atende(elemento);
    }

    // Conversão para Predicate
    default Predicate<T> toPredicate() {
        return this::atende;
    }

    // Métodos estáticos de fábrica
    static <T> Criterio<T> sempre() {
        return elemento -> true;
    }

    static <T> Criterio<T> nunca() {
        return elemento -> false;
    }

    static <T> Criterio<T> fromPredicate(Predicate<T> predicate) {
        return predicate::test;
    }

    // Método para critérios com parâmetro
    static <T, P> Criterio<T> criar(BiPredicate<T, P> predicate, P parametro) {
        return elemento -> predicate.test(elemento, parametro);
    }
}