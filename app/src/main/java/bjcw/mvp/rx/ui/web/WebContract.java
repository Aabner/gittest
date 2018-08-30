package bjcw.mvp.rx.ui.web;

import android.app.Activity;

import bjcw.mvp.rx.base.BaseModel;
import bjcw.mvp.rx.base.BasePresenter;
import bjcw.mvp.rx.base.BaseView;
import io.reactivex.Observable;

public interface WebContract {
    interface IWebView extends BaseView{
        Activity getWebViewContext();

        void setGankTitle(String title);

        void loadGankUrl(String url);

        void initWebView();
    }

    abstract class IWebPresenter extends BasePresenter{
       abstract String getGankUrl();

    }
}
