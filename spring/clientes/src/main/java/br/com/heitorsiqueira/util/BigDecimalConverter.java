package br.com.heitorsiqueira.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BigDecimalConverter {

    public BigDecimal converter(String value){
        if(value != null) {
            value = value.replace(".", "").replace(",", ".");
            return new BigDecimal(value);
        }
        return null;
    }
}
