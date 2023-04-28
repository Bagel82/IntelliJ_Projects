package inheritance;

public class Education extends MusicMajor {
    private boolean TC;

    public Education(boolean MusicTheory, boolean Studio, boolean AuralSkills, boolean TC) {
        super(MusicTheory, Studio, AuralSkills);
        this.TC = TC;
    }
    public void setTC(boolean TC)
    {
        this.TC = TC;
    }
    public boolean getTC()
    {
        return TC;
    }
}
