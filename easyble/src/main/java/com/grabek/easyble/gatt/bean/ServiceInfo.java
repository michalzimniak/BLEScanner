package com.grabek.easyble.gatt.bean;

import java.io.Serializable;


public class ServiceInfo implements Serializable {
    public String uuid;

    public ServiceInfo(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "ServiceInfo{" +
                "uuid='" + uuid + '\'' +
                '}';
    }
}
