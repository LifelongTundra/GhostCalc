//Made By LifelongTundra

public class Ghost
{
  private int spiritBox;
  private int fingerPrints;
  private int ghostWriting;
  private int freezingTemp;
  private int ghostOrb;
  private int emf5;
  private String name;

  public Ghost()
  {
    spiritBox = 0;
    fingerPrints = 0;
    ghostWriting = 0;
    freezingTemp = 0;
    ghostOrb = 0;
    emf5 = 0;
    name = "Unknown";
  }

  public Ghost(int sb, int fp, int gw, int ft, int go, int emf, String name)
  {
    spiritBox = sb;
    fingerPrints = fp;
    ghostWriting = gw;
    freezingTemp = ft;
    ghostOrb = go;
    emf5 = emf;
    this.name = name;
  }

  public void setSpiritBox(int sb)
  {
    spiritBox = sb;
  }

  public void setFingerPrints(int fp)
  {
    fingerPrints = fp;
  }

  public void setGhostWriting(int gw)
  {
    ghostWriting = gw;
  }

  public void setFreezingTemp(int ft)
  {
    freezingTemp = ft;
  }

  public void setGhostOrb(int go)
  {
    ghostOrb = go;
  }

  public void setEMF(int emf)
  {
    emf5 = emf;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public int[] getAttributes()
  {
    return new int[] {spiritBox, fingerPrints, ghostWriting, freezingTemp, ghostOrb, emf5};
  }

  public boolean equals(Ghost ghost)
  {
    int currAttr[] = getAttributes();
    int checkAttr[] = ghost.getAttributes();
    for (int i = 0; i < 6; i++)
    {
      if (currAttr[i] == 1 && checkAttr[i] <= 0)
      {
        return false;
      }
      else if (currAttr[i] == -1 && checkAttr[i] == 1)
      {
        return false;
      }
    }
    return true;
  }

}
