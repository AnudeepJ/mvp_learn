package assignment.com.dagger2learning;

/**
 * Created by anudeep on 14/08/17.
 */

public interface MvpPresenter<V extends MvpView> {

    void attachView(V view);

    void detachView();
}
