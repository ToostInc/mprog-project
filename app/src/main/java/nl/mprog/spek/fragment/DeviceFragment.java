package nl.mprog.spek.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nl.mprog.spek.interfaces.HardwareInfoInterface;
import nl.mprog.spek.model.Hardware;

/**
 *
 * DeviceFragment class.
 *
 */
public class DeviceFragment extends SpekFragment implements HardwareInfoInterface {
    public DeviceFragment() {
        // Required empty public constructor
    }


    public static DeviceFragment newInstance(String param1, String param2) {
        return (DeviceFragment) SpekFragment.newInstance(param1, param2);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void setMapData() {
        assert(info != null);
        assert(infoAdapter != null);
        info.put("Brand", Hardware.Device.BRAND);
        info.put("Model", Hardware.Device.MODEL);
        info.put("Manufacturer", Hardware.Device.MANUFACTURER);
        Log.d("Map size", String.valueOf(info.size()));
    }

}
