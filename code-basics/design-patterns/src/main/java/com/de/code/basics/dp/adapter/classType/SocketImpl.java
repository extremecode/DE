package com.de.code.basics.dp.adapter.classType;

import com.de.code.basics.dp.adapter.Socket;
import com.de.code.basics.dp.adapter.SocketAdapter;
import com.de.code.basics.dp.adapter.Volt;

public class SocketImpl extends Socket implements SocketAdapter {


    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get12Volts() {
        Volt v = getVolt();
        return convertVolts(v,10);
    }

    @Override
    public Volt get3Volts() {
        Volt v = getVolt();
        return convertVolts(v,40);
    }

    private Volt convertVolts(Volt v,int i){
        return new Volt(v.getVolts()/i);
    }

}
