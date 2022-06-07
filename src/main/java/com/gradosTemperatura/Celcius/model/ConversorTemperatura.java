
package com.gradosTemperatura.Celcius.model;

import lombok.Data;

@Data
public class ConversorTemperatura {
    private float celcius;
    private int fahrenheit;
    private float resultado;

    public ConversorTemperatura() {
       this.celcius=32;
    }
    
 
    public String fahrenheitacelsius(int grado){
        this.setFahrenheit(grado);
        this.setResultado((this.fahrenheit-this.celcius)/1.8f);
        return String.valueOf(getResultado());
    }


}
