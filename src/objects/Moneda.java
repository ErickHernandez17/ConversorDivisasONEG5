/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objects;

/**
 *
 * @author gomin
 */
public class Moneda {
    
    private Double value;
    private Double newValue = 0.0;
    private int option;
    private String[] titles  ={ "USD","EUR","GBP","JPY","KRW","MXN"};
    private String[] symbols = {"$","€","£"," ¥","₩"};
    private String symbol;
    private String title;

    public void setValue(Double value) {
        this.value = value;
    }

    public void setOption(int option) {
        this.option = option;
    }
    
    public Double getValue(){
        return this.value;
    }
    
    public String cadena(){
        /*
        Funcion por la cual se retorna el resultado como un String
        */
        convert(option);
        String result = "Tienes: "+ symbol + " " +this.newValue + " ";
        this.value = 0.0;
        return result;
    }
    
    private void convert(int option){
        /*
        Funcion para obtenr el valor de la conversion
        */
        switch (option) {
            case 0:
                this.newValue = 0.058 * this.value;
                title = titles[0];
                symbol= symbols[0];
                break;
            case 1:
                this.newValue = this.value * 0.053;
                title = titles[1];
                symbol= symbols[1];
                break;
            case 2:
                this.newValue = this.value * 0.046;
                title = titles[2];
                symbol= symbols[2];
                break;
            case 3:
                this.newValue = this.value * 8.24;
                title = titles[3];
                symbol= symbols[3];
                break;
            case 4:
                this.newValue = this.value * 76.79;
                title = titles[4];
                symbol= symbols[4];
                break;
            case 5:
                this.newValue = this.value * 17.11;
                title = titles[5];
                symbol= symbols[0];
                break;
            case 6:
                this.newValue = this.value * 18.67;
                title = titles[5];
                symbol= symbols[0];
                break;
            case 7:
                this.newValue = this.value * 21.74;
                title = titles[5];
                symbol= symbols[0];
                break;
            case 8:
                this.newValue = this.value * 0.12;
                title = titles[5];
                symbol= symbols[0];
                break;
            case 9:
                this.newValue = this.value * 0.013;
                title = titles[5];
                symbol= symbols[0]; 
                break;
        }
    }
    
}
