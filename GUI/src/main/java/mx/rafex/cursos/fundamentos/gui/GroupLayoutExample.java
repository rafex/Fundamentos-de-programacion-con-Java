package mx.rafex.cursos.fundamentos.gui;

import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.LEADING;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class GroupLayoutExample {

    public static void main(final String[] args) {

        JFrame.setDefaultLookAndFeelDecorated(true);
        final JFrame frame = new JFrame("GroupLayoutExample Example");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        final JLabel label = new JLabel("Label:");
        final JTextField textField = new JTextField();
        final JCheckBox checkBox1 = new JCheckBox("CheckBox1");
        final JCheckBox checkBox2 = new JCheckBox("CheckBox2");
        final JCheckBox checkBox3 = new JCheckBox("CheckBox");
        final JCheckBox checkBox4 = new JCheckBox("CheckBox4");
        final JButton findButton = new JButton("Button 1");
        final JButton cancelButton = new JButton("Button 2");

        checkBox1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        checkBox2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        checkBox3.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        checkBox4.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

        final GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(label).addGroup(layout
                .createParallelGroup(LEADING).addComponent(textField)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(LEADING).addComponent(checkBox1).addComponent(checkBox3))
                        .addGroup(layout.createParallelGroup(LEADING).addComponent(checkBox2).addComponent(checkBox4))))
                .addGroup(layout.createParallelGroup(LEADING).addComponent(findButton).addComponent(cancelButton)));

        layout.linkSize(SwingConstants.HORIZONTAL, findButton, cancelButton);

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(BASELINE).addComponent(label).addComponent(textField)
                        .addComponent(findButton))
                .addGroup(layout.createParallelGroup(LEADING).addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(BASELINE).addComponent(checkBox1).addComponent(checkBox2))
                        .addGroup(layout.createParallelGroup(BASELINE).addComponent(checkBox3).addComponent(checkBox4)))
                        .addComponent(cancelButton)));

        frame.pack();
        frame.setVisible(true);
    }
}
