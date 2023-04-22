package a9;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f249a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    /* renamed from: b  reason: collision with root package name */
    public static final Random f250b = new Random(SystemClock.elapsedRealtime());

    public static JSONObject a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static double b(long j10) {
        return j10 / 1000.0d;
    }

    public static String c(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static long d(double d) {
        return (long) (d * 1000.0d);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static void e(java.lang.String r6) {
        /*
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            r0 = r2
            if (r0 != 0) goto L49
            r3 = 1
            int r2 = r6.length()
            r0 = r2
            r2 = 128(0x80, float:1.8E-43)
            r1 = r2
            if (r0 > r1) goto L3c
            r4 = 3
            java.lang.String r2 = "urn:x-cast:"
            r0 = r2
            boolean r2 = r6.startsWith(r0)
            r0 = r2
            if (r0 == 0) goto L31
            int r2 = r6.length()
            r6 = r2
            r0 = 11
            if (r6 == r0) goto L27
            return
        L27:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix"
            r0 = r2
            r6.<init>(r0)
            r5 = 4
            throw r6
        L31:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r4 = 6
            java.lang.String r2 = "Namespace must begin with the prefix \"urn:x-cast:\""
            r0 = r2
            r6.<init>(r0)
            throw r6
            r4 = 5
        L3c:
            r5 = 7
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r3 = 7
            java.lang.String r0 = "Invalid namespace length"
            r5 = 7
            r6.<init>(r0)
            r5 = 1
            throw r6
            r5 = 3
        L49:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r3 = 1
            java.lang.String r0 = "Namespace cannot be null or empty"
            r5 = 5
            r6.<init>(r0)
            r4 = 7
            throw r6
            r5 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.a.e(java.lang.String):void");
    }

    public static int f(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    public static List<Integer> g(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static <T> boolean h(T t2, T t8) {
        boolean z10 = true;
        if (t2 == null) {
            if (t8 != null) {
            }
            return z10;
        }
        if (t2 == null || t8 == null) {
            z10 = false;
            return z10;
        } else if (t2.equals(t8)) {
            return z10;
        } else {
            return false;
        }
    }

    public static int[] i(Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        int i10 = 0;
        for (Integer num : collection) {
            iArr[i10] = num.intValue();
            i10++;
        }
        return iArr;
    }
}
