
import java.awt.Color;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.ImageIcon;

public class ColorFix extends javax.swing.JFrame {
  
    public int count = 3;
    public int score = 0;
    public int trial = 0;
    public int Level = 1;
    public int High = 0;
    
    public Color gc1;
    public Color gc2;
    public Color gc3;
    
    
    
     public static String dir = System.getProperty("user.home", "Desktop") + "\\Desktop\\";
    public static String path = dir.substring(0, dir.length()-8) + "PolyGames\\ColorFix\\";
    //Create folder
     File file = new File(path);
    
     public Properties prop = new Properties();
     public Properties def = new Properties();
     {
       def.setProperty("highe","0");       
       def.setProperty("highm","0");
       def.setProperty("highm","0");       
       def.setProperty("level","1");
      
     }
    
     
    public ColorFix() {
        initComponents();
          setLayout(null);
        
        
        //Set Icon 
         setIconImage(new ImageIcon(getClass().getResource("Paint-48.png")).getImage());
        
         if(!file.exists())
     {
         file.mkdirs();
     }
        
         closeMenu();       
        score =0;
        scr.setText(" SCORE : " + score);
        
        
       try
       {       
      String temp3;
      temp3 = LoadSet("level");      
       Level = Integer.valueOf(temp3); 
      
       
       
       if(Level==1)
       {
          lvl.setText("EASY");  
          hideThirdTile();
       }
       
       else if(Level==2)
       {
           lvl.setText("MEDIUM");
          hideThirdTile(); 
       }
       
       else if(Level==3)
       {
           lvl.setText("DIFFICULT");
         showThirdTile();  
       }
           
       
      
      
      
       SaveSet("level",String.valueOf(Level)); 
       }catch(Exception e) 
       {
         Level = 1;                        
         lvl.setText("EASY");
       SaveSet("level",String.valueOf(Level)); 
            
       }
       try
       {
         String temp2;
       temp2 = LoadSet("high");       
       High = Integer.valueOf(temp2);                        
       h.setText("HIGH : "+High);
       SaveSet("high",String.valueOf(High)); 
       
       }catch(Exception ex) 
       {
         High = 0;                   
       h.setText("HIGH : "+High);
       SaveSet("high",String.valueOf(High)); 
            
       }
       
       
       trial=0;
       trl.setText(" TRIES  : "+trial+"/3");
        
             NextLevel();
             
             
    }

    public void showThirdTile()
    {
                
        
       x.setLocation(90, 160);
       plus1.setLocation(x.getX()+130, x.getY());       
       y.setLocation(x.getX()+180, x.getY());
       
       ///Swapping positions of EQ/Answer and Plus2/Z
       plus2.setLocation(y.getX()+130, x.getY());
       z.setLocation(y.getX()+180, x.getY());
              
       eq.setLocation(z.getX()+130, x.getY());       
       ans.setLocation(z.getX()+180, x.getY());
       z.setVisible(true);
        plus2.setVisible(true); 
       
    }
     public void hideThirdTile()
    {           
        
       x.setLocation(180, 160);
       plus1.setLocation(x.getX()+130, x.getY());       
       y.setLocation(x.getX()+180, x.getY());
       
       eq.setLocation(y.getX()+130, x.getY());
       
       ans.setLocation(y.getX()+180, x.getY());
       plus2.setLocation(ans.getX()+130, x.getY());
       z.setLocation(ans.getX()+180, x.getY());
        z.setVisible(false);
        plus2.setVisible(false);   
    }
    
    public void SaveGame()
    {       
        SaveSet("high",String.valueOf(High));
        SaveSet("level",String.valueOf(Level));
    }
    
     private void SaveSet(String key, String value) 
     {

        try {

            File Sett = new File(path + "ColorFix.properties");
            FileWriter writer = new FileWriter(Sett);

            prop.setProperty(key, value);

            prop.store(writer, "ColorFix Game Saves (Warning :DO NOT MODIFY/DELETE !!!)\n\n\nThese are the user game scores that have been saved. Modifying these values is called \"Cheating\" \n\n");
            writer.close();

        } catch (Exception e) {
            LoadDefSet();
           
        }
    }
     
      public String LoadSet(String key) 
    {
            String value;
        try {

             File Sett = new File(path + "ColorFix.properties");
            FileReader reader = new FileReader(Sett);

            prop.load(reader);

            value = prop.getProperty(key);

            reader.close();
             return value;
        
            
        } catch (Exception e) {
            value = "0";
            return value;

        }

    }
      
       public void LoadDefSet() {
 
        try {

             File Sett = new File(path + "ColorFix.properties");
            
            FileWriter writer = new FileWriter(Sett);

           
            
            High=0;
            Level = 1;
            
                
            def.setProperty("high","0");
            def.setProperty("level","1");

           def.store(writer, "ColorFix Game Saves (Warning :DO NOT MODIFY/DELETE !!!)\n\n\nThese are the user game scores that have been saved. Modifying these will get you killed by the person who played. If that person is you, then it's called cheating!\n\n");
            writer.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Unable to load Default User Game Save\nError in function: LoadDefSet()\n\n"+ e.getMessage());
        }
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        men = new javax.swing.JPanel();
        lvl3 = new javax.swing.JLabel();
        lvl2 = new javax.swing.JLabel();
        lvl4 = new javax.swing.JLabel();
        lvl5 = new javax.swing.JLabel();
        trl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        scr = new javax.swing.JLabel();
        plus1 = new javax.swing.JLabel();
        y = new javax.swing.JLabel();
        ans = new javax.swing.JLabel();
        eq = new javax.swing.JLabel();
        o1 = new javax.swing.JLabel();
        o2 = new javax.swing.JLabel();
        o3 = new javax.swing.JLabel();
        o4 = new javax.swing.JLabel();
        o8 = new javax.swing.JLabel();
        o7 = new javax.swing.JLabel();
        o6 = new javax.swing.JLabel();
        o5 = new javax.swing.JLabel();
        mix = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        tit = new javax.swing.JLabel();
        lvl = new javax.swing.JLabel();
        lvl1 = new javax.swing.JLabel();
        o9 = new javax.swing.JLabel();
        o10 = new javax.swing.JLabel();
        o11 = new javax.swing.JLabel();
        o12 = new javax.swing.JLabel();
        z = new javax.swing.JLabel();
        plus2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.white);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        men.setOpaque(false);
        men.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lvl3.setBackground(new java.awt.Color(76, 175, 80));
        lvl3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        lvl3.setForeground(java.awt.Color.white);
        lvl3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lvl3.setText("        DIFFICULT");
        lvl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lvl3.setOpaque(true);
        lvl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvl3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lvl3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lvl3MouseExited(evt);
            }
        });
        men.add(lvl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 180, 45));

        lvl2.setBackground(new java.awt.Color(76, 175, 80));
        lvl2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        lvl2.setForeground(java.awt.Color.white);
        lvl2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lvl2.setText("        MEDIUM");
        lvl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lvl2.setOpaque(true);
        lvl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvl2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lvl2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lvl2MouseExited(evt);
            }
        });
        men.add(lvl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 180, 45));

        lvl4.setBackground(new java.awt.Color(76, 175, 80));
        lvl4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        lvl4.setForeground(java.awt.Color.white);
        lvl4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lvl4.setText("EASY");
        lvl4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lvl4.setOpaque(true);
        lvl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvl4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lvl4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lvl4MouseExited(evt);
            }
        });
        men.add(lvl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 130, 45));

        lvl5.setBackground(new java.awt.Color(76, 175, 80));
        lvl5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        lvl5.setForeground(java.awt.Color.white);
        lvl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1427314272_arrow-drop-down-24.png"))); // NOI18N
        lvl5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lvl5.setOpaque(true);
        lvl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvl5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lvl5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lvl5MouseExited(evt);
            }
        });
        men.add(lvl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 45));

        getContentPane().add(men, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 150));

        trl.setBackground(new java.awt.Color(144, 202, 249));
        trl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        trl.setText(" TRIES  : ");
        trl.setOpaque(true);
        getContentPane().add(trl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 220, 44));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Aravind Balaji   ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 110, 30));

        x.setBackground(java.awt.Color.white);
        x.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        x.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        x.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        x.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        x.setIconTextGap(0);
        x.setOpaque(true);
        x.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 120, 110));

        scr.setBackground(new java.awt.Color(144, 202, 249));
        scr.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        scr.setText(" SCORE : ");
        scr.setOpaque(true);
        getContentPane().add(scr, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 220, 44));

        plus1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        plus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus1.setText("+");
        plus1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(plus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 40, 110));

        y.setBackground(java.awt.Color.white);
        y.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        y.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        y.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        y.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        y.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        y.setIconTextGap(6);
        y.setInheritsPopupMenu(false);
        y.setOpaque(true);
        y.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yMouseClicked(evt);
            }
        });
        getContentPane().add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 120, 110));

        ans.setBackground(java.awt.Color.white);
        ans.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ans.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ans.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ans.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ans.setOpaque(true);
        ans.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ansMouseClicked(evt);
            }
        });
        getContentPane().add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 120, 110));

        eq.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        eq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eq.setText("=");
        eq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(eq, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 40, 110));

        o1.setBackground(java.awt.Color.white);
        o1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        o1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        o1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        o1.setIconTextGap(0);
        o1.setOpaque(true);
        o1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        o1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o1MouseClicked(evt);
            }
        });
        o1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                o1KeyPressed(evt);
            }
        });
        getContentPane().add(o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 50, 50));

        o2.setBackground(java.awt.Color.white);
        o2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        o2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        o2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        o2.setIconTextGap(6);
        o2.setInheritsPopupMenu(false);
        o2.setOpaque(true);
        o2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        o2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o2MouseClicked(evt);
            }
        });
        getContentPane().add(o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 50, 50));

        o3.setBackground(java.awt.Color.white);
        o3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        o3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        o3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        o3.setIconTextGap(0);
        o3.setOpaque(true);
        o3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        o3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o3MouseClicked(evt);
            }
        });
        getContentPane().add(o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 50, 50));

        o4.setBackground(java.awt.Color.white);
        o4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        o4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        o4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        o4.setIconTextGap(6);
        o4.setInheritsPopupMenu(false);
        o4.setOpaque(true);
        o4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        o4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o4MouseClicked(evt);
            }
        });
        getContentPane().add(o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 50, 50));

        o8.setBackground(java.awt.Color.white);
        o8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        o8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        o8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        o8.setIconTextGap(6);
        o8.setInheritsPopupMenu(false);
        o8.setOpaque(true);
        o8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        o8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o8MouseClicked(evt);
            }
        });
        getContentPane().add(o8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 50, 50));

        o7.setBackground(java.awt.Color.white);
        o7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        o7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        o7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        o7.setIconTextGap(0);
        o7.setOpaque(true);
        o7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        o7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o7MouseClicked(evt);
            }
        });
        getContentPane().add(o7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 50, 50));

        o6.setBackground(java.awt.Color.white);
        o6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        o6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        o6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        o6.setIconTextGap(6);
        o6.setInheritsPopupMenu(false);
        o6.setOpaque(true);
        o6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        o6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o6MouseClicked(evt);
            }
        });
        getContentPane().add(o6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 50, 50));

        o5.setBackground(java.awt.Color.white);
        o5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        o5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        o5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        o5.setIconTextGap(0);
        o5.setOpaque(true);
        o5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        o5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o5MouseClicked(evt);
            }
        });
        getContentPane().add(o5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 50, 50));

        mix.setBackground(new java.awt.Color(63, 81, 181));
        mix.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        mix.setForeground(java.awt.Color.white);
        mix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mix.setText("Color Fix!");
        mix.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mix.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mix.setOpaque(true);
        mix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mixMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mixMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mixMouseExited(evt);
            }
        });
        getContentPane().add(mix, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 220, 50));

        h.setBackground(new java.awt.Color(144, 202, 249));
        h.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        h.setText("HIGH : ");
        h.setOpaque(true);
        getContentPane().add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 220, 44));
        h.getAccessibleContext().setAccessibleName("");

        title1.setBackground(new java.awt.Color(33, 150, 243));
        title1.setFont(new java.awt.Font("Segoe Print", 1, 27)); // NOI18N
        title1.setForeground(java.awt.Color.white);
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint-48.png"))); // NOI18N
        title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        title1.setOpaque(true);
        getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 60, 50));

        title.setBackground(new java.awt.Color(33, 150, 243));
        title.setFont(new java.awt.Font("Segoe Print", 1, 27)); // NOI18N
        title.setForeground(java.awt.Color.white);
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("     ColorFix");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        title.setOpaque(true);
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 50));

        tit.setBackground(new java.awt.Color(76, 175, 80));
        tit.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tit.setForeground(java.awt.Color.white);
        tit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tit.setText("Choose the combination that gives the resultant color");
        tit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tit.setOpaque(true);
        getContentPane().add(tit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 840, 40));
        tit.getAccessibleContext().setAccessibleName("");

        lvl.setBackground(new java.awt.Color(76, 175, 80));
        lvl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        lvl.setForeground(java.awt.Color.white);
        lvl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lvl.setText("VERY EASY");
        lvl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lvl.setOpaque(true);
        lvl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lvlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lvlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lvlMouseExited(evt);
            }
        });
        getContentPane().add(lvl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 130, 45));

        lvl1.setBackground(new java.awt.Color(76, 175, 80));
        lvl1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        lvl1.setForeground(java.awt.Color.white);
        lvl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1427314272_arrow-drop-down-24.png"))); // NOI18N
        lvl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lvl1.setOpaque(true);
        lvl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lvl1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lvl1MouseExited(evt);
            }
        });
        getContentPane().add(lvl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, 45));

        o9.setBackground(java.awt.Color.white);
        o9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        o9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        o9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        o9.setIconTextGap(0);
        o9.setOpaque(true);
        o9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        o9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o9MouseClicked(evt);
            }
        });
        o9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                o9KeyPressed(evt);
            }
        });
        getContentPane().add(o9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 50, 50));

        o10.setBackground(java.awt.Color.white);
        o10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        o10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        o10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        o10.setIconTextGap(0);
        o10.setOpaque(true);
        o10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        o10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o10MouseClicked(evt);
            }
        });
        getContentPane().add(o10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 50, 50));

        o11.setBackground(java.awt.Color.white);
        o11.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        o11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        o11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        o11.setIconTextGap(6);
        o11.setInheritsPopupMenu(false);
        o11.setOpaque(true);
        o11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        o11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o11MouseClicked(evt);
            }
        });
        getContentPane().add(o11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 50, 50));

        o12.setBackground(java.awt.Color.white);
        o12.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        o12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        o12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        o12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        o12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        o12.setIconTextGap(6);
        o12.setInheritsPopupMenu(false);
        o12.setOpaque(true);
        o12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        o12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                o12MouseClicked(evt);
            }
        });
        getContentPane().add(o12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 50, 50));

        z.setBackground(java.awt.Color.white);
        z.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        z.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        z.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        z.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        z.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        z.setIconTextGap(0);
        z.setOpaque(true);
        z.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(z, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 120, 110));

        plus2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        plus2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus2.setText("+");
        plus2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(plus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 40, 110));

        back.setBackground(java.awt.Color.white);
        back.setForeground(java.awt.Color.white);
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setOpaque(true);
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void yMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yMouseClicked

       
    }//GEN-LAST:event_yMouseClicked

    private void mixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mixMouseClicked
        
             
    closeMenu();    
    tit.setForeground(Color.WHITE);
    lvl.setForeground(Color.WHITE);
     lvl1.setForeground(Color.WHITE);
    
    Color original = Color.WHITE;
    Color user=Color.WHITE;
    
    if(Level==1 || Level==2)
    {      
       original = blend(gc1,gc2, (float) 0.5);
       user = blend(x.getBackground(),y.getBackground(), (float) 0.5);
   }
    
    else if(Level==3)
    {
               
        original = blend3(gc1,gc2,gc3,(float)0.3);
       user = blend3(x.getBackground(),y.getBackground(),z.getBackground(), (float) 0.3);
    }
    
    
   if(original.equals(user))
   {
       tit.setText("Good, here's the next one...");
       tit.setBackground(new Color(76,175,80));
       lvl.setBackground(new Color(76,175,80));
        lvl1.setBackground(new Color(76,175,80));
       
       NextLevel();
       if(Level==1)
       {
         score = score +1;
       }
       else if(Level==2)
       {
           score = score +2;
       }
           
       else if(Level==3)
       {
           score = score +3;
       }
           
       
       scr.setText(" SCORE : "+score);
       if(score > High)
       {
          tit.setText("New high score! Keep going!");  
         
          High=score;
          h.setText("HIGH : " + High);
          SaveSet("high",String.valueOf(High));
       }
       trial=0;
       if(Level==1||Level==2)
       {
            trl.setText(" TRIES  : "+trial+"/3");
       }
       else
       {
           trl.setText(" TRIES  : "+trial+"/6");
       }
   }
   
   else
   {
      
       
      if(trial==2)
      {
          tit.setText("This is your last chance");   
        tit.setBackground(new Color(201,57,5));
         lvl.setBackground(new Color(201,57,5));
          lvl1.setBackground(new Color(201,57,5));
        
        
        trial=trial+1;        
        trl.setText(" TRIES  : Last try!");
      }
       
       else if(trial<3)
      {
        tit.setText("Sorry! Try again");   
        tit.setBackground(new Color(201,57,5));
         lvl.setBackground(new Color(201,57,5));
          lvl1.setBackground(new Color(201,57,5));
      
        trial=trial+1;
        trl.setText(" TRIES  : "+trial+"/3");
      }
     
          
      
      else
      {
       tit.setText("Sorry! You missed your chance, here's another one");          
       tit.setBackground(new Color(255,213,79));
       lvl.setBackground(new Color(255,213,79));
       lvl1.setBackground(new Color(255,213,79));
       tit.setForeground(Color.BLACK);
       lvl.setForeground(Color.BLACK);
       lvl1.setForeground(Color.BLACK);
       NextLevel();
      
       //Subtract points
       
       if(Level==1 || Level==2)
       {
        score = score - 1;                 
       }
       
      if(score<0)
      {
          score=0;
      }
       scr.setText(" SCORE : "+score);
       trial=0;
        trl.setText(" TRIES  : "+trial+"/3");   
      }
      
      
     
   }
    SaveGame();
   
    if(trial==0)
       {
        
            lvl.setEnabled(true);
       
       }
         else 
         {
             
             lvl.setEnabled(false);
               
         }
    
    
    }//GEN-LAST:event_mixMouseClicked

    private void mixMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mixMouseEntered

        
    }//GEN-LAST:event_mixMouseEntered

    
   Color blend( Color c1, Color c2, float ratio ) 
   {
      
       if ( ratio > 1f )
    { 
        ratio = 1f;        
    } 
    else if ( ratio < 0f ) 
    {
        ratio = 0f;
    }
    
    //Dividing the ratio
    float iRatio = 1.0f - ratio;

    int i1 = c1.getRGB();
    int i2 = c2.getRGB();

    //Converting RGB to Integer
    int a1 = (i1 >> 24 & 0xff);
    int r1 = ((i1 & 0xff0000) >> 16);
    int g1 = ((i1 & 0xff00) >> 8);
    int b1 = (i1 & 0xff);
    //Converting RGB to Integer
    int a2 = (i2 >> 24 & 0xff);
    int r2 = ((i2 & 0xff0000) >> 16);
    int g2 = ((i2 & 0xff00) >> 8);
    int b2 = (i2 & 0xff);

    //Multiplying Ratio with each color and Adding/mixing the color into a new RGB value
    int a = (int)((a1 * iRatio) + (a2 * ratio));
    int r = (int)((r1 * iRatio) + (r2 * ratio));
    int g = (int)((g1 * iRatio) + (g2 * ratio));
    int b = (int)((b1 * iRatio) + (b2 * ratio));

    //Returning the new Color object
    return new Color( a << 24 | r << 16 | g << 8 | b );
}
   
   
   
   
    Color blend3( Color c1, Color c2,Color c3, float iRatio ) 
   {
    int i1 = c1.getRGB();
    int i2 = c2.getRGB();
    int i3 = c3.getRGB();

    //Converting RGB to Integer
    int a1 = (i1 >> 24 & 0xff);
    int r1 = ((i1 & 0xff0000) >> 16);
    int g1 = ((i1 & 0xff00) >> 8);
    int b1 = (i1 & 0xff);
    //Converting RGB to Integer
    int a2 = (i2 >> 24 & 0xff);
    int r2 = ((i2 & 0xff0000) >> 16);
    int g2 = ((i2 & 0xff00) >> 8);
    int b2 = (i2 & 0xff);
     //Converting RGB to Integer
    int a3 = (i3 >> 24 & 0xff);
    int r3 = ((i3 & 0xff0000) >> 16);
    int g3 = ((i3 & 0xff00) >> 8);
    int b3 = (i3 & 0xff);

    //Multiplying Ratio with each color and Adding/mixing the color into a new RGB value
    int a = (int)((a1 * iRatio) + (a2 * iRatio)+ (a3 * iRatio));
    int r = (int)((r1 * iRatio) + (r2 * iRatio)+ (r3 * iRatio));
    int g = (int)((g1 * iRatio) + (g2 * iRatio)+ (g3 * iRatio));
    int b = (int)((b1 * iRatio) + (b2 * iRatio)+ (b3 * iRatio));

    //Returning the new Color object
    return new Color( a << 24 | r << 16 | g << 8 | b );
}

    private void mixMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mixMouseExited
        
    }//GEN-LAST:event_mixMouseExited

    private void ansMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ansMouseClicked

    }//GEN-LAST:event_ansMouseClicked

    private void o2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o2MouseClicked
       if(count==3)
        {
           x.setBackground(o2.getBackground());
           
           count=2;
        }
        
        else if(count==2)
        {       
           y.setBackground(o2.getBackground());
           count=1;
        }
        else if(count==1 && Level==3)      
        
        {            
           z.setBackground(o2.getBackground());
            count=3;           
        }
       else
        {
            x.setBackground(o2.getBackground());
            count = 2;
        }
    }//GEN-LAST:event_o2MouseClicked

    private void o4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o4MouseClicked
        if(count==3)
        {
           x.setBackground(o4.getBackground());
           
           count=2;
        }
        
        else if(count==2)
        {       
           y.setBackground(o4.getBackground());
           count=1;
        }
        else if(count==1 && Level==3)      
        
        {            
           z.setBackground(o4.getBackground());
            count=3;           
        }
       else
        {
            x.setBackground(o4.getBackground());
            count = 2;
        }
    }//GEN-LAST:event_o4MouseClicked

    private void o6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o6MouseClicked
        if(count==3)
        {
           x.setBackground(o6.getBackground());
           
           count=2;
        }
        
        else if(count==2)
        {       
           y.setBackground(o6.getBackground());
           count=1;
        }
        else if(count==1 && Level==3)      
        
        {            
           z.setBackground(o6.getBackground());
            count=3;           
        }
       else
        {
            x.setBackground(o6.getBackground());
            count = 2;
        }
    }//GEN-LAST:event_o6MouseClicked

    private void o8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o8MouseClicked
       if(count==3)
        {
           x.setBackground(o8.getBackground());
           
           count=2;
        }
        
        else if(count==2)
        {       
           y.setBackground(o8.getBackground());
           count=1;
        }
       else if(count==1 && Level==3)      
        
        {            
           z.setBackground(o8.getBackground());
            count=3;           
        }
       else
        {
            x.setBackground(o8.getBackground());
            count = 2;
        }
    }//GEN-LAST:event_o8MouseClicked

    
    
    void NextLevel()
    {
        
         
        o1.setBackground(OtherRandoms());
        o2.setBackground(OtherRandoms());
        o3.setBackground(OtherRandoms());
        o4.setBackground(OtherRandoms());
        o5.setBackground(OtherRandoms());
        o7.setBackground(OtherRandoms());
        o8.setBackground(OtherRandoms());        
        o9.setBackground(OtherRandoms());
        o10.setBackground(OtherRandoms());
        o11.setBackground(OtherRandoms());
        o12.setBackground(OtherRandoms());
    
       x.setBackground(Color.white);
       y.setBackground(Color.white);
       z.setBackground(Color.white);
        
        //Generate random RGB Colors
        Random rand1 = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        //Choose Random Slots
        Random int1 = new Random();
        Random int2 = new Random();
        Random int3 = new Random();
        
        float r1 = rand1.nextFloat();
        float g1 = rand1.nextFloat();
        float b1  = rand1.nextFloat();
        
        float r2 = rand2.nextFloat();
        float g2 = rand2.nextFloat();
        float b2 = rand2.nextFloat();
        
        float r3 = rand3.nextFloat();
        float g3 = rand3.nextFloat();
        float b3 = rand3.nextFloat();
        
       gc1 = new Color(r1, g1, b1);
       gc2 = new Color(r2, g2, b2);
       gc3 = new Color(r3, g3, b3);
        
        int Num1=1;
        int Num2=2;
        int Num3=3;
        
        if(Level==1)
        {
            
            o5.setVisible(false);
            o6.setVisible(false);
            o7.setVisible(false);
            o8.setVisible(false);   
            
            o9.setVisible(false);
            o10.setVisible(false);
            o11.setVisible(false);
            o12.setVisible(false);
            do
            {
              Num1 = int1.nextInt(4) + 1;
              Num2 = int2.nextInt(4) + 1;
       
            }while(Num1==Num2);        
        }
      
        else if(Level==2)
        {
            
            o5.setVisible(true);
            o6.setVisible(true);
            o7.setVisible(true);
            o8.setVisible(true);
            
            o9.setVisible(false);
            o10.setVisible(false);
            o11.setVisible(false);
            o12.setVisible(false);
            
            do
            {
              Num1 = int1.nextInt(8) + 1;
              Num2 = int2.nextInt(8) + 1;
       
            }while(Num1==Num2);      
        }   
            
         else if(Level==3)
        {
            
            o5.setVisible(true);
            o6.setVisible(true);
            o7.setVisible(true);
            o8.setVisible(true);
            o9.setVisible(true);
            o10.setVisible(true);
            o11.setVisible(true);
            o12.setVisible(true);
            do
            {
              Num1 = int1.nextInt(12) + 1;
              Num2 = int2.nextInt(12) + 1;
              Num3 = int3.nextInt(12) + 1;
       
            }while(Num1==Num2 && Num2==Num3 && Num1==Num3);    
            
        }
    
        
        
        if(Level==1 || Level==2)
       {
          Bg12(Num1,Num2);    
          ans.setBackground(blend(gc1,gc2,(float)0.5));
          //a.setBackground(gc1);
          //b.setBackground(gc2);
          //c.setVisible(false);
          
                  
       }
       
       else if(Level==3)
       {
            
          Bg3(Num1,Num2,Num3);
          ans.setBackground(blend3(gc1,gc2,gc3,(float)0.3));   
           //a.setBackground(gc1);
           //b.setBackground(gc2);
           //c.setBackground(gc3);
           //c.setVisible(true);
          
         
       }
        
         
    }
    
    Color OtherRandoms()
    {
        Random other = new Random();
        float ro = other.nextFloat();
        float go = other.nextFloat();
        float bo = other.nextFloat();
        
       Color gco = new Color(ro, go, bo); 
        
        return gco;
    }
    
    public void Bg12(int Num1,int Num2)
    {
         switch(Num1)
       {
           case 1 : o1.setBackground(gc1);
                    break;
           case 2 : o2.setBackground(gc1);
                    break;
           case 3 : o3.setBackground(gc1);
                    break;
           case 4 : o4.setBackground(gc1);
                    break;
           case 5 : o5.setBackground(gc1);
                    break;
           case 6 : o6.setBackground(gc1);
                    break;
           case 7 : o7.setBackground(gc1);
                    break;
           case 8 : o8.setBackground(gc1);
                    break;               
           case 9 : o9.setBackground(gc1);
                    break;
           case 10 : o10.setBackground(gc1);
                    break;
           case 11 : o11.setBackground(gc1);
                    break;
           case 12 : o12.setBackground(gc1);
                    break; 
               
           default : o3.setBackground(gc1);
         }             
                      
       switch(Num2)
       {
           case 1 : o1.setBackground(gc2);
                    break;
           case 2 : o2.setBackground(gc2);
                    break;
           case 3 : o3.setBackground(gc2);
                    break;
           case 4 : o4.setBackground(gc2);
                    break;
           case 5 : o5.setBackground(gc2);
                    break;
           case 6 : o6.setBackground(gc2);
                    break;
           case 7 : o7.setBackground(gc2);
                    break;
           case 8 : o8.setBackground(gc2);
                    break;               
           case 9 : o9.setBackground(gc2);
                    break;
           case 10 : o10.setBackground(gc2);
                    break;
           case 11 : o11.setBackground(gc2);
                    break;
           case 12 : o12.setBackground(gc2);
                    break;                
           default : o1.setBackground(gc2); 
              
               
       }  
       
    }
    
    public void Bg3(int Num1,int Num2,int Num3)
    {
        Bg12(Num1,Num2);
        
        switch(Num3)
       {
           case 1 : o1.setBackground(gc3);
                    break;
           case 2 : o2.setBackground(gc3);
                    break;
           case 3 : o3.setBackground(gc3);
                    break;
           case 4 : o4.setBackground(gc3);
                    break;
           case 5 : o5.setBackground(gc3);
                    break;
           case 6 : o6.setBackground(gc3);
                    break;
           case 7 : o7.setBackground(gc3);
                    break;
           case 8 : o8.setBackground(gc3);
                    break;               
           case 9 : o9.setBackground(gc3);
                    break;
           case 10 : o10.setBackground(gc3);
                    break;
           case 11 : o11.setBackground(gc3);
                    break;
           case 12 : o12.setBackground(gc3);
                    break;                
           default : o12.setBackground(gc3); 
              
               
       }
    }
    
     
    private void o1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_o1KeyPressed
      
           
    }//GEN-LAST:event_o1KeyPressed

    private void o1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o1MouseClicked
               
       if(count==3)
        {
           x.setBackground(o1.getBackground());
           
           count=2;
        }
        
        else if(count==2)
        {       
           y.setBackground(o1.getBackground());
           count=1;
        }
        else if(count==1 && Level==3)      
        
        {            
           z.setBackground(o1.getBackground());
            count=3;           
        }
       else
        {
            x.setBackground(o1.getBackground());
            count = 2;
        }
    }//GEN-LAST:event_o1MouseClicked

    private void o3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o3MouseClicked
    if(count==3)
        {
           x.setBackground(o3.getBackground());
           
           count=2;
        }
        
        else if(count==2)
        {       
           y.setBackground(o3.getBackground());
           count=1;
        }
       else if(count==1 && Level==3)      
        
        {            
           z.setBackground(o3.getBackground());
            count=3;           
        }
       else
        {
            x.setBackground(o3.getBackground());
            count = 2;
        }
    }//GEN-LAST:event_o3MouseClicked

    private void o5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o5MouseClicked
        if(count==3)
        {
           x.setBackground(o5.getBackground());
           
           count=2;
        }
        
        else if(count==2)
        {       
           y.setBackground(o5.getBackground());
           count=1;
        }
         else if(count==1 && Level==3)      
        
        {            
           z.setBackground(o5.getBackground());
            count=3;           
        }
       else
        {
            x.setBackground(o5.getBackground());
            count = 2;
        }
    }//GEN-LAST:event_o5MouseClicked

    private void o7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o7MouseClicked
  if(count==3)
        {
           x.setBackground(o7.getBackground());
           
           count=2;
        }
        
        else if(count==2)
        {       
           y.setBackground(o7.getBackground());
           count=1;
        }
        else if(count==1 && Level==3)      
        
        {            
           z.setBackground(o7.getBackground());
            count=3;           
        }
       else
        {
            x.setBackground(o7.getBackground());
            count = 2;
        }

    }//GEN-LAST:event_o7MouseClicked

    private void lvlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvlMouseEntered
      if(lvl.isEnabled()==true)  
        
     {         
       lvl1.setBackground(new Color(56,142,60));
            lvl.setBackground(new Color(56,142,60));  
     }
    }//GEN-LAST:event_lvlMouseEntered

    private void lvlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvlMouseExited
     if(lvl.isEnabled()==true)  
        
     {
        lvl.setBackground(new Color( 76,175,80));
        lvl1.setBackground(new Color( 76,175,80));
        
     }
    }//GEN-LAST:event_lvlMouseExited

    private void lvl1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvl1MouseEntered
        
        if(lvl.isEnabled()==true)  
        
     {         
       lvl1.setBackground(new Color(56,142,60));
            lvl.setBackground(new Color(56,142,60));  
     }
    }//GEN-LAST:event_lvl1MouseEntered

    private void lvl1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvl1MouseExited
        
      if(lvl.isEnabled()==true)  
        
     {
        lvl.setBackground(new Color( 76,175,80));
        lvl1.setBackground(new Color( 76,175,80));
        
     }
    }//GEN-LAST:event_lvl1MouseExited

    private void lvl2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvl2MouseEntered
         lvl2.setBackground(new Color(56,142,60));
           
    }//GEN-LAST:event_lvl2MouseEntered

    private void lvl2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvl2MouseExited
       lvl2.setBackground(new Color(76,175,80));
       
    }//GEN-LAST:event_lvl2MouseExited

    private void lvl3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvl3MouseEntered
         lvl3.setBackground(new Color(56,142,60));
           
    }//GEN-LAST:event_lvl3MouseEntered

    private void lvl3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvl3MouseExited
        lvl3.setBackground(new Color(76,175,80));
        
    }//GEN-LAST:event_lvl3MouseExited
public void closeMenu()
{
      men.setVisible(false);
       lvl.setVisible(true);
        lvl1.setVisible(true);
}
    private void lvlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvlMouseClicked
          
     if(lvl.isEnabled()==true)  
        
     {   
        if(men.isVisible())
        {
            closeMenu();
        }
        
        else 
        {
            men.setVisible(true);
            lvl4.setBackground(new Color(56,142,60));
            lvl5.setBackground(new Color(56,142,60));  
        }
        lvl.setVisible(false);
        lvl1.setVisible(false);
        
     }  
     
     
    }//GEN-LAST:event_lvlMouseClicked

    
    public void resetLevel()
    {
        closeMenu();        
       
        tit.setText("Choose the combination that gives the resultant color");
       tit.setBackground(new Color(76,175,80));
       lvl.setBackground(new Color(76,175,80));
        lvl1.setBackground(new Color(76,175,80));
       
        trial=0;
        trl.setText(" TRIES  : "+trial+"/3");
        count=3;
       
       SaveGame(); 
       NextLevel();
    }
    public void setLevel1()
    {
       tit.setForeground(Color.WHITE);
       lvl.setForeground(Color.WHITE);
       lvl1.setForeground(Color.WHITE);
        
        lvl.setText("EASY");
       Level=1;
      
           resetLevel();
           hideThirdTile();
       
    }
    
     public void setLevel2()
    {
        
        tit.setForeground(Color.WHITE);
       lvl.setForeground(Color.WHITE);
       lvl1.setForeground(Color.WHITE);
        
       lvl.setText("MEDIUM");
       Level=2;
       
       resetLevel();
       hideThirdTile();
    }
     
      public void setLevel3()
    {
       
        tit.setForeground(Color.WHITE);
       lvl.setForeground(Color.WHITE);
       lvl1.setForeground(Color.WHITE);
        
        lvl.setText("DIFFICULT");
       Level=3;
      
       resetLevel();
       showThirdTile();
    }
    
    
    private void lvl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvl4MouseClicked
      setLevel1();
    }//GEN-LAST:event_lvl4MouseClicked

    private void lvl4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvl4MouseEntered
         lvl4.setBackground(new Color(56,142,60));
            lvl5.setBackground(new Color(56,142,60));  
    }//GEN-LAST:event_lvl4MouseEntered

    private void lvl4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvl4MouseExited
        lvl4.setBackground(new Color(76,175,80));
        lvl5.setBackground(new Color(76,175,80));
    }//GEN-LAST:event_lvl4MouseExited

    private void lvl5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvl5MouseEntered
        lvl5.setBackground(new Color(56,142,60));
           lvl4.setBackground(new Color(56,142,60));
    }//GEN-LAST:event_lvl5MouseEntered

    private void lvl5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvl5MouseExited
         lvl5.setBackground(new Color(76,175,80));
       lvl4.setBackground(new Color(76,175,80));
    }//GEN-LAST:event_lvl5MouseExited

    private void lvl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvl5MouseClicked
       setLevel1();
    }//GEN-LAST:event_lvl5MouseClicked

    private void lvl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvl2MouseClicked
       setLevel2();
    }//GEN-LAST:event_lvl2MouseClicked

    private void lvl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lvl3MouseClicked
         setLevel3();
    }//GEN-LAST:event_lvl3MouseClicked

    private void o9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o9MouseClicked
        if(count==3)
        {
           x.setBackground(o9.getBackground());
           
           count=2;
        }
        
        else if(count==2)
        {       
           y.setBackground(o9.getBackground());
           count=1;
        }
        else if(count==1 && Level==3)      
        
        {            
           z.setBackground(o9.getBackground());
            count=3;           
        }
       else
        {
            x.setBackground(o9.getBackground());
            count = 2;
        }
    }//GEN-LAST:event_o9MouseClicked

    private void o9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_o9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_o9KeyPressed

    private void o10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o10MouseClicked
       if(count==3)
        {
           x.setBackground(o10.getBackground());
           
           count=2;
        }
        
        else if(count==2)
        {       
           y.setBackground(o10.getBackground());
           count=1;
        }
        else if(count==1 && Level==3)      
        
        {            
           z.setBackground(o10.getBackground());
            count=3;           
        }
       else
        {
            x.setBackground(o10.getBackground());
            count = 2;
        }
    }//GEN-LAST:event_o10MouseClicked

    private void o11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o11MouseClicked
        if(count==3)
        {
           x.setBackground(o11.getBackground());
           
           count=2;
        }
        
        else if(count==2)
        {       
           y.setBackground(o11.getBackground());
           count=1;
        }
        else if(count==1 && Level==3)      
        
        {            
           z.setBackground(o11.getBackground());
            count=3;           
        }
       else
        {
            x.setBackground(o11.getBackground());
            count = 2;
        }
    }//GEN-LAST:event_o11MouseClicked

    private void o12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_o12MouseClicked
         if(count==3)
        {
           x.setBackground(o12.getBackground());
           
           count=2;
        }
        
        else if(count==2)
        {       
           y.setBackground(o12.getBackground());
           count=1;
        }
        else if(count==1 && Level==3)      
        
        {            
           z.setBackground(o12.getBackground());
            count=3;           
        }
       else
        {
            x.setBackground(o12.getBackground());
            count = 2;
        }
    }//GEN-LAST:event_o12MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       SaveGame();
       Object[] op = {"Yes, I'm sure","No, I'll keep playing"};
       	if (JOptionPane.showOptionDialog(null, "You were playing great! You'll lose your progress if you quit now. Are you sure?","See ya later!", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE,null,op ,op[0])== JOptionPane.YES_OPTION)
	    {	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);		 
	    }
    }//GEN-LAST:event_formWindowClosing

    
    public static void main(String args[]) {
       
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Strt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Strt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Strt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Strt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Strt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans;
    private javax.swing.JLabel back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel eq;
    private javax.swing.JLabel h;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lvl;
    private javax.swing.JLabel lvl1;
    private javax.swing.JLabel lvl2;
    private javax.swing.JLabel lvl3;
    private javax.swing.JLabel lvl4;
    private javax.swing.JLabel lvl5;
    private javax.swing.JPanel men;
    private javax.swing.JLabel mix;
    private javax.swing.JLabel o1;
    private javax.swing.JLabel o10;
    private javax.swing.JLabel o11;
    private javax.swing.JLabel o12;
    private javax.swing.JLabel o2;
    private javax.swing.JLabel o3;
    private javax.swing.JLabel o4;
    private javax.swing.JLabel o5;
    private javax.swing.JLabel o6;
    private javax.swing.JLabel o7;
    private javax.swing.JLabel o8;
    private javax.swing.JLabel o9;
    private javax.swing.JLabel plus1;
    private javax.swing.JLabel plus2;
    private javax.swing.JLabel scr;
    public javax.swing.JLabel tit;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel trl;
    private javax.swing.JLabel x;
    private javax.swing.JLabel y;
    private javax.swing.JLabel z;
    // End of variables declaration//GEN-END:variables
}
