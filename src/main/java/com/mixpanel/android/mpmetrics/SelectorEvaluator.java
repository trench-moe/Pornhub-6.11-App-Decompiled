package com.mixpanel.android.mpmetrics;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SelectorEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f8197a;

    /* loaded from: classes.dex */
    public enum PropertyType {
        Array,
        Boolean,
        Datetime,
        Null,
        Number,
        Object,
        String,
        Unknown
    }

    public SelectorEvaluator(JSONObject jSONObject) {
        if (!jSONObject.has("operator") || !jSONObject.has("children")) {
            throw new IllegalArgumentException("Missing required keys: operator children");
        }
        this.f8197a = jSONObject;
    }

    public static boolean a(Object obj, Object obj2) {
        if (d(obj) == d(obj2)) {
            int ordinal = d(obj).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return e(obj).equals(e(obj2));
                }
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return true;
                    }
                    if (ordinal == 4) {
                        return f(obj).equals(f(obj2));
                    }
                    if (ordinal != 6) {
                        return false;
                    }
                }
            }
            return obj.equals(obj2);
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.Object b(org.json.JSONObject r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.SelectorEvaluator.b(org.json.JSONObject, org.json.JSONObject):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:315:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x07ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object c(org.json.JSONObject r17, org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 2480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.SelectorEvaluator.c(org.json.JSONObject, org.json.JSONObject):java.lang.Object");
    }

    public static PropertyType d(Object obj) {
        if (obj != null && !obj.equals(JSONObject.NULL)) {
            if (obj instanceof String) {
                return PropertyType.String;
            }
            if (obj instanceof JSONArray) {
                return PropertyType.Array;
            }
            if (obj instanceof JSONObject) {
                return PropertyType.Object;
            }
            if (!(obj instanceof Double) && !(obj instanceof Integer) && !(obj instanceof Number)) {
                return obj instanceof Boolean ? PropertyType.Boolean : obj instanceof Date ? PropertyType.Datetime : PropertyType.Unknown;
            }
            return PropertyType.Number;
        }
        return PropertyType.Null;
    }

    public static Boolean e(Object obj) {
        switch (d(obj).ordinal()) {
            case 0:
                return Boolean.valueOf(((JSONArray) obj).length() > 0);
            case 1:
                return (Boolean) obj;
            case 2:
                if (((Date) obj).getTime() <= 0) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            case 3:
                return Boolean.FALSE;
            case 4:
                if (f(obj).doubleValue() == 0.0d) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            case 5:
                if (((JSONObject) obj).length() <= 0) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            case 6:
                return Boolean.valueOf(((String) obj).length() > 0);
            default:
                return Boolean.FALSE;
        }
    }

    public static Double f(Object obj) {
        Date date;
        int ordinal = d(obj).ordinal();
        if (ordinal == 1) {
            return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
        }
        Double d = null;
        if (ordinal == 2) {
            if (((Date) obj).getTime() > 0) {
                d = new Double(date.getTime());
            }
            return d;
        }
        if (ordinal != 4) {
            if (ordinal != 6) {
                return null;
            }
        } else if (obj instanceof Double) {
            return (Double) obj;
        } else {
            if (obj instanceof Integer) {
                return Double.valueOf(((Integer) obj).doubleValue());
            }
            if (obj instanceof Number) {
                return Double.valueOf(((Number) obj).doubleValue());
            }
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return Double.valueOf(0.0d);
        }
    }
}
