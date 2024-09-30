package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    Date expirationDate ;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, Date date) {
        super(name, uniqueId, responsibleId);
        this.expirationDate  = date;
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date fecha) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = fecha;
    }

    @Override
    public Object getSpecificData() {

        String formattedDate = getFormattedDate(this.expirationDate);

        StringBuilder sb = new StringBuilder();
        sb.append("Localizacion: ").append(getLocation()).append(" ");
        sb.append("Caducidad: ").append(formattedDate);

        return sb.toString();
    }

    public void printSpecificData(){
        System.out.println(getSpecificData());
    }

    public Date getExpirationDate() {
        return expirationDate;
    }
    public String getFormattedDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }


    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
