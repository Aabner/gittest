package bjcw.mvp.rx.ui.home;

import android.content.Intent;
import android.os.Bundle;

import bjcw.mvp.rx.R;
import bjcw.mvp.rx.base.BaseActivity;
import bjcw.mvp.rx.base.CoreBaseActivity;
import bjcw.mvp.rx.ui.web.WebViewActivity;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity {

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_home;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {

    }

    @OnClick(R.id.fab)
    public void onViewClicked() {
        Intent intent = new Intent(this, WebViewActivity.class);
        intent.putExtra(WebViewActivity.GANK_TITLE,"TTTT");
        intent.putExtra(WebViewActivity.GANK_URL,"http://www.baidu.com");
        startActivity(intent);
    }
}
