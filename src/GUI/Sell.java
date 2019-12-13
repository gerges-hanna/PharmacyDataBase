/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Models.DBConnection;
import Models.MedicineModel;
import static Models.MedicineModel.dataofmedicine;
import Models.ReviewModel;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.reflect.Array.set;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

/**
 *
 * @author John
 */
public class Sell extends javax.swing.JFrame {

    /**
     * Creates new form Sell
     */
   
    public Sell() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        proprice = new javax.swing.JLabel();
        par = new javax.swing.JTextField();
        prname = new javax.swing.JTextField();
        prquantity = new javax.swing.JTextField();
        prdata = new javax.swing.JTextField();
        addpr = new javax.swing.JButton();
        clearsearch = new javax.swing.JButton();
        prsearch = new javax.swing.JButton();
        resettextfield = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listofbuy = new javax.swing.JTable();
        buypr = new javax.swing.JButton();
        removepr = new javax.swing.JButton();
        Deleteboard = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setText("Back");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel1.setText("Parcode");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel4.setText("Quantity");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel5.setText("Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setText("Price:");

        proprice.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        proprice.setText("0.0");

        par.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parActionPerformed(evt);
            }
        });

        prquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prquantityActionPerformed(evt);
            }
        });

        prdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prdataActionPerformed(evt);
            }
        });

        addpr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addpr.setText("ADD");
        addpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addprActionPerformed(evt);
            }
        });

        clearsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearsearch.setText("Clear");
        clearsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearsearchActionPerformed(evt);
            }
        });

        prsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prsearch.setText("Search");
        prsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prsearchActionPerformed(evt);
            }
        });

        resettextfield.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        resettextfield.setText("RESET");
        resettextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resettextfieldActionPerformed(evt);
            }
        });

        listofbuy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parcode", "Med_name", "price", "Quantity", "EXP"
            }
        ));
        jScrollPane1.setViewportView(listofbuy);

        buypr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buypr.setText("Buy");
        buypr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyprActionPerformed(evt);
            }
        });

        removepr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removepr.setText("Remove");
        removepr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeprActionPerformed(evt);
            }
        });

        Deleteboard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Deleteboard.setText("Delete Board");
        Deleteboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteboardActionPerformed(evt);
            }
        });

        searchtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        searchtable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                searchtableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(searchtable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(clearsearch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(proprice)
                            .addGap(0, 232, Short.MAX_VALUE))
                        .addComponent(prdata)
                        .addComponent(par)
                        .addComponent(prname)
                        .addComponent(prquantity))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prsearch)
                        .addGap(18, 18, 18)
                        .addComponent(resettextfield)
                        .addGap(18, 18, 18)
                        .addComponent(addpr)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 138, Short.MAX_VALUE)
                        .addComponent(buypr)
                        .addGap(61, 61, 61)
                        .addComponent(removepr)
                        .addGap(66, 66, 66)
                        .addComponent(Deleteboard)
                        .addGap(198, 198, 198))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(par, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(prname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(prdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(proprice)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addpr)
                        .addComponent(clearsearch)
                        .addComponent(prsearch)
                        .addComponent(resettextfield))
                    .addComponent(removepr)
                    .addComponent(Deleteboard)
                    .addComponent(buypr))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void parActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parActionPerformed

    private void prdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prdataActionPerformed

    private void clearsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearsearchActionPerformed
       par.setText(" ");
       prname.setText(" ");
       proprice.setText(" ");
       prquantity.setText(" ");
       prdata.setText(" ");
                          
    }//GEN-LAST:event_clearsearchActionPerformed

    private void buyprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyprActionPerformed
         DefaultTableModel model=(DefaultTableModel) listofbuy.getModel();
         
         ReviewModel review=new ReviewModel(); 
         int i=listofbuy.getRowCount();
        
         Object[] r=new Object[5];
         for (int j = 0; j < i; j++) {
             r[0]=model.getValueAt(j,0);
             review.setParcode(r[0].toString());
             r[1]=model.getValueAt(j,1);
             review.setMed_Name(r[1].toString());
             r[2]=model.getValueAt(j,2);
             
             String pr=r[2].toString();
             Float price=Float.valueOf(pr);
             review.setPrice(price);
             
             r[3]=model.getValueAt(j,3);
             String q=r[3].toString();
             int qu=Integer.parseInt(q);
             review.setQuantity_M(qu);
             
             
             r[4]=model.getValueAt(j,4);
             review.setSell_Date(r[4].toString());
             
             
        }
            Models.ReviewModel.listReview.add(review);
       
                
         Object []ro=new Object[5];
      
         for (int j = 0; j < Models.ReviewModel.listReview.size()/2; j++) {
            ro[0]=Models.ReviewModel.listReview.get(j).getParcode()+"";
            ro[1]=Models.ReviewModel.listReview.get(j).getMed_Name()+"";
            ro[2]=Models.ReviewModel.listReview.get(j).getPrice()+"";
            ro[3]=Models.ReviewModel.listReview.get(j).getQuantity_M()+"";
            ro[4]=Models.ReviewModel.listReview.get(j).getSell_Date();
            System.out.println(Arrays.toString(ro));
          
        }
         //System.out.println(Arrays.toString(ro));
          //DefaultTableModel model2 = (DefaultTableModel) listofbuy.getModel();
           model.setRowCount(0);  
         
        
    }//GEN-LAST:event_buyprActionPerformed

    private void resettextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resettextfieldActionPerformed
        dis();
        showdata();
        act();
       par.setText(" ");
       prname.setText(" ");
       proprice.setText(" ");
       prquantity.setText(" ");
       prdata.setText(" ");
   
    }//GEN-LAST:event_resettextfieldActionPerformed

    private void searchtableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_searchtableAncestorAdded
       showdata();
       act();
      
    }//GEN-LAST:event_searchtableAncestorAdded

    private void addprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addprActionPerformed
          DefaultTableModel m=(DefaultTableModel) searchtable.getModel();
         int i= searchtable.getSelectedRow();
           if (i>=0) {
            
           qm();
           dis();
           showdata();
           act();
           par.setText(" ");
           prname.setText(" ");
           proprice.setText(" ");
           prquantity.setText(" ");
           prdata.setText(" "); 
        }
           else
           {
               JOptionPane.showInternalMessageDialog(null,"Sorry not sorry");
           }
    
    }//GEN-LAST:event_addprActionPerformed

    private void prsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prsearchActionPerformed
       
            search();
            
    }//GEN-LAST:event_prsearchActionPerformed

    private void removeprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeprActionPerformed
         int i=listofbuy.getSelectedRow();
         DefaultTableModel model = (DefaultTableModel) listofbuy.getModel();
         String ss=model.getValueAt(i,3).toString();
         int qfrombuy=Integer.parseInt(ss);
         String par=model.getValueAt(i,0).toString();
          
         DBConnection connect=new DBConnection();
          
         connect.select("Medicine","Parcode = "+par+"");
         
         Object []r=new Object[6];
      
         for (int j = 0; j < Models.MedicineModel.dataofmedicine.size(); j++) {
            r[0]=Models.MedicineModel.dataofmedicine.get(j).getParcode()+"";
            r[1]=Models.MedicineModel.dataofmedicine.get(j).getMed_Name()+"";
            r[2]=Models.MedicineModel.dataofmedicine.get(j).getPrice()+"";
            r[3]=Models.MedicineModel.dataofmedicine.get(j).getRetail()+"";
            r[4]=Models.MedicineModel.dataofmedicine.get(j).getQuantity_M()+"";
            r[5]=Models.MedicineModel.dataofmedicine.get(j).getEXP();
          
        }
            
         String qfrommain=r[4].toString();
         int quant=Integer.parseInt(qfrommain);
         int endgame=quant+qfrombuy;
          
         connect.Update("Medicine","Quantity = "+endgame+"","Parcode = "+par+"");
         Object[]ro=new Object[5];
         for (int j = 0; j < Models.ReviewModel.listReview.size()/2; j++) {
            ro[0]=Models.ReviewModel.listReview.get(j).getParcode()+"";
            ro[1]=Models.ReviewModel.listReview.get(j).getMed_Name()+"";
            ro[2]=Models.ReviewModel.listReview.get(j).getPrice()+"";           
            ro[3]=Models.ReviewModel.listReview.get(j).getQuantity_M()+"";
            ro[4]=Models.ReviewModel.listReview.get(j).getSell_Date()+"";          
            if(ro[0].equals(par))
            {
                ReviewModel.listReview.remove(ro);
                break;
            }
          
        }
         
         model.removeRow(i);
    }//GEN-LAST:event_removeprActionPerformed

    private void DeleteboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteboardActionPerformed
           // System.out.println(MedicineModel.buydata.get(1));
           // DefaultTableModel m=(DefaultTableModel) listofbuy.getModel();
           dis2();
           DefaultTableModel model = (DefaultTableModel) listofbuy.getModel();
           model.setRowCount(0);
            
    }//GEN-LAST:event_DeleteboardActionPerformed

    private void prquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prquantityActionPerformed
         
    }//GEN-LAST:event_prquantityActionPerformed
    private  void qm()
    {
        int q=0;
        Float cost=0.0f;                       
        Float p=0.0f;
        int result=0;
        int ssq=0;
        int mainq;
        int pos = searchtable.getSelectedRow();
        mainq=Models.MedicineModel.dataofmedicine.get(pos).getQuantity_M();
        String s=prquantity.getText();
        q=Integer.parseInt(s);       
        if(mainq>0){
                
            String s2=proprice.getText();
            p=Float.parseFloat(s2); 
            cost=(float)q*p;
            String finalcost=Float.toString(cost);
            proprice.setText(finalcost);
            
            DefaultTableModel model = (DefaultTableModel) searchtable.getModel();
            mainq=Models.MedicineModel.dataofmedicine.get(pos).getQuantity_M();
            String sq=prquantity.getText();
            ssq=Integer.parseInt(sq);
            result=mainq-ssq;
                     
            DBConnection connection=new DBConnection();                     
            String endgame=Integer.toString(result);
            connection.Update("Medicine","Quantity ="+endgame+"","Parcode ="+par.getText()+"");
            model.setValueAt(endgame, pos, 4);
            
            
            
            
            DefaultTableModel model1=(DefaultTableModel) listofbuy.getModel();
            Object[] r=new Object[5];
            r[0]=par.getText();
            r[1]=prname.getText();
            r[3]=prquantity.getText();
            r[2]=proprice.getText();
            r[4]=prdata.getText();

            //String Parcode, String Med_Name, double price, double Retail, int Quantity_M, String EXP
            MedicineModel medicineModel=new MedicineModel();
            medicineModel.setParcode(par.getText());
            medicineModel.setMed_Name(prname.getText());

            String price=proprice.getText();
            Float pp=Float.valueOf(price);
            medicineModel.setPrice(pp);

            String qu=prquantity.getText();
            int qq=Integer.parseInt(qu);
            medicineModel.setQuantity_M(qq);

            medicineModel.setEXP(prdata.getText());
            Models.MedicineModel.buydata.add(medicineModel);
            model1.addRow(r);
        
        }else
        {
            JOptionPane.showInternalMessageDialog(null,"Sorry not sorry");
        }

    }
    
    private void update()
    {
        int pos=searchtable.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) searchtable.getModel();
        if(pos>=0)
        {
            model.setValueAt(par.getText(), pos,0);
            model.setValueAt( prname.getText(), pos,1);
            model.setValueAt(proprice.getText(), pos,2);
            //model.setValueAt(prquantity.getText(), pos,3);
            model.setValueAt(prquantity.getText(), pos,4);
            model.setValueAt(prdata.getText(), pos,5);
        }
    }
           
                  
    private void showdata()
    {
        
       DBConnection connect=new DBConnection();
      
        connect.select("Medicine","");
        String [] c={"Parcode","Med_Nam","price","Retail","Quantity","EXP"};
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn(c[0]);
        model.addColumn(c[1]);
        model.addColumn(c[2]);
        model.addColumn(c[3]);
        model.addColumn(c[4]);
        model.addColumn(c[5]);
        
         String []r=new String[6];
      
        for (int i = 0; i < Models.MedicineModel.dataofmedicine.size(); i++) {
            r[0]=Models.MedicineModel.dataofmedicine.get(i).getParcode()+"";
            r[1]=Models.MedicineModel.dataofmedicine.get(i).getMed_Name()+"";
            r[2]=Models.MedicineModel.dataofmedicine.get(i).getPrice()+"";
            r[3]=Models.MedicineModel.dataofmedicine.get(i).getRetail()+"";
            r[4]=Models.MedicineModel.dataofmedicine.get(i).getQuantity_M()+"";
            r[5]=Models.MedicineModel.dataofmedicine.get(i).getEXP();
            model.addRow(r);
        }

       searchtable.setModel(model);
      
       
    }
    private void act()
    {
      ListSelectionModel model=searchtable.getSelectionModel();
      model.addListSelectionListener(new ListSelectionListener() {
          @Override
          public void valueChanged(ListSelectionEvent e) {
              if(! model.isSelectionEmpty())
              {
                   int i=model.getLeadSelectionIndex();
                  
                    String []r=new String[6];
                    r[0]=Models.MedicineModel.dataofmedicine.get(i).getParcode()+"";
                    r[1]=Models.MedicineModel.dataofmedicine.get(i).getMed_Name()+"";
                    r[2]=Models.MedicineModel.dataofmedicine.get(i).getPrice()+"";
                    r[3]=Models.MedicineModel.dataofmedicine.get(i).getRetail()+"";
                    r[4]=Models.MedicineModel.dataofmedicine.get(i).getQuantity_M()+"";
                    r[5]=Models.MedicineModel.dataofmedicine.get(i).getEXP();
                    par.setText(r[0]);
                    prname.setText(r[1]);
                    proprice.setText(r[2]);
                    prquantity.setText("1");
                    prdata.setText(r[5]);
                   
                  }
              
              
             
          }
      });
    }
    private void dis2()
    {
            
        for (int i = 0; i <MedicineModel.buydata.size(); i++) {
           
                      MedicineModel.buydata.remove(i);
                      
                       
        }
         MedicineModel.buydata.clear();
        //showdata();
    }
    private void dis()
    {
            
        for (int i = 0; i <MedicineModel.dataofmedicine.size(); i++) {
           
                      MedicineModel.dataofmedicine.remove(i);
                      
                       
        }
         MedicineModel.dataofmedicine.clear();
        //showdata();
    }
    private void search() 
    {
         dis();
      
        DBConnection connect=new DBConnection();
        String parcode=par.getText();
        connect.select("Medicine","Parcode ="+parcode+"");
        
       String [] c={"Parcode","Med_Nam","price","Retail","Quantity","EXP"};
        DefaultTableModel model1=new DefaultTableModel();
        model1.addColumn(c[0]);
        model1.addColumn(c[1]);
        model1.addColumn(c[2]);
        model1.addColumn(c[3]);
        model1.addColumn(c[4]);
        model1.addColumn(c[5]);
        
         String []r=new String[6];
      
        for (int i = 0; i < Models.MedicineModel.dataofmedicine.size(); i++) {
            r[0]=Models.MedicineModel.dataofmedicine.get(i).getParcode()+"";
            r[1]=Models.MedicineModel.dataofmedicine.get(i).getMed_Name()+"";
            r[2]=Models.MedicineModel.dataofmedicine.get(i).getPrice()+"";
            r[3]=Models.MedicineModel.dataofmedicine.get(i).getRetail()+"";
            r[4]=Models.MedicineModel.dataofmedicine.get(i).getQuantity_M()+"";
            r[5]=Models.MedicineModel.dataofmedicine.get(i).getEXP();
            model1.addRow(r);
        } 
       
        
       searchtable.setModel(model1);
       par.setText("");
       
        
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
            java.util.logging.Logger.getLogger(Sell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sell().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deleteboard;
    private javax.swing.JButton addpr;
    private javax.swing.JButton back;
    private javax.swing.JButton buypr;
    private javax.swing.JButton clearsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listofbuy;
    private javax.swing.JTextField par;
    private javax.swing.JTextField prdata;
    private javax.swing.JTextField prname;
    private javax.swing.JLabel proprice;
    private javax.swing.JTextField prquantity;
    private javax.swing.JButton prsearch;
    private javax.swing.JButton removepr;
    private javax.swing.JButton resettextfield;
    private javax.swing.JTable searchtable;
    // End of variables declaration//GEN-END:variables
}
