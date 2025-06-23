import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista<T> {
    private final List<T> elementos;

    public Lista(List<T> elementos) {
        this.elementos = new ArrayList<>(elementos);
    }

    public Lista<T> coletar(Criterio<T> criterio) {
        return new Lista<>(
                elementos.stream()
                        .filter(criterio.toPredicate())
                        .collect(Collectors.toList())
        );
    }

    public List<T> toList() {
        return new ArrayList<>(elementos);
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}