//package main.java;


import main.java.gui.MultiSelectTableClass;
import main.java.gui.Util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * <p> Short description </p>
 * @Date created : 12/1/2020
 * @Module : CS513_2
 * @since : 2020
 */
public class GUIIceCreamMaker {

    private String menuTitle = "Welcome to IceCream Ordering System";
    private String menuName = "What do you want to order?";
    private List listOfOptions = Arrays.asList("IceCream", "Beverage");
    String column[] = {"Select", "Item", "Cost"};
    /**
     * Option 1 data
     */
    private String iceCreamTitle = "Which IceCream do you want?";
    private List iceCreamOptions = (List) Arrays.asList("Cup IceCream", "Cone IceCream");

    private String iceDecorator = "Which IceCream Flavour do you want?";
    private Map<String, String> iceDecoratorOptions =
            Map.of("White Chocolate", "$1.5",
                    "Dark Chocolate", "$1.25");

    private String fruitDecorator = "Please Choose Fruit Decorator";
    private Map<String, String> fruitDecoratorOptions =
            Map.of("Cherry", "$1.0",
                    "DragonFruit", "$1.0",
                    "Kiwi", "$1.0");


    private String condimentDecorator = "Please Condiment Decorator";
    private Map<String, String> condimentDecoratorOptions =
            Map.of("Jellies", "$0.5",
                    "Nuts", "$0.5",
                    "Sprinkles", "$0.5");
    String iceCreamType = null;
    ArrayList<String> chocoList = new ArrayList<>();
    ArrayList<String> fruitList = new ArrayList<>();
    ArrayList<String> condimentList = new ArrayList<>();
    /**
     * Option 2 data
     */
    private String beveragesCreamTitle = "Which BEVERAGES do you want?";
    private List beveragesOptions = Arrays.asList("HotMocha", "Cappuccino", "Coke", "Ice Tea", "GoldSpot");


    private JFrame frame;
    private JTextPane title;
    private JTable listofIceCreams;
    private JLayeredPane layeredPane;
    private JButton next;
    private JButton back;
    private JTable jt;

    /**
     * HOLD DATA
     */
    private int panel1Select = 0;
    private int panel2Select = 0;
    private String nexts = "next";
    private ActionListener nextl;
    private String backs = "back";
    private ActionListener backl;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUIIceCreamMaker window = new GUIIceCreamMaker();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public GUIIceCreamMaker() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setEnabled(false);
        frame.getContentPane().setLayout(null);
        layeredPane = new JLayeredPane();
        layeredPane.setBounds(10, 50, 414, 151);
        frame.getContentPane().add(layeredPane);
        layeredPane.setLayout(new CardLayout(0, 0));
        this.addFrameBottoms();
        this.changePanel(this.listOfOptions, menuName, this.SELECT_OPTION_0_ACTION, null, this.NEXT_OPTION_0);
    }


    public final Consumer<ActionEvent> NEXT_OPTION_0 = (aEvent) -> {
        if (this.panel1Select == 0) {
            this.changePanel(this.iceCreamOptions, this.iceCreamTitle, this.SELECT_OPTION_1_ACTION, null, this.NEXT_OPTION_1);
        } else {
            this.changePanel(this.beveragesOptions, this.beveragesCreamTitle, this.SELECT_OPTION_1_ACTION, null, this.NEXT_OPTION_1);
        }
    };

    public final Consumer<ActionEvent> NEXT_OPTION_1 = (aEvent) -> {
        if (this.panel1Select == 0) {
            this.changePanel(this.iceDecoratorOptions, this.iceDecorator, null, this.column, this.NEXT_OPTION_2);
        }
    };

    /**
     * chocolate next
     */
    public final Consumer<ActionEvent> NEXT_OPTION_2 = (aEvent) -> {
        if (this.panel1Select == 0) {
            for (int i = 0; i < this.jt.getRowCount(); i++) {
                Boolean checked = Boolean.valueOf(jt.getValueAt(i, 0).toString());
                String col = jt.getValueAt(i, 1).toString();
                if (checked) {
                    this.chocoList.add(col);
                    System.out.println("adding: "+col);
                }else {
                    this.chocoList.remove(col);
                    System.out.println("removing: "+col);
                }
            }
            this.changePanel(this.fruitDecoratorOptions, this.fruitDecorator, null, this.column, this.NEXT_OPTION_3);
        }
    };

    /**
     * fruit next
     */
    public final Consumer<ActionEvent> NEXT_OPTION_3 = (aEvent) -> {
        for (int i = 0; i < this.jt.getRowCount(); i++) {
            Boolean checked = Boolean.valueOf(jt.getValueAt(i, 0).toString());
            String col = jt.getValueAt(i, 1).toString();
            if (checked) {
                this.fruitList.add(col);
                System.out.println("adding: "+col);
            }else {
                this.fruitList.remove(col);
                System.out.println("removing: "+col);
            }
        }
        if (this.panel1Select == 0) {
            this.changePanel(this.condimentDecoratorOptions, this.condimentDecorator, null, this.column, this.NEXT_OPTION_4);
        }
    };
    /**
     * Condiment next
     */
    public final Consumer<ActionEvent> NEXT_OPTION_4 = (aEvent) -> {
        if (this.panel1Select == 0) {
            for (int i = 0; i < this.jt.getRowCount(); i++) {
                Boolean checked = Boolean.valueOf(jt.getValueAt(i, 0).toString());
                String col = jt.getValueAt(i, 1).toString();
                if (checked) {
                    this.condimentList.add(col);
                    System.out.println("adding: " + col);
                } else {
                    this.condimentList.remove(col);
                    System.out.println("removing: " + col);
                }
            }
            this.changePanel(this.condimentDecoratorOptions, "Final Result", null, this.column, this.NEXT_OPTION_4);
        }else {

        }
    };

    public final Consumer<ActionEvent> SELECT_OPTION_0_ACTION = (aEvent) -> {
        JRadioButton theJRB = (JRadioButton) aEvent.getSource();
        this.panel1Select = listOfOptions.indexOf(theJRB.getText());
        System.out.println(this.panel1Select);
    };

    public final Consumer<ActionEvent> SELECT_OPTION_1_ACTION = (aEvent) -> {
        if (this.panel1Select == 0) {
            JRadioButton theJRB = (JRadioButton) aEvent.getSource();
            this.panel2Select = this.iceCreamOptions.indexOf(theJRB.getText());
            this.iceCreamType = theJRB.getText();
        } else {
            JRadioButton theJRB = (JRadioButton) aEvent.getSource();
            this.panel2Select = this.iceCreamOptions.indexOf(theJRB.getText());
            System.out.println("panel 2 select: " + this.panel1Select);
        }
    };

    private void changePanel(Object d, String t, Consumer c, String[] col, Consumer nextL) {
        JPanel p = null;
        if (d instanceof List) {
            p = Util.createSelectPanel((List<String>) d, t, c);
        }
        if (d instanceof Map) {
            jt = Util.multipleSelectSelectPanel((Map) d, t, col);
            p = new JPanel();
            p.add(new JScrollPane(jt));
        }
        Util.switchPanel(p, layeredPane);
        this.removeAndAddListenr("next", MultiSelectTableClass.listener(nextL));
    }

    private void removeAndAddListenr(String buttonName, ActionListener newlis) {
        if (buttonName.equals("next")) {
            if (this.next.getActionListeners().length > 0) {
                this.next.removeActionListener(this.nextl);
            }
            this.next.addActionListener(newlis);
            this.nextl = newlis;
        } else {
            if (this.back.getActionListeners().length > 0) {
                this.back.removeActionListener(this.backl);
            }
            this.back.addActionListener(newlis);
            this.backl = newlis;
        }
    }


    private void addFrameBottoms() {
        next = new JButton("next >");
        next.setBounds(335, 227, 89, 23);
        frame.getContentPane().add(next);

//        back = new JButton("< back");
//        back.setBounds(236, 227, 89, 23);
//        frame.getContentPane().add(back);

        title = new JTextPane();
        title.setEditable(false);
        title.setBounds(10, 19, 414, 20);
        title.setText(menuTitle);
        title.setBackground(new Color(240, 240, 240));
        frame.getContentPane().add(title);


        JButton Cancel = new JButton("Cancel X");
        Cancel.setBounds(10, 227, 89, 23);
        Cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        frame.getContentPane().add(Cancel);
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
