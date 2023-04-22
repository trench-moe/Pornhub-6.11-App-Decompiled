package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes.dex */
public abstract class bt extends Observable {
    public final Runnable AFInAppEventParameterName;
    private long AFKeystoreWrapper;
    public final String values;
    public final Map<String, Object> AFInAppEventType = new HashMap();
    public e valueOf = e.NOT_STARTED;

    /* loaded from: classes.dex */
    public enum e {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public bt(String str, Runnable runnable) {
        this.AFInAppEventParameterName = runnable;
        this.values = str;
    }

    public abstract void AFInAppEventParameterName(Context context);

    public final void AFInAppEventType() {
        this.AFInAppEventType.put("source", this.values);
        this.AFInAppEventType.putAll(new bu());
        this.AFInAppEventType.put("latency", Long.valueOf(System.currentTimeMillis() - this.AFKeystoreWrapper));
        this.valueOf = e.FINISHED;
        setChanged();
        notifyObservers();
    }

    public final void AFKeystoreWrapper() {
        this.AFKeystoreWrapper = System.currentTimeMillis();
        this.valueOf = e.STARTED;
        addObserver(new Observer() { // from class: com.appsflyer.internal.bt.1
            @Override // java.util.Observer
            public final void update(Observable observable, Object obj) {
                bt.this.AFInAppEventParameterName.run();
            }
        });
    }
}
