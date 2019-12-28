/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dharm
 */
import javax.swing.JComboBox;
import javax.swing.JFrame;
/* www  .  j  a v a 2s. c o  m*/
public class testJComboBox {

  public static void main(String argv[]) throws Exception {
    JComboBox<Item> comboBox = new JComboBox<Item>(new Item[] {
        new Item("Major", "red"), new Item("Critical", "dark"),
        new Item("Minor", "green") });
    comboBox.addActionListener(e -> {
        JComboBox<Item> combo = (JComboBox<Item>) e.getSource();
        Item item = (Item) combo.getSelectedItem();
        System.out.println(item.getColor());
    });
    JFrame frame = new JFrame();
    frame.add(comboBox);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

class Item {

  private String name;
  private String color;

  public Item(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return name;
  }
}
