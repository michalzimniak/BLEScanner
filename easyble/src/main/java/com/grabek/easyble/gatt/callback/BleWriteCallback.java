package com.grabek.easyble.gatt.callback;


import com.grabek.easyble.BleDevice;

public interface BleWriteCallback extends BleCallback {
    void onWriteSuccess(byte[] data, BleDevice device);
}
