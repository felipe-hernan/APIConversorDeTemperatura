
package com.gradosTemperatura.Celcius.controller;


import com.gradosTemperatura.Celcius.model.ConversorTemperatura;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradosController {
    
    @GetMapping
    public String inicio(){
        return "Ingresar a la ruta /tempertaura/temperatura-en-fahrenheit";
    }
    
    @GetMapping("temperatura/{temp}")
    public String temperaturaEnCelcius(@PathVariable int temp){    
        var temperatura = new ConversorTemperatura();
        return "La temperatura en Celcius es: "+temperatura.fahrenheitacelsius(temp);   
    }
    
    
}
