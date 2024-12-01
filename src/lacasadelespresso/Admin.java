/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lacasadelespresso;

import DatabaseConnection.DatabaseConnection;
import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zai
 */

public class Admin extends javax.swing.JFrame {
     private static final String dbURL = "jdbc:mysql://localhost:3306/admin";
    private static final String dbUser = "root";
    private static final String dbPassword = "";
    
    private Connection con;  // Connection object to hold the connection 
    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();  // Initialize GUI components
        Connect();
        loadInventoryTable();
    }
    public void Connect() {
        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection to the database
            con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
            System.out.println("Database connected successfully!");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "MySQL JDBC Driver not found!", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database connection error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
        private void loadInventoryTable() {
        // Define table model
        DefaultTableModel model = (DefaultTableModel) inventoryTable.getModel();
        model.setRowCount(0); // Clear existing data

        // SQL query to fetch data
        String query = "SELECT p.product_id, p.product_name, c.category_name, p.quantity " +
                       "FROM products p " +
                       "JOIN categories c ON p.category_id = c.category_id";

        try {
            // Get database connection
            Connection conn = DatabaseConnection.getDBConnection().getConnection();

            // Prepare and execute query
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            // Populate table model
            while (rs.next()) {
                int productId = rs.getInt("product_id");
                String productName = rs.getString("product_name");
                String categoryName = rs.getString("category_name");
                int quantity = rs.getInt("quantity");

                // Add row to table model
                model.addRow(new Object[]{productId, productName, categoryName, quantity});
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading inventory table: " + e.getMessage());
        }
    }
        
    private void showSalesHistory() {
   
    String sqlQuery = "SELECT " +
                      "r.ReceiptID, r.DateOfReceipt, " +
                      "o.OrderID, o.ProductName, o.Size, o.Quantity, o.Price, o.DiningLocation, " +
                      "p.CustomerName, p.SubTotal, p.Tax, p.TotalWithTax, p.PaymentMethod, p.Payment, p.`Change`, p.PaymentDate " +
                      "FROM Receipt r " +
                      "JOIN `Order` o ON r.ReceiptID = o.ReceiptID " +
                      "JOIN Payment p ON r.ReceiptID = p.ReceiptID";

    try (Connection connection = DriverManager.getConnection(dbURL, dbUser, dbPassword)) {
       
        PreparedStatement pstmt = connection.prepareStatement(sqlQuery);
        ResultSet rs = pstmt.executeQuery();

        // Create the table model to display the results
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ReceiptID");
        model.addColumn("DateOfReceipt");
        model.addColumn("OrderID");
        model.addColumn("ProductName");
        model.addColumn("Size");
        model.addColumn("Quantity");
        model.addColumn("Price");
        model.addColumn("DiningLocation");
        model.addColumn("CustomerName");
        model.addColumn("SubTotal");
        model.addColumn("Tax");
        model.addColumn("TotalWithTax");
        model.addColumn("PaymentMethod");
        model.addColumn("Payment");
        model.addColumn("Change");
        model.addColumn("PaymentDate");

        // Process the result set and add data to the table model
        while (rs.next()) {
            Object[] row = new Object[16];
            row[0] = rs.getInt("ReceiptID");
            row[1] = rs.getDate("DateOfReceipt");
            row[2] = rs.getInt("OrderID");
            row[3] = rs.getString("ProductName");
            row[4] = rs.getString("Size");
            row[5] = rs.getInt("Quantity");
            row[6] = rs.getDouble("Price");
            row[7] = rs.getString("DiningLocation");
            row[8] = rs.getString("CustomerName");
            row[9] = rs.getDouble("SubTotal");
            row[10] = rs.getDouble("Tax");
            row[11] = rs.getDouble("TotalWithTax");
            row[12] = rs.getString("PaymentMethod");
            row[13] = rs.getDouble("Payment");
            row[14] = rs.getDouble("Change");
            row[15] = rs.getTimestamp("PaymentDate");

            model.addRow(row);
        }

        // Set the model to the JTable to display the data
        salesTable.setModel(model);

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error retrieving sales history: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
    }
   private void showPaymentTable() {
    String query = "SELECT PaymentID, ReceiptID, CustomerName, SubTotal, Tax, TotalWithTax, PaymentMethod, Reference, Payment, `Change`, PaymentDate FROM Payment";

    try (Connection connection = DriverManager.getConnection(dbURL, dbUser, dbPassword)) {
        PreparedStatement pst = connection.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        DefaultTableModel model = (DefaultTableModel) paymentTable.getModel();
        model.setRowCount(0); // Clear existing rows

        // Fetch column data dynamically
        int columnCount = rs.getMetaData().getColumnCount();

        while (rs.next()) {
            Object[] rowData = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                rowData[i - 1] = rs.getObject(i); // Dynamically fetch each column value
            }
            model.addRow(rowData);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading payment data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        reportbut = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        update = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        logs = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        updatehistorytable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymentTable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        reports = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        updatehistoryButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(223, 216, 205));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Modern No. 20", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("La Casa del Espresso Sales");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 450, 50));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-arrow.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 70));

        reportbut.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel3.setBackground(new java.awt.Color(223, 216, 205));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HISTORY SALES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Bright", 1, 14), new java.awt.Color(25, 0, 0))); // NOI18N

        salesTable.setFont(new java.awt.Font("Mongolian Baiti", 0, 12)); // NOI18N
        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ReceiptID", "DateofReceipt", "OrderID", "ProductName", "Size", "Quantity", "Price", "DiningLocation", "CustomerName", "Sub Total", "Tax", "TotalWithTax", "PaymentMethod", "Payment", "Change", "PaymenDate"
            }
        ));
        salesTable.setShowGrid(false);
        salesTable.setShowHorizontalLines(false);
        jScrollPane2.setViewportView(salesTable);

        jScrollPane6.setViewportView(jScrollPane2);

        jPanel3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 890, 440));

        update.setBackground(new java.awt.Color(223, 216, 205));
        update.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updated (1).png"))); // NOI18N
        update.setText("UPDATE");
        update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 150, 60));

        remove.setBackground(new java.awt.Color(225, 216, 205));
        remove.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus-button.png"))); // NOI18N
        remove.setText("REMOVE");
        remove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel3.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 150, 60));

        logs.setBackground(new java.awt.Color(223, 216, 205));
        logs.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        logs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trashbin.png"))); // NOI18N
        logs.setText("REMOVE HISTORY");
        logs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logsActionPerformed(evt);
            }
        });
        jPanel3.add(logs, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 160, 60));

        reportbut.addTab("1", jPanel3);

        jPanel9.setBackground(new java.awt.Color(225, 216, 205));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UPDATED DATA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Perpetua Titling MT", 1, 12))); // NOI18N

        updatehistorytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "HistoryID", "OrderID", "ReceiptID", "OldProductName", "NewProductName", "UpdatedAt", "UpdatedBy"
            }
        ));
        jScrollPane5.setViewportView(updatehistorytable);

        jScrollPane7.setViewportView(jScrollPane5);

        jPanel9.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 910, 540));

        reportbut.addTab("updatehistory", jPanel9);

        jPanel4.setBackground(new java.awt.Color(225, 216, 205));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INVENTORY", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Perpetua Titling MT", 1, 12))); // NOI18N

        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product_ID", "Product_Name", "Category_ID", "Quantity"
            }
        ));
        jScrollPane3.setViewportView(inventoryTable);

        jScrollPane8.setViewportView(jScrollPane3);

        jPanel4.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 910, 540));

        reportbut.addTab("inventory", jPanel4);

        jPanel5.setBackground(new java.awt.Color(225, 216, 205));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PAYMENT TRANSACTIONS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Perpetua Titling MT", 1, 12))); // NOI18N

        paymentTable.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PaymentID", "ReceiptID", "CustomerName", "Sub Total", "Tax", "TotalWithTax", "ReferencePaymentMethod", "Reference", "Payment", "Change", "PaymentDate"
            }
        ));
        jScrollPane1.setViewportView(paymentTable);

        jScrollPane9.setViewportView(jScrollPane1);

        jPanel5.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 910, 500));

        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.white));
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 200, 30));

        jButton1.setBackground(new java.awt.Color(223, 216, 205));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search (1).png"))); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 110, 30));

        reportbut.addTab("transactions", jPanel5);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROFIT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Perpetua Titling MT", 1, 12))); // NOI18N

        reports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Report Item", "Details"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(reports);
        if (reports.getColumnModel().getColumnCount() > 0) {
            reports.getColumnModel().getColumn(0).setResizable(false);
            reports.getColumnModel().getColumn(1).setResizable(false);
        }

        jScrollPane10.setViewportView(jScrollPane4);

        jPanel7.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 870, 500));

        reportbut.addTab("report", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        reportbut.addTab("ROP", jPanel8);

        jPanel1.add(reportbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 930, 600));

        jPanel6.setBackground(new java.awt.Color(24, 57, 43));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(223, 216, 205), 4));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(223, 216, 205));
        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(223, 216, 205));
        jLabel1.setText("RESTRICTED!! for admin only");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 450, 60));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1270, 80));

        jButton3.setBackground(new java.awt.Color(223, 216, 205));
        jButton3.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/material-management_1.png"))); // NOI18N
        jButton3.setText("INVENTORY");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(24, 57, 23), 5, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 190, 90));

        jButton2.setBackground(new java.awt.Color(223, 216, 205));
        jButton2.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file_1.png"))); // NOI18N
        jButton2.setText("HISTORY SALES");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(24, 57, 23), 5, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 190, 90));

        jButton4.setBackground(new java.awt.Color(223, 216, 205));
        jButton4.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/money (1).png"))); // NOI18N
        jButton4.setText(" TRANSACTIONS");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(24, 57, 23), 5, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 190, 90));

        updatehistoryButton.setBackground(new java.awt.Color(223, 216, 205));
        updatehistoryButton.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        updatehistoryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/restock.png"))); // NOI18N
        updatehistoryButton.setText("UPDATE HISTORY");
        updatehistoryButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 57, 24), 5, true));
        updatehistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatehistoryButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updatehistoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 190, 90));

        jButton5.setBackground(new java.awt.Color(223, 216, 205));
        jButton5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        jButton5.setText("REPORT");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 57, 24), 5, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 190, 90));

        jButton8.setBackground(new java.awt.Color(223, 216, 205));
        jButton8.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/restock.png"))); // NOI18N
        jButton8.setText("REORDER POINT");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(23, 57, 24), 5, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 190, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        showSalesHistory();
        reportbut.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       showPaymentTable();
       reportbut.setSelectedIndex(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        reportbut.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    
    }//GEN-LAST:event_backActionPerformed
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     
    String query = "SELECT ReceiptID, Subtotal, TotalWithTax, PaymentMethod, Reference, Payment, `Change`, PaymentDate FROM Payment";

    // Ensure the reports JTable is initialized before updating
    DefaultTableModel reportsModel = (DefaultTableModel) reports.getModel();
    reportsModel.setRowCount(0);  // Clear the table before adding new data

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin", "root", "");
         PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        // Variables to store the totals
        double totalSales = 0.0;
        int totalOrders = 0;

        // Loop through the result set and calculate total sales
        while (rs.next()) {
            double totalWithTax = rs.getDouble("TotalWithTax");  // Use TotalWithTax
            totalSales += totalWithTax;  // Add TotalWithTax to total sales
            totalOrders++;  // Increment the order count
        }

        // Add rows to the table with the calculated data
        reportsModel.addRow(new Object[] { "Total Orders", totalOrders });
        reportsModel.addRow(new Object[] { "Total Sales (₱)", String.format("%.2f", totalSales) });

        // Optional: You can print the row data for debugging purposes
        System.out.println("Total Orders: " + totalOrders);
        System.out.println("Total Sales (₱): " + totalSales);
    } catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Error loading reports: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    ex.printStackTrace();
    }

    // After adding the data, update the table view to reflect the changes
    reports.revalidate();  // Revalidate the table to reflect changes
    reports.repaint();     // Repaint the table to make sure it's updated visually
     reportbut.setSelectedIndex(4);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       int close = JOptionPane.showConfirmDialog(null, "Going back to Menu", "Confirmation Box", JOptionPane.YES_NO_OPTION);
    
        if (close == JOptionPane.YES_OPTION) {
            Menu usr = new Menu();
            usr.setVisible(true);
            usr.pack();
            usr.setLocationRelativeTo(null);
            usr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_backMouseClicked

    private void updatehistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatehistoryButtonActionPerformed
        String fetchQuery = "SELECT * FROM `UpdateHistory`";

        try (Connection connection = DriverManager.getConnection(dbURL, dbUser, dbPassword)) {
         
            PreparedStatement pst = connection.prepareStatement(fetchQuery);
            ResultSet rs = pst.executeQuery();

            // Create a table model to hold the data
            DefaultTableModel tableModel = new DefaultTableModel();

            // Add columns to the table model
            tableModel.addColumn("HistoryID");
            tableModel.addColumn("OrderID");
            tableModel.addColumn("ReceiptID");
            tableModel.addColumn("OldProductName");
            tableModel.addColumn("NewProductName");
            tableModel.addColumn("UpdatedAt");
            tableModel.addColumn("UpdatedBy");

            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("HistoryID"),
                    rs.getInt("OrderID"),
                    rs.getInt("ReceiptID"),
                    rs.getString("OldProductName"),
                    rs.getString("NewProductName"),
                    rs.getTimestamp("UpdatedAt"),
                    rs.getString("UpdatedBy")
                };
                tableModel.addRow(rowData);
            }

            // Set the model to the table in your GUI
            updatehistorytable.setModel(tableModel);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error fetching update history: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        
    
    }
        reportbut.setSelectedIndex(1);
    }//GEN-LAST:event_updatehistoryButtonActionPerformed

    private void logsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logsActionPerformed
      
    }//GEN-LAST:event_logsActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
  // Get the selected row from the table
    int selectedRow = salesTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an order to remove.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Retrieve the OrderID, ReceiptID, and ProductName from the selected row
    int orderID = (int) salesTable.getValueAt(selectedRow, 2); // OrderID
    int receiptID = (int) salesTable.getValueAt(selectedRow, 0); // ReceiptID
    String oldProductName = (String) salesTable.getValueAt(selectedRow, 3); // ProductName

    // Ask the user for confirmation before proceeding with deletion
    int confirmation = JOptionPane.showConfirmDialog(this,
        "Are you sure you want to remove this order?",
        "Confirm Deletion",
        JOptionPane.YES_NO_OPTION);

    if (confirmation == JOptionPane.NO_OPTION) {
        return;
    }

    // Delete query for the Order table
    String deleteOrderQuery = "DELETE FROM `Order` WHERE OrderID = ? AND ReceiptID = ?";

    // Insert query for UpdateHistory table
    String insertHistoryQuery = "INSERT INTO `UpdateHistory` (OrderID, ReceiptID, OldProductName, NewProductName, UpdatedBy) VALUES (?, ?, ?, ?, ?)";

    try (Connection connection = DriverManager.getConnection(dbURL, dbUser, dbPassword)) {
        // Start transaction
        connection.setAutoCommit(false);

        // Step 1: Delete the order from the Order table
        try (PreparedStatement deleteStmt = connection.prepareStatement(deleteOrderQuery)) {
            deleteStmt.setInt(1, orderID);
            deleteStmt.setInt(2, receiptID);

            int rowsDeleted = deleteStmt.executeUpdate();
            if (rowsDeleted == 0) {
                JOptionPane.showMessageDialog(this, "Failed to remove the order.", "Error", JOptionPane.ERROR_MESSAGE);
                connection.rollback(); // Rollback in case of failure
                return;
            }
        }

        // Step 2: Log the deletion into the UpdateHistory table
        try (PreparedStatement insertStmt = connection.prepareStatement(insertHistoryQuery)) {
            insertStmt.setInt(1, orderID);
            insertStmt.setInt(2, receiptID);
            insertStmt.setString(3, oldProductName); // Old Product Name
            insertStmt.setString(4, null); // New Product Name (null for removals)
            insertStmt.setString(5, "AdminUser"); // Replace with dynamic username if available

            int rowsInserted = insertStmt.executeUpdate();
            if (rowsInserted == 0) {
                JOptionPane.showMessageDialog(this, "Failed to log the removal into history.", "Error", JOptionPane.ERROR_MESSAGE);
                connection.rollback(); // Rollback in case of failure
                return;
            }
        }

        // Commit the transaction
        connection.commit();

        // Notify the user and refresh the table
        JOptionPane.showMessageDialog(this, "Order removed and logged in history successfully.");
        showSalesHistory(); // Refresh the table to reflect changes
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error removing the order: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_removeActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // Get the selected row from the table
        int selectedRow = salesTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }

        // Retrieve the current values from the selected row
        String oldProductName = (String) salesTable.getValueAt(selectedRow, 3); // Old ProductName
        int orderID = (Integer) salesTable.getValueAt(selectedRow, 2);          // OrderID
        int receiptID = (Integer) salesTable.getValueAt(selectedRow, 0);        // ReceiptID

        // Display a dialog to get the new Product Name
        String newProductName = JOptionPane.showInputDialog(this, "Enter new Product Name:", oldProductName);
        if (newProductName == null || newProductName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product Name cannot be empty.");
            return;
        }

        // Ask the user for confirmation before proceeding with the update
        int confirmation = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to update the Product Name?",
            "Confirm Update",
            JOptionPane.YES_NO_OPTION);

        if (confirmation == JOptionPane.NO_OPTION) {
            return; // Exit if user cancels
        }

        // Prepare the SQL update query for ProductName
        String updateQuery = "UPDATE `Order` SET ProductName = ? WHERE OrderID = ? AND ReceiptID = ?";
        String insertHistoryQuery = "INSERT INTO `UpdateHistory` (OrderID, ReceiptID, OldProductName, NewProductName, UpdatedBy) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(dbURL, dbUser, dbPassword)) {
            // Start a transaction
            connection.setAutoCommit(false);

            // Update the ProductName in the Order table
            try (PreparedStatement updatePst = connection.prepareStatement(updateQuery)) {
                updatePst.setString(1, newProductName); // Set new ProductName
                updatePst.setInt(2, orderID);           // Set OrderID
                updatePst.setInt(3, receiptID);         // Set ReceiptID
                int rowsAffected = updatePst.executeUpdate();

                if (rowsAffected > 0) {
                    // Record the update in the UpdateHistory table
                    try (PreparedStatement historyPst = connection.prepareStatement(insertHistoryQuery)) {
                        historyPst.setInt(1, orderID);             // Set OrderID
                        historyPst.setInt(2, receiptID);           // Set ReceiptID
                        historyPst.setString(3, oldProductName);   // Set OldProductName
                        historyPst.setString(4, newProductName);   // Set NewProductName
                        historyPst.setString(5, "AdminUser");      // Replace with the actual username of the updater
                        historyPst.executeUpdate();
                    }

                    // Commit the transaction
                    connection.commit();
                    JOptionPane.showMessageDialog(this, "Product Name updated successfully.");

                    // Reload the data from the database and update the table view
                    showSalesHistory();  // Refresh the table to reflect the changes
                } else {
                    connection.rollback();
                    JOptionPane.showMessageDialog(this, "Failed to update the Product Name.");
                }
            } catch (SQLException e) {
                connection.rollback();
                throw e;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating the Product Name: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         reportbut.setSelectedIndex(5);
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logs;
    private javax.swing.JTable paymentTable;
    private javax.swing.JButton remove;
    private javax.swing.JTabbedPane reportbut;
    private javax.swing.JTable reports;
    private javax.swing.JTable salesTable;
    private javax.swing.JButton update;
    private javax.swing.JButton updatehistoryButton;
    private javax.swing.JTable updatehistorytable;
    // End of variables declaration//GEN-END:variables
}
