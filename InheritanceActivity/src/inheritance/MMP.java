package inheritance;

public class MMP extends MusicMajor {
    private boolean Production;

    public MMP(boolean MusicTheory, boolean Studio, boolean AuralSkills, boolean Production) {
        super(MusicTheory, Studio, AuralSkills);
        this.Production = Production;
    }
    public void setP(boolean Production)
    {
        this.Production = Production;
    }
    public boolean getP()
    {
        return Production;
    }

}
