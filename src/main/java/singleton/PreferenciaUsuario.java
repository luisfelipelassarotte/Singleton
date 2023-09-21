package singleton;

public class PreferenciaUsuario {

    private PreferenciaUsuario() {};
    private static PreferenciaUsuario instance = new PreferenciaUsuario();
    public static PreferenciaUsuario getInstance() {
        return instance;
    }

    private String temaEscolhido;
    private String fonteEscolhido;
    private String usuarioLogado;


    public String getTemaEscolhido() {
        return temaEscolhido;
    }

    public void setTemaEscolhido(String temaEscolhido) {
        this.temaEscolhido = temaEscolhido;
    }

    public String getFonteEscolhido() {
        return fonteEscolhido;
    }

    public void setFonteEscolhido(String fonteEscolhido) {
        this.fonteEscolhido = fonteEscolhido;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
