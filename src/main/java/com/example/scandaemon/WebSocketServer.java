package com.example.scandaemon;

import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

/**
 * Created by LiYanHao9999@outlook.com
 * on 2022/2/24 15:45
 */
@ServerEndpoint("/myWs")
@Component
public class WebSocketServer {
    /**
     * 连接成功
     *
     * @param session
     */
    @OnOpen
    public void onOpen(Session session) {
        System.out.println("连接成功");

    }

    /**
     * 连接关闭
     *
     * @param session
     */
    @OnClose
    public void onClose(Session session) {
        System.out.println("连接关闭");
    }

    /**
     * 接收到消息
     * 操作
     * @param text
     */
    @OnMessage
    public String onMsg(String text) throws IOException {
        System.out.println("接受到消息 " + text);
        //根据text内容 id 进行操作:
        switch (Integer.valueOf(text)){
            //1 扫描一张 - 创建文件夹  显示一张图片
            case 1:
                //a.执行扫描仪操作
                //b.返回图片保存路径

                break;

        }

        //扫描全部 - 创建文件夹 显示全部图片
        //上传一张
        //上传全部图片
        //删除图片
        //图片裁剪并保存
        //裁剪完成后 原图和裁剪图片都保留 在一个文件夹中

        return "servet 发送：" + text;
    }


}
