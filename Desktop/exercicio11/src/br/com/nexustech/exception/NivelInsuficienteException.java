package br.com.nexustech.exception;

public class NivelInsuficienteException extends RuntimeException {

    public NivelInsuficienteException(String message) {
        super("Seu nível émuito baixo para esta masmorra!");
    }
    
}
