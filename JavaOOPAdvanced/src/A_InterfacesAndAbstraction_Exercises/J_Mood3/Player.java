package A_InterfacesAndAbstraction_Exercises.J_Mood3;

public abstract class Player<T,E> implements Heroe{
    private String username;
    private T hashedPassword;
    private int level;
    private E specialPoints;


    public Player(String username, int level,E specialPoints) {
        this.setUsername(username);
        this.setLevel(level);
        this.setSpecialPoints(specialPoints);

    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s",
                this.getUsername(),
                this.getHashedPassword().toString(),
                this.getClass().getSimpleName());
    }

    private void setSpecialPoints(E specialPoints) {
        this.specialPoints = specialPoints;
    }

    @Override
    public E getSpecialPoints() {
        return this.specialPoints;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    protected void setHashedPassword(T hashedPassword){
        this.hashedPassword = hashedPassword;
    }

    @Override
    public T getHashedPassword() {
        return this.hashedPassword;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    private void setLevel(int level) {
        this.level = level;
    }

}
