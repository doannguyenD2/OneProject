
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.*;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dharm
 */
public class FormNhap extends javax.swing.JFrame {

    private  ArrayList<khachHang> danhSachKH = new ArrayList<>();
    private  ArrayList<matHang> danhSachMH = new ArrayList<>();
    private  ArrayList<quanLy> danhSachMuaHang = new ArrayList<>();
    private int maKH=10000; 
    private int maMH = 1000;
    
    
    public FormNhap() {
        initComponents();
        readKhachHang();
        readMaHang();
        readMuaBan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabNhapKhach = new javax.swing.JTabbedPane();
        nhapKhach = new javax.swing.JPanel();
        tenKHTextField = new javax.swing.JTextField();
        diaChiTextField = new javax.swing.JTextField();
        soDTTextField = new javax.swing.JTextField();
        maKhachHangLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        khachHangTable = new javax.swing.JTable();
        themKhachButton = new javax.swing.JButton();
        loiLabel = new javax.swing.JLabel();
        nhapHang = new javax.swing.JPanel();
        maHangLabel = new javax.swing.JLabel();
        tenHangLabel = new javax.swing.JLabel();
        nhomHangLabel = new javax.swing.JLabel();
        giaBanLabel = new javax.swing.JLabel();
        themHangButton = new javax.swing.JButton();
        tenHangTextField = new javax.swing.JTextField();
        nhomHangCombo = new javax.swing.JComboBox<>();
        giaBanTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        hangHoaTable = new javax.swing.JTable();
        loiHangLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tenKHMBComboBox = new javax.swing.JComboBox<>();
        tenMHMBComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        muaBanTable = new javax.swing.JTable();
        tenKHMBLabel = new javax.swing.JLabel();
        maMHMBLabel = new javax.swing.JLabel();
        addMBButton = new javax.swing.JButton();
        loiMuaBanLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        matHangComboBox = new javax.swing.JComboBox<>();
        sortTenButton = new javax.swing.JButton();
        sortSachButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tenKHTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenKHTextFieldActionPerformed(evt);
            }
        });

        maKhachHangLabel.setText("Mã khách hàng");

        jLabel2.setText("Nhập tên khách hàng");

        jLabel3.setText("Nhập Địa chỉ");

        jLabel4.setText("Nhập SĐT");

        khachHangTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Tên KH", "Địa chỉ KH", "SĐT KH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(khachHangTable);

        themKhachButton.setText("Thêm");
        themKhachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themKhachButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nhapKhachLayout = new javax.swing.GroupLayout(nhapKhach);
        nhapKhach.setLayout(nhapKhachLayout);
        nhapKhachLayout.setHorizontalGroup(
            nhapKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nhapKhachLayout.createSequentialGroup()
                .addGroup(nhapKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nhapKhachLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(themKhachButton)
                        .addGap(72, 72, 72))
                    .addGroup(nhapKhachLayout.createSequentialGroup()
                        .addGroup(nhapKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nhapKhachLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(nhapKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maKhachHangLabel)
                                    .addGroup(nhapKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(diaChiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(soDTTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tenKHTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(loiLabel)))
                            .addGroup(nhapKhachLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(nhapKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        nhapKhachLayout.setVerticalGroup(
            nhapKhachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nhapKhachLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(maKhachHangLabel)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tenKHTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(diaChiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(soDTTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(themKhachButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loiLabel)
                .addGap(85, 85, 85))
            .addGroup(nhapKhachLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabNhapKhach.addTab("Nhập khách", nhapKhach);

        maHangLabel.setText("Mã hàng");

        tenHangLabel.setText("Tên hàng");

        nhomHangLabel.setText("Nhóm hàng");

        giaBanLabel.setText("Giá bán");

        themHangButton.setText("Thêm hàng");
        themHangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themHangButtonActionPerformed(evt);
            }
        });

        tenHangTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenHangTextFieldActionPerformed(evt);
            }
        });

        nhomHangCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hang thoi trang", "Hàng tieu dung", "Hang dien may", "Hang gia dung" }));
        nhomHangCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhomHangComboActionPerformed(evt);
            }
        });

        hangHoaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hàng", "Tên Hàng", "Nhóm Hàng", "Giá Bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(hangHoaTable);

        javax.swing.GroupLayout nhapHangLayout = new javax.swing.GroupLayout(nhapHang);
        nhapHang.setLayout(nhapHangLayout);
        nhapHangLayout.setHorizontalGroup(
            nhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nhapHangLayout.createSequentialGroup()
                .addGroup(nhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nhapHangLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(nhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(giaBanLabel)
                            .addComponent(nhomHangLabel)
                            .addComponent(tenHangLabel)
                            .addComponent(maHangLabel)
                            .addGroup(nhapHangLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(nhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loiHangLabel)
                                    .addComponent(giaBanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(nhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, nhapHangLayout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(tenHangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(nhapHangLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(nhomHangCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(nhapHangLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(themHangButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        nhapHangLayout.setVerticalGroup(
            nhapHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nhapHangLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(maHangLabel)
                .addGap(55, 55, 55)
                .addComponent(tenHangLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tenHangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nhomHangLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nhomHangCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(giaBanLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(giaBanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loiHangLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(themHangButton)
                .addContainerGap())
            .addGroup(nhapHangLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabNhapKhach.addTab("Nhập hàng", nhapHang);

        tenKHMBComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        tenKHMBComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenKHMBComboBoxActionPerformed(evt);
            }
        });

        tenMHMBComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        muaBanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma KH", "Ten KH", "Ma Hang", "Ten MH", "So luong"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(muaBanTable);

        tenKHMBLabel.setText("Ten khach hang");

        maMHMBLabel.setText("Ma mat hang");

        addMBButton.setText("Them");
        addMBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMBButtonActionPerformed(evt);
            }
        });

        loiMuaBanLabel.setText("Label báo lỗi");

        jLabel1.setText("Số lượng <10");

        matHangComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3","4","5","6","7","8","9","10" }));
        matHangComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matHangComboBoxActionPerformed(evt);
            }
        });

        sortTenButton.setText("Sort theo ten");
        sortTenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortTenButtonActionPerformed(evt);
            }
        });

        sortSachButton.setText("Sort theo sach");
        sortSachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortSachButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tenMHMBComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tenKHMBComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tenKHMBLabel)
                    .addComponent(maMHMBLabel)
                    .addComponent(addMBButton)
                    .addComponent(loiMuaBanLabel)
                    .addComponent(jLabel1)
                    .addComponent(matHangComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortTenButton)
                    .addComponent(sortSachButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(tenKHMBLabel)
                .addGap(18, 18, 18)
                .addComponent(tenKHMBComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(maMHMBLabel)
                .addGap(18, 18, 18)
                .addComponent(tenMHMBComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(matHangComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loiMuaBanLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addMBButton)
                .addGap(18, 18, 18)
                .addComponent(sortTenButton)
                .addGap(18, 18, 18)
                .addComponent(sortSachButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabNhapKhach.addTab("danh sach mua hang", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabNhapKhach)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabNhapKhach)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nhomHangComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhomHangComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nhomHangComboActionPerformed

    private void tenHangTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenHangTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenHangTextFieldActionPerformed

    private void themHangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themHangButtonActionPerformed
        try {
            matHang mHang = new matHang();
            mHang.setMaHang(maMH);
            if(tenHangTextField.getText().isBlank()||nhomHangCombo.getSelectedItem().toString().isBlank()||giaBanTextField.getText().isBlank())
            throw new IllegalArgumentException();
            mHang.setTenHangString(tenHangTextField.getText());
            mHang.setNhomHangString(nhomHangCombo.getSelectedItem().toString());
            mHang.setGiaDouble(Double.parseDouble(giaBanTextField.getText()));
            danhSachMH.add(mHang);
            maMH++;
            maHangLabel.setText("Mã hàng " + maMH);
            addRowMatHang();

            //doc ghi file
            File file = new File("MH.txt");
            if(!file.exists()) file.createNewFile();

            BufferedWriter bw;
            FileWriter fw;

            fw = new FileWriter(file.getAbsoluteFile(),true);
            bw = new BufferedWriter(fw);
            bw.write(maMH + "\n");
            bw.write(tenHangTextField.getText() + "\n");
            bw.write(nhomHangCombo.getSelectedItem().toString() + "\n");
            bw.write(giaBanTextField.getText() + "\n");
            bw.close();
            fw.close();
            //ket thuc doc ghi file
            tenHangTextField.setText("");
            giaBanTextField.setText("");

        } catch(NumberFormatException ex)
        {
            // phai try catch cai cu the truoc
            loiHangLabel.setText("Loi dinh dang gia");
        }
        catch (IllegalArgumentException e) {
            loiHangLabel.setText("Vui long dien vao ki tu trong");
        } catch (IOException ex) {
            Logger.getLogger(FormNhap.class.getName()).log(Level.SEVERE, null, ex);
            loiHangLabel.setText("Loi ra vao file, vui long xoa file va thu lai");
        }
    }//GEN-LAST:event_themHangButtonActionPerformed

    private void themKhachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themKhachButtonActionPerformed
        // TODO add your handling code here:
        try {
            khachHang kH = new khachHang();
            kH.setMaKH(maKH);
            if(tenKHTextField.getText().isBlank()||diaChiTextField.getText().isBlank()||soDTTextField.getText().isBlank())
            throw new IllegalArgumentException();
            kH.setHoTenString(tenKHTextField.getText());
            kH.setDiaChiString(diaChiTextField.getText());
            kH.setSoDTLong(Long.parseLong(soDTTextField.getText()));
            danhSachKH.add(kH);
            maKH++;
            maKhachHangLabel.setText("Mã khách hàng " + maKH);
            addRowKhachHang();

            //doc ghi file
            File file = new File("KH.txt");
            if(!file.exists()) file.createNewFile();

            BufferedWriter bw;
            FileWriter fw;

            fw = new FileWriter(file.getAbsoluteFile(),true);
            bw = new BufferedWriter(fw);
            bw.write(maKH + "\n");
            bw.write(tenKHTextField.getText() + "\n");
            bw.write(diaChiTextField.getText() + "\n");
            bw.write(soDTTextField.getText() + "\n");
            bw.close();
            fw.close();
            //ket thuc doc ghi file
            tenKHTextField.setText("");
            diaChiTextField.setText("");
            soDTTextField.setText("");

        } catch(NumberFormatException e)
        {
            loiLabel.setText("Sai SDT");
        }
        catch (IllegalArgumentException e) {
            loiLabel.setText("Vui long dien vao ki tu trong");
        } catch (IOException ex) {
            Logger.getLogger(FormNhap.class.getName()).log(Level.SEVERE, null, ex);
            loiLabel.setText("Loi ra vao file, vui long xoa file va thu lai");
        }

    }//GEN-LAST:event_themKhachButtonActionPerformed

    private void tenKHTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenKHTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenKHTextFieldActionPerformed

    private void tenKHMBComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenKHMBComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenKHMBComboBoxActionPerformed

    private void addMBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMBButtonActionPerformed
        // TODO add your handling code here:
        int checkMH = Integer.parseInt(tenMHMBComboBox.getSelectedItem().toString());
        int checkKH = Integer.parseInt(tenKHMBComboBox.getSelectedItem().toString());
        int soLuongMH = Integer.parseInt(matHangComboBox.getSelectedItem().toString());
        
        quanLy qL = new quanLy();
        
        for( khachHang s:danhSachKH)
        {
            if(s.getMaKH() == checkKH)
            {
                qL.setKhHang(s);
                break;
            }
        }
        
        for(matHang s:danhSachMH)
        {
            if(s.getMaHang() == checkMH)
            {
                qL.setMatHang(s);
                break;
            }
        }
        int checkIfExist = 0;
        for(quanLy s:danhSachMuaHang)
        {
            if(s.getKhHang()==qL.getKhHang()&&s.getMatHang()==qL.getMatHang())
            {
                if(s.getSoLuong()+ soLuongMH > 10)
                {
                    loiMuaBanLabel.setText("Vuot qua so luong quy dinh");
                    checkIfExist = 1;
                    break;
                }
                    
                s.add(soLuongMH);
                checkIfExist = 1;
                break;
            }
        }
        
        if(checkIfExist==0)
        {
            qL.setSoLuong(soLuongMH);
            danhSachMuaHang.add(qL);
        }
        addRowMuaBan();
        writeMuaBan();
        
    }//GEN-LAST:event_addMBButtonActionPerformed

    private void matHangComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matHangComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matHangComboBoxActionPerformed

    private void sortTenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortTenButtonActionPerformed
        // TODO add your handling code here:
        //sort https://howtodoinjava.com/sort/collections-sort/
        Collections.sort(danhSachMuaHang, (a,b)->a.getKhHang().getHoTenString().compareTo(b.getKhHang().getHoTenString()));
        addRowMuaBan();
    }//GEN-LAST:event_sortTenButtonActionPerformed

    private void sortSachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortSachButtonActionPerformed
        // TODO add your handling code here:
        //sort https://howtodoinjava.com/sort/collections-sort/
        Collections.sort(danhSachMuaHang, (a,b)->a.getMatHang().getTenHangString().compareTo(b.getMatHang().getTenHangString()));
        addRowMuaBan();
    }//GEN-LAST:event_sortSachButtonActionPerformed

    private void addRowKhachHang(){
        DefaultTableModel dtm1 = (DefaultTableModel) khachHangTable.getModel();
       dtm1.setRowCount(0);
       for(khachHang s:danhSachKH){
                Vector rowKH= new Vector();
                rowKH.add(s.getMaKH());
                rowKH.add(s.getHoTenString());
                rowKH.add(s.getDiaChiString());
                rowKH.add(s.getSoDTLong());
                dtm1.addRow(rowKH);
       }
    }
    
    private void addRowMatHang(){
        DefaultTableModel dtm1 = (DefaultTableModel) hangHoaTable.getModel();
       dtm1.setRowCount(0);
       for(matHang s:danhSachMH){
                Vector rowKH= new Vector();
                rowKH.add(s.getMaHang());
                rowKH.add(s.getTenHangString());
                rowKH.add(s.getNhomHangString());
                rowKH.add(s.getGiaDouble());
                dtm1.addRow(rowKH);
       }
    }
    
    private void addRowMuaBan(){
        DefaultTableModel dtm1 = (DefaultTableModel) muaBanTable.getModel();
       dtm1.setRowCount(0);
       for(quanLy s:danhSachMuaHang){
                Vector rowKH= new Vector();
                rowKH.add(s.getKhHang().getMaKH());
                rowKH.add(s.getKhHang().getHoTenString());
                rowKH.add(s.getMatHang().getMaHang());
                rowKH.add(s.getMatHang().getTenHangString());
                rowKH.add(s.getSoLuong());
                dtm1.addRow(rowKH);
       }
    }
    
    private void readKhachHang(){
        try {
            File f = new File("KH.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine())
            {
                khachHang kH = new khachHang();
                kH.setMaKH(Integer.parseInt(sc.nextLine()));
                kH.setHoTenString(sc.nextLine());
                kH.setDiaChiString(sc.nextLine());
                kH.setSoDTLong(Long.parseLong(sc.nextLine()));
                danhSachKH.add(kH); 
            }
                addRowKhachHang();
                
                maKH = danhSachKH.get(danhSachKH.size()-1).getMaKH() + 1;
                
                sc.close();

        } catch (FileNotFoundException e) {
            loiLabel.setText("Khong ton tai file");
            loiLabel.setForeground(Color.red);
        } catch(NumberFormatException e)
        {
            loiLabel.setText("Loi doc file");
            loiLabel.setForeground(Color.red);  
        } catch(Exception e)
        {
            loiLabel.setText("Loi khong xac dinh");
            loiLabel.setForeground(Color.red);  
        }
    }
    
    private void readMaHang() 
    {
        try {
            File f = new File("MH.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine())
            {
                matHang mH = new matHang();
                mH.setMaHang(Integer.parseInt(sc.nextLine()));
                mH.setTenHangString(sc.nextLine());
                mH.setNhomHangString(sc.nextLine());
                mH.setGiaDouble(Double.parseDouble(sc.nextLine()));
                danhSachMH.add(mH);
            }
            addRowMatHang();
            
            if(danhSachKH.size()>0) maMH = danhSachMH.get(danhSachMH.size()-1).getMaHang()+ 1;
            
            sc.close();
            
            
        } catch (FileNotFoundException e) {
            loiHangLabel.setText("Khong ton tai file");
            loiHangLabel.setForeground(Color.red);
        } catch(NumberFormatException e)
        {
            loiHangLabel.setText("Loi doc file");
            loiHangLabel.setForeground(Color.red);  
        } catch(Exception e)
        {
            loiHangLabel.setText("Loi khong xac dinh");
            loiHangLabel.setForeground(Color.red);  
        }
        
    }
    
    private void readMuaBan()
    {
        danhSachKH.forEach((kH) -> {
            tenKHMBComboBox.addItem(String.valueOf(kH.getMaKH()));
        });
        
        danhSachMH.forEach((mH) -> {
            tenMHMBComboBox.addItem(String.valueOf(mH.getMaHang()));
        });
    }
    
    private void writeMuaBan()
    {
        try {
            File file = new File("QLBH.txt");
            if(!file.exists()) file.createNewFile();

            FileWriter fw;

            fw = new FileWriter(file.getAbsoluteFile(),false);
            //https://www.quora.com/How-do-I-clear-a-file-in-Java-before-writing-to-it-again
            for(quanLy s:danhSachMuaHang)
            {
                fw.write(s.getKhHang().getHoTenString() + "\n");
                fw.write(s.getMatHang().getTenHangString() + "\n");
                fw.write(s.getSoLuong() + "\n");
            }
            fw.close();
            //ket thuc doc ghi file 
        } catch (Exception e) {
            loiMuaBanLabel.setText("Loi ra vao file");
        }
            
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
            java.util.logging.Logger.getLogger(FormNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMBButton;
    private javax.swing.JTextField diaChiTextField;
    private javax.swing.JLabel giaBanLabel;
    private javax.swing.JTextField giaBanTextField;
    private javax.swing.JTable hangHoaTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable khachHangTable;
    private javax.swing.JLabel loiHangLabel;
    private javax.swing.JLabel loiLabel;
    private javax.swing.JLabel loiMuaBanLabel;
    private javax.swing.JLabel maHangLabel;
    private javax.swing.JLabel maKhachHangLabel;
    private javax.swing.JLabel maMHMBLabel;
    private javax.swing.JComboBox<String> matHangComboBox;
    private javax.swing.JTable muaBanTable;
    private javax.swing.JPanel nhapHang;
    private javax.swing.JPanel nhapKhach;
    private javax.swing.JComboBox<String> nhomHangCombo;
    private javax.swing.JLabel nhomHangLabel;
    private javax.swing.JTextField soDTTextField;
    private javax.swing.JButton sortSachButton;
    private javax.swing.JButton sortTenButton;
    private javax.swing.JTabbedPane tabNhapKhach;
    private javax.swing.JLabel tenHangLabel;
    private javax.swing.JTextField tenHangTextField;
    private javax.swing.JComboBox<String> tenKHMBComboBox;
    private javax.swing.JLabel tenKHMBLabel;
    private javax.swing.JTextField tenKHTextField;
    private javax.swing.JComboBox<String> tenMHMBComboBox;
    private javax.swing.JButton themHangButton;
    private javax.swing.JButton themKhachButton;
    // End of variables declaration//GEN-END:variables
}
