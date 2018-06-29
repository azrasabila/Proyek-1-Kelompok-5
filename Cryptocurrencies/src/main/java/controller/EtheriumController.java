/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MarketCapModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author ACER
 */
public class EtheriumController {
    private static final String EtheriumData = "*/../src/main/java/excel/Etherium.xlsx"; 
    private List<MarketCapModel> etheriumMarketCap = new ArrayList<>();
    private List<MarketCapModel> monthlyMarketCap = new ArrayList<>();
     
     public void getAllData(){
         try{
             FileInputStream excel = new FileInputStream(new File(EtheriumData));
             Workbook workbook = new XSSFWorkbook(excel);
             Sheet sheet = workbook.getSheetAt(0);
             Iterator<Row> iterator = sheet.iterator();
             iterator.next();
             
             while(iterator.hasNext()){
                Row currentRow = iterator.next();
                Cell date   = currentRow.getCell(2);
                Cell open   = currentRow.getCell(3);
                Cell high   = currentRow.getCell(4);
                Cell low    = currentRow.getCell(5);
                Cell close  = currentRow.getCell(6);
                Cell volume = currentRow.getCell(7);
                Cell marketCap = currentRow.getCell(8);
                
                MarketCapModel mrkt = new MarketCapModel();
                
                mrkt.setDate(date.toString());
                mrkt.setOpen((double) open.getNumericCellValue());
                mrkt.setHigh((double) high.getNumericCellValue());
                mrkt.setLow((double) low.getNumericCellValue());
                mrkt.setClose((double) close.getNumericCellValue());
                mrkt.setVolume((int) volume.getNumericCellValue());
                mrkt.setMarketCap((long) marketCap.getNumericCellValue());
                
                this.etheriumMarketCap.add(mrkt);
             }
             
         } catch (FileNotFoundException ex) {
            Logger.getLogger(EtheriumController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EtheriumController.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public List<MarketCapModel> getList() {
        if(this.etheriumMarketCap.isEmpty()){
            getAllData();
        }
        return this.etheriumMarketCap;
    }
     
   private void montlyChart() {
        EtheriumController sub = new EtheriumController();
        List<MarketCapModel> subList;

        subList = sub.getList();

        if (!subList.isEmpty()) {

            int size = subList.size();
            long eachMonth = 0;
            String mm = subList.get(0).getDate().substring(3, 6);
            
            for (int i = 0; i < size; i++) {
                String currMonth = subList.get(i).getDate().substring(3, 6);

                if (currMonth.equals(mm)) {
                    eachMonth += subList.get(i).getMarketCap();
                    
                   
                } else {
                    
                    MarketCapModel sum = new MarketCapModel();
                    String date = subList.get(i).getDate().substring(3);
                    sum.setDate(date);
                    sum.setMarketCap(eachMonth);
                    this.monthlyMarketCap.add(sum);

                    mm = subList.get(i).getDate().substring(3, 6);
                    eachMonth = 0 + subList.get(i).getMarketCap();

                }
            }
        }
    }

    public List<MarketCapModel> getListMonthly() {
        if (this.monthlyMarketCap.isEmpty()) {
            montlyChart();
        }
        return this.monthlyMarketCap;
    }
}
