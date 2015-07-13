package yukihane.androidhellomvpworld;


import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

/**
 * Viewを実装したクラス.
 * AndroidにおいてはActivityやFragment継承クラスになるはずです.
 */
public class AskNameDisplay extends Activity implements AskNamePresenter.View {

    /**
     * 1つのビューに対して1つのプレゼンターが対応します.
     */
    private AskNamePresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new AskNamePresenter(this);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setDisplayedText(String text) {
        getShownLabel().setText(text);
    }

    public void submitClicked(android.view.View widget) {
        presenter.onNameAndAgeEntered(getNameField().getText().toString(),
                Integer.parseInt(getAgeField().getText().toString()));
    }

    private EditText getNameField() {
        return (EditText) findViewById(R.id.name);
    }

    private EditText getAgeField() {
        return (EditText) findViewById(R.id.age);
    }

    private TextView getShownLabel() {
        return (TextView) findViewById(R.id.shown);
    }
}
