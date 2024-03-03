package com.grabek.easyble.gatt.callback;


import com.grabek.easyble.BleDevice;

public interface BleRssiCallback extends BleCallback {

    void onRssi(int rssi, BleDevice bleDevice);
}
