package t3;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.app.pornhub.PornhubApplication;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import l2.d0;
import l2.s;
import t9.o1;
import w6.z;

/* loaded from: classes.dex */
public class a implements o1, w7.j {

    /* renamed from: c  reason: collision with root package name */
    public static p8.i f15101c;

    /* renamed from: f  reason: collision with root package name */
    public static final o1 f15102f = new a();

    /* renamed from: j  reason: collision with root package name */
    public static final o1 f15103j = new a();

    /* renamed from: m  reason: collision with root package name */
    public static final o1 f15104m = new a();
    public static final float[] n = new float[0];

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f15105t = {16842948};

    public static void A(Context context, String str) {
        t("system", "event", str);
        if (str.equals("discreeticon_appstart_discreet")) {
            FirebaseAnalytics.getInstance(context).a("app_launch", android.support.v4.media.b.c("launch_type", "discreet", context));
        } else if (str.equals("discreeticon_appstart_normal")) {
            FirebaseAnalytics.getInstance(context).a("app_launch", android.support.v4.media.b.c("launch_type", "normal", context));
        } else {
            FirebaseAnalytics.getInstance(context).a("update", android.support.v4.media.b.c("update_event", str, context));
        }
    }

    public static int B(int i10, int i11, String str) {
        String n02;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            n02 = a0.b.n0("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else if (i11 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.b.e(26, "negative size: ", i11));
        } else {
            n02 = a0.b.n0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(n02);
    }

    public static String C(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        return null;
                    }
                    return "REPEAT_ALL_AND_SHUFFLE";
                }
                return "REPEAT_SINGLE";
            }
            return "REPEAT_ALL";
        }
        return "REPEAT_OFF";
    }

    public static w9.e D(w9.e eVar, h2.h hVar, w9.i iVar, Boolean bool, Boolean bool2) {
        w9.e eVar2 = new w9.e();
        Iterator q10 = eVar.q();
        while (q10.hasNext()) {
            int intValue = ((Integer) q10.next()).intValue();
            if (eVar.w(intValue)) {
                w9.o a10 = iVar.a(hVar, Arrays.asList(eVar.o(intValue), new w9.h(Double.valueOf(intValue)), eVar));
                if (a10.b().equals(bool)) {
                    return eVar2;
                }
                if (bool2 != null && !a10.b().equals(bool2)) {
                }
                eVar2.u(intValue, a10);
            }
        }
        return eVar2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static w9.o E(w9.e r11, h2.h r12, java.util.List r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.a.E(w9.e, h2.h, java.util.List, boolean):w9.o");
    }

    public static void F(int i10, int i11, int i12) {
        String G;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                G = G(i10, i12, "start index");
            } else {
                if (i11 >= 0 && i11 <= i12) {
                    G = a0.b.n0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
                }
                G = G(i11, i12, "end index");
            }
            throw new IndexOutOfBoundsException(G);
        }
    }

    public static String G(int i10, int i11, String str) {
        if (i10 < 0) {
            return a0.b.n0("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return a0.b.n0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(android.support.v4.media.b.e(26, "negative size: ", i11));
    }

    public static void d(Object obj, StringBuilder sb2) {
        int lastIndexOf;
        if (obj == null) {
            sb2.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static float e(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    public static int g(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static float h(float f10, Context context) {
        return (context.getResources().getDisplayMetrics().densityDpi / 160.0f) * f10;
    }

    public static final NavController i(Fragment fragment) {
        NavController K0 = NavHostFragment.K0(fragment);
        Intrinsics.checkExpressionValueIsNotNull(K0, "NavHostFragment.findNavController(this)");
        return K0;
    }

    public static final View j(ViewGroup viewGroup, int i10) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder n10 = a1.a.n("Index: ", i10, ", Size: ");
        n10.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public static final int k(tc.a aVar, int i10) {
        int i11 = aVar.f15411e - aVar.f15409b;
        aVar.i(i10);
        int i12 = 1;
        while (aVar.g() == i10) {
            aVar.i(i10);
            i12++;
        }
        int i13 = aVar.f15411e;
        int i14 = aVar.f15409b;
        if (i11 > i13 - i14) {
            StringBuilder n10 = a1.a.n("Position ", i11, " is beyond current ");
            n10.append(aVar.f15411e - aVar.f15409b);
            throw new IllegalArgumentException(n10.toString());
        } else if (i11 >= 0) {
            aVar.f15411e = i14 + i11;
            return i12;
        } else {
            throw new IllegalArgumentException(a1.a.j("Bad position ", i11));
        }
    }

    public static synchronized p8.i l() {
        p8.i iVar;
        synchronized (a.class) {
            if (f15101c == null) {
                f15101c = PornhubApplication.a();
            }
            iVar = f15101c;
        }
        return iVar;
    }

    public static Integer m(String str) {
        char c10;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1118317585:
                if (str.equals("REPEAT_ALL_AND_SHUFFLE")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -962896020:
                if (str.equals("REPEAT_SINGLE")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1645938909:
                if (str.equals("REPEAT_ALL")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1645952171:
                if (str.equals("REPEAT_OFF")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    return c10 != 3 ? null : 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static List n(JsonReader jsonReader, b2.f fVar, d0 d0Var) {
        return l2.o.a(jsonReader, fVar, 1.0f, d0Var, false);
    }

    public static h2.a o(JsonReader jsonReader, b2.f fVar) {
        return new h2.a(n(jsonReader, fVar, l2.e.f12186c), 0);
    }

    public static h2.b p(JsonReader jsonReader, b2.f fVar) {
        return q(jsonReader, fVar, true);
    }

    public static h2.b q(JsonReader jsonReader, b2.f fVar, boolean z10) {
        return new h2.b(l2.o.a(jsonReader, fVar, z10 ? m2.g.c() : 1.0f, cb.e.A, false));
    }

    public static h2.d r(JsonReader jsonReader, b2.f fVar) {
        return new h2.d(n(jsonReader, fVar, mb.a.f13057t));
    }

    public static h2.e s(JsonReader jsonReader, b2.f fVar) {
        return new h2.e(l2.o.a(jsonReader, fVar, m2.g.c(), s.f12211c, true));
    }

    public static void t(String str, String str2, String str3) {
        p8.i l10 = l();
        p8.d dVar = new p8.d();
        dVar.f13835a.put("&ec", str);
        dVar.f13835a.put("&ea", str2);
        dVar.f13835a.put("&el", str3);
        l10.c(dVar.a());
    }

    public static void u(String str) {
        kf.a.f12078a.a("Track view: %s", str);
        p8.i l10 = l();
        l10.d("&cd", str);
        l10.c(new p8.g().a());
    }

    public static String v(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static String w(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static void x(Context context, String str, String str2) {
        u(str + "/" + str2);
        Bundle bundle = new Bundle();
        bundle.putString("screen_name", str2);
        Intrinsics.checkNotNull(context);
        FirebaseAnalytics.getInstance(context).a("screen", bundle);
    }

    public static void y(String str) {
        t("ui", "click", str);
    }

    public static void z(Context context, String str) {
        String trim = str.trim();
        Locale locale = Locale.US;
        t("system", "search", trim.toLowerCase(locale));
        FirebaseAnalytics.getInstance(context).a(ExploreModel.CATEGORY, android.support.v4.media.b.c("category_selection", str.trim().toLowerCase(locale), context));
    }

    @Override // w7.j
    public int a(z zVar, DecoderInputBuffer decoderInputBuffer, int i10) {
        decoderInputBuffer.f21800c = 4;
        return -4;
    }

    @Override // w7.j
    public void b() {
    }

    @Override // w7.j
    public int c(long j10) {
        return 0;
    }

    @Override // w7.j
    public boolean f() {
        return true;
    }
}
