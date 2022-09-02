package cn.ofpp;

import cn.ofpp.core.BoyFriend;
import cn.ofpp.core.MessageFactory;
import cn.ofpp.core.Wx;

/**
 * 启动类
 * <p>
 * 这个理论上只能用测试号 正式的号 个人认证是不支持模板消息的 企业认证的又必须使用微信模板库里的模板 只有测试的可以自定义模板内容
 * <a href="https://mp.weixin.qq.com/debug/cgi-bin/sandboxinfo?action=showinfo&t=sandbox/index">申请公众号测试应用地址</a>
 *
 * @author DokiYolo
 * Date 2022-08-22
 */
public class Application {

    /**
     * <li>创建配置</li>
     * <li>创建几个 男/女 朋友</li>
     * <li>发消息</li>
     */
    public static void main(String[] args) {
        // load and init
        Bootstrap.init();

        // -----------------  以下为演示数据  ------------------------

        BoyFriend boyFriend = new BoyFriend("郭浩宇",
                "湖南省", "长沙市", "2003-09-20", "2000-01-01", "oumZ76Kf_VIH3wKCawuq_zbip4W4", "-CAJ78m0IrIUwWcLN4mcwaiqpNYLLTkP-O1WFtw4HfU");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(boyFriend));
    }
}
