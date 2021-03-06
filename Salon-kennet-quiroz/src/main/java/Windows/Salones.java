/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Windows;

import Classes.Client;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import Classes.Salon;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
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
public class Salones extends javax.swing.JPanel {

    /**
     * @return the arraySalon
     */
    public static ArrayList<Salon> getArraySalon() {
        readData();
        return arraySalon;
    }

    private static ArrayList<Salon> arraySalon = new ArrayList<>();
    Object[] col = {"Codigo", "Nombre", "Capacidad", "Description"};
    DefaultTableModel tableModel = new DefaultTableModel(col, 0) {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    /**
     * Creates new form Clients
     */
    public Salones() {
        initComponents();
        readData();
        setData();
        setTable();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        codeT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        capacityT = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        desT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        salonTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SALONES");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(8, 1, 5, 5));

        jLabel2.setText("Codigo del salon");
        jPanel1.add(jLabel2);
        jPanel1.add(codeT);

        jLabel3.setText("Nombre del salon");
        jPanel1.add(jLabel3);
        jPanel1.add(nameT);

        jLabel4.setText("Capacidad");
        jPanel1.add(jLabel4);
        jPanel1.add(capacityT);

        jLabel5.setText("Descripcion");
        jPanel1.add(jLabel5);
        jPanel1.add(desT);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        salonTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(salonTable);

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

        jLabel6.setText("BUSCAR EN LA TABLA...");

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
                            .addComponent(jLabel6))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        saveSalon();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        searchInTable(search.getText());
    }//GEN-LAST:event_searchKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        generarReporte();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner capacityT;
    private javax.swing.JTextField codeT;
    private javax.swing.JTextField desT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameT;
    private javax.swing.JTable salonTable;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables

    private void saveBinary() {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;

        try {
            //Se crea el fichero
            fos = new FileOutputStream("salon.dat");
            salida = new ObjectOutputStream(fos);

            //Se escribe el objeto en el fichero
            salida.writeObject(getArraySalon());

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

            fis = new FileInputStream("salon.dat");
            entrada = new ObjectInputStream(fis);
            arraySalon = (ArrayList<Salon>) entrada.readObject(); //es necesario el casting

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

    private void setData() {
        salonTable.setModel(tableModel);
    }

    private void setTable() {
        readData();
        Object[] columns = {"Codigo", "Nombre", "Capacidad", "Description"};
        DefaultTableModel tableModel2 = new DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        for (Salon s : getArraySalon()) {
            Object[] row = {s.getCode(), s.getName(), s.getCapacity(), s.getDescription()};
            tableModel2.addRow(row);
        }
        salonTable.setModel(tableModel2);
    }

    private void saveSalon() {
        JTextField[] txt = new JTextField[]{codeT, nameT, desT};
        if (validateEmpty(txt)) {
            if (validateSame(codeT.getText())) {
                Salon s = new Salon();
                s.setCode(codeT.getText());
                s.setName(nameT.getText());
                s.setCapacity(Integer.parseInt(capacityT.getValue().toString()));
                s.setDescription(desT.getText());
                getArraySalon().add(s);
                saveBinary();
                setTable();
                resetData(txt);
                JOptionPane.showMessageDialog(null, "Salon agregado!", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe un salon con ese codigo", "Error", JOptionPane.ERROR_MESSAGE);

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
        if (Integer.parseInt(capacityT.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(null, "Porfavor ingrese una capacidad valida", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void resetData(JTextField[] txt) {
        for (JTextField f : txt) {
            f.setText("");
        }
    }

    private boolean validateSame(String text) {
        for (Salon c : getArraySalon()) {
            if (c.getCode().equals(text)) {
                return false;
            }
        }
        return true;
    }

    public void searchInTable(String searchString) {
        DefaultTableModel model = (DefaultTableModel) salonTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        salonTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchString.trim()));
    }
    
    
    private void generarReporte() {
        try {
            FileSystemView filesys = FileSystemView.getFileSystemView();
            try (BufferedWriter ficheroSalida = new BufferedWriter(
                    new FileWriter(new File(filesys.getHomeDirectory() + "/Reporte Salones.html")))) {
                Iterator<Salon> it = getArraySalon().iterator();
                String tr = "";
                while (it.hasNext()) {
                    Salon e = it.next();
                    tr = tr + "<tr>\n"
                            + "						<td>" + e.getCode()+ "</td>\n"
                            + "						<td>" + e.getName() + "</td>\n"
                            + "						<td>" + e.getCapacity()+ "</td>\n"
                            + "						<td>" + e.getDescription()+ "</td>\n"
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
                        + "						<th>Codigo</th>\n"
                        + "						<th>Nombre</th>\n"
                        + "						<th>Capacidad</th>\n"
                        + "						<th>Descripcion</th>\n"
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

}
