package mao.com.mao_wanandroid_client.presenter.main;

import java.util.List;

import mao.com.mao_wanandroid_client.base.BaseView;
import mao.com.mao_wanandroid_client.base.presenter.AbstractBasePresenter;
import mao.com.mao_wanandroid_client.model.banner.HomePageBannerModel;

/**
 * @author maoqitian
 * @Description:
 * @date 2019/5/7 0007 11:47
 */
public interface HomePageContract {

    interface HomePageView extends BaseView {



        /**
         * 显示首页数据
         * @param
         */
        void showHomePageView();
    }


    interface HomePageFragmentPresenter extends AbstractBasePresenter<HomePageView> {


    }
}
