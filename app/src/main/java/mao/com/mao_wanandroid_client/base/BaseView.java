package mao.com.mao_wanandroid_client.base;

/**
 * @author maoqitian
 * @Description View 的基类
 * @Time 2018/10/9 0009 20:16
 */
public interface BaseView {

    //頁面状态
    static final int STATE_NORMAL = 0x00;
    static final int STATE_LOADING = 0x01;
    static final int STATE_ERROR = 0x02;

    /**
     * 页面状态
     */
    /**
     * 正常显示
     */
    void showNormal();

    /**
     * 显示错误
     */
    void showError();

    /**
     * 正在加载
     */
    void showLoading();

    /**
     * 重新加载
     */
    void showReload();

    /**
     * 显示错误信息
     * @param errorMsg 错误信息
     */
    void showErrorMsg(String errorMsg);

    /**
     * 使用夜间模式
     * @param isNightMode 是否为夜间模式
     */
    void useNightMode(boolean isNightMode);

    /**
     * 显示登录页面
     */
    void showLoginView();

    /**
     * 显示登出页面
     */
    void showLogoutView();

    /**
     * 显示收藏成功
     */
    void showCollectSuccess();

    /**
     * 显示取消收藏成功
     */
    void showCancelCollectSuccess();

    /**
     * Show toast
     *
     * @param message Message
     */
    void showToast(String message);

    /**
     * Show snackBar
     *
     * @param message Message
     */
    void showSnackBar(String message);

}
