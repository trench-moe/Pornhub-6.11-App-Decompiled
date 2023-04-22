package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class NetworkConnectionInfo {

    /* loaded from: classes.dex */
    public enum MobileSubtype {
        UNKNOWN_MOBILE_SUBTYPE(0),
        /* JADX INFO: Fake field, exist only in values array */
        GPRS(1),
        /* JADX INFO: Fake field, exist only in values array */
        EDGE(2),
        /* JADX INFO: Fake field, exist only in values array */
        UMTS(3),
        /* JADX INFO: Fake field, exist only in values array */
        CDMA(4),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_0(5),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_A(6),
        /* JADX INFO: Fake field, exist only in values array */
        RTT(7),
        /* JADX INFO: Fake field, exist only in values array */
        HSDPA(8),
        /* JADX INFO: Fake field, exist only in values array */
        HSUPA(9),
        /* JADX INFO: Fake field, exist only in values array */
        HSPA(10),
        /* JADX INFO: Fake field, exist only in values array */
        IDEN(11),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_B(12),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(13),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(14),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(15),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(16),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(17),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(18),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: j  reason: collision with root package name */
        public static final SparseArray<MobileSubtype> f5938j;
        private final int value;

        static {
            MobileSubtype mobileSubtype;
            MobileSubtype mobileSubtype2;
            MobileSubtype mobileSubtype3;
            MobileSubtype mobileSubtype4;
            MobileSubtype mobileSubtype5;
            MobileSubtype mobileSubtype6;
            MobileSubtype mobileSubtype7;
            MobileSubtype mobileSubtype8;
            MobileSubtype mobileSubtype9;
            MobileSubtype mobileSubtype10;
            MobileSubtype mobileSubtype11;
            MobileSubtype mobileSubtype12;
            MobileSubtype mobileSubtype13;
            MobileSubtype mobileSubtype14;
            MobileSubtype mobileSubtype15;
            MobileSubtype mobileSubtype16;
            MobileSubtype mobileSubtype17;
            MobileSubtype mobileSubtype18;
            MobileSubtype mobileSubtype19;
            MobileSubtype mobileSubtype20 = UNKNOWN_MOBILE_SUBTYPE;
            SparseArray<MobileSubtype> sparseArray = new SparseArray<>();
            f5938j = sparseArray;
            sparseArray.put(0, mobileSubtype20);
            sparseArray.put(1, mobileSubtype);
            sparseArray.put(2, mobileSubtype2);
            sparseArray.put(3, mobileSubtype3);
            sparseArray.put(4, mobileSubtype4);
            sparseArray.put(5, mobileSubtype5);
            sparseArray.put(6, mobileSubtype6);
            sparseArray.put(7, mobileSubtype7);
            sparseArray.put(8, mobileSubtype8);
            sparseArray.put(9, mobileSubtype9);
            sparseArray.put(10, mobileSubtype10);
            sparseArray.put(11, mobileSubtype11);
            sparseArray.put(12, mobileSubtype12);
            sparseArray.put(13, mobileSubtype13);
            sparseArray.put(14, mobileSubtype14);
            sparseArray.put(15, mobileSubtype15);
            sparseArray.put(16, mobileSubtype16);
            sparseArray.put(17, mobileSubtype17);
            sparseArray.put(18, mobileSubtype18);
            sparseArray.put(19, mobileSubtype19);
        }

        MobileSubtype(int i10) {
            this.value = i10;
        }

        public int b() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public enum NetworkType {
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE(0),
        /* JADX INFO: Fake field, exist only in values array */
        WIFI(1),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_MMS(2),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_SUPL(3),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_DUN(4),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_HIPRI(5),
        /* JADX INFO: Fake field, exist only in values array */
        WIMAX(6),
        /* JADX INFO: Fake field, exist only in values array */
        BLUETOOTH(7),
        /* JADX INFO: Fake field, exist only in values array */
        DUMMY(8),
        /* JADX INFO: Fake field, exist only in values array */
        ETHERNET(9),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_FOTA(10),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_IMS(11),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_CBS(12),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(13),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(14),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_EMERGENCY(15),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(16),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(17),
        NONE(-1);
        

        /* renamed from: f  reason: collision with root package name */
        public static final SparseArray<NetworkType> f5941f;
        private final int value;

        static {
            NetworkType networkType;
            NetworkType networkType2;
            NetworkType networkType3;
            NetworkType networkType4;
            NetworkType networkType5;
            NetworkType networkType6;
            NetworkType networkType7;
            NetworkType networkType8;
            NetworkType networkType9;
            NetworkType networkType10;
            NetworkType networkType11;
            NetworkType networkType12;
            NetworkType networkType13;
            NetworkType networkType14;
            NetworkType networkType15;
            NetworkType networkType16;
            NetworkType networkType17;
            NetworkType networkType18;
            NetworkType networkType19 = NONE;
            SparseArray<NetworkType> sparseArray = new SparseArray<>();
            f5941f = sparseArray;
            sparseArray.put(0, networkType);
            sparseArray.put(1, networkType2);
            sparseArray.put(2, networkType3);
            sparseArray.put(3, networkType4);
            sparseArray.put(4, networkType5);
            sparseArray.put(5, networkType6);
            sparseArray.put(6, networkType7);
            sparseArray.put(7, networkType8);
            sparseArray.put(8, networkType9);
            sparseArray.put(9, networkType10);
            sparseArray.put(10, networkType11);
            sparseArray.put(11, networkType12);
            sparseArray.put(12, networkType13);
            sparseArray.put(13, networkType14);
            sparseArray.put(14, networkType15);
            sparseArray.put(15, networkType16);
            sparseArray.put(16, networkType17);
            sparseArray.put(17, networkType18);
            sparseArray.put(-1, networkType19);
        }

        NetworkType(int i10) {
            this.value = i10;
        }

        public int b() {
            return this.value;
        }
    }

    public abstract MobileSubtype a();

    public abstract NetworkType b();
}
