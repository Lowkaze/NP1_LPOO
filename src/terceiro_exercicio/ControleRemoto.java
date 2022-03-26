package terceiro_exercicio;

public class ControleRemoto {
    private Televisao televisao = new Televisao();

    public void aumentarCanal() {
        televisao.setCanal(televisao.getCanal() + 1);
    }

    public void diminuirCanal() {
        televisao.setCanal(televisao.getCanal() - 1);
    }

    public void trocarCanal(int canal) {
        televisao.setCanal(canal);
    }

    public void aumentarVolume() {
        televisao.setVolume(televisao.getVolume() + 1);
    }

    public void diminuirVolume() {
        televisao.setVolume(televisao.getVolume() - 1);
    }

    public void verificarCanalSom() {
        System.out.println("Canal selecionado: " + televisao.getCanal());
        System.out.println("Volume do som: " + televisao.getVolume());
    }
}
