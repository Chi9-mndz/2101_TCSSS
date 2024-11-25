
package lacasadelespresso;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.awt.event.ItemEvent;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.print.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    private double totalAmount = 0.0;
  private boolean isTakeOut = false;
public class ReceiptPrinter {
    private JPanel receiptPanel; 

    public ReceiptPrinter(JPanel panel) {
        this.receiptPanel = panel;
    }
}
private String productName;
private String size;
private int quantity;
private double price;
private String diningLocation;
private double totalprice;
   
    public Menu() {
        initComponents();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public class Admin { 

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/admin", 
                "root",  
                ""       
            );

            System.out.println("Database connected successfully!");
        } catch (ClassNotFoundException ex) {
           
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
          
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        btnAns = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        IceCoffee = new javax.swing.JButton();
        Frapuccino = new javax.swing.JButton();
        HotCoffee = new javax.swing.JButton();
        Pastries = new javax.swing.JButton();
        Milktea = new javax.swing.JButton();
        ComboMeals = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel221 = new javax.swing.JLabel();
        DineIn = new javax.swing.JRadioButton();
        TakeOut = new javax.swing.JRadioButton();
        jLabel225 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel226 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel227 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        extraice = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        boba = new javax.swing.JButton();
        extraice2 = new javax.swing.JButton();
        crushed = new javax.swing.JButton();
        tea = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        HoneyAlmond = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        EspressoMacchiato = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cappuccino = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        flatWhite = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        caffe_americano = new javax.swing.JButton();
        CaffeLatte = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        VanillaLatte = new javax.swing.JButton();
        CaramelMacchiato = new javax.swing.JButton();
        jLabel149 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jLabel251 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel252 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        IcedCaramel = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        IcedVanillaLatte = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        IcedCoffee = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        IcedShaken = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        IcedAmericano = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        IcedWhite = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        IcedCaramelLatte = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();
        jLabel276 = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        jLabel285 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jLabel287 = new javax.swing.JLabel();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jLabel290 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        jLabel293 = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        jLabel297 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jLabel299 = new javax.swing.JLabel();
        jLabel300 = new javax.swing.JLabel();
        jLabel301 = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        jLabel303 = new javax.swing.JLabel();
        jLabel304 = new javax.swing.JLabel();
        jLabel305 = new javax.swing.JLabel();
        jLabel306 = new javax.swing.JLabel();
        jLabel307 = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        jLabel309 = new javax.swing.JLabel();
        jLabel310 = new javax.swing.JLabel();
        jLabel311 = new javax.swing.JLabel();
        jLabel312 = new javax.swing.JLabel();
        jLabel313 = new javax.swing.JLabel();
        jLabel314 = new javax.swing.JLabel();
        jLabel315 = new javax.swing.JLabel();
        jLabel316 = new javax.swing.JLabel();
        jLabel317 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        mocha = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        CaramelCreame = new javax.swing.JButton();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        CaffeVanilla = new javax.swing.JButton();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        JavaChip = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        mochacookiee = new javax.swing.JButton();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        StrawberryCreame = new javax.swing.JButton();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        ChocoCookieeCrumble = new javax.swing.JButton();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        WhiteChocoCream = new javax.swing.JButton();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel318 = new javax.swing.JLabel();
        jLabel319 = new javax.swing.JLabel();
        jLabel320 = new javax.swing.JLabel();
        jLabel321 = new javax.swing.JLabel();
        jLabel322 = new javax.swing.JLabel();
        jLabel323 = new javax.swing.JLabel();
        jLabel324 = new javax.swing.JLabel();
        jLabel325 = new javax.swing.JLabel();
        jLabel326 = new javax.swing.JLabel();
        jLabel327 = new javax.swing.JLabel();
        jLabel328 = new javax.swing.JLabel();
        jLabel329 = new javax.swing.JLabel();
        jLabel330 = new javax.swing.JLabel();
        jLabel331 = new javax.swing.JLabel();
        jLabel332 = new javax.swing.JLabel();
        jLabel333 = new javax.swing.JLabel();
        jLabel334 = new javax.swing.JLabel();
        jLabel335 = new javax.swing.JLabel();
        jLabel336 = new javax.swing.JLabel();
        jLabel337 = new javax.swing.JLabel();
        jLabel338 = new javax.swing.JLabel();
        jLabel339 = new javax.swing.JLabel();
        jLabel340 = new javax.swing.JLabel();
        jLabel341 = new javax.swing.JLabel();
        jLabel342 = new javax.swing.JLabel();
        jLabel343 = new javax.swing.JLabel();
        jLabel344 = new javax.swing.JLabel();
        jLabel345 = new javax.swing.JLabel();
        jLabel346 = new javax.swing.JLabel();
        jLabel347 = new javax.swing.JLabel();
        jLabel348 = new javax.swing.JLabel();
        jLabel349 = new javax.swing.JLabel();
        jLabel350 = new javax.swing.JLabel();
        jLabel351 = new javax.swing.JLabel();
        jLabel352 = new javax.swing.JLabel();
        jLabel353 = new javax.swing.JLabel();
        jLabel354 = new javax.swing.JLabel();
        jLabel355 = new javax.swing.JLabel();
        jLabel356 = new javax.swing.JLabel();
        jLabel357 = new javax.swing.JLabel();
        jLabel358 = new javax.swing.JLabel();
        jLabel359 = new javax.swing.JLabel();
        jLabel360 = new javax.swing.JLabel();
        jLabel361 = new javax.swing.JLabel();
        jLabel362 = new javax.swing.JLabel();
        jLabel363 = new javax.swing.JLabel();
        jLabel364 = new javax.swing.JLabel();
        jLabel365 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        CrispandCreame = new javax.swing.JButton();
        jLabel125 = new javax.swing.JLabel();
        DarkChoco = new javax.swing.JButton();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        BrownSugar = new javax.swing.JButton();
        LuxeCreamDelight = new javax.swing.JButton();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        SuenoDeMatcha = new javax.swing.JButton();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel366 = new javax.swing.JLabel();
        jLabel367 = new javax.swing.JLabel();
        jLabel368 = new javax.swing.JLabel();
        jLabel369 = new javax.swing.JLabel();
        jLabel370 = new javax.swing.JLabel();
        jLabel371 = new javax.swing.JLabel();
        jLabel372 = new javax.swing.JLabel();
        jLabel373 = new javax.swing.JLabel();
        jLabel374 = new javax.swing.JLabel();
        jLabel375 = new javax.swing.JLabel();
        jLabel376 = new javax.swing.JLabel();
        jLabel377 = new javax.swing.JLabel();
        jLabel378 = new javax.swing.JLabel();
        jLabel379 = new javax.swing.JLabel();
        jLabel380 = new javax.swing.JLabel();
        jLabel381 = new javax.swing.JLabel();
        jLabel382 = new javax.swing.JLabel();
        jLabel383 = new javax.swing.JLabel();
        jLabel384 = new javax.swing.JLabel();
        jLabel385 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        xmastreecookiee = new javax.swing.JButton();
        jLabel148 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        blueberry = new javax.swing.JButton();
        santaCookiee = new javax.swing.JButton();
        chocolatebrownies = new javax.swing.JButton();
        jLabel147 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        chocolateChip = new javax.swing.JButton();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        EggPesto = new javax.swing.JButton();
        mangocroissant = new javax.swing.JButton();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        buttercroissnat = new javax.swing.JButton();
        cholatecroissant = new javax.swing.JButton();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        redvelvet = new javax.swing.JButton();
        jLabel222 = new javax.swing.JLabel();
        jLabel386 = new javax.swing.JLabel();
        jLabel387 = new javax.swing.JLabel();
        jLabel388 = new javax.swing.JLabel();
        jLabel389 = new javax.swing.JLabel();
        jLabel390 = new javax.swing.JLabel();
        jLabel391 = new javax.swing.JLabel();
        jLabel392 = new javax.swing.JLabel();
        jLabel393 = new javax.swing.JLabel();
        jLabel394 = new javax.swing.JLabel();
        jLabel395 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        cm4 = new javax.swing.JButton();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        cm6 = new javax.swing.JButton();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        cm2 = new javax.swing.JButton();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        c3 = new javax.swing.JButton();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        cm1 = new javax.swing.JButton();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        cm5 = new javax.swing.JButton();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        Payment = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel224 = new javax.swing.JLabel();
        jButton46 = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        PrintReceipt = new javax.swing.JButton();
        NewOrder1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        Receipt = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        receiptTable = new javax.swing.JTable();
        jLabel179 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        paymentTable = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(77, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Edwardian Script ITC", 3, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(223, 216, 205));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("La Casa del Espresso");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 490, 50));

        jPanel1.setBackground(new java.awt.Color(24, 57, 43));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(223, 216, 205), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IceCoffee.setBackground(new java.awt.Color(223, 216, 205));
        IceCoffee.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        IceCoffee.setText("ICE COFFEES");
        IceCoffee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        IceCoffee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IceCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IceCoffeeActionPerformed(evt);
            }
        });
        jPanel1.add(IceCoffee, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 30));

        Frapuccino.setBackground(new java.awt.Color(223, 216, 205));
        Frapuccino.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        Frapuccino.setText("FRAPPUCCINO");
        Frapuccino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Frapuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrapuccinoActionPerformed(evt);
            }
        });
        jPanel1.add(Frapuccino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 120, -1));

        HotCoffee.setBackground(new java.awt.Color(223, 216, 205));
        HotCoffee.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        HotCoffee.setText("HOT COFFEES");
        HotCoffee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        HotCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HotCoffeeActionPerformed(evt);
            }
        });
        jPanel1.add(HotCoffee, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 30));

        Pastries.setBackground(new java.awt.Color(223, 216, 205));
        Pastries.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        Pastries.setText("PASTRIES");
        Pastries.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Pastries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PastriesActionPerformed(evt);
            }
        });
        jPanel1.add(Pastries, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 120, -1));

        Milktea.setBackground(new java.awt.Color(223, 216, 205));
        Milktea.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        Milktea.setText("MILKTEA");
        Milktea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Milktea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilkteaActionPerformed(evt);
            }
        });
        jPanel1.add(Milktea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 120, -1));

        ComboMeals.setBackground(new java.awt.Color(223, 216, 205));
        ComboMeals.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        ComboMeals.setText("COMBO MEALS");
        ComboMeals.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        ComboMeals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMealsActionPerformed(evt);
            }
        });
        jPanel1.add(ComboMeals, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 690, 120, 30));

        jLabel1.setBackground(new java.awt.Color(223, 216, 205));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MENU6.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 100, 80));

        jLabel10.setBackground(new java.awt.Color(223, 216, 205));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MENU.png"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 70));

        jLabel11.setBackground(new java.awt.Color(223, 216, 205));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu2.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 70));

        jLabel12.setBackground(new java.awt.Color(223, 216, 205));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu3.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 100, 80));

        jLabel13.setBackground(new java.awt.Color(223, 216, 205));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MENU4.png"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, 70));

        jLabel14.setBackground(new java.awt.Color(223, 216, 205));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu5.png"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 100, 70));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, 730));

        jTabbedPane2.setBackground(new java.awt.Color(223, 216, 205));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENU", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Palatino Linotype", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane2.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(223, 216, 205));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel221.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel221.setText("- ADD ONS FOR MILKTEAS:");
        jPanel2.add(jLabel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 270, -1));

        btnAns.add(DineIn);
        DineIn.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        DineIn.setText("DINE IN");
        DineIn.setBorder(null);
        DineIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DineInActionPerformed(evt);
            }
        });
        jPanel2.add(DineIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 30));

        btnAns.add(TakeOut);
        TakeOut.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        TakeOut.setText("TAKE OUT");
        TakeOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakeOutActionPerformed(evt);
            }
        });
        jPanel2.add(TakeOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel225.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel225.setText("- CHOOSE YOUR PREFERENCE:");
        jPanel2.add(jLabel225, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Shot of Espresso:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, 30));

        jComboBox4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Warm", "Steamed", "Extra Hot" }));
        jComboBox4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.white));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));

        jLabel226.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel226.setText("SUGAR LEVEL:");
        jPanel2.add(jLabel226, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 100, 20));

        jComboBox3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Extra Foam", "Light Foam", "Foam" }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.white));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 100, 30));

        jLabel227.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel227.setText("MILK");
        jPanel2.add(jLabel227, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 50, 20));

        jComboBox2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Signature Espresso", "Blonde Espresso", "Decaf Espresso Roast", "1/2 Decaf", "1/3 Decaf" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.white));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 30));

        jLabel228.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel228.setText("ESPRESSO AND SHOTS");
        jPanel2.add(jLabel228, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 160, 30));

        jLabel229.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel229.setText("- ADD ONS FOR COFFEES:");
        jPanel2.add(jLabel229, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 270, -1));

        jLabel230.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel230.setText("MILK");
        jPanel2.add(jLabel230, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 70, 20));

        jComboBox1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20%", "50%", "70%", "100%" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.white));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 80, 30));

        extraice.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        extraice.setText("EXTRA ICE");
        extraice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        extraice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraiceActionPerformed(evt);
            }
        });
        jPanel2.add(extraice, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 30));

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton2.setText("EXTRA WATER");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 100, 30));

        boba.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        boba.setText("EXTRA BOBA");
        boba.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        boba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bobaActionPerformed(evt);
            }
        });
        jPanel2.add(boba, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 90, 30));

        extraice2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        extraice2.setText("EXTRA ICE");
        extraice2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        extraice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraice2ActionPerformed(evt);
            }
        });
        jPanel2.add(extraice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 80, 30));

        crushed.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        crushed.setText("EXTRA CRUSHED OREO");
        crushed.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        crushed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crushedActionPerformed(evt);
            }
        });
        jPanel2.add(crushed, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 150, 30));

        tea.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tea.setText("EXTRA TEA");
        tea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teaActionPerformed(evt);
            }
        });
        jPanel2.add(tea, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 80, 30));

        jSpinner1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.white));
        jSpinner1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jSpinner1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 60, 30));

        jTabbedPane2.addTab("PREFERENCE", jPanel2);

        jPanel4.setBackground(new java.awt.Color(223, 216, 205));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel2.setText("-FLAT WHITES");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 170, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hcof2.png"))); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, 90));

        jLabel16.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel16.setText("-MACHIATOS");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 180, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hcof3.png"))); // NOI18N
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, 90));

        HoneyAlmond.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        HoneyAlmond.setText("HONEY ALMOND MILK");
        HoneyAlmond.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        HoneyAlmond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoneyAlmondActionPerformed(evt);
            }
        });
        jPanel4.add(HoneyAlmond, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 140, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel18.setText("and a velvety milk foam topping.");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 160, 20));

        EspressoMacchiato.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        EspressoMacchiato.setText("ESPRESSO MACCHIATO");
        EspressoMacchiato.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        EspressoMacchiato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspressoMacchiatoActionPerformed(evt);
            }
        });
        jPanel4.add(EspressoMacchiato, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 160, 20));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("120 Calories");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 70, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel20.setText("topped with perfectly steamed milk.");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 210, 20));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("190 Calories");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 70, 20));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel22.setText("ground coffee beans.");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 160, 20));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel23.setText("creamy steamed almond milk for a nutty, aromatic twist.");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 270, 20));

        jLabel24.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel24.setText("-CAPPUCCINOS");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hcof1.png"))); // NOI18N
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 90));

        cappuccino.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        cappuccino.setText("CAPPUCCINO");
        cappuccino.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        cappuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cappuccinoActionPerformed(evt);
            }
        });
        jPanel4.add(cappuccino, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 130, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("140 Calories");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 70, 20));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel27.setText("-Blend of bold espresso, steamed milk,");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 190, 20));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel28.setText("-Velvety smooth espresso-based coffee");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 190, 20));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hcof2.png"))); // NOI18N
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 90));

        flatWhite.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        flatWhite.setText("FLAT WHITE");
        flatWhite.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        flatWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flatWhiteActionPerformed(evt);
            }
        });
        jPanel4.add(flatWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 130, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("170 Calories");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 70, 20));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel31.setText("topped with a thin layer of silky steamed milk");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 220, 20));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel32.setText("-A smooth and velvety espresso-based coffee,");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 220, 20));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel33.setText("delicately sweetened with honey and topped with");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 240, 20));

        jLabel34.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel34.setText("-AMERICANOS");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hcof.png"))); // NOI18N
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 90));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hcof5.png"))); // NOI18N
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, 90));

        caffe_americano.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        caffe_americano.setText("CAFFE AMERICANO");
        caffe_americano.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        caffe_americano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caffe_americanoActionPerformed(evt);
            }
        });
        jPanel4.add(caffe_americano, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, -1));

        CaffeLatte.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        CaffeLatte.setText("CAFFE LATTE");
        CaffeLatte.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        CaffeLatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaffeLatteActionPerformed(evt);
            }
        });
        jPanel4.add(CaffeLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 130, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel37.setText("T");
        jPanel4.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 10, 20));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel38.setText("-Shots of espresso using freshly ");
        jPanel4.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 160, 20));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel39.setText("-Espresso and steamed milk, topped");
        jPanel4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 180, 20));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setText("190 Calories");
        jPanel4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 70, 20));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel41.setText("featuring espresso, steamed milk, and a ");
        jPanel4.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 200, 20));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel42.setText("-Creamy espresso-based coffee infused");
        jPanel4.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 200, 20));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel43.setText("with the delicate sweetness of vanilla syrup,");
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 210, 20));

        jLabel44.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel44.setText("-LATTES");
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 180, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hcof3.png"))); // NOI18N
        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, 90));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hcof4.png"))); // NOI18N
        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, 90));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel47.setText("190 Calories");
        jPanel4.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 70, 20));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel48.setText("190 Calories");
        jPanel4.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 70, 20));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel49.setText("with a light layer of froth.");
        jPanel4.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 180, 20));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel50.setText("-A deliciously sweet and creamy coffee drink");
        jPanel4.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 210, 20));

        VanillaLatte.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        VanillaLatte.setText("VANILLA LATTE");
        VanillaLatte.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        VanillaLatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VanillaLatteActionPerformed(evt);
            }
        });
        jPanel4.add(VanillaLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 130, -1));

        CaramelMacchiato.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        CaramelMacchiato.setText("CARAMEL MACCHIATO");
        CaramelMacchiato.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        CaramelMacchiato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaramelMacchiatoActionPerformed(evt);
            }
        });
        jPanel4.add(CaramelMacchiato, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 150, -1));

        jLabel149.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel149.setText("rich caramel flavor.");
        jPanel4.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 180, 20));

        jLabel169.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel169.setText("of foamed milk.");
        jPanel4.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 80, 20));

        jLabel170.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel170.setText("-A shot of espresso, topped with a dollop ");
        jPanel4.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 200, 20));

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("₱ 180.00");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 70, 30));

        jLabel231.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel231.setText("15 Calories");
        jPanel4.add(jLabel231, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 70, 20));

        jLabel232.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel232.setText("G");
        jPanel4.add(jLabel232, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 10, 20));

        jLabel233.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel233.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel233.setText("₱ 85.00");
        jPanel4.add(jLabel233, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 70, 30));

        jLabel234.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel234.setText("V");
        jPanel4.add(jLabel234, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 10, 20));

        jLabel235.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel235.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel235.setText("₱ 110.00");
        jPanel4.add(jLabel235, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 70, 30));

        jLabel236.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel236.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel236.setText("₱ 60.00");
        jPanel4.add(jLabel236, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 70, 30));

        jLabel237.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel237.setText("G");
        jLabel237.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel237, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 10, 20));

        jLabel238.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel238.setText("V");
        jPanel4.add(jLabel238, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 10, 20));

        jLabel239.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel239.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel239.setText("₱ 80.00");
        jPanel4.add(jLabel239, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 70, 30));

        jLabel240.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel240.setText("T");
        jPanel4.add(jLabel240, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 10, 20));

        jLabel241.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel241.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel241.setText("₱ 100.00");
        jPanel4.add(jLabel241, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 70, 30));

        jLabel242.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel242.setText("G");
        jPanel4.add(jLabel242, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 10, 20));

        jLabel243.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel243.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel243.setText("₱ 70.00");
        jPanel4.add(jLabel243, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 70, 30));

        jLabel244.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel244.setText("V");
        jPanel4.add(jLabel244, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 10, 20));

        jLabel245.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel245.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel245.setText("₱ 80.00");
        jPanel4.add(jLabel245, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 70, 30));

        jLabel246.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel246.setText("T");
        jPanel4.add(jLabel246, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 10, 20));

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("₱ 110.00");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 70, 30));

        jLabel247.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel247.setText("G");
        jPanel4.add(jLabel247, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 10, 20));

        jLabel248.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel248.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel248.setText("₱ 70.00");
        jPanel4.add(jLabel248, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 70, 30));

        jLabel249.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel249.setText("V");
        jPanel4.add(jLabel249, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 10, 20));

        jLabel250.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel250.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel250.setText("₱ 90.00");
        jPanel4.add(jLabel250, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 70, 30));

        jLabel251.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel251.setText("T");
        jPanel4.add(jLabel251, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 10, 20));

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("₱ 150.00");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 70, 30));

        jLabel252.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel252.setText("G");
        jPanel4.add(jLabel252, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 10, 20));

        jLabel253.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel253.setText("V");
        jPanel4.add(jLabel253, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 10, 20));

        jLabel254.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel254.setText("T");
        jPanel4.add(jLabel254, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 10, 20));

        jLabel255.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel255.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel255.setText("₱ 50.00");
        jPanel4.add(jLabel255, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 70, 30));

        jLabel256.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel256.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel256.setText("₱ 70.00");
        jPanel4.add(jLabel256, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 70, 30));

        jLabel257.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel257.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel257.setText("₱ 100.00");
        jPanel4.add(jLabel257, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 70, 30));

        jLabel258.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel258.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel258.setText("₱ 70.00");
        jPanel4.add(jLabel258, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 70, 30));

        jLabel259.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel259.setText("G");
        jPanel4.add(jLabel259, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 10, 20));

        jLabel260.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel260.setText("V");
        jPanel4.add(jLabel260, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 10, 20));

        jLabel261.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel261.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel261.setText("₱ 80.00");
        jPanel4.add(jLabel261, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 70, 30));

        jLabel262.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel262.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel262.setText("₱ 110.00");
        jPanel4.add(jLabel262, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 70, 30));

        jLabel263.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel263.setText("T");
        jPanel4.add(jLabel263, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 10, 20));

        jLabel264.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel264.setText("G");
        jPanel4.add(jLabel264, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 10, 20));

        jLabel265.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel265.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel265.setText("₱ 70.00");
        jPanel4.add(jLabel265, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 70, 30));

        jLabel266.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel266.setText("V");
        jPanel4.add(jLabel266, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 10, 20));

        jLabel267.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel267.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel267.setText("₱ 90.00");
        jPanel4.add(jLabel267, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 70, 30));

        jLabel268.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel268.setText("T");
        jPanel4.add(jLabel268, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 10, 20));

        jLabel269.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel269.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel269.setText("₱ 110.00");
        jPanel4.add(jLabel269, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 70, 30));

        jLabel270.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel270.setText("G");
        jPanel4.add(jLabel270, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 10, 20));

        jLabel271.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel271.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel271.setText("₱ 70.00");
        jPanel4.add(jLabel271, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 70, 30));

        jLabel272.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel272.setText("V");
        jPanel4.add(jLabel272, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 10, 20));

        jLabel273.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel273.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel273.setText("₱ 80.00");
        jPanel4.add(jLabel273, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 70, 30));

        jLabel274.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel274.setText("T");
        jPanel4.add(jLabel274, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 10, 20));

        jLabel275.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel275.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel275.setText("₱ 110.00");
        jPanel4.add(jLabel275, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 70, 30));

        jTabbedPane2.addTab("HC", jPanel4);

        jPanel5.setBackground(new java.awt.Color(223, 216, 205));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel51.setText("-ICED MACCHIATOS");
        jPanel5.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 230, -1));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hcof6.png"))); // NOI18N
        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, 90));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel53.setText("250 Calories");
        jPanel5.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 70, 20));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel54.setText("brewed coffee.");
        jPanel5.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 80, 20));

        IcedCaramel.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        IcedCaramel.setText("ICED CARAMEL MACCHIATO");
        IcedCaramel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        IcedCaramel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IcedCaramelActionPerformed(evt);
            }
        });
        jPanel5.add(IcedCaramel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 180, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel55.setText("chocolate sauce, espresso, and cold milk.");
        jPanel5.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 210, 20));

        jLabel56.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel56.setText("-ICED LATTES");
        jPanel5.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 180, -1));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icecof12.png"))); // NOI18N
        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, 90));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel58.setText("190 Calories");
        jPanel5.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 70, 20));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel59.setText("with chilled water and ice.");
        jPanel5.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, 20));

        IcedVanillaLatte.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        IcedVanillaLatte.setText("ICED VANILLA LATTE");
        IcedVanillaLatte.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        IcedVanillaLatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IcedVanillaLatteActionPerformed(evt);
            }
        });
        jPanel5.add(IcedVanillaLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 140, -1));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel60.setText("vanilla sweetness.");
        jPanel5.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 90, 20));

        jLabel61.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel61.setText("-ICED COFFEES");
        jPanel5.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 230, -1));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icecof1.png"))); // NOI18N
        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 90));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel63.setText("5 Calories");
        jPanel5.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 70, 20));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel64.setText("-A classic cold brew made with freshly");
        jPanel5.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 190, 20));

        IcedCoffee.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        IcedCoffee.setText("ICED COFFEE");
        IcedCoffee.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        IcedCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IcedCoffeeActionPerformed(evt);
            }
        });
        jPanel5.add(IcedCoffee, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 120, -1));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel65.setText("cold milk, and topped with a rich caramel drizzle.");
        jPanel5.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 240, 20));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icecof2.png"))); // NOI18N
        jLabel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 90));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel67.setText("100 Calories");
        jPanel5.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 70, 20));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel68.setText("-Blend of espresso, ice, and");
        jPanel5.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 140, 20));

        IcedShaken.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        IcedShaken.setText("ICED SHAKEN ESPRESSO");
        IcedShaken.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        IcedShaken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IcedShakenActionPerformed(evt);
            }
        });
        jPanel5.add(IcedShaken, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 160, -1));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel70.setText("-Iced espresso drink, layered with vanilla syrup, ");
        jPanel5.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 230, 20));

        jLabel69.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel69.setText("-ICED AMERICANOS");
        jPanel5.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, -1));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icecof.png"))); // NOI18N
        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 90));

        IcedAmericano.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        IcedAmericano.setText("ICED CAFFE AMERICANO");
        IcedAmericano.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        IcedAmericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IcedAmericanoActionPerformed(evt);
            }
        });
        jPanel5.add(IcedAmericano, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, -1));

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel72.setText("15 Calories");
        jPanel5.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 70, 20));

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel73.setText("-Bold espresso-based coffee blended");
        jPanel5.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 190, 20));

        jLabel74.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel74.setText("-ICED MOCHAS");
        jPanel5.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 180, -1));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icecof3.png"))); // NOI18N
        jLabel75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, 90));

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel76.setText("390 Calories");
        jPanel5.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 70, 20));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel77.setText("caramel syrup, served over ice.");
        jPanel5.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 190, 20));

        IcedWhite.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        IcedWhite.setText("ICED WHITE CHOCOLATE MOCHA");
        IcedWhite.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        IcedWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IcedWhiteActionPerformed(evt);
            }
        });
        jPanel5.add(IcedWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 210, -1));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel78.setText("-Iced coffee drink made with rich white");
        jPanel5.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 190, 20));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel79.setText("served over ice and topped with cold milk.");
        jPanel5.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 210, 20));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icecof4.png"))); // NOI18N
        jLabel80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, 90));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel81.setText("400 Calories");
        jPanel5.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 70, 20));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel82.setText("-Blend of espresso, cold milk, and rich ");
        jPanel5.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 190, 20));

        IcedCaramelLatte.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        IcedCaramelLatte.setText("ICED CARAMEL LATTE");
        IcedCaramelLatte.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        IcedCaramelLatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IcedCaramelLatteActionPerformed(evt);
            }
        });
        jPanel5.add(IcedCaramelLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 140, -1));

        jLabel83.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel83.setText("-Espresso drink infused with vanilla syrup, ");
        jPanel5.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 210, 20));

        jLabel276.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel276.setText("G");
        jPanel5.add(jLabel276, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 10, 20));

        jLabel277.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel277.setText("G");
        jPanel5.add(jLabel277, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 10, 20));

        jLabel278.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel278.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel278.setText("₱ 190.00");
        jPanel5.add(jLabel278, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 70, 30));

        jLabel279.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel279.setText("V");
        jPanel5.add(jLabel279, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 10, 20));

        jLabel280.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel280.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel280.setText("₱ 90.00");
        jPanel5.add(jLabel280, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 70, 30));

        jLabel281.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel281.setText("T");
        jPanel5.add(jLabel281, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 10, 20));

        jLabel282.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel282.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel282.setText("₱ 130.00");
        jPanel5.add(jLabel282, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 70, 30));

        jLabel283.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel283.setText("G");
        jPanel5.add(jLabel283, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 10, 20));

        jLabel284.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel284.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel284.setText("₱ 130.00");
        jPanel5.add(jLabel284, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 70, 30));

        jLabel285.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel285.setText("V");
        jPanel5.add(jLabel285, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 10, 20));

        jLabel286.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel286.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel286.setText("₱ 190.00");
        jPanel5.add(jLabel286, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 70, 30));

        jLabel287.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel287.setText("T");
        jPanel5.add(jLabel287, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 10, 20));

        jLabel288.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel288.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel288.setText("₱ 90.00");
        jPanel5.add(jLabel288, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 70, 30));

        jLabel289.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel289.setText("G");
        jPanel5.add(jLabel289, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 10, 20));

        jLabel290.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel290.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel290.setText("₱ 80.00");
        jPanel5.add(jLabel290, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 70, 30));

        jLabel291.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel291.setText("V");
        jPanel5.add(jLabel291, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 10, 20));

        jLabel292.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel292.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel292.setText("₱ 110.00");
        jPanel5.add(jLabel292, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 70, 30));

        jLabel293.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel293.setText("T");
        jPanel5.add(jLabel293, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 10, 20));

        jLabel294.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel294.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel294.setText("₱ 150.00");
        jPanel5.add(jLabel294, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 70, 30));

        jLabel295.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel295.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel295.setText("₱ 80.00");
        jPanel5.add(jLabel295, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 70, 30));

        jLabel296.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel296.setText("V");
        jPanel5.add(jLabel296, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 10, 20));

        jLabel297.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel297.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel297.setText("₱ 110.00");
        jPanel5.add(jLabel297, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 70, 30));

        jLabel298.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel298.setText("T");
        jPanel5.add(jLabel298, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 10, 20));

        jLabel299.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel299.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel299.setText("₱ 150.00");
        jPanel5.add(jLabel299, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 70, 30));

        jLabel300.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel300.setText("G");
        jPanel5.add(jLabel300, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 10, 20));

        jLabel301.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel301.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel301.setText("₱ 60.00");
        jPanel5.add(jLabel301, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 70, 30));

        jLabel302.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel302.setText("V");
        jPanel5.add(jLabel302, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 10, 20));

        jLabel303.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel303.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel303.setText("₱ 70.00");
        jPanel5.add(jLabel303, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 70, 30));

        jLabel304.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel304.setText("T");
        jPanel5.add(jLabel304, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 10, 20));

        jLabel305.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel305.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel305.setText("₱ 90.00");
        jPanel5.add(jLabel305, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 70, 30));

        jLabel306.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel306.setText("G");
        jPanel5.add(jLabel306, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 10, 20));

        jLabel307.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel307.setText("V");
        jPanel5.add(jLabel307, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 10, 20));

        jLabel308.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel308.setText("V");
        jPanel5.add(jLabel308, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 10, 20));

        jLabel309.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel309.setText("G");
        jPanel5.add(jLabel309, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 10, 20));

        jLabel310.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel310.setText("T");
        jPanel5.add(jLabel310, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 10, 20));

        jLabel311.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel311.setText("T");
        jPanel5.add(jLabel311, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 10, 20));

        jLabel312.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel312.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel312.setText("₱ 80.00");
        jPanel5.add(jLabel312, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 70, 30));

        jLabel313.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel313.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel313.setText("₱ 130.00");
        jPanel5.add(jLabel313, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 70, 30));

        jLabel314.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel314.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel314.setText("₱ 190.00");
        jPanel5.add(jLabel314, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 70, 30));

        jLabel315.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel315.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel315.setText("₱ 220.00");
        jPanel5.add(jLabel315, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 70, 30));

        jLabel316.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel316.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel316.setText("₱ 150.00");
        jPanel5.add(jLabel316, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 70, 30));

        jLabel317.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel317.setText("₱ 110.00");
        jPanel5.add(jLabel317, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 70, 30));

        jTabbedPane2.addTab("IC", jPanel5);

        jPanel6.setBackground(new java.awt.Color(223, 216, 205));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel84.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel84.setText("-CREME FRAPPUCCINO");
        jPanel6.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 260, -1));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icecof6.png"))); // NOI18N
        jLabel85.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel6.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, 90));

        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel86.setText("370 Calories");
        jPanel6.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 70, 20));

        jLabel87.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel87.setText("a sprinkle of cookie bits.");
        jPanel6.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 210, 20));

        mocha.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        mocha.setText("MOCHA");
        mocha.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        mocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mochaActionPerformed(evt);
            }
        });
        jPanel6.add(mocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 120, -1));

        jLabel88.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel88.setText("and milk, topped with whipped cream.");
        jPanel6.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 210, 20));

        jLabel89.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel89.setText("topped with whipped cream and a sprinkle ");
        jPanel6.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 210, 20));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icecof11.png"))); // NOI18N
        jLabel90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel6.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, 90));

        CaramelCreame.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        CaramelCreame.setText("CARAMEL CREAME FRAPPUCCINO");
        CaramelCreame.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        CaramelCreame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaramelCreameActionPerformed(evt);
            }
        });
        jPanel6.add(CaramelCreame, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 210, -1));

        jLabel91.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel91.setText("480 Calories");
        jPanel6.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 70, 20));

        jLabel92.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel92.setText("-Mocha flavor with crunchy cookie crumbles,");
        jPanel6.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 210, 20));

        jLabel93.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel93.setText("with whipped cream.");
        jPanel6.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 100, 20));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icecof5.png"))); // NOI18N
        jLabel94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel6.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 90));

        CaffeVanilla.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        CaffeVanilla.setText("CAFFE VANILLA ");
        CaffeVanilla.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        CaffeVanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaffeVanillaActionPerformed(evt);
            }
        });
        jPanel6.add(CaffeVanilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, -1));

        jLabel95.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel95.setText("420 Calories");
        jPanel6.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 70, 20));

        jLabel96.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel96.setText("topped with whipped cream.");
        jPanel6.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 160, 20));

        jLabel97.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel97.setText("topped with whipped cream.");
        jPanel6.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 170, 20));

        jLabel98.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel98.setText("espresso, and a creamy texture, topped");
        jPanel6.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 200, 20));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icecof9.png"))); // NOI18N
        jLabel99.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel6.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 90));

        JavaChip.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        JavaChip.setText("JAVA CHIP");
        JavaChip.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        JavaChip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JavaChipActionPerformed(evt);
            }
        });
        jPanel6.add(JavaChip, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 120, -1));

        jLabel100.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel100.setText("440 Calories");
        jPanel6.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 70, 20));

        jLabel101.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel101.setText("-Coffee drink with rich chocolate chips,");
        jPanel6.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 210, 20));

        jLabel102.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel102.setText("-Espresso, chocolate syrup, and ice, ");
        jPanel6.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 170, 20));

        jLabel103.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel103.setText("-COFFEE FRAPPUCCINO");
        jPanel6.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, -1));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icecof.png"))); // NOI18N
        jLabel104.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel6.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 90));

        mochacookiee.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        mochacookiee.setText("MOCHA COOKIE CRUMBLE");
        mochacookiee.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        mochacookiee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mochacookieeActionPerformed(evt);
            }
        });
        jPanel6.add(mochacookiee, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 170, -1));

        jLabel105.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel105.setText("-Espresso drink with rich vanilla flavor, ice, ");
        jPanel6.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 210, 20));

        jLabel106.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel106.setText("410 Calories");
        jPanel6.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 70, 20));

        jLabel107.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel107.setText("and more cookie crumbles.");
        jPanel6.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 190, 20));

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icecof7.png"))); // NOI18N
        jLabel108.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel6.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, 90));

        StrawberryCreame.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        StrawberryCreame.setText("STRAWBERRY CREAM");
        StrawberryCreame.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        StrawberryCreame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrawberryCreameActionPerformed(evt);
            }
        });
        jPanel6.add(StrawberryCreame, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 170, -1));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel109.setText("370 Calories");
        jPanel6.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 70, 20));

        jLabel110.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel110.setText("-Strawberry flavor, milk, and ice, ");
        jPanel6.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 160, 20));

        jLabel111.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel111.setText("topped with whipped cream.");
        jPanel6.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 210, 20));

        jLabel112.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel112.setText("espresso, topped with whipped cream ");
        jPanel6.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 190, 20));

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icecof8.png"))); // NOI18N
        jLabel113.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel6.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, 90));

        ChocoCookieeCrumble.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        ChocoCookieeCrumble.setText("CHOCOLATE COOKIEE CRUMBLE");
        ChocoCookieeCrumble.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        ChocoCookieeCrumble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChocoCookieeCrumbleActionPerformed(evt);
            }
        });
        jPanel6.add(ChocoCookieeCrumble, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 210, -1));

        jLabel114.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel114.setText("460 Calories");
        jPanel6.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 70, 20));

        jLabel115.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel115.setText("-Chocolate cookies, rich mocha flavor, and ");
        jPanel6.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 210, 20));

        jLabel116.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel116.setText("with whipped cream and a drizzle of caramel.");
        jPanel6.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 230, 20));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Icecof10.png"))); // NOI18N
        jLabel117.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel6.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, 90));

        WhiteChocoCream.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        WhiteChocoCream.setText("WHITE CHOCOLATE CREAM");
        WhiteChocoCream.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        WhiteChocoCream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhiteChocoCreamActionPerformed(evt);
            }
        });
        jPanel6.add(WhiteChocoCream, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 180, -1));

        jLabel118.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel118.setText("350 Calories");
        jPanel6.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 70, 20));

        jLabel119.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel119.setText("-Rich white chocolate flavor, ice, and milk,");
        jPanel6.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 210, 20));

        jLabel120.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel120.setText("-Rich caramel flavor, milk, and ice, topped ");
        jPanel6.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 210, 20));

        jLabel318.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel318.setText("G");
        jPanel6.add(jLabel318, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 10, 20));

        jLabel319.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel319.setText("V");
        jPanel6.add(jLabel319, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 10, 20));

        jLabel320.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel320.setText("T");
        jPanel6.add(jLabel320, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, 10, 20));

        jLabel321.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel321.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel321.setText("₱ 120.00");
        jPanel6.add(jLabel321, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 70, 30));

        jLabel322.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel322.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel322.setText("₱ 200.00");
        jPanel6.add(jLabel322, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 70, 30));

        jLabel323.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel323.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel323.setText("₱ 200.00");
        jPanel6.add(jLabel323, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 70, 30));

        jLabel324.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel324.setText("G");
        jPanel6.add(jLabel324, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 10, 20));

        jLabel325.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel325.setText("V");
        jPanel6.add(jLabel325, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 10, 20));

        jLabel326.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel326.setText("T");
        jPanel6.add(jLabel326, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 10, 20));

        jLabel327.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel327.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel327.setText("₱ 120.00");
        jPanel6.add(jLabel327, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 70, 30));

        jLabel328.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel328.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel328.setText("₱ 180.00");
        jPanel6.add(jLabel328, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 70, 30));

        jLabel329.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel329.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel329.setText("₱ 180.00");
        jPanel6.add(jLabel329, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 70, 30));

        jLabel330.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel330.setText("G");
        jPanel6.add(jLabel330, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 10, 20));

        jLabel331.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel331.setText("V");
        jPanel6.add(jLabel331, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 10, 20));

        jLabel332.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel332.setText("T");
        jPanel6.add(jLabel332, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 10, 20));

        jLabel333.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel333.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel333.setText("₱ 120.00");
        jPanel6.add(jLabel333, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 70, 30));

        jLabel334.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel334.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel334.setText("₱ 180.00");
        jPanel6.add(jLabel334, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 70, 30));

        jLabel335.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel335.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel335.setText("₱ 200.00");
        jPanel6.add(jLabel335, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 70, 30));

        jLabel336.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel336.setText("G");
        jPanel6.add(jLabel336, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 10, 20));

        jLabel337.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel337.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel337.setText("₱ 120.00");
        jPanel6.add(jLabel337, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 70, 30));

        jLabel338.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel338.setText("V");
        jPanel6.add(jLabel338, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 10, 20));

        jLabel339.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel339.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel339.setText("₱ 180.00");
        jPanel6.add(jLabel339, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 70, 30));

        jLabel340.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel340.setText("T");
        jPanel6.add(jLabel340, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 10, 20));

        jLabel341.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel341.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel341.setText("₱ 200.00");
        jPanel6.add(jLabel341, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 70, 30));

        jLabel342.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel342.setText("G");
        jPanel6.add(jLabel342, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 10, 20));

        jLabel343.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel343.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel343.setText("₱ 120.00");
        jPanel6.add(jLabel343, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 70, 30));

        jLabel344.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel344.setText("V");
        jPanel6.add(jLabel344, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 10, 20));

        jLabel345.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel345.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel345.setText("₱ 180.00");
        jPanel6.add(jLabel345, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 70, 30));

        jLabel346.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel346.setText("T");
        jPanel6.add(jLabel346, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 10, 20));

        jLabel347.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel347.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel347.setText("₱ 200.00");
        jPanel6.add(jLabel347, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 70, 30));

        jLabel348.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel348.setText("G");
        jPanel6.add(jLabel348, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 10, 20));

        jLabel349.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel349.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel349.setText("₱ 120.00");
        jPanel6.add(jLabel349, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 70, 30));

        jLabel350.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel350.setText("V");
        jPanel6.add(jLabel350, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 10, 20));

        jLabel351.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel351.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel351.setText("₱ 180.00");
        jPanel6.add(jLabel351, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 70, 30));

        jLabel352.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel352.setText("T");
        jPanel6.add(jLabel352, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 10, 20));

        jLabel353.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel353.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel353.setText("₱ 200.00");
        jPanel6.add(jLabel353, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 70, 30));

        jLabel354.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel354.setText("G");
        jPanel6.add(jLabel354, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 10, 20));

        jLabel355.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel355.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel355.setText("₱ 120.00");
        jPanel6.add(jLabel355, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 70, 30));

        jLabel356.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel356.setText("V");
        jPanel6.add(jLabel356, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 10, 20));

        jLabel357.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel357.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel357.setText("₱ 180.00");
        jPanel6.add(jLabel357, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 70, 30));

        jLabel358.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel358.setText("T");
        jPanel6.add(jLabel358, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 10, 20));

        jLabel359.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel359.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel359.setText("₱ 200.00");
        jPanel6.add(jLabel359, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 70, 30));

        jLabel360.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel360.setText("G");
        jPanel6.add(jLabel360, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 10, 20));

        jLabel361.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel361.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel361.setText("₱ 120.00");
        jPanel6.add(jLabel361, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 70, 30));

        jLabel362.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel362.setText("V");
        jPanel6.add(jLabel362, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 10, 20));

        jLabel363.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel363.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel363.setText("₱ 180.00");
        jPanel6.add(jLabel363, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 70, 30));

        jLabel364.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel364.setText("T");
        jPanel6.add(jLabel364, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 10, 20));

        jLabel365.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel365.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel365.setText("₱ 200.00");
        jPanel6.add(jLabel365, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 70, 30));

        jTabbedPane2.addTab("F", jPanel6);

        jPanel8.setBackground(new java.awt.Color(223, 216, 205));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel121.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel121.setText("-MILKTEAS");
        jPanel8.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/M4.png"))); // NOI18N
        jLabel122.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel8.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, 90));

        jLabel123.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel123.setText("350 Calories");
        jPanel8.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 70, 20));

        CrispandCreame.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        CrispandCreame.setText("CRISP AND CREAM DELIGHT");
        CrispandCreame.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        CrispandCreame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrispandCreameActionPerformed(evt);
            }
        });
        jPanel8.add(CrispandCreame, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 190, -1));

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/M.png"))); // NOI18N
        jLabel125.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel8.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 90));

        DarkChoco.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        DarkChoco.setText("DARK CHOCO TRIO");
        DarkChoco.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        DarkChoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DarkChocoActionPerformed(evt);
            }
        });
        jPanel8.add(DarkChoco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 170, -1));

        jLabel126.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel126.setText("170 Calories");
        jPanel8.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 70, 20));

        jLabel127.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel127.setText("deep, caramelized flavor.  ");
        jPanel8.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 210, 20));

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/M1.png"))); // NOI18N
        jLabel128.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel8.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 90));

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/M2.png"))); // NOI18N
        jLabel129.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel8.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 90));

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/M3.png"))); // NOI18N
        jLabel130.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel8.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, 90));

        BrownSugar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        BrownSugar.setText("BROWN SUGAR VELVET");
        BrownSugar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        BrownSugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrownSugarActionPerformed(evt);
            }
        });
        jPanel8.add(BrownSugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 170, -1));

        LuxeCreamDelight.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        LuxeCreamDelight.setText("LUXE CREAM DELIGHT");
        LuxeCreamDelight.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        LuxeCreamDelight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuxeCreamDelightActionPerformed(evt);
            }
        });
        jPanel8.add(LuxeCreamDelight, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 170, -1));

        jLabel131.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel131.setText("370 Calories");
        jPanel8.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 70, 20));

        jLabel132.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel132.setText("450 Calories");
        jPanel8.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 70, 20));

        jLabel133.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel133.setText("150 Calories");
        jPanel8.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 70, 20));

        jLabel134.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel134.setText("-Brown sugar syrup, offering a smooth, caramelized ");
        jPanel8.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 250, 20));

        jLabel135.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel135.setText("flavor of cheesecake.");
        jPanel8.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 220, 20));

        jLabel136.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel136.setText("-A rich and creamy milk tea infused with the decadent ");
        jPanel8.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 260, 20));

        SuenoDeMatcha.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        SuenoDeMatcha.setText("SUENO DE MATCHA");
        SuenoDeMatcha.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        SuenoDeMatcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuenoDeMatchaActionPerformed(evt);
            }
        });
        jPanel8.add(SuenoDeMatcha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 170, -1));

        jLabel137.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel137.setText("-A rich dark chocolate milk tea sweetened ");
        jPanel8.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 210, 20));

        jLabel138.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel138.setText("with warm brown sugar syrup, giving it a");
        jPanel8.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 210, 20));

        jLabel139.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel139.setText("ice for a refreshing indulgence.  ");
        jPanel8.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 210, 20));

        jLabel140.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel140.setText("flavor paired with black tea and milk, served over");
        jPanel8.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 240, 20));

        jLabel141.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel141.setText("-High-quality matcha powder, offering a perfect balance ");
        jPanel8.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 280, 20));

        jLabel142.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel142.setText("of earthy matcha flavor and rich, velvety milk.");
        jPanel8.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 220, 20));

        jLabel143.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel143.setText("-Creamy texture of milk tea with the rich ");
        jPanel8.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 190, 20));

        jLabel144.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel144.setText("rich flavor of chocolate cookies and cream.");
        jPanel8.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 210, 20));

        jLabel366.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel366.setText("M");
        jPanel8.add(jLabel366, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 10, 20));

        jLabel367.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel367.setText("G");
        jPanel8.add(jLabel367, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 10, 20));

        jLabel368.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel368.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel368.setText("₱ 90.00");
        jPanel8.add(jLabel368, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 70, 30));

        jLabel369.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel369.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel369.setText("₱ 130.00");
        jPanel8.add(jLabel369, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 70, 30));

        jLabel370.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel370.setText("M");
        jPanel8.add(jLabel370, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 10, 20));

        jLabel371.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel371.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel371.setText("₱ 90.00");
        jPanel8.add(jLabel371, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 70, 30));

        jLabel372.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel372.setText("G");
        jPanel8.add(jLabel372, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 10, 20));

        jLabel373.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel373.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel373.setText("₱ 130.00");
        jPanel8.add(jLabel373, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 70, 30));

        jLabel374.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel374.setText("M");
        jPanel8.add(jLabel374, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 10, 20));

        jLabel375.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel375.setText("M");
        jPanel8.add(jLabel375, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 10, 20));

        jLabel376.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel376.setText("M");
        jPanel8.add(jLabel376, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 10, 20));

        jLabel377.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel377.setText("G");
        jPanel8.add(jLabel377, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 10, 20));

        jLabel378.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel378.setText("G");
        jPanel8.add(jLabel378, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 10, 20));

        jLabel379.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel379.setText("G");
        jPanel8.add(jLabel379, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 10, 20));

        jLabel380.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel380.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel380.setText("₱ 90.00");
        jPanel8.add(jLabel380, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 70, 30));

        jLabel381.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel381.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel381.setText("₱ 130.00");
        jPanel8.add(jLabel381, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 70, 30));

        jLabel382.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel382.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel382.setText("₱ 130.00");
        jPanel8.add(jLabel382, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 70, 30));

        jLabel383.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel383.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel383.setText("₱ 130.00");
        jPanel8.add(jLabel383, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 70, 30));

        jLabel384.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel384.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel384.setText("₱ 90.00");
        jPanel8.add(jLabel384, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 70, 30));

        jLabel385.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel385.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel385.setText("₱ 90.00");
        jPanel8.add(jLabel385, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 70, 30));

        jTabbedPane2.addTab("M", jPanel8);

        jPanel9.setBackground(new java.awt.Color(223, 216, 205));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel124.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel124.setText("-CUPCAKES");
        jPanel9.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 130, -1));

        jLabel145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P3.png"))); // NOI18N
        jLabel145.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel9.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, 90));

        jLabel146.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel146.setText("170 Calories");
        jPanel9.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 70, 20));

        xmastreecookiee.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        xmastreecookiee.setText("CHRISTMAS TREE COOKIEE");
        xmastreecookiee.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        xmastreecookiee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xmastreecookieeActionPerformed(evt);
            }
        });
        jPanel9.add(xmastreecookiee, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 170, 20));

        jLabel148.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel148.setText("-BREAKFAST SANDWICHES");
        jPanel9.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, -1));

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P1.png"))); // NOI18N
        jLabel150.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel9.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 90));

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P4.png"))); // NOI18N
        jLabel151.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel9.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 90));

        blueberry.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        blueberry.setText("BLUEBERRY CUPCAKE");
        blueberry.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        blueberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueberryActionPerformed(evt);
            }
        });
        jPanel9.add(blueberry, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, 160, 20));

        santaCookiee.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        santaCookiee.setText("SANTA'S COOKIEE");
        santaCookiee.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        santaCookiee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                santaCookieeActionPerformed(evt);
            }
        });
        jPanel9.add(santaCookiee, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 160, 20));

        chocolatebrownies.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        chocolatebrownies.setText("DOUBLE CHOCOLATE BROWNIES");
        chocolatebrownies.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        chocolatebrownies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocolatebrowniesActionPerformed(evt);
            }
        });
        jPanel9.add(chocolatebrownies, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 220, 20));

        jLabel147.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel147.setText("170 Calories");
        jPanel9.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 70, 20));

        jLabel152.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel152.setText("170 Calories");
        jPanel9.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 70, 20));

        jLabel153.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel153.setText("170 Calories");
        jPanel9.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 70, 20));

        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P2.png"))); // NOI18N
        jLabel154.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel9.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, 90));

        jLabel155.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel155.setText("170 Calories");
        jPanel9.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 70, 20));

        chocolateChip.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        chocolateChip.setText("CHOCOLATE CHIP COOKIEE");
        chocolateChip.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        chocolateChip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chocolateChipActionPerformed(evt);
            }
        });
        jPanel9.add(chocolateChip, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 180, 20));

        jLabel156.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel156.setText("-BAKERY");
        jPanel9.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, -1));

        jLabel157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P.png"))); // NOI18N
        jLabel157.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel9.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 90));

        jLabel158.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel158.setText("170 Calories");
        jPanel9.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 70, 20));

        jLabel159.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel159.setText("170 Calories");
        jPanel9.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 70, 20));

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P5.png"))); // NOI18N
        jLabel160.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel9.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, 90));

        EggPesto.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        EggPesto.setText("EGG, PESTO AND MOZZARELLLA ");
        EggPesto.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        EggPesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EggPestoActionPerformed(evt);
            }
        });
        jPanel9.add(EggPesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 210, 20));

        mangocroissant.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        mangocroissant.setText("BAKED MANGO CROISSANT");
        mangocroissant.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        mangocroissant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangocroissantActionPerformed(evt);
            }
        });
        jPanel9.add(mangocroissant, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 180, 20));

        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P6.png"))); // NOI18N
        jLabel161.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel9.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, 90));

        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P7.png"))); // NOI18N
        jLabel162.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel9.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, 90));

        jLabel163.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel163.setText("170 Calories");
        jPanel9.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 70, 20));

        buttercroissnat.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        buttercroissnat.setText("BUTTER CROISSANT");
        buttercroissnat.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        buttercroissnat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttercroissnatActionPerformed(evt);
            }
        });
        jPanel9.add(buttercroissnat, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 160, 20));

        cholatecroissant.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        cholatecroissant.setText("CHOCOLATE CROISSANT");
        cholatecroissant.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        cholatecroissant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cholatecroissantActionPerformed(evt);
            }
        });
        jPanel9.add(cholatecroissant, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 160, 20));

        jLabel164.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel164.setText("-CROISSANTS");
        jPanel9.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 150, -1));

        jLabel165.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel165.setText("170 Calories");
        jPanel9.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 70, 20));

        jLabel166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P8.png"))); // NOI18N
        jLabel166.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel9.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, 90));

        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/P9.png"))); // NOI18N
        jLabel167.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel9.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, 90));

        jLabel168.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel168.setText("170 Calories");
        jPanel9.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 70, 20));

        redvelvet.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        redvelvet.setText("RED VELVET CUPCAKE");
        redvelvet.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        redvelvet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redvelvetActionPerformed(evt);
            }
        });
        jPanel9.add(redvelvet, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 160, 20));

        jLabel222.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel222.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel222.setText("₱ 150.00");
        jPanel9.add(jLabel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 90, 30));

        jLabel386.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel386.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel386.setText("₱ 190.00");
        jPanel9.add(jLabel386, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 90, 30));

        jLabel387.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel387.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel387.setText("₱ 190.00");
        jPanel9.add(jLabel387, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 90, 30));

        jLabel388.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel388.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel388.setText("₱ 170.00");
        jPanel9.add(jLabel388, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 90, 30));

        jLabel389.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel389.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel389.setText("₱ 170.00");
        jPanel9.add(jLabel389, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 90, 30));

        jLabel390.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel390.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel390.setText("₱ 170.00");
        jPanel9.add(jLabel390, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 90, 30));

        jLabel391.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel391.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel391.setText("₱ 180.00");
        jPanel9.add(jLabel391, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 90, 30));

        jLabel392.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel392.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel392.setText("₱ 180.00");
        jPanel9.add(jLabel392, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 90, 30));

        jLabel393.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel393.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel393.setText("₱ 180.00");
        jPanel9.add(jLabel393, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 90, 30));

        jLabel394.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel394.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel394.setText("₱ 200.00");
        jPanel9.add(jLabel394, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 90, 30));

        jLabel395.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel395.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel395.setText("₱ 150.00");
        jPanel9.add(jLabel395, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 90, 30));

        jTabbedPane2.addTab("P", jPanel9);

        jPanel10.setBackground(new java.awt.Color(223, 216, 205));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel171.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel171.setText("-COMBO MEALS");
        jPanel10.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        jLabel172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CM5.png"))); // NOI18N
        jLabel172.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, 90));

        jLabel173.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jLabel173.setText("WHITE CHOCOLATE CREAM");
        jPanel10.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 180, 30));

        cm4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        cm4.setText("CM 4");
        cm4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        cm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cm4ActionPerformed(evt);
            }
        });
        jPanel10.add(cm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 60, 20));

        jLabel174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CM.png"))); // NOI18N
        jLabel174.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 90));

        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CM1.png"))); // NOI18N
        jLabel175.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 90));

        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CM2.png"))); // NOI18N
        jLabel176.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 90));

        jLabel177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CM3.png"))); // NOI18N
        jLabel177.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, 90));

        jLabel178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CM4.png"))); // NOI18N
        jLabel178.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel10.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, 90));

        jLabel180.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jLabel180.setText("WITH JAVA CHIP FRAPPUCCINO");
        jPanel10.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 200, 30));

        jLabel181.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel181.setText("ICED SHAKEN ESPRESSO");
        jPanel10.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 180, 30));

        jLabel182.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jLabel182.setText("ICED VANILLA LATTE");
        jPanel10.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 130, 30));

        cm6.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        cm6.setText("CM 6");
        cm6.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        cm6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cm6ActionPerformed(evt);
            }
        });
        jPanel10.add(cm6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 60, 20));

        jLabel183.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jLabel183.setText("-CHOCOLATE CHIP COOKIE WITH");
        jPanel10.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 200, 20));

        jLabel184.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jLabel184.setText("-CHOCOLATE CHIP COOKIE WITH");
        jPanel10.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 200, 20));

        jLabel185.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jLabel185.setText("CARAMEL MACCHIATO");
        jPanel10.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 160, 30));

        cm2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        cm2.setText("CM 2");
        cm2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        cm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cm2ActionPerformed(evt);
            }
        });
        jPanel10.add(cm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 60, 20));

        jLabel186.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jLabel186.setText("-BAKED MANGO CROISSANT WITH");
        jPanel10.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 220, 20));

        jLabel187.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jLabel187.setText("-CHOCOLATE CROISSANT WITH");
        jPanel10.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 220, 20));

        c3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        c3.setText("CM 3");
        c3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        jPanel10.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 60, 20));

        jLabel188.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel188.setText("-CHRISTMAS TREE COOKIEE WITH ");
        jPanel10.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, 20));

        jLabel189.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel189.setText("CHOCOLATE COOKIE CRUMBLE");
        jPanel10.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 190, 30));

        cm1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        cm1.setText("CM 1");
        cm1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        cm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cm1ActionPerformed(evt);
            }
        });
        jPanel10.add(cm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 60, 20));

        jLabel190.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel190.setText("-BLUEBERRY CUPCAKE WITH");
        jPanel10.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 180, 20));

        jLabel191.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel191.setText("-RED VELVET CUPCAKE WITH");
        jPanel10.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 180, 20));

        cm5.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        cm5.setText("CM 5");
        cm5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        cm5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cm5ActionPerformed(evt);
            }
        });
        jPanel10.add(cm5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 60, 20));

        jLabel214.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel214.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel214.setText("₱ 355.00");
        jPanel10.add(jLabel214, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 90, 30));

        jLabel215.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel215.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel215.setText("₱ 355.00");
        jPanel10.add(jLabel215, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 80, 30));

        jLabel216.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel216.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel216.setText("₱ 355.00");
        jPanel10.add(jLabel216, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 80, 30));

        jLabel217.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel217.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel217.setText("₱ 355.00");
        jPanel10.add(jLabel217, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 90, 30));

        jLabel218.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel218.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel218.setText("₱ 355.00");
        jPanel10.add(jLabel218, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 90, 30));

        jLabel219.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel219.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel219.setText("₱ 355.00");
        jPanel10.add(jLabel219, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 90, 30));

        jTabbedPane2.addTab("CM", jPanel10);

        jPanel3.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 790, 700));

        jLabel220.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel220.setText("Customer's Name:");
        jPanel3.add(jLabel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Payment.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        Payment.setText("PAY");
        Payment.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.lightGray));
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });
        jPanel3.add(Payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 740, 170, -1));

        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel3.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 630, 190, 50));

        jLabel224.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel224.setForeground(new java.awt.Color(223, 216, 205));
        jLabel224.setText("TOTAL: ");
        jPanel3.add(jLabel224, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 650, 120, 30));

        jButton46.setBackground(new java.awt.Color(77, 0, 0));
        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/setting-lines.png"))); // NOI18N
        jButton46.setBorder(null);
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 10, 60, 40));

        removeButton.setBackground(new java.awt.Color(246, 244, 238));
        removeButton.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        removeButton.setText("DELETE ORDER");
        removeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        jPanel3.add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 700, 110, 30));

        PrintReceipt.setBackground(new java.awt.Color(246, 244, 238));
        PrintReceipt.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        PrintReceipt.setText("PRINT RECEIPT");
        PrintReceipt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PrintReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintReceiptActionPerformed(evt);
            }
        });
        jPanel3.add(PrintReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 700, 100, 30));

        NewOrder1.setBackground(new java.awt.Color(246, 244, 238));
        NewOrder1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        NewOrder1.setText("NEW ORDER");
        NewOrder1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewOrder1ActionPerformed(evt);
            }
        });
        jPanel3.add(NewOrder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 700, 110, 30));
        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, -1, -1));
        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 150, -1, -1));

        Receipt.setBackground(new java.awt.Color(255, 255, 255));
        Receipt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receipt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 0, 24))); // NOI18N
        Receipt.setForeground(new java.awt.Color(223, 216, 205));
        Receipt.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        Receipt.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ReceiptAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Receipt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        receiptTable.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        receiptTable.setForeground(new java.awt.Color(0, 51, 51));
        receiptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product", "Size", "Quantity", "Price", "Dining Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        receiptTable.setGridColor(new java.awt.Color(0, 0, 0));
        receiptTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        receiptTable.setSelectionForeground(new java.awt.Color(153, 153, 153));
        receiptTable.setShowGrid(false);
        receiptTable.setShowVerticalLines(true);
        receiptTable.setSurrendersFocusOnKeystroke(true);
        receiptTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                receiptTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(receiptTable);

        Receipt.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 70, 440, 320));

        jLabel179.setFont(new java.awt.Font("Perpetua", 1, 12)); // NOI18N
        jLabel179.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel179.setText("@LACASADELESPRESSO");
        jLabel179.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel179.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Receipt.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 130, 20));

        jLabel193.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel193.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel193.setText("La Casa del Espresso");
        jLabel193.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel193.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Receipt.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 330, 40));

        jLabel194.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLabel194.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel194.setText("THANKYOU FOR YOUR ORDER!");
        jLabel194.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel194.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Receipt.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 220, 20));

        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Labels", "Details"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        paymentTable.setShowGrid(true);
        paymentTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                paymentTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(paymentTable);

        Receipt.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 387, 440, 160));

        jPanel3.add(Receipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, 440, 570));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1410, 790));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NewOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewOrder1ActionPerformed
 // Add an ActionListener to the "New Transaction" button
NewOrder1.addActionListener(e -> {
    // Prompt to confirm starting a new transaction
    int choice = JOptionPane.showConfirmDialog(
        null,
        "Transact Another Order?",
        "Confirmation",
        JOptionPane.YES_NO_OPTION
    );

    if (choice == JOptionPane.YES_OPTION) {
        // Clear all rows from the receipt table
        DefaultTableModel receiptModel = (DefaultTableModel) receiptTable.getModel();
        receiptModel.setRowCount(0); // Clears all data in the receipt table

        // Clear all rows from the payment table
        DefaultTableModel paymentTableModel = (DefaultTableModel) paymentTable.getModel();
        paymentTableModel.setRowCount(0); // Clears all data in the payment table

        // Reset total amount and update total text field
        totalAmount = 0.0; // Reset the total amount variable
        txtTotal.setText(""); // Clear the total amount display field

        JOptionPane.showMessageDialog(null, "New Order Started!", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else if (choice == JOptionPane.NO_OPTION) {
        // If the user cancels starting a new transaction, display a message
        JOptionPane.showMessageDialog(null, "You cancelled another transaction.", "Cancellation", JOptionPane.INFORMATION_MESSAGE);
    }
});
    }//GEN-LAST:event_NewOrder1ActionPerformed

    private void PrintReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintReceiptActionPerformed
try {
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            printerJob.setPrintable(new Printable() {
                public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                    if (pageIndex > 0) {  // If there's more than one page, stop printing
                        return NO_SUCH_PAGE;
                    }

                    // Set up the printing area and margins
                    Graphics2D g2d = (Graphics2D) graphics;
                    g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

                    // Scale the content to fit the page
                    double scale = Math.min(pageFormat.getImageableWidth() / Receipt.getWidth(), pageFormat.getImageableHeight() / Receipt.getHeight());
                    g2d.scale(scale, scale);

                    // Print the panel
                    Receipt.printAll(g2d);
                    return PAGE_EXISTS;
                }
            });

            // Show the print dialog and start the print job
            if (printerJob.printDialog()) {
                printerJob.print();
            }

            JOptionPane.showMessageDialog(null, "Receipt printed successfully!");
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, "Error printing receipt: " + e.getMessage(), "Print Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_PrintReceiptActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
    String orderToRemove = JOptionPane.showInputDialog(this, "Enter the product name or order to remove:");
    if (orderToRemove != null && !orderToRemove.isEmpty()) {
        DefaultTableModel receiptModel = (DefaultTableModel) receiptTable.getModel();
        boolean orderFound = false;
        double totalPriceToRemove = 0.0;
        
        for (int row = 0; row < receiptModel.getRowCount(); row++) {
            Object product = receiptModel.getValueAt(row, 0); 
            if (product != null && product.toString().equalsIgnoreCase(orderToRemove)) {
               
                totalPriceToRemove = (double) receiptModel.getValueAt(row, 3); 

                int confirmation = JOptionPane.showConfirmDialog(
                        this,
                        "Are you sure you want to remove this order: " + orderToRemove + "?",
                        "Confirm Removal",
                        JOptionPane.YES_NO_OPTION
                );

                if (confirmation == JOptionPane.YES_OPTION) {
                 
                    receiptModel.removeRow(row);
                    
                    totalAmount -= totalPriceToRemove;

                    updatePaymentTable();

                    JOptionPane.showMessageDialog(this, "Order removed successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Order removal canceled.");
                }
                
                orderFound = true;
                break;
            }
        }

        if (!orderFound) {
            JOptionPane.showMessageDialog(this, "Order not found in receipt.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        LogIn al= new LogIn();
        al.show();

        dispose();
    }//GEN-LAST:event_jButton46ActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed
         Connection conn = null;
        PreparedStatement pstmt = null;
 Payment.addActionListener(e -> {
    try {
        // Calculate the subtotal dynamically based on receipt items (not hardcoded)
        double subtotal = 0.0;
        for (int row = 0; row < receiptTable.getRowCount(); row++) {
            Object priceObj = receiptTable.getValueAt(row, 3); // "Price" column
            Object quantityObj = receiptTable.getValueAt(row, 2); // "Quantity" column

            if (priceObj != null && quantityObj != null) {
                try {
                    double price = Double.parseDouble(priceObj.toString());
                    int quantity = Integer.parseInt(quantityObj.toString());
                    subtotal += price * quantity;
                } catch (NumberFormatException ex) {
                    System.err.println("Invalid price or quantity at row " + row);
                }
            }
        }

        // Calculate tax
        double taxRate = 0.12; // 12% tax rate
        double tax = subtotal * taxRate;
        double totalWithTax = subtotal + tax; // Total amount including tax

        // Prompt for Payment Method
        String[] paymentMethods = { "Cash", "GCash", "Credit Card" };
        String paymentMethod = (String) JOptionPane.showInputDialog(
            this,
            "Select Payment Method:",
            "Payment Method",
            JOptionPane.QUESTION_MESSAGE,
            null,
            paymentMethods,
            paymentMethods[0]
        );

        if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Payment method is required.", "Payment Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Ask for Customer's Name
        String customerName = JOptionPane.showInputDialog(this, "Enter Customer Name:");
        if (customerName == null || customerName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Customer name is required.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Prompt for Payment Amount
        double payment = 0;
        boolean validPayment = false;

        while (!validPayment) {
            String paymentInput = JOptionPane.showInputDialog(this, "Enter Payment Amount:");
            if (paymentInput == null || paymentInput.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Payment is required.", "Payment Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                payment = Double.parseDouble(paymentInput);
                if (payment < totalWithTax) {
                    JOptionPane.showMessageDialog(this, "Insufficient payment. Please enter a valid amount.", "Payment Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    validPayment = true;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid payment amount. Please enter a numeric value.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Calculate Change (even if payment == total, it will show ₱0.00 as change)
        double change = payment - totalWithTax;

        // Optional: Prompt for Reference if payment is GCash or Credit Card
        String reference = " ";
        if (paymentMethod.equals("GCash") || paymentMethod.equals("Credit Card")) {
            reference = JOptionPane.showInputDialog(this, "Enter Transaction/Reference Number:");
            if (reference == null || reference.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Reference is required for " + paymentMethod + " payments.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Update existing rows in paymentTable
        DefaultTableModel paymentModel = (DefaultTableModel) paymentTable.getModel();
        paymentModel.addRow(new Object[] { "Customer Name", customerName });
        paymentModel.addRow(new Object[] { "Payment Method", paymentMethod });
        paymentModel.addRow(new Object[] { "Reference", reference });
        paymentModel.addRow(new Object[] { "Payment", String.format("₱%.2f", payment) });
        paymentModel.addRow(new Object[] { "Change", String.format("₱%.2f", change) });

        // Insert data into the database
        String dbURL = "jdbc:mysql://localhost:3306/admin";
        String dbUser = "root";
        String dbPassword = "";

        try (Connection connection = DriverManager.getConnection(dbURL, dbUser, dbPassword)) {
            // Insert payment details
            String paymentQuery = "INSERT INTO payment (SubTotal, Tax, TotalAmount, PaymentMethod, Reference, Payment, `Change`, PaymentDate) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement paymentPstmt = connection.prepareStatement(paymentQuery);

            paymentPstmt.setDouble(1, subtotal);
            paymentPstmt.setDouble(2, tax);
            paymentPstmt.setDouble(3, totalWithTax);
            paymentPstmt.setString(4, paymentMethod);
            paymentPstmt.setString(5, reference);
            paymentPstmt.setDouble(6, payment);
            paymentPstmt.setDouble(7, change);
            paymentPstmt.setTimestamp(8, new Timestamp(System.currentTimeMillis()));

            paymentPstmt.executeUpdate();

            // Insert receipt details
            String receiptQuery = "INSERT INTO receipt (ProductName, Size, Quantity, Price, DiningLocation, OrderDate) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement receiptPstmt = connection.prepareStatement(receiptQuery);

            for (int row = 0; row < receiptTable.getRowCount(); row++) {
                String productName = receiptTable.getValueAt(row, 0).toString();
                String size = receiptTable.getValueAt(row, 1).toString();
                int quantity = Integer.parseInt(receiptTable.getValueAt(row, 2).toString());
                double price = Double.parseDouble(receiptTable.getValueAt(row, 3).toString());
                String diningLocation = receiptTable.getValueAt(row, 4).toString();

                receiptPstmt.setString(1, productName);
                receiptPstmt.setString(2, size);
                receiptPstmt.setInt(3, quantity);
                receiptPstmt.setDouble(4, price);
                receiptPstmt.setString(5, diningLocation);
                receiptPstmt.setTimestamp(6, new Timestamp(System.currentTimeMillis()));

                receiptPstmt.addBatch();
            }

            receiptPstmt.executeBatch();

            // Display success message
            JOptionPane.showMessageDialog(this, "Payment and Receipt successfully recorded in the database.", "Database Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

        // Display success message
        JOptionPane.showMessageDialog(this, "Payment successful!\nThank you, " + customerName + ".", "Payment Success", JOptionPane.INFORMATION_MESSAGE);

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
});


    }//GEN-LAST:event_PaymentActionPerformed

    private void cm5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cm5ActionPerformed
    try {
    price = 355.0;

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "CM5";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_cm5ActionPerformed

    private void cm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cm1ActionPerformed
       try {
    price = 355.0;

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "CM1";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_cm1ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
     try {
    price = 355.0;

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "CM3";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_c3ActionPerformed

    private void cm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cm2ActionPerformed
     try {
    price = 355.0;

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "CM2";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_cm2ActionPerformed

    private void cm6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cm6ActionPerformed
     try {
    price = 355.0;

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "CM6";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_cm6ActionPerformed

    private void cm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cm4ActionPerformed
     try {
    price = 355.0;

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "CM4";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_cm4ActionPerformed

    private void redvelvetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redvelvetActionPerformed
      try {
    price = 150.0;

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "Red Velvet Cupcake";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_redvelvetActionPerformed

    private void cholatecroissantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cholatecroissantActionPerformed
      try {
    price = 180.0;

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "Chocolate Croissant";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_cholatecroissantActionPerformed

    private void buttercroissnatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttercroissnatActionPerformed
    try {
    price = 180.0;

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "Butter Croissant";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_buttercroissnatActionPerformed

    private void mangocroissantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mangocroissantActionPerformed
      try {
    price = 180.0;

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "Baked Mango Croissant";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_mangocroissantActionPerformed

    private void EggPestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EggPestoActionPerformed
       try {
    price = 190.0;

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "Egg Pesto and Mozzarella";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_EggPestoActionPerformed

    private void chocolateChipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocolateChipActionPerformed
     try {
    price = 180.0;

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "Chocolate Chip Cookiee";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_chocolateChipActionPerformed

    private void chocolatebrowniesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chocolatebrowniesActionPerformed
      try {
    price = 190.0;

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "Double Chocolate Brownies";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_chocolatebrowniesActionPerformed

    private void santaCookieeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_santaCookieeActionPerformed
      try {
    price = 170.0;
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "Santa's Cookiee";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_santaCookieeActionPerformed

    private void blueberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueberryActionPerformed
       try {
    price = 150.0;

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "Blueberry Cupcake";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_blueberryActionPerformed

    private void xmastreecookieeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xmastreecookieeActionPerformed
      try {
    price = 170.0;

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity for Egg Pesto:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
    quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * price;
    totalAmount += totalprice;  
   
    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
              }
    productName = "Christmas Tree Cookiee";
     DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{ productName, " ", quantity, totalprice, diningLocation });  
   
    updatePaymentTable();
    } catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_xmastreecookieeActionPerformed

    private void SuenoDeMatchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuenoDeMatchaActionPerformed
      try {
    String[] sizes = {"Medio - 16oz", "Grande - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;  
    
    double pricePerCup = 0;
    if (size.equals("Medio - 16oz")) {
        pricePerCup = 90.0;
    } else if (size.equals("Grande - 31oz")) {
        pricePerCup = 130.0;
    }

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
     quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * pricePerCup;
    totalAmount += totalprice;  

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {  
        diningLocation = "Take-Out";
        totalAmount += 30.0; 
    }
    productName = "Sueno De Matcha";
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation  
    });
    updatePaymentTable();
} catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_SuenoDeMatchaActionPerformed

    private void LuxeCreamDelightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuxeCreamDelightActionPerformed
       try {
    String[] sizes = {"Medio - 16oz", "Grande - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;  
    
    double pricePerCup = 0;
    if (size.equals("Medio - 16oz")) {
        pricePerCup = 90.0;
    } else if (size.equals("Grande - 31oz")) {
        pricePerCup = 130.0;
    }

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
     quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * pricePerCup;
    totalAmount += totalprice;  

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {  
        diningLocation = "Take-Out";
        totalAmount += 30.0; 
    }
    productName = "Luxe Cream Delight";
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation  
    });
    updatePaymentTable();
} catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_LuxeCreamDelightActionPerformed

    private void BrownSugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrownSugarActionPerformed
     try {
    String[] sizes = {"Medio - 16oz", "Grande - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;  
    
    double pricePerCup = 0;
    if (size.equals("Medio - 16oz")) {
        pricePerCup = 90.0;
    } else if (size.equals("Grande - 31oz")) {
        pricePerCup = 130.0;
    }

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
     quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * pricePerCup;
    totalAmount += totalprice;  

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {  
        diningLocation = "Take-Out";
        totalAmount += 30.0; 
    }
    productName = "Brown Sugar Velvet";
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation  
    });
    updatePaymentTable();
} catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_BrownSugarActionPerformed

    private void DarkChocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DarkChocoActionPerformed
       try {
    String[] sizes = {"Medio - 16oz", "Grande - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;  
    
    double pricePerCup = 0;
    if (size.equals("Medio - 16oz")) {
        pricePerCup = 90.0;
    } else if (size.equals("Grande - 31oz")) {
        pricePerCup = 130.0;
    }

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
     quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * pricePerCup;
    totalAmount += totalprice;  

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {  
        diningLocation = "Take-Out";
        totalAmount += 30.0; 
    }
    productName = "Dark Choco Trio";
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation  
    });
    updatePaymentTable();
} catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_DarkChocoActionPerformed

    private void CrispandCreameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrispandCreameActionPerformed
       try {
    String[] sizes = {"Medio - 16oz", "Grande - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;  
    
    double pricePerCup = 0;
    if (size.equals("Medio - 16oz")) {
        pricePerCup = 90.0;
    } else if (size.equals("Grande - 31oz")) {
        pricePerCup = 130.0;
    }

    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return; 
     quantity = Integer.parseInt(quantityInput);

    totalprice = quantity * pricePerCup;
    totalAmount += totalprice;  

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {  
        diningLocation = "Take-Out";
        totalAmount += 30.0; 
    }
    productName = "Crisp and Cream Delight";
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation  
    });
    updatePaymentTable();
} catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_CrispandCreameActionPerformed

    private void WhiteChocoCreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhiteChocoCreamActionPerformed
       try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 120.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 180.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 200.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "White Chocolate Cream"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_WhiteChocoCreamActionPerformed

    private void ChocoCookieeCrumbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChocoCookieeCrumbleActionPerformed
      try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 120.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 180.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 200.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Chocolate Cookiee Crumble"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_ChocoCookieeCrumbleActionPerformed

    private void StrawberryCreameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrawberryCreameActionPerformed
       try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 120.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 180.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 200.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Strawberry Cream"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_StrawberryCreameActionPerformed

    private void mochacookieeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mochacookieeActionPerformed
    try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 120.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 180.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 200.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Mocha Cookiee Crumble"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_mochacookieeActionPerformed

    private void JavaChipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JavaChipActionPerformed
      try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 120.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 180.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 200.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Java Chip"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_JavaChipActionPerformed

    private void CaffeVanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaffeVanillaActionPerformed
     try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 120.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 180.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 200.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Caffe Vanilla"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_CaffeVanillaActionPerformed
    private void CaramelCreameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaramelCreameActionPerformed
       try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 120.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 180.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 200.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Caramel Cream Frappuccino"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_CaramelCreameActionPerformed

    private void mochaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mochaActionPerformed
    try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 120.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 180.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 200.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Mocha"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_mochaActionPerformed
    private void IcedCaramelLatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IcedCaramelLatteActionPerformed
    try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 130.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 190.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 220.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Iced Caramel Latte"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_IcedCaramelLatteActionPerformed

    private void IcedWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IcedWhiteActionPerformed
       try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 80.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 130.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 190.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Iced White Chocolate Mocha"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_IcedWhiteActionPerformed

    private void IcedAmericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IcedAmericanoActionPerformed
     try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 60.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 70.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 90.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Iced Americano"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_IcedAmericanoActionPerformed

    private void IcedShakenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IcedShakenActionPerformed
     try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 80.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 110.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 150.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Iced Shaken Espresso"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_IcedShakenActionPerformed

    private void IcedCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IcedCoffeeActionPerformed
    try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 80.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 110.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 150.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Iced Coffee"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_IcedCoffeeActionPerformed

    private void IcedVanillaLatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IcedVanillaLatteActionPerformed
      try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 90.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 110.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 150.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Iced Vanilla Latte"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_IcedVanillaLatteActionPerformed

    private void IcedCaramelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IcedCaramelActionPerformed
      try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 90.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 130.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 190.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Iced Caramel Macchiato"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_IcedCaramelActionPerformed

    private void CaramelMacchiatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaramelMacchiatoActionPerformed
     try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 70.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 80.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 110.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Caramel Macchiato"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_CaramelMacchiatoActionPerformed

    private void VanillaLatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VanillaLatteActionPerformed
      try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 70.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 90.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 110.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Vanilla Latte"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_VanillaLatteActionPerformed

    private void CaffeLatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaffeLatteActionPerformed
     try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 70.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 80.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 110.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Caffe Latte"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_CaffeLatteActionPerformed

    private void caffe_americanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caffe_americanoActionPerformed
   try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 50.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 70.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 100.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Caffe Americano"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_caffe_americanoActionPerformed

    private void flatWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flatWhiteActionPerformed
     try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 70.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 90.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 150.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Flat White"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_flatWhiteActionPerformed

    private void cappuccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cappuccinoActionPerformed
       try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 70.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 80.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 110.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Cappuccino"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_cappuccinoActionPerformed

    private void EspressoMacchiatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspressoMacchiatoActionPerformed
    try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 70.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 80.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 110.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Espresso Macchiato"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_EspressoMacchiatoActionPerformed

    private void HoneyAlmondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoneyAlmondActionPerformed
    try {
    String[] sizes = {"Grande - 16oz", "Venti - 20oz", "Trenta - 31oz"};
    size = (String) JOptionPane.showInputDialog(
        this, 
        "Select cup size:", 
        "Cup Size", 
        JOptionPane.QUESTION_MESSAGE, 
        null, 
        sizes, 
        sizes[0]
    );
    if (size == null || size.isEmpty()) return;
    
    if (size.equals("Grande - 16oz")) {
        price = 80.0;
    } else if (size.equals("Venti - 20oz")) {
        price = 110.0;
    } else if (size.equals("Trenta - 31oz")) {
        price = 180.0;
    }
    String quantityInput = JOptionPane.showInputDialog(this, "Enter quantity:", "Quantity", JOptionPane.QUESTION_MESSAGE);
    if (quantityInput == null || quantityInput.isEmpty()) return;
    quantity = Integer.parseInt(quantityInput);

     totalprice = quantity * price;
    totalAmount += totalprice;

    diningLocation = "Dine-In"; 
    if (TakeOut.isSelected()) {
        diningLocation = "Take-Out";
    }
    productName = "Honey Almond Milk"; 
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[]{
        productName, size, quantity, totalprice, diningLocation    
    });
    updatePaymentTable();

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Invalid quantity. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_HoneyAlmondActionPerformed

    private void teaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teaActionPerformed
    int choice = JOptionPane.showConfirmDialog(null, "Do You Really Want to Add a Tea?", "Confirmation", JOptionPane.YES_NO_OPTION);

    if (choice == JOptionPane.YES_OPTION) {
    JOptionPane.showMessageDialog(null, "Extra Tea has been added!");
    totalAmount += 15.0;
    totalAmount += 15.0;
    totalprice = 15.0;
    quantity = 1;
    productName = "Extra Tea";
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[] { productName, " ", quantity, totalprice, " " });

    updatePaymentTable();
    
    } else if (choice == JOptionPane.NO_OPTION) {
    
    JOptionPane.showMessageDialog(null, "No Tea has been added.");
    }
    }//GEN-LAST:event_teaActionPerformed

    private void crushedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crushedActionPerformed
     int choice = JOptionPane.showConfirmDialog(null, "Do You Really Want to Add an Crushed Oreo?", "Confirmation", JOptionPane.YES_NO_OPTION);

    if (choice == JOptionPane.YES_OPTION) {
    JOptionPane.showMessageDialog(null, "Crushed Oreo has been added!");
    totalAmount += 15.0;
    totalAmount += 15.0;
    totalprice = 15.0;
    quantity = 1;
    productName = "Extra Crushed Oreo";
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[] { productName, " ", quantity, totalprice, " " });

    updatePaymentTable();
    
    } else if (choice == JOptionPane.NO_OPTION) {
    
    JOptionPane.showMessageDialog(null, "No Crushed Oreo has been added.");
    }
    }//GEN-LAST:event_crushedActionPerformed

    private void extraice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraice2ActionPerformed
    int choice = JOptionPane.showConfirmDialog(null, "Do You Really Want to Add an Ice?", "Confirmation", JOptionPane.YES_NO_OPTION);

    if (choice == JOptionPane.YES_OPTION) {
    JOptionPane.showMessageDialog(null, "Ice has been added!");
    totalAmount += 15.0;
    totalAmount += 15.0;
    totalprice = 15.0;
    quantity = 1;
    productName = "Extra Ice";
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[] { productName, " ", quantity, totalprice, " " });

    updatePaymentTable();
    
    } else if (choice == JOptionPane.NO_OPTION) {
    
    JOptionPane.showMessageDialog(null, "No water has been added.");
    }
    }//GEN-LAST:event_extraice2ActionPerformed

    private void bobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bobaActionPerformed
     int choice = JOptionPane.showConfirmDialog(null, "Do You Really Want to Add an Boba?", "Confirmation", JOptionPane.YES_NO_OPTION);

    if (choice == JOptionPane.YES_OPTION) {
    JOptionPane.showMessageDialog(null, "Boba has been added!");
    totalAmount += 15.0;
    totalAmount += 15.0;
    totalprice = 15.0;
    quantity = 1;
    productName = "Extra Boba";
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[] { productName, " ", quantity, totalprice, " " });

    updatePaymentTable();
    
    } else if (choice == JOptionPane.NO_OPTION) {
    
    JOptionPane.showMessageDialog(null, "No Boba has been added.");
    }
    }//GEN-LAST:event_bobaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    int choice = JOptionPane.showConfirmDialog(null, "Do You Really Want to Add Water?", "Confirmation", JOptionPane.YES_NO_OPTION);

    if (choice == JOptionPane.YES_OPTION) {
    JOptionPane.showMessageDialog(null, "Water has been added!");
    totalAmount += 15.0;
    totalAmount += 15.0;
    totalprice = 15.0;
    quantity = 1;
    productName = "Extra Water";
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[] { productName, " ", quantity, totalprice, " " });

    updatePaymentTable();
    }
    else if (choice == JOptionPane.NO_OPTION) {
        JOptionPane.showMessageDialog(null, "No water has been added.");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void extraiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraiceActionPerformed
  int choice = JOptionPane.showConfirmDialog(null, "Do You Really Want to Add an Ice?", "Confirmation", JOptionPane.YES_NO_OPTION);

    if (choice == JOptionPane.YES_OPTION) {
    JOptionPane.showMessageDialog(null, "Ice has been added!");
    totalAmount += 15.0;
    totalprice = 15.0;
    quantity = 1;
    productName = "Extra Ice";
    DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
    model.addRow(new Object[] { productName, " ", quantity, totalprice, " " });

    updatePaymentTable();
    
    } else if (choice == JOptionPane.NO_OPTION) {
    
    JOptionPane.showMessageDialog(null, "No water has been added.");
    }
    }//GEN-LAST:event_extraiceActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     jComboBox1.addItemListener(e -> {
    if (e.getStateChange() == ItemEvent.SELECTED) {
       productName = (String) e.getItem();
            if (!productName.equals("None")) {
            if (lastSelectedOption == null || !lastSelectedOption.equals(productName)) {
                DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
                model.addRow(new Object[]{productName , " ", "", " ", " "});

                lastSelectedOption = productName ;
            }
        }
    }
});
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
    jComboBox2.addItemListener(e -> {
    if (e.getStateChange() == ItemEvent.SELECTED) {
       productName = (String) e.getItem();
            if (!productName.equals("None")) {
            if (lastSelectedOption == null || !lastSelectedOption.equals(productName)) {
                DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
                model.addRow(new Object[]{productName , " ", "", " ", " "});

                lastSelectedOption = productName ;
            }
        }
    }
});
    }//GEN-LAST:event_jComboBox2ActionPerformed
   private String lastSelectedOption = null;

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
    jComboBox3.addItemListener(e -> {
    if (e.getStateChange() == ItemEvent.SELECTED) {
        String selectedOption = (String) e.getItem();

        if (!selectedOption.equals("None")) {
            if (lastSelectedOption == null || !lastSelectedOption.equals(selectedOption)) {
                DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
                model.addRow(new Object[]{selectedOption, " ", "1", 0.0, " "});

                lastSelectedOption = selectedOption;
            }
        }
    }
});
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
 jComboBox4.addItemListener(e -> {
    if (e.getStateChange() == ItemEvent.SELECTED) {
       productName = (String) e.getItem();
            if (!productName.equals("None")) {
            if (lastSelectedOption == null || !lastSelectedOption.equals(productName)) {
                DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
                model.addRow(new Object[]{productName , " ", "", " ", " "});

                lastSelectedOption = productName ;
            }
        }
    }
});
    }//GEN-LAST:event_jComboBox4ActionPerformed
    
    private void TakeOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakeOutActionPerformed
    diningLocation = "Take-Out";
    totalAmount += 30.0;
    totalprice = 30.0;
    quantity = 1;
    productName = "Take-Out Charge";
    DefaultTableModel receiptModel = (DefaultTableModel) receiptTable.getModel();
    receiptModel.addRow(new Object[] { productName, " ", quantity, totalprice, diningLocation });
    updatePaymentTable();
    }//GEN-LAST:event_TakeOutActionPerformed
  
    private void DineInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DineInActionPerformed
     diningLocation = "Dine-In";
     DefaultTableModel receiptModel = (DefaultTableModel) receiptTable.getModel();
    receiptModel.addRow(new Object[] { "", " ", "", "", diningLocation });
    }//GEN-LAST:event_DineInActionPerformed
   
    private void ComboMealsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMealsActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(6);
    }//GEN-LAST:event_ComboMealsActionPerformed

    private void MilkteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilkteaActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(4);
    }//GEN-LAST:event_MilkteaActionPerformed

    private void PastriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PastriesActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(5);
    }//GEN-LAST:event_PastriesActionPerformed

    private void HotCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HotCoffeeActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_HotCoffeeActionPerformed

    private void FrapuccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrapuccinoActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_FrapuccinoActionPerformed

    private void IceCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IceCoffeeActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_IceCoffeeActionPerformed

    private void ReceiptAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ReceiptAncestorAdded
  
    }//GEN-LAST:event_ReceiptAncestorAdded

    private void receiptTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_receiptTableAncestorAdded
    String[] columnNames = { "Product", "Size", "Quantity", "Price", "Dining Location" }; 
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    receiptTable.setModel(model);
    

      
    }//GEN-LAST:event_receiptTableAncestorAdded

    private void jSpinner1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jSpinner1AncestorAdded
       jSpinner1.addChangeListener(e -> {
    quantity = (int) jSpinner1.getValue(); 
    price = 25.0;                     
    totalprice = quantity * price;  
    productName = "Espresso Shot";
    if (quantity > 0) {
       
        DefaultTableModel model = (DefaultTableModel) receiptTable.getModel();
        model.addRow(new Object[]{productName, " ", quantity, totalprice, " "});

       
        totalAmount += totalprice;
        updatePaymentTable();
    }
});
    }//GEN-LAST:event_jSpinner1AncestorAdded

    private void paymentTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_paymentTableAncestorAdded

    String[] paymentColumnNames = { "Label", "Details" };
    DefaultTableModel paymentModel = new DefaultTableModel(paymentColumnNames, 0);
    paymentTable.setModel(paymentModel);

    // Initialize Rows for Subtotal, Tax, Total, and Date
    double subtotal = 0.0; // Example value; replace with your dynamic subtotal calculation
    double taxRate = 0.12; // 12% tax rate
    double tax = subtotal * taxRate;
    double totalWithTax = subtotal + tax;
    String currentDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    paymentModel.addRow(new Object[] { "SubTotal", String.format("₱%.2f", subtotal) });
    paymentModel.addRow(new Object[] { "Tax (12%)", String.format("₱%.2f", tax) });
    paymentModel.addRow(new Object[] { "Total Amount", String.format("₱%.2f", totalWithTax) });
    paymentModel.addRow(new Object[] { "Date", currentDate });
    }//GEN-LAST:event_paymentTableAncestorAdded
      private void updatePaymentTable() {
    final double TAX_RATE = 0.12;
    double subtotal = 0;
    double tax = 0.0;

    // Calculate the subtotal by iterating through the receiptTable
    for (int row = 0; row < receiptTable.getRowCount(); row++) {
        Object priceObj = receiptTable.getValueAt(row, 3); // "Price" column (index 3)
        Object quantityObj = receiptTable.getValueAt(row, 2); // "Quantity" column (index 2)

        // Log the values for debugging
        System.out.println("Processing row " + row + ": Price = " + priceObj + ", Quantity = " + quantityObj);

        // Check if price and quantity are valid and calculate subtotal
        if (priceObj != null && quantityObj != null) {
            try {
                double price = Double.parseDouble(priceObj.toString());
                int quantity = Integer.parseInt(quantityObj.toString());
                double rowTotal = price * quantity;
                subtotal += rowTotal;

                // Log the individual row total for debugging
                System.out.println("Row total for " + row + ": " + rowTotal);
            } catch (NumberFormatException e) {
                System.err.println("Invalid price or quantity at row " + row);
            }
        } else {
            // Log in case any value is null
            System.out.println("Skipping row " + row + " due to null value.");
        }
    }

    // Log subtotal for debugging
    System.out.println("Subtotal: " + subtotal);

    // Calculate tax and total
    tax = subtotal * TAX_RATE;
    double totalWithTax = subtotal + tax;

    // Log tax and total for debugging
    System.out.println("Tax: " + tax + ", Total with tax: " + totalWithTax);

    // Get the payment table model
    DefaultTableModel paymentModel = (DefaultTableModel) paymentTable.getModel();

    // Update SubTotal, Tax, and Total Amount in the payment table
    boolean subtotalRowFound = false;
    boolean taxRowFound = false;
    boolean totalRowFound = false;

    // Loop through payment model and update the relevant rows
    for (int row = 0; row < paymentModel.getRowCount(); row++) {
        Object label = paymentModel.getValueAt(row, 0); // "Label" column
        if (label != null) {
            // Check for SubTotal, Tax, and Total labels
            if (label.toString().equalsIgnoreCase("SubTotal")) {
                paymentModel.setValueAt(String.format("₱%.2f", subtotal), row, 1); // "Details" column
                subtotalRowFound = true;
            } else if (label.toString().equalsIgnoreCase("Tax (12%)")) {
                paymentModel.setValueAt(String.format("₱%.2f", tax), row, 1);
                taxRowFound = true;
            } else if (label.toString().equalsIgnoreCase("Total Amount")) {
                paymentModel.setValueAt(String.format("₱%.2f", totalWithTax), row, 1);
                totalRowFound = true;
            }
        }
    }

    // Add missing rows if needed
    if (!subtotalRowFound) {
        paymentModel.addRow(new Object[] { "SubTotal", String.format("₱%.2f", subtotal) });
    }
    if (!taxRowFound) {
        paymentModel.addRow(new Object[] { "Tax (12%)", String.format("₱%.2f", tax) });
    }
    if (!totalRowFound) {
        paymentModel.addRow(new Object[] { "Total Amount", String.format("₱%.2f", totalWithTax) });
    }

    // Update the total in the totalTextArea (use final total amount here)
    txtTotal.setText("Total: ₱" + String.format("%.2f", totalWithTax));
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrownSugar;
    private javax.swing.JButton CaffeLatte;
    private javax.swing.JButton CaffeVanilla;
    private javax.swing.JButton CaramelCreame;
    private javax.swing.JButton CaramelMacchiato;
    private javax.swing.JButton ChocoCookieeCrumble;
    private javax.swing.JButton ComboMeals;
    private javax.swing.JButton CrispandCreame;
    private javax.swing.JButton DarkChoco;
    private javax.swing.JRadioButton DineIn;
    private javax.swing.JButton EggPesto;
    private javax.swing.JButton EspressoMacchiato;
    private javax.swing.JButton Frapuccino;
    private javax.swing.JButton HoneyAlmond;
    private javax.swing.JButton HotCoffee;
    private javax.swing.JButton IceCoffee;
    private javax.swing.JButton IcedAmericano;
    private javax.swing.JButton IcedCaramel;
    private javax.swing.JButton IcedCaramelLatte;
    private javax.swing.JButton IcedCoffee;
    private javax.swing.JButton IcedShaken;
    private javax.swing.JButton IcedVanillaLatte;
    private javax.swing.JButton IcedWhite;
    private javax.swing.JButton JavaChip;
    private javax.swing.JButton LuxeCreamDelight;
    private javax.swing.JButton Milktea;
    private javax.swing.JButton NewOrder1;
    private javax.swing.JButton Pastries;
    private javax.swing.JButton Payment;
    private javax.swing.JButton PrintReceipt;
    private javax.swing.JPanel Receipt;
    private javax.swing.JButton StrawberryCreame;
    private javax.swing.JButton SuenoDeMatcha;
    private javax.swing.JRadioButton TakeOut;
    private javax.swing.JButton VanillaLatte;
    private javax.swing.JButton WhiteChocoCream;
    private javax.swing.JButton blueberry;
    private javax.swing.JButton boba;
    private javax.swing.ButtonGroup btnAns;
    private javax.swing.JButton buttercroissnat;
    private javax.swing.JButton c3;
    private javax.swing.JButton caffe_americano;
    private javax.swing.JButton cappuccino;
    private javax.swing.JButton chocolateChip;
    private javax.swing.JButton chocolatebrownies;
    private javax.swing.JButton cholatecroissant;
    private javax.swing.JButton cm1;
    private javax.swing.JButton cm2;
    private javax.swing.JButton cm4;
    private javax.swing.JButton cm5;
    private javax.swing.JButton cm6;
    private javax.swing.JButton crushed;
    private javax.swing.JButton extraice;
    private javax.swing.JButton extraice2;
    private javax.swing.JButton flatWhite;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton46;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel310;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel316;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel322;
    private javax.swing.JLabel jLabel323;
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel325;
    private javax.swing.JLabel jLabel326;
    private javax.swing.JLabel jLabel327;
    private javax.swing.JLabel jLabel328;
    private javax.swing.JLabel jLabel329;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel330;
    private javax.swing.JLabel jLabel331;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel333;
    private javax.swing.JLabel jLabel334;
    private javax.swing.JLabel jLabel335;
    private javax.swing.JLabel jLabel336;
    private javax.swing.JLabel jLabel337;
    private javax.swing.JLabel jLabel338;
    private javax.swing.JLabel jLabel339;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel340;
    private javax.swing.JLabel jLabel341;
    private javax.swing.JLabel jLabel342;
    private javax.swing.JLabel jLabel343;
    private javax.swing.JLabel jLabel344;
    private javax.swing.JLabel jLabel345;
    private javax.swing.JLabel jLabel346;
    private javax.swing.JLabel jLabel347;
    private javax.swing.JLabel jLabel348;
    private javax.swing.JLabel jLabel349;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel350;
    private javax.swing.JLabel jLabel351;
    private javax.swing.JLabel jLabel352;
    private javax.swing.JLabel jLabel353;
    private javax.swing.JLabel jLabel354;
    private javax.swing.JLabel jLabel355;
    private javax.swing.JLabel jLabel356;
    private javax.swing.JLabel jLabel357;
    private javax.swing.JLabel jLabel358;
    private javax.swing.JLabel jLabel359;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel360;
    private javax.swing.JLabel jLabel361;
    private javax.swing.JLabel jLabel362;
    private javax.swing.JLabel jLabel363;
    private javax.swing.JLabel jLabel364;
    private javax.swing.JLabel jLabel365;
    private javax.swing.JLabel jLabel366;
    private javax.swing.JLabel jLabel367;
    private javax.swing.JLabel jLabel368;
    private javax.swing.JLabel jLabel369;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel370;
    private javax.swing.JLabel jLabel371;
    private javax.swing.JLabel jLabel372;
    private javax.swing.JLabel jLabel373;
    private javax.swing.JLabel jLabel374;
    private javax.swing.JLabel jLabel375;
    private javax.swing.JLabel jLabel376;
    private javax.swing.JLabel jLabel377;
    private javax.swing.JLabel jLabel378;
    private javax.swing.JLabel jLabel379;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel380;
    private javax.swing.JLabel jLabel381;
    private javax.swing.JLabel jLabel382;
    private javax.swing.JLabel jLabel383;
    private javax.swing.JLabel jLabel384;
    private javax.swing.JLabel jLabel385;
    private javax.swing.JLabel jLabel386;
    private javax.swing.JLabel jLabel387;
    private javax.swing.JLabel jLabel388;
    private javax.swing.JLabel jLabel389;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel390;
    private javax.swing.JLabel jLabel391;
    private javax.swing.JLabel jLabel392;
    private javax.swing.JLabel jLabel393;
    private javax.swing.JLabel jLabel394;
    private javax.swing.JLabel jLabel395;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton mangocroissant;
    private javax.swing.JButton mocha;
    private javax.swing.JButton mochacookiee;
    private javax.swing.JTable paymentTable;
    private javax.swing.JTable receiptTable;
    private javax.swing.JButton redvelvet;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton santaCookiee;
    private javax.swing.JButton tea;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JButton xmastreecookiee;
    // End of variables declaration//GEN-END:variables
}
