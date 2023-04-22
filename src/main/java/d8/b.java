package d8;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f8829a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8830b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8831c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8832e;

    public b(int i10, int i11, int i12, int i13, int i14) {
        this.f8829a = i10;
        this.f8830b = i11;
        this.f8831c = i12;
        this.d = i13;
        this.f8832e = i14;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(String str) {
        char c10;
        k8.a.c(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String v2 = t3.a.v(split[i14].trim());
            Objects.requireNonNull(v2);
            switch (v2.hashCode()) {
                case 100571:
                    if (v2.equals("end")) {
                        c10 = 0;
                        break;
                    } else {
                        c10 = 65535;
                        break;
                    }
                case 3556653:
                    if (v2.equals("text")) {
                        c10 = 1;
                        break;
                    } else {
                        c10 = 65535;
                        break;
                    }
                case 109757538:
                    if (v2.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (v2.equals("style")) {
                        c10 = 3;
                        break;
                    } else {
                        c10 = 65535;
                        break;
                    }
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 == 0) {
                i11 = i14;
            } else if (c10 == 1) {
                i13 = i14;
            } else if (c10 == 2) {
                i10 = i14;
            } else if (c10 == 3) {
                i12 = i14;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new b(i10, i11, i12, i13, split.length);
    }
}
