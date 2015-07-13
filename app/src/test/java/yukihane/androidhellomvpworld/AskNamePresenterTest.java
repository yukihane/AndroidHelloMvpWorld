package yukihane.androidhellomvpworld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * プレゼンターテストコード.
 * android.* パッケージに一切依存せず, JUnitで実行することができる.
 */
public class AskNamePresenterTest {

    @Test
    public void testFirst() {

        AskNamePresenter presenter = new AskNamePresenter(new AskNamePresenter.View() {
            @Override
            public void setDisplayedText(String text) {
                assertEquals("James is 25 years old", text);
            }
        });

        presenter.onNameAndAgeEntered("James", 25);
    }
}
