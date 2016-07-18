package observer_pattern;

public class OtousanListener implements Observer {

    @Override
    public void notify(Event event) {
        System.out.println(this.getClass().getName());
        System.out.printf("お父さん<%sから「たすけて〜」とLINEktkr%n", event.getSource());
        if (event instanceof HentaEvent) {
            System.out.println("お父さんパニックﾟ★:ﾟ ヾ(´*д*｀)ﾉｼ ﾟ:★ﾟ　");
        }
    }
}
