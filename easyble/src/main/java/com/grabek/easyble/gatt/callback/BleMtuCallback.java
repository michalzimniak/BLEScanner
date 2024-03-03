package com.grabek.easyble.gatt.callback;


import com.grabek.easyble.BleDevice;


public interface BleMtuCallback extends BleCallback {
    void onMtuChanged(int mtu, BleDevice device);
}
