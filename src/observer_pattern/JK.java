package observer_pattern;

public class JK extends Subject {

    public void hentaiShutsubotsu() {
        System.out.println(this.toString() + "ｷｬｰ!!ﾍﾝﾀｲｰ!!");
        HentaEvent event = new HentaEvent(this);
        notifyObservers(event);
    }

    @Override
    public String toString() {
        return "jk";
    }
}
