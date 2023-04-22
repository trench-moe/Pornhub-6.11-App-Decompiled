package a1;

import android.util.Log;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.view.comments.ChildCommentsActivity;
import com.google.android.exoplayer2.ParserException;
import com.google.android.material.snackbar.Snackbar;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import gf.c;
import gf.u;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.collections.ArrayDeque;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import pe.t;

/* loaded from: classes.dex */
public final /* synthetic */ class a {
    public static float a(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) / f12) + f13;
    }

    public static int b(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static int c(ArrayDeque arrayDeque, int i10, ArrayDeque arrayDeque2) {
        return ArrayDeque.access$positiveMod(arrayDeque2, ArrayDeque.access$getHead$p(arrayDeque) + i10);
    }

    public static ParserException d(int i10, String str, int i11, Throwable th) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        sb2.append(i11);
        return ParserException.a(sb2.toString(), th);
    }

    public static f e(k kVar, ParameterizedType parameterizedType, String str, String str2) {
        f d = kVar.d(parameterizedType, SetsKt.emptySet(), str);
        Intrinsics.checkNotNullExpressionValue(d, str2);
        return d;
    }

    public static Object f(c.a aVar, String str, List list, c.a aVar2, u.b bVar, t tVar, Class cls) {
        Objects.requireNonNull(aVar, str);
        list.add(aVar2);
        bVar.c(tVar);
        return bVar.b().b(cls);
    }

    public static Object g(long[] jArr, int i10, Function1 function1) {
        return function1.invoke(ULong.m182boximpl(ULongArray.m247getsVKNKU(jArr, i10)));
    }

    public static String h(int i10, String str, int i11, String str2, int i12) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(i12);
        return sb2.toString();
    }

    public static String i(EditText editText) {
        return editText.getText().toString().trim();
    }

    public static String j(String str, int i10) {
        return str + i10;
    }

    public static String k(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder m(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder n(String str, int i10, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder o(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder p(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static ArrayList q(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }

    public static HashMap r(HashMap hashMap, String str, HashMap hashMap2, String str2, String str3) {
        hashMap.put(str, hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(str2, str3);
        return hashMap3;
    }

    public static Iterator s(Sequence sequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(sequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return sequence.iterator();
    }

    public static void t(ChildCommentsActivity childCommentsActivity, int i10, RecyclerView recyclerView, int i11) {
        Snackbar.l(recyclerView, childCommentsActivity.getString(i10), i11).n();
    }

    public static void u(String str, int i10, String str2) {
        Log.d(str2, str + i10);
    }
}
