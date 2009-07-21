/*
 * OptionsAlertJPanel.java
 *
 * Created on June 19, 2007, 7:18 PM
 *
  * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * Copyright (C) 2009 Yan Cheng Cheok <yccheok@yahoo.com>
 */

package org.yccheok.jstock.gui;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.swing.*;

import javax.swing.event.HyperlinkEvent;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author  yccheok
 */
public class OptionsAlertJPanel extends javax.swing.JPanel implements JStockOptionsObserver {
    
    /** Creates new form OptionsAlertJPanel */
    public OptionsAlertJPanel() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jXHeader1 = new org.jdesktop.swingx.JXHeader();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jEditorPane3 = new javax.swing.JEditorPane();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setLayout(new java.awt.BorderLayout());

        jXHeader1.setDescription("Alert user when an indicator is being triggered.");
        jXHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/32x32/bell.png"))); // NOI18N
        jXHeader1.setTitle("Alert");
        add(jXHeader1, java.awt.BorderLayout.NORTH);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Alert when one of the indicators reached");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Alert when all the indicators reached");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));

        jCheckBox2.setText("Send message to email");
        jCheckBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });

        jLabel1.setText("E-mail");
        jLabel1.setEnabled(false);

        jLabel3.setText("Password");
        jLabel3.setEnabled(false);

        jTextField2.setEnabled(false);

        jPasswordField1.setEnabled(false);

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("@gmail.com");
        jLabel2.setEnabled(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16x16/mail_send.png"))); // NOI18N
        jButton1.setText("Test email");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jButton1)))
                    .addComponent(jCheckBox2))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("SMS"));

        jCheckBox3.setText("SMS message through Google Calendar");
        jCheckBox3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });

        jLabel4.setText("Username");
        jLabel4.setEnabled(false);

        jLabel5.setText("Password");
        jLabel5.setEnabled(false);

        jTextField3.setEnabled(false);

        jPasswordField2.setEnabled(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/16x16/sms_protocol.png"))); // NOI18N
        jButton2.setText("Test SMS");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jEditorPane3.setBackground(new java.awt.Color(240, 240, 240));
        jEditorPane3.setContentType("text/html");
        jEditorPane3.setEditable(false);
        jEditorPane3.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r\n        <p style=\"margin-top: 0; font-size: 8px; font-family: Tahoma;\">Click <a href=\"http://jstock.sourceforge.net/faq.html#sms\">here</a> to find out how to setup your mobile phone</p>\n  </body>\r\n</html>\r\n");
        jEditorPane3.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                jEditorPane3jEditorPane1HyperlinkUpdate(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel6.setText("(e.g. john@gmail.com)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEditorPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jEditorPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("System tray"));

        jCheckBox1.setText("Pop up message from system tray");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(164, 164, 164))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField2.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this, "Email address cannot be empty", "Empty email", JOptionPane.WARNING_MESSAGE);
            jTextField2.requestFocus();
            return;
        }

        if (jPasswordField1.getPassword().length == 0)
        {
            JOptionPane.showMessageDialog(this, "Email password cannot be empty", "Empty password", JOptionPane.WARNING_MESSAGE);
            jPasswordField1.requestFocus();
            return;
        }   
            
        try {
            GoogleMail.Send(
                    jTextField2.getText(),
                    new String(jPasswordField1.getPassword()),
                    jTextField2.getText() + "@gmail.com",
                    "Congratulation! JStock's email alert system is working.",
                    "Congratulation! JStock's email alert system is working."
                  );
        } catch (AddressException ex) {
            JOptionPane.showMessageDialog(this, "Error in sending email. Please check your network connection.", "Email error", JOptionPane.WARNING_MESSAGE);
            log.error("", ex);
            return;
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(this, "Error in sending email. Please check your username and password.", "Email error", JOptionPane.WARNING_MESSAGE);
            log.error("", ex);
            return;
        }
        
        JOptionPane.showMessageDialog(this, "Email alert system is working.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
// TODO add your handling code here:
        if(this.jCheckBox2.isSelected()) {
            jLabel1.setEnabled(true);
            jLabel2.setEnabled(true);
            jLabel3.setEnabled(true);
            jButton1.setEnabled(true);
            jTextField2.setEnabled(true);
            jPasswordField1.setEnabled(true);
        }
        else {
            jLabel1.setEnabled(false);
            jLabel2.setEnabled(false);
            jLabel3.setEnabled(false);
            jButton1.setEnabled(false);
            jTextField2.setEnabled(false);
            jPasswordField1.setEnabled(false);            
        }        
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jEditorPane3jEditorPane1HyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_jEditorPane3jEditorPane1HyperlinkUpdate
        // TODO add your handling code here:
        if (HyperlinkEvent.EventType.ACTIVATED.equals(evt.getEventType())) {
            URL url = evt.getURL();

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();

                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    if (url == null) {
                        // www.yahoo.com considered an invalid URL. Hence, evt.getURL() returns null.
                        String string = "http://" + evt.getDescription();
                        try {
                            url = new URL(string);
                        } catch (MalformedURLException ex) {
                            return;
                        }
                    }

                    try {
                        desktop.browse(url.toURI());
                    } catch (URISyntaxException ex) {
                    } catch (IOException ex) {
                    }
                }
            }
        }
}//GEN-LAST:event_jEditorPane3jEditorPane1HyperlinkUpdate

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
        // TODO add your handling code here:
        if(this.jCheckBox3.isSelected()) {
            jLabel4.setEnabled(true);
            jLabel5.setEnabled(true);
            jButton2.setEnabled(true);
            jTextField3.setEnabled(true);
            jPasswordField2.setEnabled(true);
        }
        else {
            jLabel4.setEnabled(false);
            jLabel5.setEnabled(false);
            jButton2.setEnabled(false);
            jTextField3.setEnabled(false);
            jPasswordField2.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTextField3.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(this, "SMS username cannot be empty", "Empty SMS username", JOptionPane.WARNING_MESSAGE);
            jTextField3.requestFocus();
            return;
        }

        if (jPasswordField2.getPassword().length == 0)
        {
            JOptionPane.showMessageDialog(this, "SMS password cannot be empty", "Empty SMS password", JOptionPane.WARNING_MESSAGE);
            jPasswordField2.requestFocus();
            return;
        }

        final String username = jTextField3.getText();
        final String password = new String(jPasswordField2.getPassword());
        final boolean status = GoogleCalendar.SMS(username, password, "Congratulation! JStock's SMS alert system is working.");
        if (false == status)
        {
            JOptionPane.showMessageDialog(this, "Error in sending SMS. Please check your username + password or network connection", "SMS error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "SMS alert system is working. You shall receive SMS within 2 minutes.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    @Override
    public void set(JStockOptions jStockOptions) {
        jCheckBox1.setSelected(jStockOptions.isPopupMessage());
        jCheckBox2.setSelected(jStockOptions.isSendEmail());
        jCheckBox3.setSelected(jStockOptions.isSMSEnabled());
        jTextField2.setText(Utils.decrypt(jStockOptions.getEmail()));
        jPasswordField1.setText(Utils.decrypt(jStockOptions.getEmailPassword()));
        jTextField3.setText(Utils.decrypt(jStockOptions.getGoogleCalendarUsername()));
        jPasswordField2.setText(Utils.decrypt(jStockOptions.getGoogleCalendarPassword()));

        if (jStockOptions.isSingleIndicatorAlert()) {
            jRadioButton1.setSelected(true);
        }
        else {
            jRadioButton2.setSelected(true);
        }
    }

    @Override
    public boolean apply(JStockOptions jStockOptions) {
        if (jCheckBox2.isSelected()) {
            if (jTextField2.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(this, "Email address cannot be empty", "Empty email", JOptionPane.WARNING_MESSAGE);
                jTextField2.requestFocus();
                return false;
            }
            
            if (jPasswordField1.getPassword().length == 0)
            {
                JOptionPane.showMessageDialog(this, "Email password cannot be empty", "Empty password", JOptionPane.WARNING_MESSAGE);
                jPasswordField1.requestFocus();
                return false;
            }            
        }

        if (jCheckBox3.isSelected()) {
            if (jTextField3.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(this, "SMS username cannot be empty", "Empty SMS username", JOptionPane.WARNING_MESSAGE);
                jTextField3.requestFocus();
                return false;
            }

            if (jPasswordField2.getPassword().length == 0)
            {
                JOptionPane.showMessageDialog(this, "SMS password cannot be empty", "Empty SMS password", JOptionPane.WARNING_MESSAGE);
                jPasswordField2.requestFocus();
                return false;
            }
        }

        jStockOptions.setPopupMessage(jCheckBox1.isSelected());
        jStockOptions.setSendEmail(jCheckBox2.isSelected());
        jStockOptions.setEmail(Utils.encrypt(jTextField2.getText()));
        jStockOptions.setEmailPassword(Utils.encrypt(new String(jPasswordField1.getPassword())));
        jStockOptions.setSMSEnabled(jCheckBox3.isSelected());
        jStockOptions.setGoogleCalendarUsername(Utils.encrypt(jTextField3.getText()));
        jStockOptions.setGoogleCalendarPassword(Utils.encrypt(new String(jPasswordField2.getPassword())));
        jStockOptions.setSingleIndicatorAlert(jRadioButton1.isSelected());
        
        return true;
    }
    
    private static final Log log = LogFactory.getLog(OptionsAlertJPanel.class);
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JEditorPane jEditorPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private org.jdesktop.swingx.JXHeader jXHeader1;
    // End of variables declaration//GEN-END:variables
    
}
