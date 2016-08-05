package com.example.meicaimall.utils;

/**
 * Created by Administrator on 2016/8/4.
 */

import android.graphics.Bitmap;

import java.util.List;

/**
 * 常量
 *
 * @author gongyibing
 * @version 1.0
 * @created 2015-05-07
 */
public class Constants {
    /**
     * bitmap临时文件列表
     */
    public static List<Bitmap> listbt;
    /**
     * 日志信息 <br>
     * <code>true 显示</code> <code>false 不显示</code> <br>
     */
    public static boolean LOGGER = false;
    /**
     * 测试/上线 <br>
     * <code>true 测试</code> <code>false 上线</code> <br>
     */
    public static boolean TEST = true;
    /**
     * 首页 fragment信息 <br>
     * 索引值0<br>
     */
    public static final int HOME_FRAGMENT_INDEX = 0;
    /**
     * 分类 fragment信息 <br>
     * 索引值1<br>
     */
    public static final int CATEGORY_FRAGMENT_INDEX = 1;
    /**
     * 购物车 fragment信息 <br>
     * 索引值2<br>
     */
    public static final int COLLECT_FRAGMENT_INDEX = 2;
    /**
     * 设置 fragment信息 <br>
     * 索引值 3<br>
     */
    public static final int SETTING_FRAGMENT_INDEX = 3;
    /**
     * 设置 fragment信息 <br>
     * 索引值 4<br>
     */
    public static final int PHONE_CHARGE_INDEX = 4;

    /**
     * 获取数据失败
     */
    public static final int FAILED = 1;
    /**
     * 获取数据成功
     */
    public static final int SUCCESS = 2;

    /**
     * 刷新数据
     */
    public static final int REFRESH = 3;

    /**
     * 网络类型 <br>
     * 0：无网络 <br>
     */
    public static final int NETTYPE_NO = 0x00;
    /**
     * 网络类型 <br>
     * 1：WIFI网络 <br>
     */
    public static final int NETTYPE_WIFI = 0x01;
    /**
     * 网络类型 <br>
     * 2：WAP网络 <br>
     */
    public static final int NETTYPE_CMWAP = 0x02;
    /**
     * 网络类型 <br>
     * 3：NET网络 <br>
     */
    public static final int NETTYPE_CMNET = 0x03;

    /**
     * 首页获取数据配置
     */
    public static final String APP_HOME_DATA = "index/portal/getMainFunc?";
    /**
     * 首页配置数据1
     */
    public static final String APP_HOME_DATA1 = "home/getHomeData?";
    /**
     * 首页广告图片地址
     */
    public static final String APP_HOME_IMG = "index/portal/getMainAd.do";
    /**
     * 获取分类列表
     */
    public static final String APP_CLASSIFICATION = "product";
    /**
     * 查询二级分类产品
     */
    public static final String APP_CHILDS_MERCHANDISE = "common/getProductByCategory";
    /**
     * 店铺方产品方法名
     */
    public static final String SHOPPRODUCT = "commodityInfo";
    /**
     * 百度ak
     */

    public static final String AK = "2q3vGcs8oGtB5LIbYRLOKubU";
    /**
     * 当前 DEMO 应用的 APP_KEY 2045436852，第三方应用应该使用自己的 APP_KEY 683749597替换该 APP_KEY
     */
    public static final String APP_KEY = "683749597";

    /**
     * 当前 DEMO 应用的回调页，第三方应用可以使用自己的回调页。
     * <p/>
     * <p>
     * 注：关于授权回调页对移动客户端应用来说对用户是不可见的，所以定义为何种形式都将不影响， 但是没有定义将无法使用 SDK 认证登录。
     * 建议使用默认回调页：https://api.weibo.com/oauth2/default.html
     * </p>
     */
    public static final String REDIRECT_URL = "http://open.weibo.com/apps/683749597/info/advanced/";

    /**
     * Scope 是 OAuth2.0 授权机制中 authorize 接口的一个参数。通过 Scope，平台将开放更多的微博
     * 核心功能给开发者，同时也加强用户隐私保护，提升了用户体验，用户在新 OAuth2.0 授权页中有权利 选择赋予应用的功能。
     * <p/>
     * 我们通过新浪微博开放平台-->管理中心-->我的应用-->接口管理处，能看到我们目前已有哪些接口的 使用权限，高级权限需要进行申请。
     * <p/>
     * 目前 Scope 支持传入多个 Scope 权限，用逗号分隔。
     * <p/>
     * 有关哪些 OpenAPI 需要权限申请，请查看：http://open.weibo.com/wiki/%E5%BE%AE%E5%8D%9AAPI
     * 关于 Scope 概念及注意事项，请查看：http://open.weibo.com/wiki/Scope
     */
    public static final String SCOPE = "email,direct_messages_read,direct_messages_write,"
            + "friendships_groups_read,friendships_groups_write,statuses_to_me_read,"
            + "follow_app_official_microblog," + "invitation_write";

    /**
     * 微信官网申请的app_id
     */
    public static final String APP_ID = "wx8be0aab008ab17ae";
    /**
     * 普通会员简介
     */
    public static final String MEMBER = "1、进入平台有机会看广告得红包。\n"
            + "2、在平台合作商家可用CO酷币消费抵扣折扣部分。\n"
            + "3、推广奖励---引导3个朋友下载APP并注册 可拥有三层空间展示窗口。\n"
            + "4、个人窗口展示平台---图片可添加任意链接（经审核通过的），比如引向自己店铺或单个商品页. 可非常便捷的在自己电脑端付费方式调用上级商家功能版，企业版，区域平台，全国平台以及弹窗窗口等展示窗口，并能选择多种精准投放方式（列：全国任意设置中心点，方圆多少公里对我平台开启APP的会员进行信息投放）。\n"
            + "5、注册奖励--自己下载得20CO酷币，引导下载得20CO酷币6、随时拥有上级商家利用多项推广功能层层利益推送产品时，参与利益推送获得推送奖励，以及得到购买廉价产品的机会。";
    /**
     * vip会员简介
     */
    public static final String VIP = "1、在普通会员功能的基础上，横向无限纵向7层朋友圈展示窗口。\n"
            + "2、拥有企业版提共多项推广功能（比如常见的三级分销等等），在平台2%和企业版3%的基本利率的基础上自己设定产品成本价、卖价，员工数、员工的固定收益以及设置利益推送的中的不同角色的利益分配方式，按不同推广功能推销自己的产品。\n"
            + "3、商家版享有自己名下所有普通会员在平台合作商家产生的消费返利30%的权限，所有普通会员在平台公共窗口做广告平台所收益部分20%的权限返利以及30%的引入奖励。\n"
            + "4、商家版自己在自己的窗口做广告，所得的收益归自己所有，平台不享受任何收益。\n"
            + "5、普通会员一但成为商家版所有的下级会员归原商家版所有，新发展的新会员归自己拥有，自己继续归属于原商家版的企业版。\n";
    /**
     * 企业版会员简介
     */
    public static final String ENTREPRENEUR_FUNCTION = "1、在商家版的功能基础上，拥有横向纵向无限层展示窗口。\n"
            + "2、拥有自己的商城，可海纳自己名下的所有商家。\n"
            + "3、拥有自己的多项推广功能（例：大家熟悉的三级分销等），并且得到公司不断植入新的功能以及不断的优化和完善，在名下商家版的使用下得到商品销售价3%的使用费。\n"
            + "4、企业版享有自己名下所有商家版及下级普通会员在平台合作商家产生的消费，平台所得返利后的50%权限利润分配，如果商家第一返佣人是企业版，该企业版享有10%的引入奖励，"
            + "在平台公共窗口作广告平台所收益部分40%权限（试用版25%）的返利，做广告的会员第一返佣人如果是企业版，该企业版享有30%的引入奖励。企业版自己通过自己的后台在自己的广告窗口带来的收益归企业版自己所有，平台不享受任何返利。"
            + "举例：平台所送30个商家版，每个商家版发展会员消费者300个，总共有9000个，每个会员每周为自己带来1块钱的广告收入，等于9000块钱，一个月就等于36000元。\n"
            + "5、企业版名下所有商家功能版下面的普通会员一旦有人被招商为商家功能版，该企业版得到招商奖励500元。企业版直接分享的会员，如果被招商为企业版，该企业版享有30%的招商奖励，"
            + "其他间接分享的会员，被招商为企业版，该企业版享有10%的奖励， 试用版没有奖励。\n"
            + "6、企业版可成为其他普通会员招商为企业版的培训导师，可以对自己的企业版间接会员和其他企业版的间接会员培训，一旦这些会员被招商为企业版，该导师享有20%的招商奖励，"
            + "通过导师被招商为企业版，可享受29800的优惠价格。\n"
            + "7、企业版自己以下会员在平台升级为企业版，该升级企业版的所有会员归原企业版所有，新发展会员归自己所有，新的企业版仍继续归属于原上级区域平台。";
    /**
     * 付费升级说明
     */
    public static final String VIP_AND_ENTREPRENEUR_QUALIFICATION = "[如何成为商家版会员]"
            + "（1）电脑端填写资料并付费1000元升级为商家版会员。\n"
            + "[如何成为企业会员]\n"
            + "（1）电脑端缴纳3万元人民币通过平台审核。\n" + "[如何代理区域平台]\n"

            + "	（1）缴纳20万元，须是独立法人单位。平台审核。签立合同。";
    /**
     * 区域平台
     */
    public static final String REGION_PLATFORM_QUALIFICATION = "1、拥有企业版的所有功能。\n"
            + "2、无限层朋友圈公告投放功能。\n"
            + "3、区域平台享有自己名下所有企业版、商家版及下级普通会员在平台合作商家产生的消费，平台所得返利后的60%权限利润分配。如果商家第一返佣人是区域平台，该区域平台享有10%的引入奖励。如果商家是在自己的区域范围内通提5%的消费奖励，在平台公共窗口作广告平台所收益部分55%权限的返利，做广告的普通会员第一返佣人如果是区域平台，该区域平台享有30%的引入奖励区域平台在"
            + "自己的广告窗口带来的收益归区域平台自己所有，平台不享受任何返利。\n"
            + "4、区域平台下面的普通会员一旦有人被招商为商家版，该区域平台是他的第一返佣人，该区域平台得到招商奖励600元，如果该区域平台不是第一返佣人，区域平台的奖励是600元减出自己下级返佣人的奖励部分剩下部分归自己，区域平台以下的会员一旦被招商为企业版，区域平台直接分享的会员被招商为企业版区域平台获奖励30%，区域平台下面的其他会员被招商为企业版，"
            + "区域平台获奖励10%。\n"
            + "5、可为普通会员被招商成企业版的导师，享有20%的导师奖励  以及导师优惠价格29800元。举例：平台所送十个企业版300个商家版，每个商家版发展会员300个，总共有90000个会员，每个会员每周为自己带来1块钱的广告收入，等于9万块钱，一个月就等于36万元。砍一半的会员 5万人带来每月20万收入。\n"
            + "备注：区域平台最好是多个股东以上的独立经济体。后期的同城代购，需求与发布的，平台授予责权利的管理政策。";

    /***
     * 升级条件
     */
    public static final String UPDATEMEMBER_STRING = "邀请有效会员成功人数在50人以上,即可申请成为VIP会员.邀请有效会员成功人数不少于5000人,即可升级为创业者.";

}