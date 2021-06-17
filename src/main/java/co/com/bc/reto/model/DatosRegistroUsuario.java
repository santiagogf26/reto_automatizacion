package co.com.bc.reto.model;

import lombok.Data;

@Data
public class DatosRegistroUsuario {

    private String nombre;
    private String apellidos;
    private String email;
    private String mesNacimiento;
    private String diaNacimiento;
    private String anoNacimiento;
    private String ciudad;
    private String codigoPostal;
    private String pais;
    private String dispositivo;
    private String modeloDispositivo;
    private String osDispositivo;
    private String contrasena;
}
