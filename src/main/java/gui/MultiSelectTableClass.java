package main.java.gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <p> Short description </p>
 * @Date created : 12/6/2020
 * @Module : CS513_2
 * @since : 2020
 */
public class MultiSelectTableClass extends DefaultTableModel {

    @Override
    public Class<?> getColumnClass(int column) {
        switch (column) {
            case 0:
                return Boolean.class;
            default:
                return String.class;
        }
    }

    public List<List> convertData(Map<String, String> options) {
        return options.entrySet().stream().map(s -> {
            List l = Arrays.asList(Boolean.FALSE, s.getKey(), s.getValue());
            return l;
        }).collect(Collectors.toList());
    }

    public void fillData(String[] column, List<List> rows) {
        for (int i = 0; i < column.length; i++) {
            this.addColumn(column[i]);
        }
        for (int i = 0; i < rows.size(); i++) {
            List row = rows.get(i);
            this.addRow(new Object[0]);
            this.setValueAt(row.get(0), i, 0);
            this.setValueAt(row.get(1), i, 1);
            this.setValueAt(row.get(2), i, 2);
        }

    }

    public static  ActionListener listener(Consumer whatToBo) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                whatToBo.accept(arg0);
            }
        };
    }
}
