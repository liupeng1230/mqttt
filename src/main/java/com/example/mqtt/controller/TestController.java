package com.example.mqtt.controller;

import com.example.mqtt.config.MqttGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 刘鹏
 * @Date: 2021/06/05/17:59
 * @Description:
 */
@RestController
public class TestController {

    @Autowired
    private MqttGateway mqttSender;

    @RequestMapping("/send")
    public void send(String topic,String data){
        mqttSender.sendToMqtt(topic,data);
    }


    /**
     * 发送
     * @param topic
     * @param sendData
     * @return
     */
    @RequestMapping("/sendMqtt")
    public String sendMqtt(String topic,String sendData) {
        mqttSender.sendToMqtt(topic, sendData);
        return "OK";
    }
}
