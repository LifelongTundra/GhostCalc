//Made By LifelongTundra

public class GhostConstants
{
  // Descriptions are a mix from https://phasmophobia.fandom.com/wiki/Ghost and https://gamesgds.com/phasmophobia-ghost-entries-guide-spirit-wraith-and-more/
  public static final String SPIRIT_DESC = "While a Spirit has no particular strengths, they are weak to Smudge Sticks.\nUse a Smudge Stick on a Spirit and it will stop attacking for a relatively long period of time.";
  public static final String WRAITH_DESC = "Wraiths can fly, meaning you cannot track their footsteps with a UV Flashlight.\nIn addition, Wraiths can travel through walls, making avoiding them in “Hunt” mode particularly challenging.\nThey do have one weakness, however, they are particularly vulnerable to lines of salt and will cease attacking if they come in contact with it.";
  public static final String PHANTOM_DESC = "A rather slow but powerful type of ghost. Similar to the Yurei, the Phantom has a significant effect over your sanity, but only if you look at it.\nYou can avoid it by using a photo camera on it, making it disappear briefly.\nThis, however, will only work if the ghost is in Shadow form. If it is hunting, you will not be able to stop it with the camera.";
  public static final String POLTERGEIST_DESC = "One of the most famous Ghosts, a Poltergeist, also known as a noisy ghost can manipulate objects around it to spread fear into it’s victims.";
  public static final String BANSHEE_DESC = "Banshees are ghosts that reacts the strongest to crucifixes out of all the ghosts in the game.\nThey will attempt to slowly stalk and pick off the players one by one.";
  public static final String JINN_DESC = "A Jinn is a territorial Ghost that will attack when threatened. It has also been known to be able to travel at significant speed.\nTurning off the locations power source will prevent the Jinn from using it’s ability";
  public static final String MARE_DESC = "A Mare is a ghost that attacks primarily in the dark and will often turn off the lights.";
  public static final String REVENANT_DESC = "A Revenant is a ghost that can attack indiscriminately regardless of sanity levels when hunting.\nHiding from the Revenant will cause it to move slowly, but will travel faster than any other ghost in the game if the Revenant is hunting a victim.";
  public static final String SHADE_DESC = "A Shade is considered to be a shy ghost. It will not attack if there are multiple people nearby, but that also means it is harder to find in larger groups.";
  public static final String DEMON_DESC = "A Demon is one of the worst ghosts to encounter. It will attack more often than any other ghost, so a crucifix is recommended to prevent hunts.";
  public static final String YUREI_DESC = "A Yurei is a type of ghost that has the ability to drain the player's sanity quicker than any other ghost.\nSmudging the room the Yurei was found in will prevent it from wandering from the location for a long time.";
  public static final String ONI_DESC = "An Oni is a very active ghost and it’s likely that it will show itself within the first few minutes of the game.\nIt’s also likely to wander around near the ghost room. It’s recommended to hide in a closet and wait for it to leave, but It won't give you evidence easily.";
  
  
  public static final String[] EVIDENCE_ORDER = new String[] {"Spirit Box", "Fingerprints", "Ghost Writing", "Freezing Temperature", "Ghost Orb", "EMF 5"};
  // Constructor list goes [SpiritBox, Fingerprints, GhostWriting, FreezingTemp, GhostOrb, EMF]
  public static final Ghost SPIRIT = new Ghost(1, 1, 1, 0, 0, 0, "Spirit", SPIRIT_DESC);
  public static final Ghost WRAITH = new Ghost(1, 1, 0, 1, 0, 0, "Wraith", WRAITH_DESC);
  public static final Ghost PHANTOM = new Ghost(0, 0, 0, 1, 1, 1, "Phantom", PHANTOM_DESC);
  public static final Ghost POLTERGEIST = new Ghost(1, 1, 0, 0, 1, 0, "Poltergeist", POLTERGEIST_DESC);
  public static final Ghost BANSHEE = new Ghost(0, 1, 0, 1, 0, 1, "Banshee", BANSHEE_DESC);
  public static final Ghost JINN = new Ghost(1, 0, 0, 0, 1, 1, "Jinn", JINN_DESC);
  public static final Ghost MARE = new Ghost(1, 0, 0, 1, 1, 0, "Mare", MARE_DESC);
  public static final Ghost REVENANT = new Ghost(0, 1, 1, 0, 0, 1, "Revenant", REVENANT_DESC);
  public static final Ghost SHADE = new Ghost(0, 0, 1, 0, 1, 1, "Shade", SHADE_DESC);
  public static final Ghost DEMON = new Ghost(1, 0, 1, 1, 0, 0, "Demon", DEMON_DESC);
  public static final Ghost YUREI = new Ghost(0, 0, 1, 1, 1, 0, "Yurei", YUREI_DESC);
  public static final Ghost ONI = new Ghost(1, 0, 1, 0, 0, 1, "Oni", ONI_DESC);

  public static final Ghost[] GHOST_LIST = new Ghost[] {SPIRIT, WRAITH, PHANTOM, POLTERGEIST,
      BANSHEE, JINN, MARE, REVENANT, SHADE, DEMON, YUREI, ONI};
}
