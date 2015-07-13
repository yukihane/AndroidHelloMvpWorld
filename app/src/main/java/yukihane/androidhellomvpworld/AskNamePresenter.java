package yukihane.androidhellomvpworld;

/**
 * MVPのP(プレゼンター).
 * PとVは1対1の関係になる.
 */
public class AskNamePresenter {

    private View view;

    /**
     * (今回はたまたまそうなっていますが)モデルはプレゼンターと1対1の関係になるとは限りません.
     * 1つのプレセンターが複数のモデルを使用する場合もありますし,
     * 1つのモデルが複数のプレゼンターから利用される場合もあり得ます.
     */
    private MyModel model;

    public AskNamePresenter(View view) {
        this.view = view;
        model = new MyModel();
    }

    public void onNameAndAgeEntered(String name, int age) {
        view.setDisplayedText(model.getResult(name, age));
    }

    /**
     * MVPのV(ビュー).
     * PとVは1対1の関係になる.
     */
    public interface View {
        void setDisplayedText(String text);
    }
}
