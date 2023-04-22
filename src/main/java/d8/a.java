package d8;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import d8.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k8.c0;
import k8.t;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class a extends y7.b {

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f8824s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final b f8825o;

    /* renamed from: p  reason: collision with root package name */
    public Map<String, c> f8826p;

    /* renamed from: q  reason: collision with root package name */
    public float f8827q;

    /* renamed from: r  reason: collision with root package name */
    public float f8828r;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.f8827q = -3.4028235E38f;
        this.f8828r = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.n = false;
            this.f8825o = null;
            return;
        }
        this.n = true;
        String l10 = c0.l(list.get(0));
        k8.a.c(l10.startsWith("Format:"));
        b a10 = b.a(l10);
        Objects.requireNonNull(a10);
        this.f8825o = a10;
        n(new t(list.get(1)));
    }

    public static int l(long j10, List<Long> list, List<List<y7.a>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            } else if (list.get(size).longValue() == j10) {
                return size;
            } else {
                if (list.get(size).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }

    public static float m(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return i10 != 2 ? -3.4028235E38f : 0.95f;
            }
            return 0.5f;
        }
        return 0.05f;
    }

    public static long o(String str) {
        Matcher matcher = f8824s.matcher(str.trim());
        if (matcher.matches()) {
            String group = matcher.group(1);
            int i10 = c0.f11939a;
            long parseLong = (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(group) * 60 * 60 * 1000000);
            return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + parseLong;
        }
        return -9223372036854775807L;
    }

    @Override // y7.b
    public y7.d k(byte[] bArr, int i10, boolean z10) {
        t tVar;
        b bVar;
        long j10;
        int i11;
        int i12;
        float f10;
        Layout.Alignment alignment;
        int i13;
        int i14;
        float m10;
        float m11;
        float f11;
        int i15;
        float f12;
        int i16;
        int i17;
        int i18;
        int i19;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        t tVar2 = new t(bArr, i10);
        if (!aVar.n) {
            aVar.n(tVar2);
        }
        b bVar2 = aVar.n ? aVar.f8825o : null;
        while (true) {
            String g10 = tVar2.g();
            if (g10 == null) {
                return new d(arrayList, arrayList2);
            }
            if (g10.startsWith("Format:")) {
                bVar2 = b.a(g10);
            } else {
                if (g10.startsWith("Dialogue:")) {
                    if (bVar2 == null) {
                        Log.w("SsaDecoder", g10.length() != 0 ? "Skipping dialogue line before complete format: ".concat(g10) : new String("Skipping dialogue line before complete format: "));
                    } else {
                        k8.a.c(g10.startsWith("Dialogue:"));
                        String[] split = g10.substring(9).split(",", bVar2.f8832e);
                        if (split.length != bVar2.f8832e) {
                            Log.w("SsaDecoder", g10.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(g10) : new String("Skipping dialogue line with fewer columns than format: "));
                        } else {
                            long o10 = o(split[bVar2.f8829a]);
                            if (o10 == -9223372036854775807L) {
                                Log.w("SsaDecoder", g10.length() != 0 ? "Skipping invalid timing: ".concat(g10) : new String("Skipping invalid timing: "));
                            } else {
                                long o11 = o(split[bVar2.f8830b]);
                                if (o11 == -9223372036854775807L) {
                                    Log.w("SsaDecoder", g10.length() != 0 ? "Skipping invalid timing: ".concat(g10) : new String("Skipping invalid timing: "));
                                } else {
                                    Map<String, c> map = aVar.f8826p;
                                    c cVar = (map == null || (i19 = bVar2.f8831c) == -1) ? null : map.get(split[i19].trim());
                                    String str = split[bVar2.d];
                                    Matcher matcher = c.b.f8848a.matcher(str);
                                    PointF pointF = null;
                                    int i20 = -1;
                                    while (true) {
                                        tVar = tVar2;
                                        if (matcher.find()) {
                                            String group = matcher.group(1);
                                            Objects.requireNonNull(group);
                                            try {
                                                PointF a10 = c.b.a(group);
                                                if (a10 != null) {
                                                    pointF = a10;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                Matcher matcher2 = c.b.d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    Objects.requireNonNull(group2);
                                                    i18 = c.a(group2);
                                                } else {
                                                    i18 = -1;
                                                }
                                                if (i18 != -1) {
                                                    i20 = i18;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            tVar2 = tVar;
                                        } else {
                                            String replace = c.b.f8848a.matcher(str).replaceAll(BuildConfig.FLAVOR).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                            float f13 = aVar.f8827q;
                                            float f14 = aVar.f8828r;
                                            SpannableString spannableString = new SpannableString(replace);
                                            if (cVar != null) {
                                                if (cVar.f8835c != null) {
                                                    bVar = bVar2;
                                                    j10 = o11;
                                                    spannableString.setSpan(new ForegroundColorSpan(cVar.f8835c.intValue()), 0, spannableString.length(), 33);
                                                } else {
                                                    bVar = bVar2;
                                                    j10 = o11;
                                                }
                                                float f15 = cVar.d;
                                                if (f15 == -3.4028235E38f || f14 == -3.4028235E38f) {
                                                    f11 = -3.4028235E38f;
                                                    i15 = IntCompanionObject.MIN_VALUE;
                                                } else {
                                                    f11 = f15 / f14;
                                                    i15 = 1;
                                                }
                                                boolean z11 = cVar.f8836e;
                                                if (z11 && cVar.f8837f) {
                                                    i16 = 0;
                                                    f12 = f11;
                                                    i17 = 33;
                                                    spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                                } else {
                                                    f12 = f11;
                                                    i16 = 0;
                                                    i17 = 33;
                                                    if (z11) {
                                                        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                    } else if (cVar.f8837f) {
                                                        spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                    }
                                                }
                                                if (cVar.f8838g) {
                                                    spannableString.setSpan(new UnderlineSpan(), i16, spannableString.length(), i17);
                                                }
                                                if (cVar.f8839h) {
                                                    spannableString.setSpan(new StrikethroughSpan(), i16, spannableString.length(), i17);
                                                }
                                                i11 = -1;
                                                i12 = i15;
                                                f10 = f12;
                                            } else {
                                                bVar = bVar2;
                                                j10 = o11;
                                                i11 = -1;
                                                i12 = IntCompanionObject.MIN_VALUE;
                                                f10 = -3.4028235E38f;
                                            }
                                            if (i20 == i11) {
                                                i20 = cVar != null ? cVar.f8834b : i11;
                                            }
                                            switch (i20) {
                                                case 0:
                                                default:
                                                    Log.w("SsaDecoder", android.support.v4.media.b.e(30, "Unknown alignment: ", i20));
                                                case -1:
                                                    alignment = null;
                                                    break;
                                                case 1:
                                                case 4:
                                                case 7:
                                                    alignment = Layout.Alignment.ALIGN_NORMAL;
                                                    break;
                                                case 2:
                                                case 5:
                                                case 8:
                                                    alignment = Layout.Alignment.ALIGN_CENTER;
                                                    break;
                                                case 3:
                                                case 6:
                                                case 9:
                                                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                    break;
                                            }
                                            Layout.Alignment alignment2 = alignment;
                                            switch (i20) {
                                                case 0:
                                                default:
                                                    Log.w("SsaDecoder", android.support.v4.media.b.e(30, "Unknown alignment: ", i20));
                                                case -1:
                                                    i13 = IntCompanionObject.MIN_VALUE;
                                                    break;
                                                case 1:
                                                case 4:
                                                case 7:
                                                    i13 = 0;
                                                    break;
                                                case 2:
                                                case 5:
                                                case 8:
                                                    i13 = 1;
                                                    break;
                                                case 3:
                                                case 6:
                                                case 9:
                                                    i13 = 2;
                                                    break;
                                            }
                                            switch (i20) {
                                                case 0:
                                                default:
                                                    Log.w("SsaDecoder", android.support.v4.media.b.e(30, "Unknown alignment: ", i20));
                                                case -1:
                                                    i14 = IntCompanionObject.MIN_VALUE;
                                                    break;
                                                case 1:
                                                case 2:
                                                case 3:
                                                    i14 = 2;
                                                    break;
                                                case 4:
                                                case 5:
                                                case 6:
                                                    i14 = 1;
                                                    break;
                                                case 7:
                                                case 8:
                                                case 9:
                                                    i14 = 0;
                                                    break;
                                            }
                                            if (pointF == null || f14 == -3.4028235E38f || f13 == -3.4028235E38f) {
                                                m10 = m(i13);
                                                m11 = m(i14);
                                            } else {
                                                m10 = pointF.x / f13;
                                                m11 = pointF.y / f14;
                                            }
                                            y7.a aVar2 = new y7.a(spannableString, alignment2, null, null, m11, 0, i14, m10, i13, i12, f10, -3.4028235E38f, -3.4028235E38f, false, -16777216, IntCompanionObject.MIN_VALUE, 0.0f, null);
                                            int l10 = l(j10, arrayList2, arrayList);
                                            for (int l11 = l(o10, arrayList2, arrayList); l11 < l10; l11++) {
                                                ((List) arrayList.get(l11)).add(aVar2);
                                            }
                                            aVar = this;
                                            bVar2 = bVar;
                                            tVar2 = tVar;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                tVar = tVar2;
                bVar = bVar2;
                aVar = this;
                bVar2 = bVar;
                tVar2 = tVar;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(k8.t r26) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.a.n(k8.t):void");
    }
}
