package bjcw.mvp.rx.ui.web;

import android.app.Activity;

import bjcw.mvp.rx.base.CoreBasePresenter;
import bjcw.mvp.rx.base.BaseView;

public interface WebContract {
    interface IWebView extends BaseView{
        Activity getWebViewContext();

        void setGankTitle(String title);

        void loadGankUrl(String url);

        void initWebView();
    }

    abstract class IWebPresenter extends CoreBasePresenter {
       abstract String getGankUrl();

    }
}
