package mao.com.mao_wanandroid_client.core.http.helper;

import java.util.List;

import io.reactivex.Observable;
import mao.com.mao_wanandroid_client.model.ResponseBody;
import mao.com.mao_wanandroid_client.model.banner.HomePageBannerModel;

/**
 * @author maoqitian
 * @Description 网络请求帮助接口
 * @Time 2018/11/12 0012 20:23
 */
public interface IHttpHelper {

    /**
     * 获取首页Banner数据
     * @return
     */
    Observable<ResponseBody<List<HomePageBannerModel>>> GetHomePageBannerData();
}