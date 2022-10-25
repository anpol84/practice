package practice21_22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    private ICreateDocument createDocument;
    public Frame(ICreateDocument iCreateDocument){
        super("Editor");
        this.createDocument = iCreateDocument;
        render();
    }
    private void render(){
        setSize(500, 500);
        setVisible(true);
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        jMenu.add(newItem);
        jMenu.add(openItem);
        jMenu.add(saveItem);
        jMenu.add(exitItem);
        jMenuBar.add(jMenu);

        newItem.addActionListener(new Frame.NewItemListener());
        openItem.addActionListener(new Frame.OpenItemListener());
        setJMenuBar(jMenuBar);

    }
    class NewItemListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            createDocument.createNew();
            System.out.println("Created");
        }
    }
    class OpenItemListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            createDocument.createOpen();
            System.out.println("Opened");
        }
    }

}
