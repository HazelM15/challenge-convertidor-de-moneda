package com.aluracursos.convertidordemoneda.modelos;

//import java.util.List;

public record Moneda(String result,
                     String base_code,
                     String target_code,
                     double conversion_rate,
                     double conversion_result){

    @Override
    public String toString() {
        return "Resultado del proceso " + result +
                "\nLa conversion de " + base_code + " a " + target_code +
                " siendo el tipo de cambio en " + conversion_rate +
                base_code + " es de " + conversion_result + target_code;
    }

}