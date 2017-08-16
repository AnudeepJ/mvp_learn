package assignment.com.dagger2learning;

/**
 * Created by anudeep on 14/08/17.
 */

public interface GithubPresenter extends MvpPresenter<GithubView> {

    void loadRepositries();
}
