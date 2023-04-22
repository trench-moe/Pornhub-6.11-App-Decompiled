package android.support.v4.media;

import android.media.UnsupportedSchemeException;
import android.util.Log;
import com.app.pornhub.domain.config.UsersConfig;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.g;
import com.google.android.exoplayer2.drm.h;
import com.google.android.gms.measurement.internal.zzfr;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import f3.o;
import j7.j;
import java.lang.reflect.Type;
import java.util.List;
import java.util.UUID;
import jb.c;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements g.c, c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f380a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ a f381b = new a();

    public static int b(List list, int i10, int i11) {
        return (list.hashCode() + i10) * i11;
    }

    public static int c(IntRange intRange, int i10) {
        return intRange.getEndInclusive().intValue() + i10;
    }

    public static f d(k kVar, Class cls, String str, String str2) {
        f d = kVar.d(cls, SetsKt.emptySet(), str);
        Intrinsics.checkNotNullExpressionValue(d, str2);
        return d;
    }

    public static Object e(CharSequence charSequence, int i10, Function1 function1) {
        return function1.invoke(Character.valueOf(charSequence.charAt(i10)));
    }

    public static Object f(byte[] bArr, int i10, Function1 function1) {
        return function1.invoke(UByte.m28boximpl(UByteArray.m91getw2LRezQ(bArr, i10)));
    }

    public static String g(Class cls, StringBuilder sb2, String str, String str2) {
        sb2.append(cls.getSimpleName());
        sb2.append(str);
        sb2.append(cls.getSimpleName());
        sb2.append(str2);
        return sb2.toString();
    }

    public static String h(String str, Type type) {
        return str + type;
    }

    public static String i(StringBuilder sb2, int i10, char c10) {
        sb2.append(i10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String j(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String k(StringBuilder sb2, List list, char c10) {
        sb2.append(list);
        sb2.append(c10);
        return sb2.toString();
    }

    public static StringBuilder l(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static void m(zzfr zzfrVar, String str) {
        zzfrVar.zzay().zzk().zza(str);
    }

    public static /* synthetic */ void n(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void o(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static boolean p(o oVar, UsersConfig.Companion companion) {
        return companion.isGay(oVar.a().getOrientation());
    }

    public static boolean q(Flags.BooleanFlagField booleanFlagField, int i10, String str) {
        Boolean bool = booleanFlagField.get(i10);
        Intrinsics.checkNotNullExpressionValue(bool, str);
        return bool.booleanValue();
    }

    @Override // com.google.android.exoplayer2.drm.g.c
    public g a(UUID uuid) {
        int i10 = h.d;
        try {
            try {
                return new h(uuid);
            } catch (UnsupportedSchemeException e10) {
                throw new UnsupportedDrmException(1, e10);
            } catch (Exception e11) {
                throw new UnsupportedDrmException(2, e11);
            }
        } catch (UnsupportedDrmException unused) {
            String valueOf = String.valueOf(uuid);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 53);
            sb2.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb2.append(valueOf);
            sb2.append(".");
            Log.e("FrameworkMediaDrm", sb2.toString());
            return new e();
        }
    }

    @Override // jb.c
    public Object apply(Object obj) {
        j jVar = (j) obj;
        int i10 = j7.g.y;
        return jVar;
    }
}
