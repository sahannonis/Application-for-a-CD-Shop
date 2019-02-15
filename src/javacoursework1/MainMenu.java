package javacoursework1;

import java.io.File;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Sahan & Rizwana
 */
public class MainMenu extends javax.swing.JFrame {
Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private String username;
    private String userid;
    
    private String category;
    int total = 0;
    private int price;
    private String sql;
    private String sql1;
    
    public MainMenu() {
        initComponents();
       con=Connect.ConnectDB();
        CurrentDate();
       
    }
    
 //the current time and date is displayed here
 public void CurrentDate(){
        Thread clock=new Thread(){
            public void run(){
                for(;;){
                    Calendar cal=new GregorianCalendar();
                    int year=cal.get(Calendar.YEAR);
                    int month=cal.get(Calendar.MONTH);
                    int day=cal.get(Calendar.DAY_OF_MONTH);
                    date.setText("Date : "+year+"/"+(month+1)+"/"+day);
                    int second=cal.get(Calendar.SECOND);
                    int minute=cal.get(Calendar.MINUTE);
                    int hour=cal.get(Calendar.HOUR_OF_DAY);
                    time.setText("Time : "+hour+":"+(minute)+":"+second);       
                    try{
                        sleep(1000);
                    }
                    catch(Exception e){  
                    }
                }
            }
        };
        clock.start();
    }
 
 //display the currently logged users name
  public void user(String username)
    {
        this.username=username;
        currentuser.setText("Logged As : "+username+"                                                                                                                        ");
    }
  
  public void Update_table(String x){
        try{
           String query = (x);
           PreparedStatement pst = con.prepareStatement(query);
           ResultSet rs=pst.executeQuery();
           

           table.setModel(DbUtils.resultSetToTableModel(rs));
           pst.close();
           rs.close();
      
           
       }
   catch(Exception e){
       System.out.println(e);
    }
   }

 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Menupanel = new javax.swing.JPanel();
        homebtn = new javax.swing.JButton();
        Addbtn = new javax.swing.JButton();
        checkbtn = new javax.swing.JButton();
        showcasebtn = new javax.swing.JButton();
        invoicebtn = new javax.swing.JButton();
        customerbtn = new javax.swing.JButton();
        settingbtn = new javax.swing.JButton();
        mainpanel = new javax.swing.JPanel();
        homepanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        addcdpanel = new javax.swing.JPanel();
        genretxt = new javax.swing.JTextField();
        titletxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        qtytxt = new javax.swing.JTextField();
        reltxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TVbtn = new javax.swing.JButton();
        seasontxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gamebtn = new javax.swing.JButton();
        moviebtn = new javax.swing.JButton();
        msg = new javax.swing.JLabel();
        msg1 = new javax.swing.JLabel();
        msg2 = new javax.swing.JLabel();
        checkpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        sgamebtn = new javax.swing.JButton();
        smoviebtn = new javax.swing.JButton();
        stvbtn = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        showdelbtn = new javax.swing.JButton();
        showupdatebtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        lblqty = new javax.swing.JLabel();
        ttitletxt = new javax.swing.JTextField();
        tqtytxt = new javax.swing.JTextField();
        tdelbtn = new javax.swing.JButton();
        tupdatebtn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        showcasepanel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        onair = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        music = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        tvseries = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        btn3D = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        games = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        FullHD = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        sport = new javax.swing.JButton();
        cooking = new javax.swing.JButton();
        romantic = new javax.swing.JButton();
        children = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        invoicepanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        custxt = new javax.swing.JTextField();
        billbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        sellqtytxt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        printbtn = new javax.swing.JButton();
        selltitletxt = new javax.swing.JTextField();
        sellgamebtn = new javax.swing.JButton();
        sellmoviebtn = new javax.swing.JButton();
        selltvbtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        totallbl = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jButton2 = new javax.swing.JButton();
        customerpanel = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        add_customerbtn = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        settingspanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        passtxt = new javax.swing.JPasswordField();
        signupbtn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        currentuser = new javax.swing.JMenu();
        date = new javax.swing.JMenu();
        time = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menupanel.setBackground(new java.awt.Color(255, 255, 255));
        Menupanel.setMaximumSize(new java.awt.Dimension(327670, 327670));

        homebtn.setBackground(new java.awt.Color(204, 153, 0));
        homebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/home-icon.png"))); // NOI18N
        homebtn.setText("Home");
        homebtn.setIconTextGap(5);
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });

        Addbtn.setBackground(new java.awt.Color(204, 153, 0));
        Addbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/digital-campaign (1).png"))); // NOI18N
        Addbtn.setText("Add New CD");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        checkbtn.setBackground(new java.awt.Color(204, 153, 0));
        checkbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/database.png"))); // NOI18N
        checkbtn.setText("Check Database");
        checkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbtnActionPerformed(evt);
            }
        });

        showcasebtn.setBackground(new java.awt.Color(204, 153, 0));
        showcasebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        showcasebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/compact-disc (3).png"))); // NOI18N
        showcasebtn.setText("Showcase");
        showcasebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showcasebtnActionPerformed(evt);
            }
        });

        invoicebtn.setBackground(new java.awt.Color(204, 153, 0));
        invoicebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        invoicebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/marketing (1).png"))); // NOI18N
        invoicebtn.setText("CheckOut");
        invoicebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoicebtnActionPerformed(evt);
            }
        });

        customerbtn.setBackground(new java.awt.Color(204, 153, 0));
        customerbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/customer.png"))); // NOI18N
        customerbtn.setText("Customer");
        customerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerbtnActionPerformed(evt);
            }
        });

        settingbtn.setBackground(new java.awt.Color(204, 153, 0));
        settingbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        settingbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/settings.png"))); // NOI18N
        settingbtn.setText("Admin Settings");
        settingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenupanelLayout = new javax.swing.GroupLayout(Menupanel);
        Menupanel.setLayout(MenupanelLayout);
        MenupanelLayout.setHorizontalGroup(
            MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenupanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(showcasebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invoicebtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settingbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenupanelLayout.setVerticalGroup(
            MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenupanelLayout.createSequentialGroup()
                .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showcasebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invoicebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(settingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(Menupanel, java.awt.BorderLayout.LINE_START);

        mainpanel.setLayout(new java.awt.CardLayout());

        homepanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/1.png"))); // NOI18N

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/3.png"))); // NOI18N
        jLabel36.setText("jLabel36");

        javax.swing.GroupLayout homepanelLayout = new javax.swing.GroupLayout(homepanel);
        homepanel.setLayout(homepanelLayout);
        homepanelLayout.setHorizontalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        homepanelLayout.setVerticalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mainpanel.add(homepanel, "card4");

        addcdpanel.setBackground(new java.awt.Color(0, 0, 0));

        titletxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titletxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Title");

        reltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reltxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Released Year");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Seasons");

        TVbtn.setBackground(new java.awt.Color(0, 0, 0));
        TVbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TVbtn.setForeground(new java.awt.Color(255, 255, 255));
        TVbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/camera.png"))); // NOI18N
        TVbtn.setText("Add Series");
        TVbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TVbtnActionPerformed(evt);
            }
        });

        seasontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seasontxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Genre");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantity");

        gamebtn.setBackground(new java.awt.Color(0, 0, 0));
        gamebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gamebtn.setForeground(new java.awt.Color(255, 255, 255));
        gamebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/game-controller.png"))); // NOI18N
        gamebtn.setText("Add Games");
        gamebtn.setHideActionText(true);
        gamebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamebtnActionPerformed(evt);
            }
        });

        moviebtn.setBackground(new java.awt.Color(0, 0, 0));
        moviebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        moviebtn.setForeground(new java.awt.Color(255, 255, 255));
        moviebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/movie.png"))); // NOI18N
        moviebtn.setText("Add Movies");
        moviebtn.setActionCommand("Add ");
        moviebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moviebtnActionPerformed(evt);
            }
        });

        msg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 255, 255));

        msg1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msg1.setForeground(new java.awt.Color(255, 255, 255));

        msg2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msg2.setForeground(new java.awt.Color(255, 255, 255));
        msg2.setToolTipText("");

        javax.swing.GroupLayout addcdpanelLayout = new javax.swing.GroupLayout(addcdpanel);
        addcdpanel.setLayout(addcdpanelLayout);
        addcdpanelLayout.setHorizontalGroup(
            addcdpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addcdpanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(addcdpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addcdpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titletxt, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(reltxt)
                    .addComponent(genretxt)
                    .addComponent(qtytxt)
                    .addComponent(seasontxt))
                .addGap(34, 34, 34)
                .addGroup(addcdpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TVbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moviebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gamebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(addcdpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(msg2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(msg1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                .addContainerGap(2687, Short.MAX_VALUE))
        );
        addcdpanelLayout.setVerticalGroup(
            addcdpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addcdpanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(addcdpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addcdpanelLayout.createSequentialGroup()
                        .addGroup(addcdpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gamebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addcdpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msg1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moviebtn))
                        .addGroup(addcdpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addcdpanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(msg2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addcdpanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TVbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(addcdpanelLayout.createSequentialGroup()
                        .addGroup(addcdpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addcdpanelLayout.createSequentialGroup()
                                .addGroup(addcdpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(titletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(addcdpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(reltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addComponent(genretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addGroup(addcdpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(qtytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25)
                        .addGroup(addcdpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(seasontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(364, Short.MAX_VALUE))
        );

        mainpanel.add(addcdpanel, "card2");

        checkpanel.setBackground(new java.awt.Color(0, 0, 0));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        sgamebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/game-controller.png"))); // NOI18N
        sgamebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgamebtnActionPerformed(evt);
            }
        });

        smoviebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/movie.png"))); // NOI18N
        smoviebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smoviebtnActionPerformed(evt);
            }
        });

        stvbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/camera.png"))); // NOI18N
        stvbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stvbtnActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 255, 51));
        jLabel11.setText("Click on button to show the table you want to update/delete");

        showdelbtn.setBackground(new java.awt.Color(0, 0, 0));
        showdelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/rubbish-bin.png"))); // NOI18N
        showdelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showdelbtnActionPerformed(evt);
            }
        });

        showupdatebtn.setBackground(new java.awt.Color(51, 204, 0));
        showupdatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/update.png"))); // NOI18N
        showupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showupdatebtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 153, 0));

        lbltitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbltitle.setText("TITLE");

        lblqty.setBackground(new java.awt.Color(0, 0, 0));
        lblqty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblqty.setText("QUANTITY");

        tdelbtn.setBackground(new java.awt.Color(204, 51, 0));
        tdelbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tdelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/delete.png"))); // NOI18N
        tdelbtn.setText("Delete");
        tdelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdelbtnActionPerformed(evt);
            }
        });

        tupdatebtn.setBackground(new java.awt.Color(51, 204, 0));
        tupdatebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tupdatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/update.png"))); // NOI18N
        tupdatebtn.setText("Update");
        tupdatebtn.setToolTipText("");
        tupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tupdatebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tdelbtn)
                        .addGap(68, 68, 68)
                        .addComponent(tupdatebtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblqty)
                            .addComponent(lbltitle))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ttitletxt, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(tqtytxt))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltitle)
                            .addComponent(ttitletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(lblqty))
                    .addComponent(tqtytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tdelbtn)
                    .addComponent(tupdatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Games");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Movies");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("TV Series");

        javax.swing.GroupLayout checkpanelLayout = new javax.swing.GroupLayout(checkpanel);
        checkpanel.setLayout(checkpanelLayout);
        checkpanelLayout.setHorizontalGroup(
            checkpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkpanelLayout.createSequentialGroup()
                .addGroup(checkpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkpanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(checkpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(checkpanelLayout.createSequentialGroup()
                                .addComponent(sgamebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(smoviebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stvbtn))
                            .addGroup(checkpanelLayout.createSequentialGroup()
                                .addComponent(showdelbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(showupdatebtn))
                            .addGroup(checkpanelLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel19)
                                .addGap(110, 110, 110)
                                .addComponent(jLabel20)
                                .addGap(107, 107, 107)
                                .addComponent(jLabel21)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)))
                .addGroup(checkpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkpanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkpanelLayout.createSequentialGroup()
                        .addGap(1123, 1123, 1123)
                        .addComponent(lbl)))
                .addGap(148, 148, 148))
        );
        checkpanelLayout.setVerticalGroup(
            checkpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkpanelLayout.createSequentialGroup()
                .addGroup(checkpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(checkpanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(checkpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(6, 6, 6)
                        .addGroup(checkpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sgamebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(smoviebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stvbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(checkpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showupdatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showdelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(checkpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbl)))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        mainpanel.add(checkpanel, "card4");

        showcasepanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Quick View : Category");

        jLabel32.setText("jLabel32");

        jPanel3.setBackground(new java.awt.Color(204, 153, 0));

        onair.setBackground(new java.awt.Color(0, 0, 0));
        onair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/on-air.png"))); // NOI18N
        onair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onairActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setText("On Air");

        music.setBackground(new java.awt.Color(0, 0, 0));
        music.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/music (1).png"))); // NOI18N
        music.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel24.setText("Music");

        tvseries.setBackground(new java.awt.Color(0, 0, 0));
        tvseries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/camera.png"))); // NOI18N
        tvseries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tvseriesActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel26.setText("TV Series");

        btn3D.setBackground(new java.awt.Color(0, 0, 0));
        btn3D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/cinema.png"))); // NOI18N
        btn3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3DActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel29.setText("3D ");

        games.setBackground(new java.awt.Color(0, 0, 0));
        games.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/console (1).png"))); // NOI18N
        games.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel30.setText("Games");

        FullHD.setBackground(new java.awt.Color(0, 0, 0));
        FullHD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/television (2).png"))); // NOI18N
        FullHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullHDActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel33.setText("Full HD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(onair, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(music, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel23)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tvseries, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn3D, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FullHD, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(games, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel33)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel30)
                        .addGap(58, 58, 58))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(onair)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(music, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tvseries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(games, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(FullHD)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel26)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel33)))
        );

        jPanel4.setBackground(new java.awt.Color(204, 153, 0));

        sport.setBackground(new java.awt.Color(0, 0, 0));
        sport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/football (1).png"))); // NOI18N
        sport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportActionPerformed(evt);
            }
        });

        cooking.setBackground(new java.awt.Color(0, 0, 0));
        cooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/cooking.png"))); // NOI18N
        cooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookingActionPerformed(evt);
            }
        });

        romantic.setBackground(new java.awt.Color(0, 0, 0));
        romantic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/romantic.png"))); // NOI18N
        romantic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanticActionPerformed(evt);
            }
        });

        children.setBackground(new java.awt.Color(0, 0, 0));
        children.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/children.png"))); // NOI18N
        children.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                childrenActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel28.setText("Children");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel25.setText("Romantic");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel31.setText("Cooking");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel27.setText("Sports");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/learning (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel34.setText("Education");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/pikachu.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel35.setText("Animation");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(children, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel28)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(romantic, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cooking, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sport, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel25)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel31)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel27)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel34)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel35))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(romantic)
                            .addComponent(children)))
                    .addComponent(cooking)
                    .addComponent(sport)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(jLabel25))
                    .addComponent(jLabel31)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(jLabel35))))
        );

        javax.swing.GroupLayout showcasepanelLayout = new javax.swing.GroupLayout(showcasepanel);
        showcasepanel.setLayout(showcasepanelLayout);
        showcasepanelLayout.setHorizontalGroup(
            showcasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showcasepanelLayout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(showcasepanelLayout.createSequentialGroup()
                .addGroup(showcasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, showcasepanelLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(showcasepanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2749, Short.MAX_VALUE))
        );
        showcasepanelLayout.setVerticalGroup(
            showcasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(showcasepanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(showcasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(302, 302, 302))
        );

        mainpanel.add(showcasepanel, "card8");

        invoicepanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Customer Name");

        custxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custxtActionPerformed(evt);
            }
        });

        billbtn.setBackground(new java.awt.Color(0, 0, 0));
        billbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        billbtn.setForeground(new java.awt.Color(255, 255, 255));
        billbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/bill.png"))); // NOI18N
        billbtn.setText("Bill");
        billbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billbtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantity");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Title");

        printbtn.setBackground(new java.awt.Color(0, 0, 0));
        printbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        printbtn.setForeground(new java.awt.Color(255, 255, 255));
        printbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/printing-tool.png"))); // NOI18N
        printbtn.setText("Print");
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbtnActionPerformed(evt);
            }
        });

        sellgamebtn.setBackground(new java.awt.Color(0, 0, 0));
        sellgamebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/game-controller.png"))); // NOI18N
        sellgamebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellgamebtnActionPerformed(evt);
            }
        });

        sellmoviebtn.setBackground(new java.awt.Color(0, 0, 0));
        sellmoviebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/movie.png"))); // NOI18N
        sellmoviebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellmoviebtnActionPerformed(evt);
            }
        });

        selltvbtn.setBackground(new java.awt.Color(0, 0, 0));
        selltvbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/camera.png"))); // NOI18N
        selltvbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selltvbtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Amount:");

        totallbl.setBackground(new java.awt.Color(0, 0, 0));
        totallbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totallbl.setForeground(new java.awt.Color(255, 255, 255));
        totallbl.setText("0");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Game Collection");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Movie Collection ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TV Series Collection");

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Prices:");

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("GAMES:         150");

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Movies:          100");

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("TV Series:      120");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.setMaximumSize(new java.awt.Dimension(142, 528));
        jButton2.setMinimumSize(new java.awt.Dimension(593, 528));
        jButton2.setPreferredSize(new java.awt.Dimension(593, 528));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout invoicepanelLayout = new javax.swing.GroupLayout(invoicepanel);
        invoicepanel.setLayout(invoicepanelLayout);
        invoicepanelLayout.setHorizontalGroup(
            invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoicepanelLayout.createSequentialGroup()
                .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoicepanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(invoicepanelLayout.createSequentialGroup()
                                .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(42, 42, 42)
                                .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(custxt, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(selltitletxt)
                                    .addComponent(sellqtytxt)))
                            .addGroup(invoicepanelLayout.createSequentialGroup()
                                .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sellgamebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(invoicepanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel14)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(invoicepanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16))
                                    .addGroup(invoicepanelLayout.createSequentialGroup()
                                        .addComponent(sellmoviebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(selltvbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(invoicepanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42)
                                    .addGroup(invoicepanelLayout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel43)
                                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(invoicepanelLayout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(invoicepanelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(totallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(invoicepanelLayout.createSequentialGroup()
                                .addComponent(billbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(invoicepanelLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(invoicepanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(2641, Short.MAX_VALUE))
        );
        invoicepanelLayout.setVerticalGroup(
            invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoicepanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(invoicepanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(80, 80, 80))
                    .addGroup(invoicepanelLayout.createSequentialGroup()
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(custxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(selltitletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sellqtytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(29, 29, 29)))
                .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sellmoviebtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sellgamebtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selltvbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(44, 44, 44)
                .addComponent(jLabel42)
                .addGap(15, 15, 15)
                .addComponent(jLabel43)
                .addGap(34, 34, 34)
                .addComponent(jLabel44)
                .addGap(32, 32, 32)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totallbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(billbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        mainpanel.add(invoicepanel, "card5");

        customerpanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/customer-service (1).png"))); // NOI18N

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Customer_ID");

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Customer_Name");

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Phone_NO");

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Email");

        jTextField4.setToolTipText("");

        add_customerbtn.setText("Save");

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"76", "Rohan", "077-4293119", "rohan32@gmail.com"},
                {"78", "Ashara", "077-8748342", "ashu.raheem@gmail.com"},
                {"79", "Perera", "072-7893748", "perera65@gmail.com"},
                {"", "Malith", "071-8327423", null}
            },
            new String [] {
                "Customer_ID", "Customer_Name", "Phone_NO", "Email"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout customerpanelLayout = new javax.swing.GroupLayout(customerpanel);
        customerpanel.setLayout(customerpanelLayout);
        customerpanelLayout.setHorizontalGroup(
            customerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerpanelLayout.createSequentialGroup()
                .addGroup(customerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerpanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(customerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41))
                        .addGap(29, 29, 29)
                        .addGroup(customerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(customerpanelLayout.createSequentialGroup()
                                .addGroup(customerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(add_customerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(customerpanelLayout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(customerpanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2857, Short.MAX_VALUE))
        );
        customerpanelLayout.setVerticalGroup(
            customerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerpanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(customerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(customerpanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(customerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(customerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(customerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(customerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(customerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerpanelLayout.createSequentialGroup()
                            .addComponent(add_customerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(499, Short.MAX_VALUE))
        );

        mainpanel.add(customerpanel, "card7");

        settingspanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Username");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Password");

        usertxt.setBackground(new java.awt.Color(255, 204, 51));

        passtxt.setBackground(new java.awt.Color(255, 204, 51));

        signupbtn.setBackground(new java.awt.Color(0, 0, 0));
        signupbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signupbtn.setForeground(new java.awt.Color(255, 255, 255));
        signupbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javacoursework1/login (4).png"))); // NOI18N
        signupbtn.setText("Sign Up");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Enter a new ID to your database: ");

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingspanelLayout = new javax.swing.GroupLayout(settingspanel);
        settingspanel.setLayout(settingspanelLayout);
        settingspanelLayout.setHorizontalGroup(
            settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingspanelLayout.createSequentialGroup()
                .addGroup(settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingspanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(settingspanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(settingspanelLayout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addGroup(settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(signupbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(3214, Short.MAX_VALUE))
        );
        settingspanelLayout.setVerticalGroup(
            settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingspanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(settingspanelLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(35, 35, 35)
                        .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addGap(34, 34, 34)
                .addGroup(settingspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        mainpanel.add(settingspanel, "card6");

        getContentPane().add(mainpanel, java.awt.BorderLayout.CENTER);

        currentuser.setText("Name");
        currentuser.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        currentuser.setIconTextGap(25);
        jMenuBar2.add(currentuser);

        date.setText("Date");
        date.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        date.setIconTextGap(25);
        jMenuBar2.add(date);

        time.setText("Time");
        time.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        time.setIconTextGap(45);
        jMenuBar2.add(time);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //menu panel used to display different types of panels.
    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        mainpanel.removeAll();
        mainpanel.add(homepanel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_homebtnActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        mainpanel.removeAll();
        mainpanel.add(addcdpanel);
        mainpanel.repaint();
        mainpanel.revalidate();
       
    }//GEN-LAST:event_AddbtnActionPerformed
//adding data to the tv table in the database
    private void TVbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TVbtnActionPerformed
        if (titletxt.getText().compareTo("")==0){
            msg2.setText("TV Series Title Not Entered!");
        }
        else
        try{
          
            Statement stmt = con.createStatement();
            String sql = "insert into tv(title,released_year,genre,no_of_seasons,quantity)"+"values('"+titletxt.getText()+"','"+reltxt.getText()+"','"+genretxt.getText()+"','"+seasontxt.getText()+"','"+qtytxt.getText()+"')";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "TV Series Added Sucessfully");
        titletxt.setText("");
        reltxt.setText("");
        genretxt.setText("");
        qtytxt.setText("");
        seasontxt.setText(""); 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
 
       
    }//GEN-LAST:event_TVbtnActionPerformed

    private void checkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbtnActionPerformed
        mainpanel.removeAll();
        mainpanel.add(checkpanel);
        mainpanel.repaint();
        mainpanel.revalidate();
        ttitletxt.setVisible(false);
     
       tqtytxt.setVisible(false);
       lbltitle.setVisible(false);
       lblqty.setVisible(false);
  
       tdelbtn.setVisible(false);
       tupdatebtn.setVisible(false);
    }//GEN-LAST:event_checkbtnActionPerformed
//adding data to the game table in the database
    private void gamebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamebtnActionPerformed
        if (titletxt.getText().compareTo("")==0){
       msg.setText("Game Title Not Entered!");
        }
        
   else
       try{
          
           Statement stmt = con.createStatement();
           String sql = "insert into games(title,released_year,genre,quantity)"+"values('"+titletxt.getText()+"','"+reltxt.getText()+"','"+genretxt.getText()+"','"+qtytxt.getText()+"')";
           stmt.executeUpdate(sql);
           
           JOptionPane.showMessageDialog(null, "Game Added Sucessfully");
        titletxt.setText("");
        reltxt.setText("");
        genretxt.setText("");
        qtytxt.setText("");
        seasontxt.setText("");  
       }
   catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
   }
            
    }//GEN-LAST:event_gamebtnActionPerformed
//adding data to the movie table in the database
    private void moviebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moviebtnActionPerformed
              if (titletxt.getText().compareTo("")==0){
       msg1.setText("Movie Title Not Entered!");
  
   }
   else
       try{
          
           Statement stmt = con.createStatement();
           String sql = "insert into movies(title,released_year,genre,quantity)"+"values('"+titletxt.getText()+"','"+reltxt.getText()+"','"+genretxt.getText()+"','"+qtytxt.getText()+"')";
           stmt.executeUpdate(sql);
          
           JOptionPane.showMessageDialog(null, "Movie Added Sucessfully");
        titletxt.setText("");
        reltxt.setText("");
        genretxt.setText("");
        qtytxt.setText("");
        seasontxt.setText(""); 
       }
   catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
   }
    }//GEN-LAST:event_moviebtnActionPerformed

    private void showupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showupdatebtnActionPerformed
        ttitletxt.setVisible(true);
     
        tqtytxt.setVisible(true);
        lbltitle.setVisible(true);
        lblqty.setVisible(true);
       
        tdelbtn.setVisible(false);
        tupdatebtn.setVisible(true);
    }//GEN-LAST:event_showupdatebtnActionPerformed

    private void showdelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showdelbtnActionPerformed
        ttitletxt.setVisible(true);
     
        tqtytxt.setVisible(false);
        lbltitle.setVisible(true);
        lblqty.setVisible(false);
       
        tdelbtn.setVisible(true);
        tupdatebtn.setVisible(false);
    }//GEN-LAST:event_showdelbtnActionPerformed

    private void stvbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stvbtnActionPerformed
        Update_table("Select * from tv");
        lbl.setText("tv");
        lbl.setVisible(false);
    }//GEN-LAST:event_stvbtnActionPerformed

    private void smoviebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smoviebtnActionPerformed
        Update_table("Select * from movies");
        lbl.setText("movies");
        lbl.setVisible(false);

    }//GEN-LAST:event_smoviebtnActionPerformed

    private void sgamebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgamebtnActionPerformed
        Update_table("Select * from games");
        lbl.setText("games");
        lbl.setVisible(false);
    }//GEN-LAST:event_sgamebtnActionPerformed

    private void invoicebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoicebtnActionPerformed
         mainpanel.removeAll();
        mainpanel.add(invoicepanel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_invoicebtnActionPerformed
//the button is specifically to sell a game
    private void sellgamebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellgamebtnActionPerformed
        String x =  "games";
        
        if (selltitletxt.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(null, "Title Not Entered");
        }
        else
        try{
         
           
            Statement stmt = con.createStatement();
             String sq =  "Select * from games where title = '"+selltitletxt.getText()+"'";
             ResultSet rs = stmt.executeQuery(sq);
             if(rs.next()){
            
            
            
            String sql = "insert into invoice(title,category,quantity)"+"values('"+selltitletxt.getText()+"','"+x+"','"+sellqtytxt.getText()+"')";
            String sql1 = "update games set quantity = quantity - ? where title = ?";
            
           
            PreparedStatement pstmt = con.prepareStatement(sql1);{ 
                // set the corresponding param
                pstmt.setString(1,sellqtytxt.getText());
                pstmt.setString(2,selltitletxt.getText());
                // execute the delete statement
                pstmt.executeUpdate();}
                stmt.execute(sq);
                
                stmt.executeUpdate(sql);
                
            JOptionPane.showMessageDialog(null, "invoice created");
        }
             else{
                 JOptionPane.showMessageDialog(null, "There's no Game in the database with that title\n Please Re-Enter");
             }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
 
        category = "games";
        price = 150;
      
 
    }//GEN-LAST:event_sellgamebtnActionPerformed
//the button is specifically to sell a movie
    private void sellmoviebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellmoviebtnActionPerformed
         String x =  "movie";
        if (selltitletxt.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(null, "Title Not Entered");
        }
        else
        try{
             Statement stmt = con.createStatement();
             String sq =  "Select * from movies where title = '"+selltitletxt.getText()+"'";
             ResultSet rs = stmt.executeQuery(sq);
             if(rs.next()){
                 
             
            
             
            String sql = "insert into invoice(title,category,quantity)"+"values('"+selltitletxt.getText()+"','"+x+"','"+sellqtytxt.getText()+"')";
            String sql1 = "update movies set quantity = quantity - ? where title = ?";

            
            PreparedStatement pstmt = con.prepareStatement(sql1);{ 
                // set the corresponding param
                pstmt.setString(1,sellqtytxt.getText());
                pstmt.setString(2,selltitletxt.getText());
                // execute the delete statement
                pstmt.executeUpdate();}
                stmt.execute(sq);
                stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "invoice created");}
              else{
                 JOptionPane.showMessageDialog(null, "There's no Movie in the database with that title\n Please Re-Enter");
             }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
 
        category = "movies";
        price = 100;
        
    }//GEN-LAST:event_sellmoviebtnActionPerformed
//the button is specifically to sell a tv series
    private void selltvbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selltvbtnActionPerformed
         String x =  "TV Series";
        if (selltitletxt.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(null, "Title Not Entered");
        }
        else
        try{
             Statement stmt = con.createStatement();
             String sq =  "Select * from tv where title = '"+selltitletxt.getText()+"'";
             ResultSet rs = stmt.executeQuery(sq);
            if(rs.next()){
            
            
            
            String sql = "insert into invoice(title,category,quantity)"+"values('"+selltitletxt.getText()+"','"+x+"','"+sellqtytxt.getText()+"')";
            String sql1 = "update tv set quantity = quantity - ? where title = ?";
            
           
            PreparedStatement pstmt = con.prepareStatement(sql1);{ 
                // set the corresponding param
                pstmt.setString(1,sellqtytxt.getText());
                pstmt.setString(2,selltitletxt.getText());
                // execute the delete statement
                pstmt.executeUpdate();}
                stmt.execute(sq);
                
                stmt.executeUpdate(sql);
                
            JOptionPane.showMessageDialog(null, "invoice created");
        }
              else{
                 JOptionPane.showMessageDialog(null, "There's no TV Series in the database with that title\n Please Re-Enter");
             }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
 
         category = "tv";
        price = 120;
        
    }//GEN-LAST:event_selltvbtnActionPerformed
//this is used to calculate the bill.
    private void billbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billbtnActionPerformed
     
       try{
          
          String sql = "Select sum("+sellqtytxt.getText()+"*"+price+") as total from "+category+" where title ='"+selltitletxt.getText()+"' ";
          
             price = price *  Integer.parseInt(sellqtytxt.getText());
             total = total + price;
             totallbl.setText(String.valueOf(total));
  

           
      
           
       }
   catch(Exception e){
       System.out.println(e);
    }
   
    
    }//GEN-LAST:event_billbtnActionPerformed

    private void settingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingbtnActionPerformed
        mainpanel.removeAll();
        mainpanel.add(settingspanel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_settingbtnActionPerformed
//here we add a new admin to the database to use the application in his/her own login details.
    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
         if (usertxt.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(null, "Username not entered");
        }
         if (passtxt.getText().compareTo("")==0){
            JOptionPane.showMessageDialog(null, "Password not entered");
        }
        else
        try{
             Statement stmt = con.createStatement();
           
             String sql = "insert into admin(admin_username,passwords)"+"values('"+usertxt.getText()+"','"+passtxt.getText()+"')";
         
             stmt.executeUpdate(sql);
             JOptionPane.showMessageDialog(null,"Signing Up","Signed Up",JOptionPane.INFORMATION_MESSAGE);
             }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Something went wrong","Error",JOptionPane.INFORMATION_MESSAGE);
        }
 usertxt.setText("");
 passtxt.setText("");
    }//GEN-LAST:event_signupbtnActionPerformed

    private void reltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reltxtActionPerformed

    private void custxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custxtActionPerformed

    private void titletxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titletxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titletxtActionPerformed

    private void customerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerbtnActionPerformed
        mainpanel.removeAll();
        mainpanel.add(customerpanel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_customerbtnActionPerformed

    private void showcasebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showcasebtnActionPerformed
        mainpanel.removeAll();
        mainpanel.add(showcasepanel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_showcasebtnActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
      this.hide();
    }//GEN-LAST:event_CancelActionPerformed
//here we print a receipt for the customer.
    private void printbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbtnActionPerformed
      
        //right here we set the button to print a receipt.
        try{
        File file = new File("receipt.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        
        PrintWriter pw = new PrintWriter(file);
        pw.println("Name of customer: " + custxt.getText());
        pw.println("Amount          : " + totallbl.getText());
        pw.close();
          JOptionPane.showMessageDialog(null,"Receipt generated","DONE",JOptionPane.INFORMATION_MESSAGE);
      }
      catch(Exception e){
          System.out.print(e);
      }
    }//GEN-LAST:event_printbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       totallbl.setText("");
       selltitletxt.setText("");
       sellqtytxt.setText("");        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Animation().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Education().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void childrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_childrenActionPerformed
        new Childern().setVisible(true);
    }//GEN-LAST:event_childrenActionPerformed

    private void romanticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanticActionPerformed
        new Romantic().setVisible(true);
    }//GEN-LAST:event_romanticActionPerformed

    private void cookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookingActionPerformed
        new cooking().setVisible(true);
    }//GEN-LAST:event_cookingActionPerformed

    private void sportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportActionPerformed
        new Sports().setVisible(true);
    }//GEN-LAST:event_sportActionPerformed

    private void FullHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullHDActionPerformed
        new FullHD().setVisible(true);
    }//GEN-LAST:event_FullHDActionPerformed

    private void gamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamesActionPerformed
        new Games().setVisible(true);
    }//GEN-LAST:event_gamesActionPerformed

    private void btn3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3DActionPerformed
        new Other3D().setVisible(true);
    }//GEN-LAST:event_btn3DActionPerformed

    private void tvseriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tvseriesActionPerformed
        new TVSeries().setVisible(true);
    }//GEN-LAST:event_tvseriesActionPerformed

    private void musicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicActionPerformed
        new music().setVisible(true);
    }//GEN-LAST:event_musicActionPerformed

    private void onairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onairActionPerformed
        new onair().setVisible(true);
    }//GEN-LAST:event_onairActionPerformed

    private void seasontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seasontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seasontxtActionPerformed

    private void tupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tupdatebtnActionPerformed
        String sql = "update "+lbl.getText()+" set quantity = quantity + ? where title = ?";
        try{
            PreparedStatement pstmt = con.prepareStatement(sql); {

                // set the corresponding param

                pstmt.setString(1,tqtytxt.getText());
                pstmt.setString(2,ttitletxt.getText());
                // execute the delete statement
                pstmt.executeUpdate();

            }} catch (Exception e) {
                System.out.println(e.getMessage());
            }
            Update_table("Select * from "+lbl.getText()+"");

         

            ttitletxt.setText("");
            tqtytxt.setText("");
    }//GEN-LAST:event_tupdatebtnActionPerformed

    private void tdelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdelbtnActionPerformed
        String sql = "DELETE FROM "+lbl.getText()+" WHERE title = ?";

        try{

            PreparedStatement pstmt = con.prepareStatement(sql); {

                // set the corresponding param
                pstmt.setString(1, ttitletxt.getText());
                // execute the delete statement
                pstmt.executeUpdate();

            }} catch (Exception e) {
                System.out.println(e.getMessage());
            }
            Update_table("Select * from "+lbl.getText()+"");

            ttitletxt.setText("");

        
    }//GEN-LAST:event_tdelbtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JOptionPane.showMessageDialog(null,"You have been logged out","Logged Out",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton FullHD;
    private javax.swing.JPanel Menupanel;
    private javax.swing.JButton TVbtn;
    private javax.swing.JButton add_customerbtn;
    private javax.swing.JPanel addcdpanel;
    private javax.swing.JButton billbtn;
    private javax.swing.JButton btn3D;
    private javax.swing.JButton checkbtn;
    private javax.swing.JPanel checkpanel;
    private javax.swing.JButton children;
    private javax.swing.JButton cooking;
    private javax.swing.JMenu currentuser;
    private javax.swing.JButton customerbtn;
    private javax.swing.JPanel customerpanel;
    private javax.swing.JTextField custxt;
    private javax.swing.JMenu date;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton gamebtn;
    private javax.swing.JButton games;
    private javax.swing.JTextField genretxt;
    private javax.swing.JButton homebtn;
    private javax.swing.JPanel homepanel;
    private javax.swing.JButton invoicebtn;
    private javax.swing.JPanel invoicepanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblqty;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JButton moviebtn;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel msg1;
    private javax.swing.JLabel msg2;
    private javax.swing.JButton music;
    private javax.swing.JButton onair;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JButton printbtn;
    private javax.swing.JTextField qtytxt;
    private javax.swing.JTextField reltxt;
    private javax.swing.JButton romantic;
    private javax.swing.JTextField seasontxt;
    private javax.swing.JButton sellgamebtn;
    private javax.swing.JButton sellmoviebtn;
    private javax.swing.JTextField sellqtytxt;
    private javax.swing.JTextField selltitletxt;
    private javax.swing.JButton selltvbtn;
    private javax.swing.JButton settingbtn;
    private javax.swing.JPanel settingspanel;
    private javax.swing.JButton sgamebtn;
    private javax.swing.JButton showcasebtn;
    private javax.swing.JPanel showcasepanel;
    private javax.swing.JButton showdelbtn;
    private javax.swing.JButton showupdatebtn;
    private javax.swing.JButton signupbtn;
    private javax.swing.JButton smoviebtn;
    private javax.swing.JButton sport;
    private javax.swing.JButton stvbtn;
    private javax.swing.JTable table;
    private javax.swing.JButton tdelbtn;
    private javax.swing.JMenu time;
    private javax.swing.JTextField titletxt;
    private javax.swing.JLabel totallbl;
    private javax.swing.JTextField tqtytxt;
    private javax.swing.JTextField ttitletxt;
    private javax.swing.JButton tupdatebtn;
    private javax.swing.JButton tvseries;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
