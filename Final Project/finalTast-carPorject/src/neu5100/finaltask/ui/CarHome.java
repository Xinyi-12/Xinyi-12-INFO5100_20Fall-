package neu5100.finaltask.ui;

import java.sql.ResultSet;

import neu5100.finaltask.dao.JDBC_Connection.BDD;
import neu5100.finaltask.dao.JDBC_Connection.Parameter;
import neu5100.finaltask.dao.JDBC_Connection.ResultSetTableModel;


public class CarHome extends javax.swing.JFrame {
    BDD db;
    ResultSet rs;


    public CarHome() {
        //super("CarHome");

        db = new BDD(Parameter.HOST_DB,Parameter.USERNAME_DB,Parameter.PASSWORD_DB);
        initComponents();

    }

    public void table(){
        String a[] = {"images","model","price","year"};
        rs = db.querySelect(a, "carinfo");
        carTable.setModel(new ResultSetTableModel(rs));

    }



    public void pupulateArrayList(){
//
//        try{
//            FileInputStream file = new FileImputStream("cars.dat");
//            ObjectInputStream inputFile = new ObjectInputStream(file);
//
//            //boolean endOfFile = false;
//            while(){
//            }
//
//        }catch(IOExcetion e){
//             JOptionPane.showMessageDialog(null,"0");
//        }

    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        filter = new javax.swing.JPanel();
        modelBox = new javax.swing.JComboBox<>();
        modelL = new javax.swing.JLabel();
        makeBox = new javax.swing.JComboBox<>();
        yearBox = new javax.swing.JComboBox<>();
        categoryBox = new javax.swing.JComboBox<>();
        colorBox = new javax.swing.JComboBox<>();
        priceBox = new javax.swing.JComboBox<>();
        makeL = new javax.swing.JLabel();
        yearL = new javax.swing.JLabel();
        categoryL = new javax.swing.JLabel();
        colorL = new javax.swing.JLabel();
        priceL = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        carList = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1084, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 702, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1131, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 169, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 233, Short.MAX_VALUE)
        );

        filter.setBackground(new java.awt.Color(204, 204, 204));
        filter.setForeground(new java.awt.Color(204, 204, 204));

        modelBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modelBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accord", "Prius" }));
        modelBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelBoxActionPerformed(evt);
            }
        });

        modelL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modelL.setText("Model");

        makeBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        makeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        makeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeBoxActionPerformed(evt);
            }
        });

        yearBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        categoryBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        categoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        colorBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        colorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        priceBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        makeL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        makeL.setText("Make");

        yearL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yearL.setText("Year");

        categoryL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        categoryL.setText("Category");

        colorL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        colorL.setText("Color");

        priceL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceL.setText("Price");

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\AppData\\Local\\Temp\\icons8_mail_filter_24px_1.png")); // NOI18N
        jLabel7.setText("Filter");

        javax.swing.GroupLayout filterLayout = new javax.swing.GroupLayout(filter);
        filter.setLayout(filterLayout);
        filterLayout.setHorizontalGroup(
                filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(filterLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addGap(33, 33, 33)
                                .addComponent(modelL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 65, Short.MAX_VALUE)
                                .addComponent(modelBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(makeL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(makeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yearL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(categoryL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(colorL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(colorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(priceL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        filterLayout.setVerticalGroup(
                filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(filterLayout.createSequentialGroup()
                                .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(filterLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(makeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(yearL)
                                                        .addComponent(makeL)
                                                        .addComponent(modelBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(filterLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(priceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(priceL))
                                                        .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(colorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(colorL))
                                                        .addGroup(filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(categoryL))
                                                        .addComponent(modelL, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addComponent(jLabel7))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        carTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        carTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Images", "Model", "Price", "Year"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        carTable.setGridColor(new java.awt.Color(153, 153, 153));
        carTable.setRowHeight(150);
        carTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        carTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(carTable);

        jLabel1.setText("car one");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(221, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout carListLayout = new javax.swing.GroupLayout(carList);
        carList.setLayout(carListLayout);
        carListLayout.setHorizontalGroup(
                carListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        carListLayout.setVerticalGroup(
                carListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(carListLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 296, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(filter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(carList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>


    private void modelBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String modelItem02 = (String) modelBox.getSelectedItem();
        if(modelItem02.equals("")){}
        if(modelItem02.equals("Accord")){
            // table();
            //   SQL = "SELECT * FROM " + nomTable + " WHERE " + etat;
            rs = db.querySelectAll("carInfo", " model = 'Accord'" );
            carTable.setModel(new ResultSetTableModel(rs));
        }else if(modelItem02 == "Prius"){
            rs = db.querySelectAll("carInfo", " model = 'Prius'" );
            carTable.setModel(new ResultSetTableModel(rs));
//                 rs = db.querySelectAll("carInfo");
//                 carTable.setModel(new ResultSetTableModel(rs));
        }


    }

    private void makeBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel bg;
    private javax.swing.JPanel carList;
    private javax.swing.JTable carTable;
    private javax.swing.JComboBox<String> categoryBox;
    private javax.swing.JLabel categoryL;
    private javax.swing.JComboBox<String> colorBox;
    private javax.swing.JLabel colorL;
    private javax.swing.JPanel filter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> makeBox;
    private javax.swing.JLabel makeL;
    private javax.swing.JComboBox<String> modelBox;
    private javax.swing.JLabel modelL;
    private javax.swing.JComboBox<String> priceBox;
    private javax.swing.JLabel priceL;
    private javax.swing.JComboBox<String> yearBox;
    private javax.swing.JLabel yearL;
    // End of variables declaration
}


