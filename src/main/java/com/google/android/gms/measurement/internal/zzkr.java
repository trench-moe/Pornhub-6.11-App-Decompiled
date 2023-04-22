package com.google.android.gms.measurement.internal;

import a0.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.z;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;
import r3.c;
import w9.a3;
import w9.b;
import w9.c3;
import w9.d3;
import w9.e2;
import w9.e3;
import w9.g2;
import w9.h3;
import w9.i3;
import w9.i5;
import w9.j2;
import w9.l2;
import w9.l3;
import w9.m3;
import w9.n3;
import w9.o2;
import w9.p5;
import w9.r5;
import w9.r6;
import w9.s3;
import w9.u3;
import w9.v3;
import w9.w3;

/* loaded from: classes.dex */
public final class zzkr extends zzkf {
    public zzkr(zzkp zzkpVar) {
        super(zzkpVar);
    }

    public static final boolean zzA(zzau zzauVar, zzp zzpVar) {
        Objects.requireNonNull(zzauVar, "null reference");
        Objects.requireNonNull(zzpVar, "null reference");
        return (TextUtils.isEmpty(zzpVar.zzb) && TextUtils.isEmpty(zzpVar.zzq)) ? false : true;
    }

    public static final i3 zzB(e3 e3Var, String str) {
        for (i3 i3Var : e3Var.A()) {
            if (i3Var.y().equals(str)) {
                return i3Var;
            }
        }
        return null;
    }

    public static final Object zzC(e3 e3Var, String str) {
        i3 zzB = zzB(e3Var, str);
        if (zzB != null) {
            if (zzB.P()) {
                return zzB.z();
            }
            if (zzB.N()) {
                return Long.valueOf(zzB.v());
            }
            if (zzB.L()) {
                return Double.valueOf(zzB.s());
            }
            if (zzB.u() > 0) {
                List<i3> A = zzB.A();
                ArrayList arrayList = new ArrayList();
                for (i3 i3Var : A) {
                    if (i3Var != null) {
                        Bundle bundle = new Bundle();
                        for (i3 i3Var2 : i3Var.A()) {
                            if (i3Var2.P()) {
                                bundle.putString(i3Var2.y(), i3Var2.z());
                            } else if (i3Var2.N()) {
                                bundle.putLong(i3Var2.y(), i3Var2.v());
                            } else if (i3Var2.L()) {
                                bundle.putDouble(i3Var2.y(), i3Var2.s());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
        }
        return null;
    }

    private final void zzD(StringBuilder sb2, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (true) {
            while (it.hasNext()) {
                i3 i3Var = (i3) it.next();
                if (i3Var != null) {
                    zzF(sb2, i11);
                    sb2.append("param {\n");
                    zzI(sb2, i11, AppMeasurementSdk.ConditionalUserProperty.NAME, i3Var.O() ? this.zzs.zzj().zze(i3Var.y()) : null);
                    zzI(sb2, i11, "string_value", i3Var.P() ? i3Var.z() : null);
                    zzI(sb2, i11, "int_value", i3Var.N() ? Long.valueOf(i3Var.v()) : null);
                    zzI(sb2, i11, "double_value", i3Var.L() ? Double.valueOf(i3Var.s()) : null);
                    if (i3Var.u() > 0) {
                        zzD(sb2, i11, i3Var.A());
                    }
                    zzF(sb2, i11);
                    sb2.append("}\n");
                }
            }
            return;
        }
    }

    private final void zzE(StringBuilder sb2, int i10, g2 g2Var) {
        String str;
        if (g2Var == null) {
            return;
        }
        zzF(sb2, i10);
        sb2.append("filter {\n");
        if (g2Var.z()) {
            zzI(sb2, i10, "complement", Boolean.valueOf(g2Var.y()));
        }
        if (g2Var.B()) {
            zzI(sb2, i10, "param_name", this.zzs.zzj().zze(g2Var.w()));
        }
        if (g2Var.C()) {
            int i11 = i10 + 1;
            o2 v2 = g2Var.v();
            if (v2 != null) {
                zzF(sb2, i11);
                sb2.append("string_filter {\n");
                if (v2.A()) {
                    switch (v2.B()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzI(sb2, i11, "match_type", str);
                }
                if (v2.z()) {
                    zzI(sb2, i11, "expression", v2.v());
                }
                if (v2.y()) {
                    zzI(sb2, i11, "case_sensitive", Boolean.valueOf(v2.x()));
                }
                if (v2.s() > 0) {
                    zzF(sb2, i11 + 1);
                    sb2.append("expression_list {\n");
                    for (String str2 : v2.w()) {
                        zzF(sb2, i11 + 2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                zzF(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (g2Var.A()) {
            zzJ(sb2, i10 + 1, "number_filter", g2Var.u());
        }
        zzF(sb2, i10);
        sb2.append("}\n");
    }

    private static final void zzF(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private static final String zzG(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final void zzH(StringBuilder sb2, int i10, String str, s3 s3Var) {
        if (s3Var == null) {
            return;
        }
        zzF(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (s3Var.t() != 0) {
            zzF(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : s3Var.C()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (s3Var.v() != 0) {
            zzF(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : s3Var.E()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (s3Var.s() != 0) {
            zzF(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (c3 c3Var : s3Var.B()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c3Var.z() ? Integer.valueOf(c3Var.s()) : null);
                sb2.append(":");
                sb2.append(c3Var.y() ? Long.valueOf(c3Var.t()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (s3Var.u() != 0) {
            zzF(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (u3 u3Var : s3Var.D()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(u3Var.A() ? Integer.valueOf(u3Var.t()) : null);
                sb2.append(": [");
                int i19 = 0;
                for (Long l12 : u3Var.x()) {
                    long longValue = l12.longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        zzF(sb2, 3);
        sb2.append("}\n");
    }

    private static final void zzI(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzF(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private static final void zzJ(StringBuilder sb2, int i10, String str, j2 j2Var) {
        if (j2Var == null) {
            return;
        }
        zzF(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (j2Var.y()) {
            int D = j2Var.D();
            zzI(sb2, i10, "comparison_type", D != 1 ? D != 2 ? D != 3 ? D != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (j2Var.A()) {
            zzI(sb2, i10, "match_as_float", Boolean.valueOf(j2Var.x()));
        }
        if (j2Var.z()) {
            zzI(sb2, i10, "comparison_value", j2Var.u());
        }
        if (j2Var.C()) {
            zzI(sb2, i10, "min_comparison_value", j2Var.w());
        }
        if (j2Var.B()) {
            zzI(sb2, i10, "max_comparison_value", j2Var.v());
        }
        zzF(sb2, i10);
        sb2.append("}\n");
    }

    public static int zza(m3 m3Var, String str) {
        for (int i10 = 0; i10 < ((n3) m3Var.f17295f).m1(); i10++) {
            if (str.equals(((n3) m3Var.f17295f).B1(i10).x())) {
                return i10;
            }
        }
        return -1;
    }

    public static r6 zzl(r6 r6Var, byte[] bArr) {
        i5 i5Var = i5.f17193c;
        if (i5Var == null) {
            synchronized (i5.class) {
                i5Var = i5.f17193c;
                if (i5Var == null) {
                    i5Var = p5.b(i5.class);
                    i5.f17193c = i5Var;
                }
            }
        }
        if (i5Var != null) {
            r5 r5Var = (r5) r6Var;
            Objects.requireNonNull(r5Var);
            r5Var.k(bArr, 0, bArr.length, i5Var);
            return r5Var;
        }
        r5 r5Var2 = (r5) r6Var;
        Objects.requireNonNull(r5Var2);
        r5Var2.k(bArr, 0, bArr.length, i5.a());
        return r5Var2;
    }

    public static List zzr(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static boolean zzv(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean zzx(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void zzz(d3 d3Var, String str, Object obj) {
        List z10 = d3Var.z();
        int i10 = 0;
        while (true) {
            if (i10 >= z10.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((i3) z10.get(i10)).y())) {
                break;
            } else {
                i10++;
            }
        }
        h3 w10 = i3.w();
        w10.p(str);
        if (obj instanceof Long) {
            w10.o(((Long) obj).longValue());
        }
        if (i10 < 0) {
            d3Var.r(w10);
            return;
        }
        if (d3Var.f17296j) {
            d3Var.g();
            d3Var.f17296j = false;
        }
        e3.B((e3) d3Var.f17295f, i10, (i3) w10.l());
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final boolean zzb() {
        return false;
    }

    public final long zzd(byte[] bArr) {
        Objects.requireNonNull(bArr, "null reference");
        this.zzs.zzv().zzg();
        MessageDigest zzE = zzkw.zzE();
        if (zzE == null) {
            a.t(this.zzs, "Failed to get MD5");
            return 0L;
        }
        return zzkw.zzp(zzE.digest(bArr));
    }

    public final Bundle zzf(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        while (true) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj == null) {
                    bundle.putString(str, null);
                } else if (obj instanceof Long) {
                    bundle.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(str, ((Double) obj).doubleValue());
                } else if (!(obj instanceof ArrayList)) {
                    bundle.putString(str, obj.toString());
                } else if (z10) {
                    z.f7033f.zza().zza();
                    if (this.zzs.zzf().zzs(null, zzdu.zzam)) {
                        ArrayList arrayList = (ArrayList) obj;
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            arrayList2.add(zzf((Map) arrayList.get(i10), false));
                        }
                        bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                    } else {
                        ArrayList arrayList3 = (ArrayList) obj;
                        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                        int size2 = arrayList3.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            arrayList4.add(zzf((Map) arrayList3.get(i11), false));
                        }
                        bundle.putParcelableArrayList(str, arrayList4);
                    }
                }
            }
            return bundle;
        }
    }

    public final Parcelable zzh(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                return (Parcelable) creator.createFromParcel(obtain);
            } catch (SafeParcelReader.ParseException unused) {
                this.zzs.zzay().zzd().zza("Failed to load parcelable from buffer");
                obtain.recycle();
                return null;
            }
        } finally {
            obtain.recycle();
        }
    }

    public final zzau zzi(b bVar) {
        Object obj;
        Bundle zzf = zzf(bVar.f17074c, true);
        String obj2 = (!zzf.containsKey("_o") || (obj = zzf.get("_o")) == null) ? "app" : obj.toString();
        String zzb = zzgo.zzb(bVar.f17072a);
        if (zzb == null) {
            zzb = bVar.f17072a;
        }
        return new zzau(zzb, new zzas(zzf), obj2, bVar.f17073b);
    }

    public final e3 zzj(zzap zzapVar) {
        d3 w10 = e3.w();
        long j10 = zzapVar.zze;
        if (w10.f17296j) {
            w10.g();
            w10.f17296j = false;
        }
        e3.I((e3) w10.f17295f, j10);
        zzar zzarVar = new zzar(zzapVar.zzf);
        while (zzarVar.hasNext()) {
            String next = zzarVar.next();
            h3 w11 = i3.w();
            w11.p(next);
            Object zzf = zzapVar.zzf.zzf(next);
            Objects.requireNonNull(zzf, "null reference");
            zzt(w11, zzf);
            w10.r(w11);
        }
        return (e3) w10.l();
    }

    public final String zzm(l3 l3Var) {
        if (l3Var == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder m10 = a1.a.m("\nbatch {\n");
        while (true) {
            for (n3 n3Var : l3Var.v()) {
                if (n3Var != null) {
                    zzF(m10, 1);
                    m10.append("bundle {\n");
                    if (n3Var.b1()) {
                        zzI(m10, 1, "protocol_version", Integer.valueOf(n3Var.j1()));
                    }
                    zzI(m10, 1, "platform", n3Var.B());
                    if (n3Var.X0()) {
                        zzI(m10, 1, "gmp_version", Long.valueOf(n3Var.s1()));
                    }
                    if (n3Var.h1()) {
                        zzI(m10, 1, "uploading_gmp_version", Long.valueOf(n3Var.x1()));
                    }
                    if (n3Var.s0()) {
                        zzI(m10, 1, "dynamite_version", Long.valueOf(n3Var.q1()));
                    }
                    if (n3Var.p0()) {
                        zzI(m10, 1, "config_version", Long.valueOf(n3Var.o1()));
                    }
                    zzI(m10, 1, "gmp_app_id", n3Var.y());
                    zzI(m10, 1, "admob_app_id", n3Var.C1());
                    zzI(m10, 1, "app_id", n3Var.D1());
                    zzI(m10, 1, "app_version", n3Var.t());
                    if (n3Var.n0()) {
                        zzI(m10, 1, "app_version_major", Integer.valueOf(n3Var.S()));
                    }
                    zzI(m10, 1, "firebase_instance_id", n3Var.x());
                    if (n3Var.r0()) {
                        zzI(m10, 1, "dev_cert_hash", Long.valueOf(n3Var.p1()));
                    }
                    zzI(m10, 1, "app_store", n3Var.s());
                    if (n3Var.g1()) {
                        zzI(m10, 1, "upload_timestamp_millis", Long.valueOf(n3Var.w1()));
                    }
                    if (n3Var.e1()) {
                        zzI(m10, 1, "start_timestamp_millis", Long.valueOf(n3Var.v1()));
                    }
                    if (n3Var.W0()) {
                        zzI(m10, 1, "end_timestamp_millis", Long.valueOf(n3Var.r1()));
                    }
                    if (n3Var.a1()) {
                        zzI(m10, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(n3Var.u1()));
                    }
                    if (n3Var.Z0()) {
                        zzI(m10, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(n3Var.t1()));
                    }
                    zzI(m10, 1, "app_instance_id", n3Var.E1());
                    zzI(m10, 1, "resettable_device_id", n3Var.C());
                    zzI(m10, 1, "ds_id", n3Var.w());
                    if (n3Var.Y0()) {
                        zzI(m10, 1, "limited_ad_tracking", Boolean.valueOf(n3Var.k0()));
                    }
                    zzI(m10, 1, "os_version", n3Var.A());
                    zzI(m10, 1, "device_model", n3Var.v());
                    zzI(m10, 1, "user_default_language", n3Var.D());
                    if (n3Var.f1()) {
                        zzI(m10, 1, "time_zone_offset_minutes", Integer.valueOf(n3Var.l1()));
                    }
                    if (n3Var.o0()) {
                        zzI(m10, 1, "bundle_sequential_index", Integer.valueOf(n3Var.T0()));
                    }
                    if (n3Var.d1()) {
                        zzI(m10, 1, "service_upload", Boolean.valueOf(n3Var.l0()));
                    }
                    zzI(m10, 1, "health_monitor", n3Var.z());
                    if (!this.zzs.zzf().zzs(null, zzdu.zzah) && n3Var.m0() && n3Var.n1() != 0) {
                        zzI(m10, 1, "android_id", Long.valueOf(n3Var.n1()));
                    }
                    if (n3Var.c1()) {
                        zzI(m10, 1, "retry_counter", Integer.valueOf(n3Var.k1()));
                    }
                    if (n3Var.q0()) {
                        zzI(m10, 1, "consent_signals", n3Var.u());
                    }
                    List<w3> G = n3Var.G();
                    if (G != null) {
                        while (true) {
                            for (w3 w3Var : G) {
                                if (w3Var != null) {
                                    zzF(m10, 2);
                                    m10.append("user_property {\n");
                                    zzI(m10, 2, "set_timestamp_millis", w3Var.J() ? Long.valueOf(w3Var.u()) : null);
                                    zzI(m10, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzs.zzj().zzf(w3Var.x()));
                                    zzI(m10, 2, "string_value", w3Var.y());
                                    zzI(m10, 2, "int_value", w3Var.I() ? Long.valueOf(w3Var.t()) : null);
                                    zzI(m10, 2, "double_value", w3Var.H() ? Double.valueOf(w3Var.s()) : null);
                                    zzF(m10, 2);
                                    m10.append("}\n");
                                }
                            }
                        }
                    }
                    List<a3> E = n3Var.E();
                    if (E != null) {
                        for (a3 a3Var : E) {
                            if (a3Var != null) {
                                zzF(m10, 2);
                                m10.append("audience_membership {\n");
                                if (a3Var.C()) {
                                    zzI(m10, 2, "audience_id", Integer.valueOf(a3Var.s()));
                                }
                                if (a3Var.D()) {
                                    zzI(m10, 2, "new_audience", Boolean.valueOf(a3Var.B()));
                                }
                                zzH(m10, 2, "current_data", a3Var.v());
                                if (a3Var.E()) {
                                    zzH(m10, 2, "previous_data", a3Var.w());
                                }
                                zzF(m10, 2);
                                m10.append("}\n");
                            }
                        }
                    }
                    List<e3> F = n3Var.F();
                    if (F != null) {
                        while (true) {
                            for (e3 e3Var : F) {
                                if (e3Var != null) {
                                    zzF(m10, 2);
                                    m10.append("event {\n");
                                    zzI(m10, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzs.zzj().zzd(e3Var.z()));
                                    if (e3Var.L()) {
                                        zzI(m10, 2, "timestamp_millis", Long.valueOf(e3Var.v()));
                                    }
                                    if (e3Var.K()) {
                                        zzI(m10, 2, "previous_timestamp_millis", Long.valueOf(e3Var.u()));
                                    }
                                    if (e3Var.J()) {
                                        zzI(m10, 2, "count", Integer.valueOf(e3Var.s()));
                                    }
                                    if (e3Var.t() != 0) {
                                        zzD(m10, 2, e3Var.A());
                                    }
                                    zzF(m10, 2);
                                    m10.append("}\n");
                                }
                            }
                        }
                    }
                    zzF(m10, 1);
                    m10.append("}\n");
                }
            }
            m10.append("}\n");
            return m10.toString();
        }
    }

    public final String zzo(e2 e2Var) {
        if (e2Var == null) {
            return "null";
        }
        StringBuilder m10 = a1.a.m("\nevent_filter {\n");
        if (e2Var.G()) {
            zzI(m10, 0, "filter_id", Integer.valueOf(e2Var.t()));
        }
        zzI(m10, 0, "event_name", this.zzs.zzj().zzd(e2Var.y()));
        String zzG = zzG(e2Var.C(), e2Var.D(), e2Var.E());
        if (!zzG.isEmpty()) {
            zzI(m10, 0, "filter_type", zzG);
        }
        if (e2Var.F()) {
            zzJ(m10, 1, "event_count_filter", e2Var.x());
        }
        if (e2Var.s() > 0) {
            m10.append("  filters {\n");
            for (g2 g2Var : e2Var.z()) {
                zzE(m10, 2, g2Var);
            }
        }
        zzF(m10, 1);
        m10.append("}\n}\n");
        return m10.toString();
    }

    public final String zzp(l2 l2Var) {
        if (l2Var == null) {
            return "null";
        }
        StringBuilder m10 = a1.a.m("\nproperty_filter {\n");
        if (l2Var.B()) {
            zzI(m10, 0, "filter_id", Integer.valueOf(l2Var.s()));
        }
        zzI(m10, 0, "property_name", this.zzs.zzj().zzf(l2Var.w()));
        String zzG = zzG(l2Var.y(), l2Var.z(), l2Var.A());
        if (!zzG.isEmpty()) {
            zzI(m10, 0, "filter_type", zzG);
        }
        zzE(m10, 1, l2Var.t());
        m10.append("}\n");
        return m10.toString();
    }

    public final List zzq(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzs.zzay().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzs.zzay().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
        if ((r3 instanceof android.os.Parcelable[]) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r5 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r7 >= r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
        r4.add(zzs((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
        r3 = (java.util.ArrayList) r3;
        r12 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
        if (r7 >= r12) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
        r4.add(zzs((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00be, code lost:
        r4.add(zzs((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c8, code lost:
        r0.put(r2, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map zzs(android.os.Bundle r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkr.zzs(android.os.Bundle, boolean):java.util.Map");
    }

    public final void zzt(h3 h3Var, Object obj) {
        Bundle[] bundleArr;
        Objects.requireNonNull(obj, "null reference");
        if (h3Var.f17296j) {
            h3Var.g();
            h3Var.f17296j = false;
        }
        i3.D((i3) h3Var.f17295f);
        if (h3Var.f17296j) {
            h3Var.g();
            h3Var.f17296j = false;
        }
        i3.F((i3) h3Var.f17295f);
        if (h3Var.f17296j) {
            h3Var.g();
            h3Var.f17296j = false;
        }
        i3.H((i3) h3Var.f17295f);
        if (h3Var.f17296j) {
            h3Var.g();
            h3Var.f17296j = false;
        }
        i3.K((i3) h3Var.f17295f);
        if (obj instanceof String) {
            h3Var.q((String) obj);
        } else if (obj instanceof Long) {
            h3Var.o(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (h3Var.f17296j) {
                h3Var.g();
                h3Var.f17296j = false;
            }
            i3.G((i3) h3Var.f17295f, doubleValue);
        } else if (!(obj instanceof Bundle[])) {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) event param value", obj);
        } else {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    h3 w10 = i3.w();
                    while (true) {
                        for (String str : bundle.keySet()) {
                            h3 w11 = i3.w();
                            w11.p(str);
                            Object obj2 = bundle.get(str);
                            if (obj2 instanceof Long) {
                                w11.o(((Long) obj2).longValue());
                            } else if (obj2 instanceof String) {
                                w11.q((String) obj2);
                            } else if (obj2 instanceof Double) {
                                double doubleValue2 = ((Double) obj2).doubleValue();
                                if (w11.f17296j) {
                                    w11.g();
                                    w11.f17296j = false;
                                }
                                i3.G((i3) w11.f17295f, doubleValue2);
                            }
                            if (w10.f17296j) {
                                w10.g();
                                w10.f17296j = false;
                            }
                            i3.I((i3) w10.f17295f, (i3) w11.l());
                        }
                    }
                    if (((i3) w10.f17295f).u() > 0) {
                        arrayList.add((i3) w10.l());
                    }
                }
            }
            if (h3Var.f17296j) {
                h3Var.g();
                h3Var.f17296j = false;
            }
            i3.J((i3) h3Var.f17295f, arrayList);
        }
    }

    public final void zzu(v3 v3Var, Object obj) {
        Objects.requireNonNull(obj, "null reference");
        if (v3Var.f17296j) {
            v3Var.g();
            v3Var.f17296j = false;
        }
        w3.C((w3) v3Var.f17295f);
        if (v3Var.f17296j) {
            v3Var.g();
            v3Var.f17296j = false;
        }
        w3.E((w3) v3Var.f17295f);
        if (v3Var.f17296j) {
            v3Var.g();
            v3Var.f17296j = false;
        }
        w3.G((w3) v3Var.f17295f);
        if (obj instanceof String) {
            String str = (String) obj;
            if (v3Var.f17296j) {
                v3Var.g();
                v3Var.f17296j = false;
            }
            w3.B((w3) v3Var.f17295f, str);
        } else if (obj instanceof Long) {
            v3Var.o(((Long) obj).longValue());
        } else if (!(obj instanceof Double)) {
            this.zzs.zzay().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        } else {
            double doubleValue = ((Double) obj).doubleValue();
            if (v3Var.f17296j) {
                v3Var.g();
                v3Var.f17296j = false;
            }
            w3.F((w3) v3Var.f17295f, doubleValue);
        }
    }

    public final boolean zzw(long j10, long j11) {
        if (j10 != 0 && j11 > 0) {
            Objects.requireNonNull((c) this.zzs.zzav());
            if (Math.abs(System.currentTimeMillis() - j10) <= j11) {
                return false;
            }
        }
        return true;
    }

    public final byte[] zzy(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.zzs.zzay().zzd().zzb("Failed to gzip content", e10);
            throw e10;
        }
    }
}
