package A_InterfacesAndAbstraction_Exercises.J_Mood3;

public interface Heroe<T, E> {
    String getUsername();
    T getHashedPassword();
    int getLevel();
    E getSpecialPoints();
    E getPointsResult();
}
