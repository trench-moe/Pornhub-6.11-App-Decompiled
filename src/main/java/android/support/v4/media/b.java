package android.support.v4.media;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.data.model.ErrorModel;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.d;
import com.google.android.gms.measurement.internal.zzfr;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.xmlpull.v1.XmlPullParser;
import w6.y;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f382a = new b();

    public static Bundle b(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static Bundle c(String str, String str2, Context context) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        Intrinsics.checkNotNull(context);
        return bundle;
    }

    public static Object d(int[] iArr, int i10, Function1 function1) {
        return function1.invoke(UInt.m104boximpl(UIntArray.m169getpVg5ArA(iArr, i10)));
    }

    public static String e(int i10, String str, int i11) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        sb2.append(i11);
        return sb2.toString();
    }

    public static String f(int i10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String g(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.A());
        return sb2.toString();
    }

    public static String h(String str, long j10) {
        return str + j10;
    }

    public static String i(String str, Uri uri) {
        return str + uri;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(StringBuilder sb2, ErrorModel errorModel, char c10) {
        sb2.append(errorModel);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String l(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String m(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String n(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String o(XmlPullParser xmlPullParser, StringBuilder sb2, String str) {
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder p(String str, SimpleTypeMarker simpleTypeMarker, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(simpleTypeMarker);
        sb2.append(str2);
        return sb2;
    }

    public static ArrayList q(LinkedHashMap linkedHashMap, Object obj) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(obj, arrayList);
        return arrayList;
    }

    public static y.b r(int i10) {
        y.b bVar = new y.b();
        bVar.b(i10);
        return bVar;
    }

    public static void s(zzfr zzfrVar, String str) {
        zzfrVar.zzay().zzj().zza(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.d
    public List a(String str, boolean z10, boolean z11) {
        return MediaCodecUtil.e(str, z10, z11);
    }
}
