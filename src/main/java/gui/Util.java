package main.java.gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/**
 * <p> Short description </p>
 * @Date created : 12/6/2020
 * @Module : CS513_2
 * @since : 2020
 */
public class Util {

    public static void switchPanel(JPanel panel, JLayeredPane layeredPane) {
        layeredPane.removeAll();
        layeredPane.add(panel);
        layeredPane.repaint();
        layeredPane.revalidate();
    }

    public static JTextPane createTitle(String title) {
        JTextPane txtpnWhatDo = new JTextPane();
        txtpnWhatDo.setText(title);
        txtpnWhatDo.setBounds(10, 5, 200, 30);
        txtpnWhatDo.setBackground(new Color(240, 240, 240));
        return txtpnWhatDo;
    }

    public static JPanel createSelectPanel(java.util.List<String> options, String title, Consumer c) {
        JPanel panel = new JPanel();
        AtomicInteger y = new AtomicInteger(45);
        panel.add(Util.createTitle(title));
        ButtonGroup group = new ButtonGroup();
        options.forEach(s -> {
            JRadioButton rdbtnNewRadioButton_2 = new JRadioButton(s);
            rdbtnNewRadioButton_2.setBounds(10, y.get(), 109, 23);
            rdbtnNewRadioButton_2.addActionListener(MultiSelectTableClass.listener(c));
            group.add(rdbtnNewRadioButton_2);
            panel.add(rdbtnNewRadioButton_2);
            y.set(y.get() + 15);
        });
        panel.setLayout(new GridLayout(3,0));
        return panel;
    }

    public static JTable multipleSelectSelectPanel(Map<String, String> options, String title,String[] column) {
//        String column[] = {"Select", "Item", "Cost"};
        MultiSelectTableClass model = new MultiSelectTableClass();
        List<List> array = model.convertData(options);
        model.fillData(column, array);
        return new JTable(model);
    }
}
