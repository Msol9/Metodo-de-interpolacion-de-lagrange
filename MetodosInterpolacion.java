/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author ROY
 */
public class MetodosInterpolacion extends javax.swing.JFrame {

    /**
     * Creates new form MetodosInterpolacion
     */
    public MetodosInterpolacion() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelLogo1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        panelLogo2 = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        JPaneGrafica = new javax.swing.JPanel();
        Seleccion = new javax.swing.JComboBox<>();
        Datos = new javax.swing.JPanel();
        panelPr = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        panelLogo1.setBackground(new java.awt.Color(153, 153, 255));
        panelLogo1.setPreferredSize(new java.awt.Dimension(100, 0));

        javax.swing.GroupLayout panelLogo1Layout = new javax.swing.GroupLayout(panelLogo1);
        panelLogo1.setLayout(panelLogo1Layout);
        panelLogo1Layout.setHorizontalGroup(
            panelLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );
        panelLogo1Layout.setVerticalGroup(
            panelLogo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextField1.setBackground(new java.awt.Color(255, 255, 102));
        jTextField1.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        jTextField1.setText("MÉTODOS INTERPOLACIÓN");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(true);

        panelLogo2.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout panelLogo2Layout = new javax.swing.GroupLayout(panelLogo2);
        panelLogo2.setLayout(panelLogo2Layout);
        panelLogo2Layout.setHorizontalGroup(
            panelLogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelLogo2Layout.setVerticalGroup(
            panelLogo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelLogo1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelLogo1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(panelLogo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelPrincipal.setBackground(new java.awt.Color(153, 153, 255));

        JPaneGrafica.setPreferredSize(new java.awt.Dimension(325, 0));

        javax.swing.GroupLayout JPaneGraficaLayout = new javax.swing.GroupLayout(JPaneGrafica);
        JPaneGrafica.setLayout(JPaneGraficaLayout);
        JPaneGraficaLayout.setHorizontalGroup(
            JPaneGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );
        JPaneGraficaLayout.setVerticalGroup(
            JPaneGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Seleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lagrange" }));
        Seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionActionPerformed(evt);
            }
        });

        Datos.setPreferredSize(new java.awt.Dimension(325, 0));

        javax.swing.GroupLayout DatosLayout = new javax.swing.GroupLayout(Datos);
        Datos.setLayout(DatosLayout);
        DatosLayout.setHorizontalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );
        DatosLayout.setVerticalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPrLayout = new javax.swing.GroupLayout(panelPr);
        panelPr.setLayout(panelPrLayout);
        panelPrLayout.setHorizontalGroup(
            panelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPrLayout.setVerticalGroup(
            panelPrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(Datos, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPaneGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Seleccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(Seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Datos, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(JPaneGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)))
                    .addComponent(panelPr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void SeleccionActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String opcion = Seleccion.getSelectedItem().toString();
        switch (opcion) {
            case "Lagrange":
                interpolacionLagrange();
                break;
        }
    }                                         

    public void interpolacionLagrange() {
        JLabel lblX = new JLabel("Valores de X:");
        lblX.setBounds(20, 10, 120, 30);
        panelPr.add(lblX);

        JTextField txtX = new JTextField();
        txtX.setBounds(20, 40, 150, 30);
        panelPr.add(txtX);

        JLabel lblY = new JLabel("Valores de Y:");
        lblY.setBounds(20, 80, 120, 30);
        panelPr.add(lblY);

        JTextField txtY = new JTextField();
        txtY.setBounds(20, 110, 150, 30);
        panelPr.add(txtY);

        JLabel lblValor = new JLabel("Valor a interpolar:");
        lblValor.setBounds(20, 150, 150, 30);
        panelPr.add(lblValor);

        JTextField txtValor = new JTextField();
        txtValor.setBounds(20, 180, 150, 30);
        panelPr.add(txtValor);

        // Área de resultados
        JTextArea resultados = new JTextArea();
        resultados.setEditable(false);
        resultados.setLineWrap(true);
        resultados.setWrapStyleWord(true);

        // MISMAS MEDIDAS QUE TU CÓDIGO
        JScrollPane scroll = new JScrollPane(resultados);
        scroll.setBounds(10, 10, 290, 270);

        Datos.add(scroll);

        JButton calcular = new JButton("Calcular");
        calcular.setBounds(35, 230, 120, 30);

        calcular.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    String[] valoresX = txtX.getText().split(",");
                    String[] valoresY = txtY.getText().split(",");

                    if (valoresX.length != valoresY.length) {

                        resultados.setText("Error: La cantidad de valores X y Y debe ser igual.");
                        return;
                    }

                    double[] x = new double[valoresX.length];
                    double[] y = new double[valoresY.length];

                    for (int i = 0; i < valoresX.length; i++) {

                        x[i] = Double.parseDouble(valoresX[i].trim());
                        y[i] = Double.parseDouble(valoresY[i].trim());
                    }

                    double valor = Double.parseDouble(txtValor.getText());

                    double resultadoFinal = 0;

                    StringBuilder procedimiento = new StringBuilder();

                    procedimiento.append("======= INTERPOLACIÓN DE LAGRANGE =======\n\n");

                    procedimiento.append("Datos:\n\n");

                    for (int i = 0; i < x.length; i++) {

                        procedimiento.append("x")
                                .append(i)
                                .append(" = ")
                                .append(x[i])
                                .append("      f(x")
                                .append(i)
                                .append(") = ")
                                .append(y[i])
                                .append("\n");
                    }

                    procedimiento.append("\n");
                    for (int i = 0; i < x.length; i++) {

                        procedimiento.append("L")
                                .append(i)
                                .append("(x) = ");

                        double a = 1;
                        double b = 0;
                        double c = 0;

                        double divisor = 1;

                        // Construcción simbólica
                        for (int j = 0; j < x.length; j++) {

                            if (i != j) {

                                procedimiento.append("(x-")
                                        .append((int) x[j])
                                        .append(")");

                                divisor *= (x[i] - x[j]);

                                // Expansión algebraica
                                double nuevoA = a;

                                double nuevoB = b - (a * x[j]);

                                double nuevoC = c - (b * x[j]);

                                a = nuevoA;
                                b = nuevoB;
                                c = nuevoC;
                            }
                        }

                        procedimiento.append("/(")
                                .append((int) divisor)
                                .append(")\n");

                        // Forma desarrollada
                        procedimiento.append("      = (");

                        if (a != 0) {

                            if (a == 1) {

                                procedimiento.append("x² ");

                            } else {

                                procedimiento.append((int) a)
                                        .append("x² ");
                            }
                        }

                        if (b >= 0) {

                            procedimiento.append("+ ")
                                    .append((int) b)
                                    .append("x ");

                        } else {

                            procedimiento.append("- ")
                                    .append((int) Math.abs(b))
                                    .append("x ");
                        }

                        if (c >= 0) {

                            procedimiento.append("+ ")
                                    .append((int) c);

                        } else {

                            procedimiento.append("- ")
                                    .append((int) Math.abs(c));
                        }

                        procedimiento.append(")/")
                                .append((int) Math.abs(divisor))
                                .append("\n\n");
                    }
                    procedimiento.append("P(x) = ");
                    for (int i = 0; i < x.length; i++) {
                        procedimiento.append(y[i])
                                .append("(L")
                                .append(i)
                                .append("(x))");
                        if (i < x.length - 1) {
                            procedimiento.append(" + ");
                        }
                    }
                    procedimiento.append("\n\n");
                    double coefA = 0;
                    double coefB = 0;
                    double coefC = 0;
                    for (int i = 0; i < x.length; i++) {
                        double a = 1;
                        double b = 0;
                        double c = 0;
                        double divisor = 1;
                        for (int j = 0; j < x.length; j++) {
                            if (i != j) {
                                divisor *= (x[i] - x[j]);
                                double nuevoA = a;
                                double nuevoB = b - (a * x[j]);
                                double nuevoC = c - (b * x[j]);
                                a = nuevoA;
                                b = nuevoB;
                                c = nuevoC;
                            }
                        }
                        coefA += y[i] * (a / divisor);
                        coefB += y[i] * (b / divisor);
                        coefC += y[i] * (c / divisor);
                    }
                    procedimiento.append("P(x) = ");
                    if (coefA != 0) {
                        if (coefA == 1) {
                            procedimiento.append("x² ");
                        } else {
                            procedimiento.append(coefA)
                                    .append("x² ");
                        }
                    }
                    if (coefB >= 0) {
                        procedimiento.append("+ ")
                                .append(coefB)
                                .append("x ");
                    } else {
                        procedimiento.append("- ")
                                .append(Math.abs(coefB))
                                .append("x ");
                    }
                    if (coefC >= 0) {
                        procedimiento.append("+ ")
                                .append(coefC);
                    } else {
                        procedimiento.append("- ")
                                .append(Math.abs(coefC));
                    }
                    procedimiento.append("\n\n");
                    procedimiento.append("Valor a interpolar: ")
                            .append(valor);
                    // ==========================
// GRAFICAR LAGRANGE
// ==========================

                    XYSeries serie = new XYSeries("Lagrange");

// Rango de la gráfica
                    double xmin = x[0];
                    double xmax = x[0];

                    for (int i = 0; i < x.length; i++) {

                        if (x[i] < xmin) {
                            xmin = x[i];
                        }

                        if (x[i] > xmax) {
                            xmax = x[i];
                        }
                    }

// Expandir un poco el rango
                    xmin -= 2;
                    xmax += 2;

// Evaluar muchos puntos
                    for (double xp = xmin; xp <= xmax; xp += 0.1) {

                        double yp = 0;

                        // Fórmula de Lagrange
                        for (int i = 0; i < x.length; i++) {

                            double L = 1;

                            for (int j = 0; j < x.length; j++) {

                                if (i != j) {

                                    L *= (xp - x[j]) / (x[i] - x[j]);
                                }
                            }

                            yp += y[i] * L;
                        }

                        serie.add(xp, yp);
                    }

// Dataset
                    XYSeriesCollection dataset = new XYSeriesCollection();
                    dataset.addSeries(serie);

// Crear gráfica
                    JFreeChart grafica = ChartFactory.createXYLineChart(
                            "Interpolación de Lagrange",
                            "X",
                            "Y",
                            dataset
                    );

// Crear panel
                    ChartPanel panelGrafica = new ChartPanel(grafica);

// Limpiar JPanel
                    JPaneGrafica.removeAll();

                    JPaneGrafica.setLayout(new BorderLayout());

// Agregar gráfica
                    JPaneGrafica.add(panelGrafica, BorderLayout.CENTER);

                    JPaneGrafica.revalidate();
                    JPaneGrafica.repaint();
                    resultados.setText(procedimiento.toString());
                } catch (NumberFormatException ex) {
                    resultados.setText("Error: Ingresa números válidos separados por comas.");
                } catch (Exception ex) {
                    resultados.setText("Error: " + ex.getMessage());
                }
            }
        });

        panelPr.add(calcular);
        JButton limpiar = new JButton("Limpiar");
        limpiar.setBounds(35, 270, 120, 30);
        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtX.setText("");
                txtY.setText("");
                txtValor.setText("");
                resultados.setText("");
            }
        });
        panelPr.add(limpiar);
        panelPr.repaint();
        panelPr.revalidate();
    }

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
            java.util.logging.Logger.getLogger(MetodosInterpolacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetodosInterpolacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetodosInterpolacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetodosInterpolacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetodosInterpolacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Datos;
    private javax.swing.JPanel JPaneGrafica;
    private javax.swing.JComboBox<String> Seleccion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelLogo1;
    private javax.swing.JPanel panelLogo2;
    private javax.swing.JPanel panelPr;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration                   
}
