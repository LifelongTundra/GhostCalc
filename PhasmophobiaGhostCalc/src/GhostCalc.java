import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author LifelongTundra
 * @version 2.1 10/6/2020
 * 
 * Improved logic calculator for the game Phasmophobia.
 */

public class GhostCalc
{
  private JFrame frame;
  private Ghost newGhost;
  private List<String> possible = new ArrayList<String>();
  private List<String> impossible = new ArrayList<String>();
  private List<String> evidenceList = new ArrayList<String>();
  private JTextArea possibleGhosts = new JTextArea("Possible Ghost List:");
  private JTextArea impossibleGhosts = new JTextArea("Impossible Ghost List:");
  private JTextArea evidence = new JTextArea("Current Evidence:");

  public GhostCalc()
  {
    reset();

    frame = new JFrame("Ghost Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ButtonPressed listener = new ButtonPressed();

    JPanel evidencePad = new JPanel();
    evidencePad.setLayout(new GridLayout(3, 2));
    evidencePad.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    JPanel noEvidencePad = new JPanel();
    noEvidencePad.setLayout(new GridLayout(3, 2));
    noEvidencePad.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    JPanel middleSection = new JPanel();
    middleSection.setLayout(new GridBagLayout());
    middleSection.setPreferredSize(new Dimension(300, 350));

    JPanel possibilityPanel = new JPanel();
    possibilityPanel.setLayout(new GridLayout(1, 2));
    possibilityPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

    JPanel resetButton = new JPanel();
    resetButton.setLayout(new GridLayout(1, 2));
    resetButton.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));

    JButton reset = new JButton("RESET");
    JButton calc = new JButton("Calculate");
    JButton sb = new JButton("Spirit Box");
    JButton nsb = new JButton("No Spirit Box");
    JButton fp = new JButton("Finger Prints");
    JButton nfp = new JButton("No Finger Prints");
    JButton gw = new JButton("Ghost Writing");
    JButton ngw = new JButton("No Ghost Writing");
    JButton ft = new JButton("Freezing Temperature");
    JButton nft = new JButton("No Freezing Temperature");
    JButton go = new JButton("Ghost Orb");
    JButton ngo = new JButton("No Ghost Orb");
    JButton emf = new JButton("EMF 5");
    JButton nemf = new JButton("No EMF 5");

    reset.addActionListener(listener);
    calc.addActionListener(listener);
    sb.addActionListener(listener);
    nsb.addActionListener(listener);
    fp.addActionListener(listener);
    nfp.addActionListener(listener);
    gw.addActionListener(listener);
    ngw.addActionListener(listener);
    ft.addActionListener(listener);
    nft.addActionListener(listener);
    go.addActionListener(listener);
    ngo.addActionListener(listener);
    emf.addActionListener(listener);
    nemf.addActionListener(listener);

    evidencePad.add(sb);
    evidencePad.add(fp);
    evidencePad.add(gw);
    evidencePad.add(ft);
    evidencePad.add(go);
    evidencePad.add(emf);

    noEvidencePad.add(nsb);
    noEvidencePad.add(nfp);
    noEvidencePad.add(ngw);
    noEvidencePad.add(nft);
    noEvidencePad.add(ngo);
    noEvidencePad.add(nemf);

    resetButton.add(reset);
    resetButton.add(calc);

    possibleGhosts.setText("Possible Ghost List:" + printOut(possible));

    possibilityPanel.add(possibleGhosts);
    possibilityPanel.add(impossibleGhosts);

    GridBagConstraints p = new GridBagConstraints();
    p.ipady = 5;
    p.ipadx = 100;
    p.gridheight = 1;
    p.gridx = 1;
    p.gridy = 0;
    middleSection.add(possibilityPanel, p);

    GridBagConstraints e = new GridBagConstraints();
    e.weighty = 1.0;
    e.ipady = 50;
    e.ipadx = 400;
    e.gridheight = 1;
    e.gridx = 1;
    e.gridy = 2;
    middleSection.add(evidence, e);

    frame.add(evidencePad, BorderLayout.WEST);
    frame.add(middleSection, BorderLayout.CENTER);
    frame.add(noEvidencePad, BorderLayout.EAST);
    frame.add(resetButton, BorderLayout.SOUTH);

    newGhost = new Ghost();
  }

  private class ButtonPressed implements ActionListener
  {
    @Override
    public void actionPerformed(ActionEvent e)
    {
      switch (e.getActionCommand())
      {
        case "Spirit Box":
          newGhost.setSpiritBox(1);
          evidenceAdd(e.getActionCommand());
          evaluate(newGhost);
          break;
        case "No Spirit Box":
          newGhost.setSpiritBox(-1);
          evidenceAdd(e.getActionCommand());
          evaluate(newGhost);
          break;
        case "Finger Prints":
          newGhost.setFingerPrints(1);
          evidenceAdd(e.getActionCommand());
          evaluate(newGhost);
          break;
        case "No Finger Prints":
          newGhost.setFingerPrints(-1);
          evidenceAdd(e.getActionCommand());
          evaluate(newGhost);
          break;
        case "Ghost Writing":
          newGhost.setGhostWriting(1);
          evidenceAdd(e.getActionCommand());
          evaluate(newGhost);
          break;
        case "No Ghost Writing":
          newGhost.setGhostWriting(-1);
          evidenceAdd(e.getActionCommand());
          evaluate(newGhost);
          break;
        case "Freezing Temperature":
          newGhost.setFreezingTemp(1);
          evidenceAdd(e.getActionCommand());
          evaluate(newGhost);
          break;
        case "No Freezing Temperature":
          newGhost.setFreezingTemp(-1);
          evidenceAdd(e.getActionCommand());
          evaluate(newGhost);
          break;
        case "Ghost Orb":
          newGhost.setGhostOrb(1);
          evidenceAdd(e.getActionCommand());
          evaluate(newGhost);
          break;
        case "No Ghost Orb":
          newGhost.setGhostOrb(-1);
          evidenceAdd(e.getActionCommand());
          evaluate(newGhost);
          break;
        case "EMF 5":
          newGhost.setEMF(1);
          evidenceAdd(e.getActionCommand());
          evaluate(newGhost);
          break;
        case "No EMF 5":
          newGhost.setEMF(-1);
          evidenceAdd(e.getActionCommand());
          evaluate(newGhost);
          break;
        case "RESET":
          reset();
          break;
        case "Calculate":
          int[] temp = newGhost.getAttributes();
          System.out.print("[");
          for (int i = 0; i < 6; i++)
            System.out.print(temp[i]);
          System.out.print("]\n");
          break;
      }
    }
  }

  private String printOut(List<String> list)
  {
    String output = "\n";
    for (int i = 0; i < list.size(); i++)
    {
      output += list.get(i) + "\n";
    }
    return output;
  }

  private void reset()
  {
    newGhost = new Ghost();
    impossible.clear();
    possible.clear();
    evidenceList.clear();
    possible.add("Spirit");
    possible.add("Wraith");
    possible.add("Phantom");
    possible.add("Poltergeist");
    possible.add("Banshee");
    possible.add("Jinn");
    possible.add("Mare");
    possible.add("Revenant");
    possible.add("Shade");
    possible.add("Demon");
    possible.add("Yurei");
    possible.add("Oni");
    impossibleGhosts.setText("Impossible Ghost List:" + printOut(impossible));
    possibleGhosts.setText("Possible Ghost List:" + printOut(possible));
    evidence.setText("Current Evidence:" + printOut(evidenceList));
  }

  private void addRemove(String str)
  {
    if (!impossible.contains(str))
    {
      possible.remove(str);
      impossible.add(str);
    }
  }

  private void reverseAddRemove(String str)
  {
    if (!possible.contains(str))
    {
      possible.add(str);
      impossible.remove(str);
    }
  }

  private void evidenceAdd(String str)
  {
    if (!evidenceList.contains(str))
      evidenceList.add(str);
    if (evidenceList.contains("No " + str))
      evidenceList.remove("No " + str);
    else
      evidenceList.remove(str.substring(3));
  }

  public void evaluate(Ghost ghost)
  {
    for (Ghost specificGhost : GivenGhost.GHOST_LIST)
    {
      if (newGhost.equals(specificGhost))
        reverseAddRemove(specificGhost.getName());
      else
        addRemove(specificGhost.getName());
    }
    impossibleGhosts.setText("Impossible Ghost List:" + printOut(impossible));
    possibleGhosts.setText("Possible Ghost List:" + printOut(possible));
    evidence.setText("Current Evidence:" + printOut(evidenceList));
  }

  public void display()
  {
    frame.pack();
    frame.setVisible(true);
  }

  public static void run()
  {
    new GhostCalc().display();
  }
}
