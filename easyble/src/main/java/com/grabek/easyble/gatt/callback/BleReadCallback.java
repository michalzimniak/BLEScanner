package com.grabek.easyble.gatt.callback;


import com.grabek.easyble.BleDevice;

public interface BleReadCallback extends BleCallback {
    void onReadSuccess(byte[] data, BleDevice device);
}
