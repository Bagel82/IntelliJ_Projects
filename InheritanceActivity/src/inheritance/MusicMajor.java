package inheritance;

public class MusicMajor {
    private boolean MusicTheory;
    private boolean Studio;
    private boolean AuralSkills;

    public MusicMajor(boolean MusicTheory, boolean Studio, boolean AuralSkills) {
        this.MusicTheory = MusicTheory;
        this.Studio = Studio;
        this.AuralSkills = AuralSkills;
    }
    public void setMT(boolean MusicTheory)
    {
        this.MusicTheory = MusicTheory;
    }
    public void setS(boolean Studio)
    {
        this.Studio = Studio;
    }
    public void setAS(boolean AuralSkills)
    {
        this.AuralSkills = AuralSkills;
    }
    public boolean getMT()
    {
        return MusicTheory;
    }
    public boolean getS()
    {
        return Studio;
    }
    public boolean getAS()
    {
        return AuralSkills;
    }
}
