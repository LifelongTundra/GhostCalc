//Made By LifelongTundra

public class GivenGhost
{
  // Constructor list goes [SpiritBox, FingerPrints, GhostWriting, FreezingTemp, GhostOrb, EMF]
  public static final Ghost SPIRIT = new Ghost(1, 1, 1, 0, 0, 0, "Spirit");
  public static final Ghost WRAITH = new Ghost(1, 1, 0, 1, 0, 0, "Wraith");
  public static final Ghost PHANTOM = new Ghost(0, 0, 0, 1, 1, 1, "Phantom");
  public static final Ghost POLTERGEIST = new Ghost(1, 1, 0, 0, 1, 0, "Poltergeist");
  public static final Ghost BANSHEE = new Ghost(0, 1, 0, 1, 0, 1, "Banshee");
  public static final Ghost JINN = new Ghost(1, 0, 0, 0, 1, 1, "Jinn");
  public static final Ghost MARE = new Ghost(1, 0, 0, 1, 1, 0, "Mare");
  public static final Ghost REVENANT = new Ghost(0, 1, 1, 0, 0, 1, "Revenant");
  public static final Ghost SHADE = new Ghost(0, 0, 1, 0, 1, 1, "Shade");
  public static final Ghost DEMON = new Ghost(1, 0, 1, 1, 0, 0, "Demon");
  public static final Ghost YUREI = new Ghost(0, 0, 1, 1, 1, 0, "Yurei");
  public static final Ghost ONI = new Ghost(1, 0, 1, 0, 0, 1, "Oni");

  public static final Ghost[] GHOST_LIST = new Ghost[] {SPIRIT, WRAITH, PHANTOM, POLTERGEIST,
      BANSHEE, JINN, MARE, REVENANT, SHADE, DEMON, YUREI, ONI};
}
