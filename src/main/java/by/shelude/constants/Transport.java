package by.shelude.constants;

import java.util.NoSuchElementException;

/**
 * Created by Дмитрий on 22.08.2016.
 */
public enum  Transport {
    AUTOBUS, TROLLEYBUS, TRAMWAY;


    @Override
    public String toString() {
        switch (this) {
            case AUTOBUS: {
                return "Autobus";
            }
            case TROLLEYBUS: {
                return "Trolleybus";
            }
            case TRAMWAY: {
                return "Tramway";
            }
            default: {
                return null;
            }
        }
    }
}
