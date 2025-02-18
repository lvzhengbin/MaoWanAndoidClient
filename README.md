# MaoWanAndoidClient
[![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)
<img src="https://img.shields.io/badge/Android-1.0.5-blue.svg" align=left />
## 项目简介
- 首先感谢[**鸿洋**](https://github.com/hongyangAndroid)大佬提供的[玩Android开放API](https://www.wanandroid.com/blog/show/2)，这是一款有较好用户体验的开源**玩Android客户端。**提供丰富完整的功能，更好的体验，旨在更好的浏览[https://www.wanandroid.com/](https://www.wanandroid.com/)网站内容，更好的在手机上进行学习。项目使用**Retrofit2 + RxJava2 + Dagger2 +MVP+RxBus**架构，尽量使用**Material Design**控件进行开发。如果觉得本项目对你有帮助，希望您给我来一个**Star**. 
### MVP项目架构解析
- [Android 基本架构之MVP分析与实践](https://juejin.im/post/5d680af66fb9a06af92bb780)
#### 注意
- 下载本项目建议clone master分支,clone 本项目之后需编译生成dagger对应文件。
## 项目基本架构
![MVP-WanAndroid-Architecture](https://github.com/maoqitian/MaoMdPhoto/raw/master/WanAndroid/MVP-WanAndroid-Architecture1.jpg)
## API
[**玩Android开放API**](https://www.wanandroid.com/blog/show/2)
## 项目gif、截图展示
<img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/show.gif"  height="300" width="170"><img src="https://raw.githubusercontent.com/maoqitian/MaoWanAndoidClient/dev/preview/usercenter.gif"  height="300" width="170"><img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/homePage.jpg"  height="300" width="170"> <img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/knowledge.jpg"  height="300" width="170"><img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/search.jpg"  height="300" width="170">
<img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/project.jpg"  height="300" width="170"><img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/setting.jpg"  height="300" width="170"><img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/officialA.jpg"  height="300" width="170"><img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/commonWeb.jpg"  height="300" width="170"><img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/collect.jpg"  height="300" width="170">
<img src="https://raw.githubusercontent.com/maoqitian/MaoMdPhoto/master/WanAndroid/newdawer.jpg"  height="300" width="170"><img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/login.jpg"  height="300" width="170"><img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/loginout.jpg"  height="300" width="170"><img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/webviewPage.jpg"  height="300" width="170"><img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/AddCollectionArticle.png"  height="300" width="170">
<img src="https://github.com/maoqitian/MaoMdPhoto/raw/master/WanAndroid/navigation.jpg"  height="300" width="170"><img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/UpdateCollectionWeb.png"  height="300" width="170"><img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/homeDark.jpg"  height="300" width="170"><img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/projectDark.jpg"  height="300" width="170"><img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/searchDark.jpg"  height="300" width="170">
<img src="https://github.com/maoqitian/MaoWanAndoidClient/raw/master/preview/knowledgeDark.jpg"  height="300" width="170">

## 项目功能
### 首页
- 首页文章列表
- 首页banner
- 常用网站
- 搜索热词（包含在搜索界面）
- 置顶文章
- 最新项目tab (首页的第二个tab)

### 知识体系
- 体系数据
- 知识体系下的文章

### 公众号
- 获取公众号列表
- 查看某个公众号历史数据

### 导航
- 导航数据

### 项目
- 项目分类
- 项目列表数据

### 登录与注册
- 登录、注册功能

### 收藏
- 收藏文章列表
- 收藏站内文章
- 收藏站外文章
- 取消收藏
- 收藏网站列表
- 收藏网址
- 编辑收藏网站
- 删除收藏网站

### 搜索
- 首页文章搜索
- 在某个公众号中搜索历史文章

### 积分
- 积分排行榜
- 获取个人积分
- 获取个人积分获取列表

### 广场
- 广场列表数据
- 分享人对应列表数据
- 自己的分享的文章列表（个人中心）
- 删除自己分享的文章（个人中心）
- 分享文章

### 设置
- 夜间模式
- 清除缓存
- 版本信息
- 关于我们
- 退出登录

### 个人中心
- 点击头像进入个人中心，仿B站个人中心效果

# Thanks
- 首先感谢本项目使用到的优秀开源项目
## 参考项目
- [GeekNews](https://github.com/codeestX/GeekNews)

## 使用的第三方库

第三方库 | 功能
---|---
[Dagger2](https://github.com/google/dagger) | 依赖注入
[Retrofit2](https://github.com/square/retrofit) | 网络
[OKHttp3](https://github.com/square/okhttp) | 网络
[RxJava2](https://github.com/ReactiveX/RxJava) | 异步事件处理
[greenDAO](https://github.com/greenrobot/greenDAO) | 数据库
[SmartRefreshLayout](https://github.com/scwang90/SmartRefreshLayout) | 下拉刷新
[Glide4](https://github.com/bumptech/glide) | 图片加载
[Android-ConvenientBanner](https://github.com/saiwu-bigkoo/Android-ConvenientBanner) | Banner
[BaseRecyclerViewAdapterHelper](https://github.com/CymChad/BaseRecyclerViewAdapterHelper) | 数据适配器帮助类
[butterknife](https://github.com/JakeWharton/butterknife) | 控件绑定
[FlowLayout](https://github.com/maoqitian/FlowLayout) | tag 显示
[verticalTabLayout](https://note.youdao.com/)| 纵向导航

## 图标
- [阿里巴巴矢量图标库](https://www.iconfont.cn/collections/index)
- [fontawesome](https://fontawesome.com/icons?d=gallery)

# 版本下载体验
- [**历史版本下载地址**](https://github.com/maoqitian/MaoWanAndoidClient/releases)
### **最新版本下载二维码**
- 可以手机浏览器输入以下地址下载 [https://fir.im/kgy2](https://fir.im/kgy2)
![downloadApk](https://raw.githubusercontent.com/maoqitian/MaoMdPhoto/master/WanAndroid/downloadApk-v1.0.5.png)

# 版本更新日志

## v1.0.5 (2019/10/12)
### 新增广场模块
- 广场列表数据
- 分享人对应列表数据
- 自己的分享的文章列表（个人中心）
- 删除自己分享的文章（个人中心）
- 分享文章
- 个人中心页面支持加载更多
- 修复上个版本存在的bug

## v1.0.4 (2019/09/18)
### 新增积分排行榜模块
- 添加积分排行榜入口，并完成数据展示页面，支持下拉刷新，加载更多
- 添加关于我们页面
- 修复上个版本存在的bug

## v1.0.3 (2019/09/09)
### 新增个人中心模块
- 点击头像进入个人中心，仿B站个人中心效果
- 文章浏览页面增加收藏功能
- 修复上个版本存在的bug

## v1.0.2 (2019/09/03)
### 新增我的积分模块
- 获取个人积分
- 获取个人积分获取列表
- 登录之后侧拉Drawer 显示等级和积分
- 修复上个版本存在的bug

## v1.0.1 (2019/08/29)
### 完善收藏模块功能
- 收藏站外文章
- 收藏网站列表
- 收藏网址
- 编辑收藏网站
- 删除收藏网站
- 修复上个版本存在的bug
## v1.0.0 (2019/08/15)
- 项目第一个版本， 完成WanAndroid基本功能

# Statement
项目中的 API 均来自于 [wanandroid.com](https://www.wanandroid.com/) 网站，纯属学习交流使用，不得用于商业用途。

# License

Copyright 2019 maoqitian

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.	
	
	
	
