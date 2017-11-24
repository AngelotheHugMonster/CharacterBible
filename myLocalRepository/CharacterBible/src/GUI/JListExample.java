package GUI;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.JCheckBoxMenuItem;
 
public class JListExample extends JFrame {
    private JList<String> countryList;
    public JListExample() {
    	setResizable(false);
        //create the model and add elements
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("USA");
        listModel.addElement("India");
        listModel.addElement("Vietnam");
        listModel.addElement("Canada");
        listModel.addElement("Denmark");
        listModel.addElement("France");
        listModel.addElement("Great Britain");
        listModel.addElement("Japan");
        getContentPane().setLayout(null);
 
        //create the list
        countryList = new JList<>(listModel);
        listModel.addElement("before add");
        countryList.setBounds(100, 0, 100, 178);
        countryList.setBackground(Color.LIGHT_GRAY);
        getContentPane().add(countryList);
        listModel.addElement("after add");
        
        JMenuBar menuBar = new JMenuBar();
        menuBar.setToolTipText("why");
        menuBar.setBackground(Color.GRAY);
        menuBar.setBounds(0, 0, 100, 22);
        getContentPane().add(menuBar);
        
        JMenu mnTestMenu = new JMenu("Test Menu");
        menuBar.add(mnTestMenu);
        
        JMenuItem Item1 = new JMenuItem("1");
        mnTestMenu.add(Item1);
        
        JMenuItem Item2 = new JMenuItem("2");
        mnTestMenu.add(Item2);
        
        JSeparator separatorA = new JSeparator();
        mnTestMenu.add(separatorA);
        
        JMenu SubMenu = new JMenu("SubMenu");
        mnTestMenu.add(SubMenu);
        
        JMenuItem mntmLol = new JMenuItem("lol");
        SubMenu.add(mntmLol);
        
        JMenuItem mntmNah = new JMenuItem("nah");
        SubMenu.add(mntmNah);
        
        JSeparator separatorB = new JSeparator();
        mnTestMenu.add(separatorB);
        
        JCheckBoxMenuItem CheckItem = new JCheckBoxMenuItem("CheckItem");
        mnTestMenu.add(CheckItem);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JList Example");       
        this.setSize(200,200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
     
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JListExample();
            }
        });
    }       
}
