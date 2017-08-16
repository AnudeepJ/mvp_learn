package assignment.com.dagger2learning;

/**
 * Created by anudeep on 14/08/17.
 */

public class MvpBasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V view;

    @Override
    public void attachView(V view) {
        this.view = view;
    }


    public V getView() {
        return view;
    }

    @Override
    public void detachView() {
        view = null;
    }
}
