/**
 * CPU Fragment class used to display CPU information from Hardware on screen.
 *
 * @author Joost Bremmer
 * @since  2016
 */

package nl.mprog.spek.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nl.mprog.spek.interfaces.HardwareInfoInterface;
import nl.mprog.spek.model.Hardware;

public class CPUFragment extends SpekFragment implements HardwareInfoInterface {
    public CPUFragment() {
        // Required empty public constructor
    }


    public static CPUFragment newInstance(String param1, String param2) {
        return (CPUFragment) SpekFragment.newInstance(param1, param2);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void setMapData() {
        super.setMapData();

        info.put("Processor", Hardware.CPU.NAME);
        info.put("Architecture", Hardware.CPU.ARCH);
        info.put("Cores", String.valueOf(Hardware.CPU.CORE_COUNT));

    }

}
