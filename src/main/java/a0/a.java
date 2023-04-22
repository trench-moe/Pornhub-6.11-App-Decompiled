package a0;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.view.comments.CommentsFragment;
import com.google.android.gms.measurement.internal.zzfr;
import com.google.android.material.snackbar.Snackbar;
import gf.c;
import gf.f;
import gf.u;
import io.realm.RealmQuery;
import io.realm.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.UInt;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.t;
import qb.e;
import qb.r;
import sc.d;
import sun.misc.Unsafe;
import x.c;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ a f117c = new a();

    public static float b(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static int c(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static int d(CharSequence charSequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return charSequence.length();
    }

    public static int e(String str, int i10) {
        return String.valueOf(str).length() + i10;
    }

    public static int f(UInt uInt, int i10) {
        return UInt.m110constructorimpl(uInt.m161unboximpl() + i10);
    }

    public static u.b g(c cVar, t tVar, String str, String str2, String str3, f.a aVar, String str4, c.a aVar2, String str5, String str6) {
        Objects.requireNonNull(cVar);
        Intrinsics.checkNotNullParameter(tVar, str);
        Intrinsics.checkNotNullParameter(str2, str3);
        Intrinsics.checkNotNullParameter(aVar, str4);
        Intrinsics.checkNotNullParameter(aVar2, str5);
        u.b bVar = new u.b();
        bVar.a(str6);
        return bVar;
    }

    public static RealmQuery h(p pVar, p pVar2, Class cls) {
        pVar.e();
        return new RealmQuery(pVar2, cls);
    }

    public static Object i(short[] sArr, int i10, Function1 function1) {
        return function1.invoke(UShort.m288boximpl(UShortArray.m351getMh2AYeg(sArr, i10)));
    }

    public static String j(int i10, String str, long j10, String str2) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        sb2.append(j10);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String k(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String l(StringBuilder sb2, boolean z10, char c10) {
        sb2.append(z10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static StringBuilder m(char c10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c10);
        return sb2;
    }

    public static StringBuilder n(int i10, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static Iterator o(Iterable iterable, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(iterable, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return iterable.iterator();
    }

    public static void p(int i10, String str, int i11, String str2) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        sb2.append(i11);
        Log.w(str2, sb2.toString());
    }

    public static void q(int i10, StringBuilder sb2, String str) {
        sb2.append(Integer.toHexString(i10));
        sb2.append(str);
    }

    public static void r(int i10, HashMap hashMap, String str, int i11, String str2, int i12, String str3, int i13, String str4) {
        hashMap.put(str, Integer.valueOf(i10));
        hashMap.put(str2, Integer.valueOf(i11));
        hashMap.put(str3, Integer.valueOf(i12));
        hashMap.put(str4, Integer.valueOf(i13));
    }

    public static void s(CommentsFragment commentsFragment, int i10, RecyclerView recyclerView, int i11) {
        Snackbar.l(recyclerView, commentsFragment.E().getString(i10), i11).n();
    }

    public static void t(zzfr zzfrVar, String str) {
        zzfrVar.zzay().zzd().zza(str);
    }

    public static void u(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, str2);
        Intrinsics.checkNotNullParameter(str3, str4);
        Intrinsics.checkNotNullParameter(str5, str6);
    }

    public static /* synthetic */ boolean v(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }

    @Override // qb.e
    public Object a(qb.c cVar) {
        Set e10 = ((r) cVar).e(d.class);
        sc.c cVar2 = sc.c.f14952j;
        if (cVar2 == null) {
            synchronized (sc.c.class) {
                cVar2 = sc.c.f14952j;
                if (cVar2 == null) {
                    cVar2 = new sc.c(0);
                    sc.c.f14952j = cVar2;
                }
            }
        }
        return new sc.b(e10, cVar2);
    }
}
