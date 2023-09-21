package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreferenciaUsuarioTest {

    @Test
    public void deveRetornarTemaEscolhido() {
        PreferenciaUsuario.getInstance().setTemaEscolhido("Dark");
        assertEquals("Dark", PreferenciaUsuario.getInstance().getTemaEscolhido());
    }

    @Test
    public void deveRetornarFonteEscolhido() {
        PreferenciaUsuario.getInstance().setFonteEscolhido("Comic Sans");
        assertEquals("Comic Sans", PreferenciaUsuario.getInstance().getFonteEscolhido());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        PreferenciaUsuario.getInstance().setUsuarioLogado("Cleiton Rasta");
        assertEquals("Cleiton Rasta", PreferenciaUsuario.getInstance().getUsuarioLogado());
    }

}