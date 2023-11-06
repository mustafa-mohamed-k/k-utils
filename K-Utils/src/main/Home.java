package main;


import command.CommandsPanel;
import org.kordamp.ikonli.carbonicons.CarbonIcons;
import org.kordamp.ikonli.swing.FontIcon;
import variable.VariablesPanel;
/**
 *
 * @author MustafaMohamed
 */
public class Home extends javax.swing.JFrame {
    
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        myInit();
        initCommandsPanel();
        initVariablesPanel();
    }
    
    private void initCommandsPanel() {
        CommandsPanel panel = new CommandsPanel();
        jPanelCommands.add(panel);
    }
    
    private void initVariablesPanel(){
        VariablesPanel panel = new VariablesPanel();
        jPanelVariables.add(panel);
    }
    
    private void myInit() {
        FontIcon icon = FontIcon.of(CarbonIcons.ACCOUNT);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelCommands = new javax.swing.JPanel();
        jPanelVariables = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("K-Utils");

        jPanelCommands.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Commands", jPanelCommands);

        jPanelVariables.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Variables", jPanelVariables);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelCommands;
    private javax.swing.JPanel jPanelVariables;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}