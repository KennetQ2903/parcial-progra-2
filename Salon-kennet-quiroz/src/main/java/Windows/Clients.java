/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Windows;

import Classes.Client;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author alumno
 */
public class Clients extends javax.swing.JPanel {

    /**
     * @return the arrayClients
     */
    public static ArrayList<Client> getArrayClients() {
        readData();
        return arrayClients;
    }

    private static ArrayList<Client> arrayClients = new ArrayList<>();
    Object[] col = {"NIT", "Nombre", "Direccion", "Email", "Telefono"};
    DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    /**
     * Creates new form Clients
     */
    public Clients() {
        initComponents();
        readData();
        setData();
        setTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nitT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dirT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phoneT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClient = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTES");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(10, 1, 5, 5));

        jLabel2.setText("NIT");
        jPanel1.add(jLabel2);
        jPanel1.add(nitT);

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3);
        jPanel1.add(nameT);

        jLabel4.setText("Direccion");
        jPanel1.add(jLabel4);
        jPanel1.add(dirT);

        jLabel5.setText("Email");
        jPanel1.add(jLabel5);
        jPanel1.add(emailT);

        jLabel6.setText("Telefono");
        jPanel1.add(jLabel6);
        jPanel1.add(phoneT);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        tableClient.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableClient);

        jButton3.setText("Reporte");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });

        jLabel7.setText("BUSCAR CLIENTE....");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search)
                            .addComponent(jLabel7))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        saveClient();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        generarReporte();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        searchInTable(search.getText());
    }//GEN-LAST:event_searchKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dirT;
    private javax.swing.JTextField emailT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameT;
    private javax.swing.JTextField nitT;
    private javax.swing.JTextField phoneT;
    private javax.swing.JTextField search;
    private javax.swing.JTable tableClient;
    // End of variables declaration//GEN-END:variables

    private void saveClient() {
        JTextField[] txt = new JTextField[]{nitT, nameT, dirT, emailT, phoneT};
        if (validateEmpty(txt)) {
            if (validateSame(nitT.getText())) {
                Client c = new Client();
                c.setNit(nitT.getText());
                c.setName(nameT.getText());
                c.setDirection(dirT.getText());
                c.setEmail(emailT.getText());
                c.setPhone(phoneT.getText());
                getArrayClients().add(c);
                saveBinary();
                setTable();
                resetData(txt);
                JOptionPane.showMessageDialog(null, "Cliente agregado!", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe un cliente con ese nit", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Porfavor llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean validateEmpty(JTextField[] txt) {
        for (JTextField f : txt) {
            if ("".equals(f.getText())) {
                f.requestFocus();
                return false;
            }
        }
        return true;
    }

    private boolean validateSame(String text) {
        for (Client c : getArrayClients()) {
            if (c.getNit().equals(text)) {
                return false;
            }
        }
        return true;
    }

    private void saveBinary() {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;

        try {
            //Se crea el fichero
            fos = new FileOutputStream("client.dat");
            salida = new ObjectOutputStream(fos);

            //Se escribe el objeto en el fichero
            salida.writeObject(getArrayClients());

        } catch (FileNotFoundException e) {
            System.out.println("1" + e.getMessage());
        } catch (IOException e) {
            System.out.println("2" + e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println("3" + e.getMessage());
            }
        }
    }

    public static void readData() {
        FileInputStream fis = null;
        ObjectInputStream entrada = null;

        try {

            fis = new FileInputStream("client.dat");
            entrada = new ObjectInputStream(fis);
            arrayClients = (ArrayList<Client>) entrada.readObject(); //es necesario el casting

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void setTable() {
        readData();
        Object[] col2 = {"NIT", "Nombre", "Direccion", "Email", "Telefono"};
        DefaultTableModel tableModel2 = new DefaultTableModel(col2, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (Client c : getArrayClients()) {
            Object[] row = {c.getNit(), c.getName(), c.getDirection(), c.getEmail(), c.getPhone()};
            tableModel2.addRow(row);
        }
        tableClient.setModel(tableModel2);
    }

    private void resetData(JTextField[] txt) {
        for (JTextField f : txt) {
            f.setText("");
        }
    }

    private void generarReporte() {
        try {
            FileSystemView filesys = FileSystemView.getFileSystemView();
            try (BufferedWriter ficheroSalida = new BufferedWriter(
                    new FileWriter(new File(filesys.getHomeDirectory() + "/Reporte Clientes.html")))) {
                Iterator<Client> it = getArrayClients().iterator();
                String tr = "";
                while (it.hasNext()) {
                    Client e = it.next();
                    tr = tr + "<tr>\n"
                            + "						<td>" + e.getNit() + "</td>\n"
                            + "						<td>" + e.getName() + "</td>\n"
                            + "						<td>" + e.getDirection() + "</td>\n"
                            + "						<td>" + e.getEmail() + "</td>\n"
                            + "						<td>" + e.getPhone() + "</td>\n"
                            + "					</tr>";
                }
                ficheroSalida.write("<!DOCTYPE html>\n"
                        + "<html lang=\"en\">\n"
                        + "	<head>\n"
                        + "		<meta charset=\"UTF-8\" />\n"
                        + "		<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n"
                        + "		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n"
                        + "		<title>Reporte</title>\n"
                        + "		<link\n"
                        + "			href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\n"
                        + "			rel=\"stylesheet\"\n"
                        + "			integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\n"
                        + "			crossorigin=\"anonymous\"\n"
                        + "		/>\n"
                        + "	</head>\n"
                        + "	<body style=\"background-color: #000a12\">\n"
                        + "		<div class=\"container-fluid p-4\">\n"
                        + "			<table class=\"table table-lg table-dark table-striped table-hover w-100 text-center\">\n"
                        + "				<thead>\n"
                        + "					<tr>\n"
                        + "						<td colspan=\"5\" style=\"background-color: black; font-size: 1.5rem\">REPORTE DE CLIENTES</td>\n"
                        + "					</tr>\n"
                        + "					<tr>\n"
                        + "						<th>NIT</th>\n"
                        + "						<th>Nombre</th>\n"
                        + "						<th>Direccion</th>\n"
                        + "						<th>Email</th>\n"
                        + "						<th>Telefono</th>\n"
                        + "					</tr>\n"
                        + "				</thead>\n"
                        + "				<tbody>\n"
                        + tr
                        + "				</tbody>\n"
                        + "			</table>\n"
                        + "		</div>\n"
                        + "	</body>\n"
                        + "</html>");
            }
            JOptionPane.showMessageDialog(null, "Se genero el reporte en el escritorio", "Exito", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException errorDeFichero) {
            JOptionPane.showMessageDialog(null, "Error al generar el reporte", "Error", JOptionPane.ERROR_MESSAGE);

            System.out.println(
                    "Ha habido problemas: "
                    + errorDeFichero.getMessage());
        }
    }

    private void setData() {
        tableClient.setModel(tableModel);
        tableClient.setRowHeight(25);
    }

    public void searchInTable(String searchString) {
        DefaultTableModel model = (DefaultTableModel) tableClient.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        tableClient.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchString.trim()));
    }

}
