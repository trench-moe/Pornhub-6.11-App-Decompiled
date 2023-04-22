package com.appsflyer.internal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class i {

    /* loaded from: classes.dex */
    public enum a {
        NONE,
        FIRST,
        ALL
    }

    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN,
        ACCELEROMETER,
        MAGNETOMETER,
        RESERVED,
        GYROSCOPE
    }

    /* loaded from: classes.dex */
    public enum e {
        UNKNOWN("uk"),
        ACCELEROMETER("am"),
        MAGNETOMETER("mm"),
        RESERVED("rs"),
        GYROSCOPE("gs");
        
        public String AFKeystoreWrapper;

        e(String str) {
            this.AFKeystoreWrapper = str;
        }
    }

    private static List<BigDecimal> AFInAppEventParameterName(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Float f10 = (Float) arrayList.get(1);
        Float f11 = (Float) arrayList.get(2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(0)).toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(f10.toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(f11.toString())));
        return arrayList2;
    }

    public final Map AFKeystoreWrapper(List<Map<String, Object>> list) {
        a aVar;
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        for (Map<String, Object> map : list) {
            HashMap hashMap2 = new HashMap();
            boolean z10 = map.get("sVS") != null;
            a aVar2 = (z10 && (map.get("sVE") != null)) ? a.ALL : z10 ? a.FIRST : a.NONE;
            if (aVar2 == a.NONE) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("er", "na");
                return hashMap3;
            }
            Integer num = (Integer) map.get("sT");
            String str = (String) map.get("sN");
            if (str != null) {
                hashMap2.put("n", str);
            } else {
                hashMap2.put("n", "uk");
            }
            b bVar = b.values()[num.intValue()];
            ArrayList arrayList2 = new ArrayList(AFInAppEventParameterName(map.get("sVS")));
            if (aVar2 == a.ALL) {
                arrayList2.addAll(AFInAppEventParameterName(map.get("sVE")));
            }
            if (bVar == b.MAGNETOMETER) {
                ArrayList arrayList3 = new ArrayList();
                aVar = aVar2;
                BigDecimal valueOf = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(1)).doubleValue(), ((BigDecimal) arrayList2.get(0)).doubleValue()) * 57.29577951308232d);
                DecimalFormat decimalFormat = new DecimalFormat("##.#");
                decimalFormat.setRoundingMode(RoundingMode.DOWN);
                arrayList3.add(Double.valueOf(Double.parseDouble(decimalFormat.format(valueOf))));
                DecimalFormat decimalFormat2 = new DecimalFormat("##.#");
                decimalFormat2.setRoundingMode(RoundingMode.DOWN);
                arrayList3.add(Double.valueOf(Double.parseDouble(decimalFormat2.format((BigDecimal) arrayList2.get(2)))));
                ArrayList arrayList4 = new ArrayList();
                if (arrayList2.size() > 5) {
                    BigDecimal subtract = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(4)).doubleValue(), ((BigDecimal) arrayList2.get(3)).doubleValue()) * 57.29577951308232d).subtract(valueOf);
                    DecimalFormat decimalFormat3 = new DecimalFormat("##.#");
                    decimalFormat3.setRoundingMode(RoundingMode.DOWN);
                    arrayList4.add(Double.valueOf(Double.parseDouble(decimalFormat3.format(subtract))));
                    BigDecimal subtract2 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                    DecimalFormat decimalFormat4 = new DecimalFormat("##.#");
                    decimalFormat4.setRoundingMode(RoundingMode.DOWN);
                    arrayList4.add(Double.valueOf(Double.parseDouble(decimalFormat4.format(subtract2))));
                }
                arrayList = new ArrayList();
                arrayList.add(arrayList3);
                arrayList.add(arrayList4);
            } else {
                aVar = aVar2;
                ArrayList arrayList5 = new ArrayList();
                if (arrayList2.size() > 5) {
                    BigDecimal subtract3 = ((BigDecimal) arrayList2.get(3)).subtract((BigDecimal) arrayList2.get(0));
                    DecimalFormat decimalFormat5 = new DecimalFormat("##.#");
                    decimalFormat5.setRoundingMode(RoundingMode.DOWN);
                    arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat5.format(subtract3))));
                    BigDecimal subtract4 = ((BigDecimal) arrayList2.get(4)).subtract((BigDecimal) arrayList2.get(1));
                    DecimalFormat decimalFormat6 = new DecimalFormat("##.#");
                    decimalFormat6.setRoundingMode(RoundingMode.DOWN);
                    arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat6.format(subtract4))));
                    BigDecimal subtract5 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                    DecimalFormat decimalFormat7 = new DecimalFormat("##.#");
                    decimalFormat7.setRoundingMode(RoundingMode.DOWN);
                    arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat7.format(subtract5))));
                }
                ArrayList arrayList6 = new ArrayList();
                DecimalFormat decimalFormat8 = new DecimalFormat("##.#");
                decimalFormat8.setRoundingMode(RoundingMode.DOWN);
                arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat8.format((BigDecimal) arrayList2.get(0)))));
                DecimalFormat decimalFormat9 = new DecimalFormat("##.#");
                decimalFormat9.setRoundingMode(RoundingMode.DOWN);
                arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat9.format((BigDecimal) arrayList2.get(1)))));
                DecimalFormat decimalFormat10 = new DecimalFormat("##.#");
                decimalFormat10.setRoundingMode(RoundingMode.DOWN);
                arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat10.format((BigDecimal) arrayList2.get(2)))));
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(arrayList6);
                arrayList7.add(arrayList5);
                arrayList = arrayList7;
            }
            hashMap2.put("v", arrayList);
            hashMap.put(e.values()[num.intValue()].AFKeystoreWrapper, hashMap2);
            if (aVar == a.FIRST) {
                hashMap.put("er", "no_svs");
            }
        }
        return hashMap;
    }
}
