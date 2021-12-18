package com.ventas.ventas.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * @author Jose Chavez
 */
@Getter
@Setter
@AllArgsConstructor
public class ExceptionResponse {

    private Date timestamp;
    private String mensaje;
    private String detalles;

}
