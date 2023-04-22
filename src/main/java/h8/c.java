package h8;

import com.appsflyer.oaid.BuildConfig;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: f  reason: collision with root package name */
    public int f10233f;

    /* renamed from: h  reason: collision with root package name */
    public int f10235h;

    /* renamed from: o  reason: collision with root package name */
    public float f10241o;

    /* renamed from: a  reason: collision with root package name */
    public String f10229a = BuildConfig.FLAVOR;

    /* renamed from: b  reason: collision with root package name */
    public String f10230b = BuildConfig.FLAVOR;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f10231c = Collections.emptySet();
    public String d = BuildConfig.FLAVOR;

    /* renamed from: e  reason: collision with root package name */
    public String f10232e = null;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10234g = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10236i = false;

    /* renamed from: j  reason: collision with root package name */
    public int f10237j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f10238k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f10239l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f10240m = -1;
    public int n = -1;

    /* renamed from: p  reason: collision with root package name */
    public int f10242p = -1;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10243q = false;

    public static int b(int i10, String str, String str2, int i11) {
        if (!str.isEmpty()) {
            if (i10 != -1) {
                return str.equals(str2) ? i10 + i11 : -1;
            }
        }
        return i10;
    }

    public int a() {
        int i10 = this.f10239l;
        if (i10 == -1 && this.f10240m == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f10240m == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }
}
