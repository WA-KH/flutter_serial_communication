package id.farellsujanto.flutter_serial_communication;

import com.hoho.android.usbserial.driver.Cp21xxSerialDriver;
import com.hoho.android.usbserial.driver.ProbeTable;
import com.hoho.android.usbserial.driver.UsbSerialProber;

public class CustomProber {

    static UsbSerialProber getCustomProber() {
        ProbeTable customTable = new ProbeTable();
        customTable.addProduct(0x0ccf, 0x0576, Cp21xxSerialDriver.class); // e.g. device with custom VID+PID
        return new UsbSerialProber(customTable);
    }

}
