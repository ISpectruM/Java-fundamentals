package E_Reflection_Exercises.D_BarracksWars_TheCommandsStrikeBack.pr0304Barracks.models.units;

public class Archer extends AbstractUnit {
    private static final int ARCHER_HEALHT = 25;
    private static final int ARCHER_DAMAGE = 7;

    public Archer() {
        super(ARCHER_HEALHT, ARCHER_DAMAGE);
    }
}