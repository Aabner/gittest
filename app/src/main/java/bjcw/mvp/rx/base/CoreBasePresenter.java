package bjcw.mvp.rx.base;

public abstract class CoreBasePresenter<M,V> {
    public M mModel;
    public V mView;
    public RxManager mRxManager = new RxManager();

    public void attachVM(M m, V v){
        this.mView = v;
        this.mModel = m;
//        this.onStart();
    }
    public void detachVM(){
        mRxManager.clear();
        mView = null;
        mModel = null;
    }

//    public abstract void onStart();

   public void subscribe(){

   }
    public void unSubscribe(){

    }
}
