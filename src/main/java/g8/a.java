package g8;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.List;
import k8.c0;
import k8.t;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;
import y7.d;

/* loaded from: classes2.dex */
public final class a extends y7.b {
    public final t n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f9874o;

    /* renamed from: p  reason: collision with root package name */
    public final int f9875p;

    /* renamed from: q  reason: collision with root package name */
    public final int f9876q;

    /* renamed from: r  reason: collision with root package name */
    public final String f9877r;

    /* renamed from: s  reason: collision with root package name */
    public final float f9878s;

    /* renamed from: t  reason: collision with root package name */
    public final int f9879t;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.n = new t();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f9875p = 0;
            this.f9876q = -1;
            this.f9877r = "sans-serif";
            this.f9874o = false;
            this.f9878s = 0.85f;
            this.f9879t = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f9875p = bArr[24];
        this.f9876q = ((bArr[26] & UByte.MAX_VALUE) << 24) | ((bArr[27] & UByte.MAX_VALUE) << 16) | ((bArr[28] & UByte.MAX_VALUE) << 8) | (bArr[29] & UByte.MAX_VALUE);
        this.f9877r = "Serif".equals(c0.m(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f9879t = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f9874o = z10;
        if (z10) {
            this.f9878s = c0.g(((bArr[11] & UByte.MAX_VALUE) | ((bArr[10] & UByte.MAX_VALUE) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f9878s = 0.85f;
        }
    }

    public static void l(boolean z10) {
        if (!z10) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    public static void m(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = true;
            boolean z11 = (i10 & 1) != 0;
            boolean z12 = (i10 & 2) != 0;
            if (z11) {
                if (z12) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z12) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z10 = false;
            }
            if (z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (!z10 && !z11 && !z12) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    @Override // y7.b
    public d k(byte[] bArr, int i10, boolean z10) {
        String q10;
        int i11;
        t tVar = this.n;
        tVar.f12009a = bArr;
        tVar.f12011c = i10;
        tVar.f12010b = 0;
        int i12 = 2;
        int i13 = 1;
        l(tVar.a() >= 2);
        int x10 = tVar.x();
        if (x10 == 0) {
            q10 = BuildConfig.FLAVOR;
        } else {
            if (tVar.a() >= 2) {
                byte[] bArr2 = tVar.f12009a;
                int i14 = tVar.f12010b;
                char c10 = (char) ((bArr2[i14 + 1] & UByte.MAX_VALUE) | ((bArr2[i14] & UByte.MAX_VALUE) << 8));
                if (c10 == 65279 || c10 == 65534) {
                    q10 = tVar.q(x10, jb.b.f11661e);
                }
            }
            q10 = tVar.q(x10, jb.b.f11660c);
        }
        if (q10.isEmpty()) {
            return b.f9880f;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(q10);
        m(spannableStringBuilder, this.f9875p, 0, 0, spannableStringBuilder.length(), 16711680);
        int i15 = this.f9876q;
        int length = spannableStringBuilder.length();
        if (i15 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i15 >>> 8) | ((i15 & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), 0, length, 16711713);
        }
        String str = this.f9877r;
        int length2 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float f10 = this.f9878s;
        for (int i16 = 8; this.n.a() >= i16; i16 = 8) {
            t tVar2 = this.n;
            int i17 = tVar2.f12010b;
            int f11 = tVar2.f();
            int f12 = this.n.f();
            if (f12 == 1937013100) {
                l(this.n.a() >= i12);
                int x11 = this.n.x();
                int i18 = 0;
                while (i18 < x11) {
                    t tVar3 = this.n;
                    l(tVar3.a() >= 12);
                    int x12 = tVar3.x();
                    int x13 = tVar3.x();
                    tVar3.E(i12);
                    int s10 = tVar3.s();
                    tVar3.E(i13);
                    int f13 = tVar3.f();
                    if (x13 > spannableStringBuilder.length()) {
                        int length3 = spannableStringBuilder.length();
                        StringBuilder sb2 = new StringBuilder(68);
                        sb2.append("Truncating styl end (");
                        sb2.append(x13);
                        sb2.append(") to cueText.length() (");
                        sb2.append(length3);
                        sb2.append(").");
                        Log.w("Tx3gDecoder", sb2.toString());
                        x13 = spannableStringBuilder.length();
                    }
                    int i19 = x13;
                    if (x12 >= i19) {
                        StringBuilder sb3 = new StringBuilder(60);
                        sb3.append("Ignoring styl with start (");
                        sb3.append(x12);
                        sb3.append(") >= end (");
                        sb3.append(i19);
                        sb3.append(").");
                        Log.w("Tx3gDecoder", sb3.toString());
                        i11 = i18;
                    } else {
                        i11 = i18;
                        m(spannableStringBuilder, s10, this.f9875p, x12, i19, 0);
                        if (f13 != this.f9876q) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan((f13 >>> 8) | ((f13 & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), x12, i19, 33);
                        }
                    }
                    i18 = i11 + 1;
                    i12 = 2;
                    i13 = 1;
                }
            } else if (f12 == 1952608120 && this.f9874o) {
                l(this.n.a() >= 2);
                f10 = c0.g(this.n.x() / this.f9879t, 0.0f, 0.95f);
                this.n.D(i17 + f11);
                i12 = 2;
                i13 = 1;
            }
            this.n.D(i17 + f11);
            i12 = 2;
            i13 = 1;
        }
        return new b(new y7.a(spannableStringBuilder, null, null, null, f10, 0, 0, -3.4028235E38f, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, IntCompanionObject.MIN_VALUE, 0.0f, null));
    }
}
