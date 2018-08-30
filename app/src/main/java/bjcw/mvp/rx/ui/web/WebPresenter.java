package bjcw.mvp.rx.ui.web;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import io.reactivex.functions.Consumer;

public class WebPresenter extends WebContract.IWebPresenter {
    private WebContract.IWebView mWebView;
    private String mGankUrl;
    private Activity mActivity;
    public WebPresenter(WebContract.IWebView webView){
        this.mWebView = webView;
    }
    @Override
    public String getGankUrl() {
       return this.mGankUrl;
    }

    @Override
    public void subscribe() {
        super.subscribe();
        mActivity = mWebView.getWebViewContext();
        Intent intent = mActivity.getIntent();
        String title = intent.getStringExtra(WebViewActivity.GANK_TITLE);
        mWebView.setGankTitle(title);
        mWebView.initWebView();
        mGankUrl = intent.getStringExtra(WebViewActivity.GANK_URL);
        mWebView.loadGankUrl(mGankUrl);
    }

}
