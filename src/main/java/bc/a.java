package bc;

import i6.d;
import i6.e;
import s6.p;
import xb.a0;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    public static final yb.a f3637b = new yb.a();

    /* renamed from: c  reason: collision with root package name */
    public static final String f3638c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e  reason: collision with root package name */
    public static final d<a0, byte[]> f3639e = p.f14881z;

    /* renamed from: a  reason: collision with root package name */
    public final e<a0> f3640a;

    public a(e<a0> eVar, d<a0, byte[]> dVar) {
        this.f3640a = eVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }
}
