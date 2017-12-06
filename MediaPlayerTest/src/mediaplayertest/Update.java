/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaplayertest;

import db.Koneksi;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author LPG
 */
public class Update extends javax.swing.JFrame {

    /**
     * Creates new form Update
     */
    private String loc;
    private File file;
    private boolean image;
    Movie movie = new Movie();
            
    Koneksi konek = new Koneksi();
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public Update() {
        initComponents();
    }
    
    public Update(Movie update){
        initComponents();
        tampilan(update);
        movie = update;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        genre1 = new javax.swing.JComboBox<>();
        genre2 = new javax.swing.JComboBox<>();
        genre3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        actor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        director = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        country = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        synopsis = new javax.swing.JTextArea();
        save = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cover = new javax.swing.JLabel();
        choose = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Title");

        jLabel2.setText("Year");

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2013", "2014", "2015", "2016", "2017" }));

        jLabel3.setText("Genre");

        genre1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Adventure", "Animation", "Bibiography", "Crime", "Comedy", "Documentary", "Family", "Fantacy", "History", "Horror", "Music", "Musical", "Mystery", "Romance", "Sci-Fi", "Sport", "Thriler", "War", "Western" }));

        genre2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Action", "Adventure", "Animation", "Bibiography", "Crime", "Comedy", "Documentary", "Family", "Fantacy", "History", "Horror", "Music", "Musical", "Mystery", "Romance", "Sci-Fi", "Sport", "Thriler", "War", "Western" }));

        genre3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Action", "Adventure", "Animation", "Bibiography", "Crime", "Comedy", "Documentary", "Family", "Fantacy", "History", "Horror", "Music", "Musical", "Mystery", "Romance", "Sci-Fi", "Sport", "Thriler", "War", "Western" }));

        jLabel4.setText("Actor");

        jLabel5.setText("Director");

        jLabel6.setText("Country");

        country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Australia", "Austria", "Belgia", "Brazil", "Bulgaria", "Canada", "China", "Colombia", "Costarica", "Denmark", "Finlandia", "France", "Germani", "Greece", "Hongkong", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Israel", "Ireland", "Italy", "Japan", "Korea", "Malaysia", "Maxico", "Netherlands", "Newzealand", "Pakistan", "Philippines", "Poland", "Portugal", "Romania", "Russia", "Saudi Arabia", "Singapore", "South Afrika", "Spain", "Sweden", "Switzerland", "Thailand", "Timor Leste", "Turkey", "United Kingdom", "United States", "Vietnam" }));

        jLabel7.setText("Synopsis");

        synopsis.setColumns(20);
        synopsis.setRows(5);
        jScrollPane1.setViewportView(synopsis);

        save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel8.setText("Cover");

        choose.setText("Choose");
        choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseActionPerformed(evt);
            }
        });

        jLabel9.setText(".Jpg");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(actor, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(director, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(genre1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                                .addComponent(genre2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(genre3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(39, 39, 39)))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(choose, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(48, 48, 48))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genre3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genre2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genre1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cover, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(director, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(choose, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String g2 = (String)genre2.getSelectedItem(); 
        String g3 = (String)genre3.getSelectedItem();
        
        if(g2==null){
            g2="";
        }
        if(g3==null){
            g3="";
        }
        
        if(image == true){
            File fileImg = new File(loc);
            String newImageLoc = "src/chooser/"+fileImg.getName();
            File newFileImg = new File(newImageLoc);
        
            InputStream inStream = null;
            OutputStream outStream = null;
            try{
            byte[] buffer = new byte[1024];
            int length;
            
            inStream = new FileInputStream(fileImg);
            outStream = new FileOutputStream(newFileImg);
            
            while((length = inStream.read(buffer)) > 0){
                outStream.write(buffer, 0, length);
            }
            
            inStream.close();
            outStream.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
            update(title.getText(), year.getSelectedItem().toString(), genre1.getSelectedItem().toString(),
                g2, g3, director.getText(),actor.getText(), country.getSelectedItem().toString() , synopsis.getText(), newImageLoc );
        }
         
        update(title.getText(), year.getSelectedItem().toString(), genre1.getSelectedItem().toString(),
                g2, g3, director.getText(),actor.getText(), country.getSelectedItem().toString() , synopsis.getText());
        
        showMessageDialog(null, "Upload success!");
        
        this.setVisible(false);
        new FormAdmin().setVisible(true);
    }//GEN-LAST:event_saveActionPerformed

    private void chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseActionPerformed
        // TODO add your handling code here:
       JFileChooser fc = new JFileChooser();
       int result = fc.showOpenDialog(this);
       if (result == JFileChooser.APPROVE_OPTION){
           image = true;
           file = new File(fc.getSelectedFiles().toString());
           loc = fc.getSelectedFile().getAbsolutePath();
           BufferedImage img = null;
           try{
               img = ImageIO.read(new File(loc));
           } catch(IOException e){
               System.out.println(e.getMessage());
           }
            Image newImg = img.getScaledInstance(cover.getWidth(), cover.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imgIcon = new ImageIcon(newImg);
            cover.setIcon(imgIcon);
       }
    }//GEN-LAST:event_chooseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new FormAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void tampilan(Movie update){
        try(Connection conn = konek.connect()){ 
            String id1 = update.getTitle();                
            String sql = "SELECT * FROM Movie WHERE title = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, id1);
            ResultSet rs=pst.executeQuery();
            
            
            
            String add1 =rs.getString(2);
            update.setTitle(add1);
            
            System.out.println(add1);
            
            String add2 =rs.getString(3);
            update.setYear(add2);
            
            String add3 =rs.getString(4);
            update.setGenre_1(add3);
            add3 =rs.getString(5);
            update.setGenre_1(update.getGenre_1()+add3);
            add3 =rs.getString(6);
            update.setGenre_1(update.getGenre_1()+add3);
            
            String add4 =rs.getString(8);
            update.setActor(add4);
            
            String add5 =rs.getString(7);
            update.setDirector(add5);
            
            String add6 =rs.getString(9);
            update.setCountry(add6);
            
            String add7 =rs.getString(10);
            update.setSynopsis(add7);
            
            String img = rs.getString(11);
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(cover.getWidth(), cover.getHeight(), Image.SCALE_SMOOTH));
            cover.setIcon(imageIcon);
            
            setData(update);
        }catch(Exception e){
            
        }
    }
    
    public void setData(Movie x){
        title.setText(x.getTitle());
        year.setSelectedItem(x.getYear());
        genre1.setSelectedItem(x.getGenre_1());
        genre2.setSelectedItem(x.getGenre_2());
        genre3.setSelectedItem(x.getGenre_3());
        actor.setText(x.getActor());
        director.setText(x.getDirector());
        country.setSelectedItem(x.getCountry());
        synopsis.setText(x.getSynopsis());
    }
    
    public void update(String title, String year, String genre1, String genre2, String genre3, String director, String actor, String country, String synopsis, String cover){
        String sql = "UPDATE Movie SET title = ? ," + "year = ? ," + " genre1 = ?," + "genre2 = ?," +"genre3 =?," + "director = ? ," + "actor = ? ," + "country = ? ," + "synopsis = ? cover=? WHERE id_movie=?";
        try (Connection con = konek.connect();
            PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, title);
            pstmt.setString(2, year);
            pstmt.setString(3, genre1);
            pstmt.setString(4, genre2);
            pstmt.setString(5, genre3);
            pstmt.setString(6, director);
            pstmt.setString(7, actor);
            pstmt.setString(8, country);
            pstmt.setString(9, synopsis);
            pstmt.setString(10, cover);
            pstmt.setInt(11,movie.getId());
            pstmt.executeUpdate();
            
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void update(String title, String year, String genre1, String genre2, String genre3, String director, String actor, String country, String synopsis){
        String sql = "UPDATE Movie SET title = ? ," + "year = ? ," + " genre1 = ?," + "genre2 = ?," +"genre3 =?," + "director = ? ," + "actor = ? ," + "country = ? ," + "synopsis = ? WHERE id_movie=?";
        try (Connection con = konek.connect();
            PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, title);
            pstmt.setString(2, year);
            pstmt.setString(3, genre1);
            pstmt.setString(4, genre2);
            pstmt.setString(5, genre3);
            pstmt.setString(6, director);
            pstmt.setString(7, actor);
            pstmt.setString(8, country);
            pstmt.setString(9, synopsis);
            pstmt.setInt(10,movie.getId());
            pstmt.executeUpdate();
            
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actor;
    private javax.swing.JButton choose;
    private javax.swing.JComboBox<String> country;
    private javax.swing.JLabel cover;
    private javax.swing.JTextField director;
    private javax.swing.JComboBox<String> genre1;
    private javax.swing.JComboBox<String> genre2;
    private javax.swing.JComboBox<String> genre3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save;
    private javax.swing.JTextArea synopsis;
    private javax.swing.JTextField title;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
