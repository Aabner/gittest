package bjcw.mvp.rx.ui.splash;

import android.os.Bundle;

import bjcw.mvp.rx.R;
import bjcw.mvp.rx.base.BaseActivity;
import bjcw.mvp.rx.base.CoreBaseActivity;
import bjcw.mvp.rx.ui.home.HomeActivity;
import bjcw.mvp.rx.utils.RxTimerUtil;

public class SplashActivity extends BaseActivity {

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_splash;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        RxTimerUtil.timer(3000, new RxTimerUtil.IRxNext() {
            @Override
            public void doNext(long number) {
                startActivity(HomeActivity.class);
                finish();
            }
        });
    }
}
