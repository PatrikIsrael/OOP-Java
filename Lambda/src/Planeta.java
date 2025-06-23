public class Planeta {

    private String nomePlaneta;
    private boolean Habitavel;

    public Planeta(String nomePlaneta, boolean Habitavel) {
        this.nomePlaneta = nomePlaneta;
        this.Habitavel = Habitavel;
    }

    public boolean getHabitavel() {
        return Habitavel;
    }

    public void setHabitavel(boolean habitavel) {
        Habitavel = habitavel;
    }

    public String getNomePlaneta() {
        return nomePlaneta;
    }

    public void setNome(String nome) {
        this.nomePlaneta = nome;
    }


    @Override
    public String toString(){
        return nomePlaneta;
    }

    public boolean isHabitavel() {
        return Habitavel;
    }
}
