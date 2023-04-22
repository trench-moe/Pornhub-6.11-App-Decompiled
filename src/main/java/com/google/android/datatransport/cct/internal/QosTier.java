package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

/* loaded from: classes.dex */
public enum QosTier {
    DEFAULT(0),
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_ONLY(1),
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_OR_DAILY(2),
    /* JADX INFO: Fake field, exist only in values array */
    FAST_IF_RADIO_AWAKE(3),
    /* JADX INFO: Fake field, exist only in values array */
    NEVER(4),
    /* JADX INFO: Fake field, exist only in values array */
    UNRECOGNIZED(-1);
    
    private final int value;

    static {
        QosTier qosTier;
        QosTier qosTier2;
        QosTier qosTier3;
        QosTier qosTier4;
        QosTier qosTier5;
        QosTier qosTier6 = DEFAULT;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, qosTier6);
        sparseArray.put(1, qosTier);
        sparseArray.put(2, qosTier2);
        sparseArray.put(3, qosTier3);
        sparseArray.put(4, qosTier4);
        sparseArray.put(-1, qosTier5);
    }

    QosTier(int i10) {
        this.value = i10;
    }
}
