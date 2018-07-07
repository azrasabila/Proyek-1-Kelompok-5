/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import controller.BitcoinCashController;
import controller.BitcoinController;
import controller.EtheriumController;
import controller.LitecoinController;
import controller.RippleController;
import controller.StellarController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import model.MarketCapModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RectangleEdge;

/**
 *
 * @author Lenovo
 */
public class Chart extends javax.swing.JPanel {

    /**
     * Creates new form Chart
     */
    String judul;
    public Chart() {
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

        LabelTabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        Ok = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();

        LabelTabel.setText("Market Cap Chart");

        jLabel3.setText("Mata Uang");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bitcoin", "Bitcoin Cash", "Etherium", "Litecoin", "Ripple", "Stellar" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Filter Bulan");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        Ok.setText("OK");
        Ok.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                OkItemStateChanged(evt);
            }
        });
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filter", "MarketCap", "Open", "High", "Low", "Close", "Volume" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Filter Tahun");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "2017", "2018" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox5, 0, 260, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelTabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Ok))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ok)))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private static JFreeChart createChart(CategoryDataset dataset, String judul) {
        // create the chart...
        JFreeChart chart = ChartFactory.createLineChart(judul, // chart
                // //
                // title
                "Date", // domain axis label
                "MarketCap Capitalization", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                false, // include legend
                true, // tooltips
                false // urls
        );

        TextTitle source = new TextTitle(" Market Capitalization");
        source.setFont(new Font("SansSerif", Font.PLAIN, 10));
        source.setPosition(RectangleEdge.BOTTOM);

        chart.addSubtitle(source);
        chart.setBackgroundPaint(Color.white);
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setRangeGridlinePaint(Color.white);

        // customise the range axis...
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setAutoRange(true);
        // customise the renderer...
        LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
        renderer.setShapesVisible(true);
        renderer.setDrawOutlines(true);
        renderer.setUseFillPaint(true);
        renderer.setFillPaint(Color.white);
        return chart;
    }

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code her
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed

        String bulan = jComboBox4.getSelectedItem().toString();
        String tahun = jComboBox5.getSelectedItem().toString();
        String value = jComboBox3.getSelectedItem().toString();
        String Filter = jComboBox1.getSelectedItem().toString();
        judul = Filter;
        switch (value) {
            case "Bitcoin":
                Bitcoin(bulan, tahun, Filter);
                //judul = Filter;
                break;
            case "Bitcoin Cash":
                BitcoinCash(bulan, tahun, Filter);
                //judul = Filter;
                break;
            case "Etherium":
                Etherium(bulan, tahun, Filter);
                //judul = Filter;
                break;
            case "Litecoin":
                LiteCoin(bulan, tahun, Filter);
                //judul = Filter;
                break;
            case "Ripple":
                Ripple(bulan, tahun, Filter);
                //judul = Filter;
                break;
            case "Stellar":
                Stellar(bulan, tahun, Filter);
                //judul = Filter;
                break;
            default:
                break;
        }
    }//GEN-LAST:event_OkActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
//        String bulan = jComboBox4.getSelectedItem().toString();
//        String tahun = jComboBox5.getSelectedItem().toString();
//        String value = jComboBox3.getSelectedItem().toString();
//        String Filter = jComboBox1.getSelectedItem().toString();
//        switch (value) {
//            case "Bitcoin":
//                Bitcoin(bulan,tahun, Filter);
//                break;
//            case "Bitcoin Cash":
//                BitcoinCash(bulan, tahun, Filter);
//                break;
//            case "Etherium":
//                Etherium(bulan, tahun, Filter);
//                break;
//            case "Litecoin":
//                LiteCoin(bulan, tahun, Filter);
//                break;
//            case "Ripple":
//                Ripple(bulan, tahun, Filter);
//                break;
//            case "Stellar":
//                Stellar(bulan, tahun, Filter);
//                break;
//            default:
//                break;
//        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void OkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_OkItemStateChanged
        // TODO add your handling code here:
        String bulan = jComboBox4.getSelectedItem().toString();
        String tahun = jComboBox5.getSelectedItem().toString();
        String value = jComboBox3.getSelectedItem().toString();
        String Filter = jComboBox1.getSelectedItem().toString();
        String judul;
        switch (value) {
            case "Bitcoin":
                Bitcoin(bulan, tahun, Filter);

                break;
            case "Bitcoin Cash":
                BitcoinCash(bulan, tahun, Filter);
                break;
            case "Etherium":
                Etherium(bulan, tahun, Filter);
                break;
            case "Litecoin":
                LiteCoin(bulan, tahun, Filter);
                break;
            case "Ripple":
                Ripple(bulan, tahun, Filter);
                break;
            case "Stellar":
                Stellar(bulan, tahun, Filter);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_OkItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTabel;
    private javax.swing.JButton Ok;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public String changeMonth(String bulan) {
        String bulanF = "All Time";
        switch (bulan) {
            case "Jan":
                bulanF = "Januari";
                break;
            case "Feb":
                bulanF = "Februari";
                break;
            case "Mar":
                bulanF = "Maret";
                break;
            case "Apr":
                bulanF = "April";
                break;
            case "May":
                bulanF = "Mei";
                break;
            case "Jun":
                bulanF = "Juni";
                break;
            case "Jul":
                bulanF = "Juli";
                break;
            case "Aug":
                bulanF = "Agustus";
                break;
            case "Sep":
                bulanF = "September";
                break;
            case "Oct":
                bulanF = "Oktober";
                break;
            case "Nov":
                bulanF = "November";
                break;
            case "Dec":
                bulanF = "December";
                break;

        }

        return bulanF;
    }

    private static CategoryDataset LiteCoinDataset(String bulan, String tahun, String key) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        LitecoinController bch = new LitecoinController();
        List<MarketCapModel> subList;
        long Filter = 0;
        int i;
        String currYear, currMonth;

        if (bulan.equals("All")) {
            subList = bch.getListMonthly(key);
        } else {
            subList = bch.getList();
        }

        if (!subList.isEmpty()) {
            int size;
            size = subList.size();

            for (i = 0; i < size; i++) {
                switch (key) {
                    case "Open":
                        Filter = (long) subList.get(i).getOpen();
                        //       judul = "Open";
                        break;
                    case "MarketCap":
                        Filter = subList.get(i).getMarketCap();
                        //     judul = "MarketCap";
                        break;
                    case "Close":
                        Filter = (long) subList.get(i).getClose();
                        //   judul = "Close";
                        break;
                    case "Volume":
                        Filter = subList.get(i).getVolume();
                        // judul = "Volume";
                        break;
                    case "Low":
                        Filter = (long) subList.get(i).getLow();
                        //judul = "Low";
                        break;
                    case "High":
                        Filter = (long) subList.get(i).getHigh();
                        //judul = "High";
                        break;
                    default:
                        break;
                }
                if (bulan.equals("All")) {
                    currMonth = subList.get(i).getDate().substring(0, 3);
                    currYear = subList.get(i).getDate().substring(4);
                } else {
                    currMonth = subList.get(i).getDate().substring(3, 6);
                    currYear = subList.get(i).getDate().substring(7);
                }

                if (bulan.equals("All") && tahun.equals("All")) {
                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);
                } else if (tahun.equals("All") && currMonth.equals(bulan)) {

                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);

                } else if (currYear.equals(tahun) && bulan.equals("All")) {

                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);

                } else if (currMonth.equals(bulan) && currYear.equals(tahun)) {

                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);

                }

            }
        }
        return dataset;
    }

    public void LiteCoin(String bulan, String tahun, String Filter) {
        CategoryDataset dataset = LiteCoinDataset(bulan, tahun, Filter);
        JFreeChart chart = createChart(dataset, judul);
        chart.addSubtitle(new TextTitle("Litecoin\n" + changeMonth(bulan)));
        ChartPanel myChart = new ChartPanel(chart);
        myChart.setMouseWheelEnabled(true);
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(myChart, BorderLayout.WEST);
        jPanel2.validate();
    }

    private static CategoryDataset BCHDataset(String bulan, String tahun, String key) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        BitcoinCashController bch = new BitcoinCashController();
        List<MarketCapModel> subList;
        int i;
        String currYear, currMonth;
        if (bulan.equals("All")) {
            subList = bch.getListMonthly(key);
        } else {
            subList = bch.getList();
        }

        if (!subList.isEmpty()) {
            int size;

            size = subList.size();

            for (i = 0; i < size; i++) {

                if (bulan.equals("All")) {
                    currMonth = subList.get(i).getDate().substring(0, 3);
                    currYear = subList.get(i).getDate().substring(4);
                } else {
                    currMonth = subList.get(i).getDate().substring(3, 6);
                    currYear = subList.get(i).getDate().substring(7);
                }

                if (bulan.equals("All") && tahun.equals("All")) {
                    String date = subList.get(i).getDate();
                    long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(marketCap, "All Time", date);
                } else if (tahun.equals("All") && currMonth.equals(bulan)) {

                    String date = subList.get(i).getDate();
                    long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(marketCap, "All Time", date);

                } else if (currYear.equals(tahun) && bulan.equals("All")) {

                    String date = subList.get(i).getDate();
                    long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(marketCap, "All Time", date);

                } else if (currMonth.equals(bulan) && currYear.equals(tahun)) {

                    String date = subList.get(i).getDate();
                    long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(marketCap, "All Time", date);

                }
            }
        }

        return dataset;
    }

    public void BitcoinCash(String bulan, String tahun, String Filter) {
        CategoryDataset dataset = BCHDataset(bulan, tahun, Filter);
        JFreeChart chart = createChart(dataset, judul);
        chart.addSubtitle(new TextTitle("Bitcoin Cash\n" + changeMonth(bulan)));
        ChartPanel myChart = new ChartPanel(chart);
        myChart.setMouseWheelEnabled(true);
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(myChart, BorderLayout.WEST);
        jPanel2.validate();
    }

    private static CategoryDataset BTCDataset(String bulan, String tahun, String key) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        BitcoinController bch = new BitcoinController();
        List<MarketCapModel> subList;
        long Filter = 0;
        int i;
        String currYear, currMonth;

        if (bulan.equals("All")) {
            subList = bch.getListMonthly(key);
        } else {
            subList = bch.getList();
        }
        if (!subList.isEmpty()) {
            int size;
            size = subList.size();
            for (i = 0; i < size; i++) {
                if (null != key) {
                    switch (key) {
                        case "Open":
                            Filter = (long) subList.get(i).getOpen();
                            //       judul = "Open";
                            break;
                        case "MarketCap":
                            Filter = subList.get(i).getMarketCap();
                            //     judul = "MarketCap";
                            break;
                        case "Close":
                            Filter = (long) subList.get(i).getClose();
                            //   judul = "Close";
                            break;
                        case "Volume":
                            Filter = subList.get(i).getVolume();
                            // judul = "Volume";
                            break;
                        case "Low":
                            Filter = (long) subList.get(i).getLow();
                            //judul = "Low";
                            break;
                        case "High":
                            Filter = (long) subList.get(i).getHigh();
                            //judul = "High";
                            break;
                        default:
                            break;
                    }
                }
                if (bulan.equals("All")) {
                    currMonth = subList.get(i).getDate().substring(0, 3);
                    currYear = subList.get(i).getDate().substring(4);
                } else {
                    currMonth = subList.get(i).getDate().substring(3, 6);
                    currYear = subList.get(i).getDate().substring(7);
                }

                if (bulan.equals("All") && tahun.equals("All")) {
                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);
                } else if (tahun.equals("All") && currMonth.equals(bulan)) {

                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);

                } else if (currYear.equals(tahun) && bulan.equals("All")) {

                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);

                } else if (currMonth.equals(bulan) && currYear.equals(tahun)) {

                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);

                }
            }
        }
        return dataset;
    }

    public void Bitcoin(String bulan, String tahun, String Filter) {
        CategoryDataset dataset = BTCDataset(bulan, tahun, Filter);
        JFreeChart chart = createChart(dataset, judul);
        chart.addSubtitle(new TextTitle("Bitcoin\n" + changeMonth(bulan)));
        ChartPanel myChart = new ChartPanel(chart);
        myChart.setMouseWheelEnabled(true);
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(myChart, BorderLayout.WEST);
        jPanel2.validate();
    }

    private static CategoryDataset RippleDataset(String bulan, String tahun, String key) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        RippleController bch = new RippleController();
        List<MarketCapModel> subList;
        long Filter = 0;
        int i;
        String currYear, currMonth;

        if (bulan.equals("All")) {
            subList = bch.getListMonthly(key);
        } else {
            subList = bch.getList();
        }

        if (!subList.isEmpty()) {
            int size;

            size = subList.size();

            for (i = 0; i < size; i++) {
                switch (key) {
                    case "Open":
                        Filter = (long) subList.get(i).getOpen();
                        //       judul = "Open";
                        break;
                    case "MarketCap":
                        Filter = subList.get(i).getMarketCap();
                        //     judul = "MarketCap";
                        break;
                    case "Close":
                        Filter = (long) subList.get(i).getClose();
                        //   judul = "Close";
                        break;
                    case "Volume":
                        Filter = subList.get(i).getVolume();
                        // judul = "Volume";
                        break;
                    case "Low":
                        Filter = (long) subList.get(i).getLow();
                        //judul = "Low";
                        break;
                    case "High":
                        Filter = (long) subList.get(i).getHigh();
                        //judul = "High";
                        break;
                    default:
                        break;
                }
                if (bulan.equals("All")) {
                    currMonth = subList.get(i).getDate().substring(0, 3);
                    currYear = subList.get(i).getDate().substring(4);
                } else {
                    currMonth = subList.get(i).getDate().substring(3, 6);
                    currYear = subList.get(i).getDate().substring(7);
                }

                if (bulan.equals("All") && tahun.equals("All")) {
                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);
                } else if (tahun.equals("All") && currMonth.equals(bulan)) {

                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);

                } else if (currYear.equals(tahun) && bulan.equals("All")) {

                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);

                } else if (currMonth.equals(bulan) && currYear.equals(tahun)) {

                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);

                }

            }
        }
        return dataset;
    }

    public void Ripple(String bulan, String tahun, String Filter) {
        CategoryDataset dataset = RippleDataset(bulan, tahun, Filter);
        JFreeChart chart = createChart(dataset, judul);
        chart.addSubtitle(new TextTitle("Ripple\n" + changeMonth(bulan)));
        ChartPanel myChart = new ChartPanel(chart);
        myChart.setMouseWheelEnabled(true);
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(myChart, BorderLayout.WEST);
        jPanel2.validate();

    }

    private static CategoryDataset EtheriumDataset(String bulan, String tahun, String key) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        EtheriumController bch = new EtheriumController();
        List<MarketCapModel> subList;
        long Filter = 0;
        int i;
        String currYear, currMonth;

        if (bulan.equals("All")) {
            subList = bch.getListMonthly(key);
        } else {
            subList = bch.getList();
        }

        if (!subList.isEmpty()) {
            int size;

            size = subList.size();

            for (i = 0; i < size; i++) {
                switch (key) {
                    case "Open":
                        Filter = (long) subList.get(i).getOpen();
                        //       judul = "Open";
                        break;
                    case "MarketCap":
                        Filter = subList.get(i).getMarketCap();
                        //     judul = "MarketCap";
                        break;
                    case "Close":
                        Filter = (long) subList.get(i).getClose();
                        //   judul = "Close";
                        break;
                    case "Volume":
                        Filter = subList.get(i).getVolume();
                        // judul = "Volume";
                        break;
                    case "Low":
                        Filter = (long) subList.get(i).getLow();
                        //judul = "Low";
                        break;
                    case "High":
                        Filter = (long) subList.get(i).getHigh();
                        //judul = "High";
                        break;
                    default:
                        break;
                }
                if (bulan.equals("All")) {
                    currMonth = subList.get(i).getDate().substring(0, 3);
                    currYear = subList.get(i).getDate().substring(4);
                } else {
                    currMonth = subList.get(i).getDate().substring(3, 6);
                    currYear = subList.get(i).getDate().substring(7);
                }

                if (bulan.equals("All") && tahun.equals("All")) {
                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);
                } else if (tahun.equals("All") && currMonth.equals(bulan)) {

                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);

                } else if (currYear.equals(tahun) && bulan.equals("All")) {

                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);

                } else if (currMonth.equals(bulan) && currYear.equals(tahun)) {

                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);

                }

            }
        }
        return dataset;
    }

    public void Etherium(String bulan, String tahun, String Filter) {
        CategoryDataset dataset = EtheriumDataset(bulan, tahun, Filter);
        JFreeChart chart = createChart(dataset, judul);
        chart.addSubtitle(new TextTitle("Etherium\n" + changeMonth(bulan)));
        ChartPanel myChart = new ChartPanel(chart);
        myChart.setMouseWheelEnabled(true);
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(myChart, BorderLayout.WEST);
        jPanel2.validate();
    }

    private static CategoryDataset StellarDataset(String bulan, String tahun, String key) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        StellarController bch = new StellarController();
        List<MarketCapModel> subList;
        long Filter = 0;
        int i;
        String currYear, currMonth;

        if (bulan.equals("All")) {
            subList = bch.getListMonthly(key);
        } else {
            subList = bch.getList();
        }

        if (!subList.isEmpty()) {
            int size;

            size = subList.size();

            for (i = 0; i < size; i++) {
                switch (key) {
                    case "Open":
                        Filter = (long) subList.get(i).getOpen();
                        //       judul = "Open";
                        break;
                    case "MarketCap":
                        Filter = subList.get(i).getMarketCap();
                        //     judul = "MarketCap";
                        break;
                    case "Close":
                        Filter = (long) subList.get(i).getClose();
                        //   judul = "Close";
                        break;
                    case "Volume":
                        Filter = subList.get(i).getVolume();
                        // judul = "Volume";
                        break;
                    case "Low":
                        Filter = (long) subList.get(i).getLow();
                        //judul = "Low";
                        break;
                    case "High":
                        Filter = (long) subList.get(i).getHigh();
                        //judul = "High";
                        break;
                    default:
                        break;
                }
                if (bulan.equals("All")) {
                    currMonth = subList.get(i).getDate().substring(0, 3);
                    currYear = subList.get(i).getDate().substring(4);
                } else {
                    currMonth = subList.get(i).getDate().substring(3, 6);
                    currYear = subList.get(i).getDate().substring(7);
                }

                if (bulan.equals("All") && tahun.equals("All")) {
                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);
                } else if (tahun.equals("All") && currMonth.equals(bulan)) {

                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);

                } else if (currYear.equals(tahun) && bulan.equals("All")) {

                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);

                } else if (currMonth.equals(bulan) && currYear.equals(tahun)) {

                    String date = subList.get(i).getDate();
                    //long marketCap = subList.get(i).getMarketCap();
                    dataset.addValue(Filter, "All Time", date);

                }

            }
        }
        return dataset;
    }

    public void Stellar(String bulan, String tahun, String Filter) {
        CategoryDataset dataset = StellarDataset(bulan, tahun, Filter);
        JFreeChart chart = createChart(dataset, judul);
        chart.addSubtitle(new TextTitle("Stellar\n" + changeMonth(bulan)));
        ChartPanel myChart = new ChartPanel(chart);
        myChart.setMouseWheelEnabled(true);
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(myChart, BorderLayout.WEST);
        jPanel2.validate();
    }
}
