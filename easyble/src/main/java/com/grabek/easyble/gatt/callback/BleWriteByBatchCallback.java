package com.grabek.easyble.gatt.callback;


import com.grabek.easyble.BleDevice;

public interface BleWriteByBatchCallback extends BleCallback {
    void writeByBatchSuccess(byte[] data, BleDevice device);
}
