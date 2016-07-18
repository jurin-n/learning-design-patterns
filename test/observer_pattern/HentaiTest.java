package observer_pattern;

import org.junit.Test;

public class HentaiTest {
    @Test
    public void testHentai() throws Exception {
        //Subject
        JK jk = new JK();
        //Observers
        OmawaListener omawarisan = new OmawaListener();
        OtousanListener otousan = new OtousanListener();
        //SubjectにObservers登録
        jk.addObserver(omawarisan);
        jk.addObserver(otousan);

        // 発火(変 態 出 没)
        jk.hentaiShutsubotsu();
    }
}
