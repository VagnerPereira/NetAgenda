package com.ClinicaFeliz.NetAgenda.Exceptions;

public class ComponenteNaoEncontradoException extends RuntimeException{
    public  ComponenteNaoEncontradoException(String message) {
        super(message);
    }
}
