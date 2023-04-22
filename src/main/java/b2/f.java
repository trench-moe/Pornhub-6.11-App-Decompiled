package b2;

import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<Layer>> f3450c;
    public Map<String, m> d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, g2.b> f3451e;

    /* renamed from: f  reason: collision with root package name */
    public List<g2.g> f3452f;

    /* renamed from: g  reason: collision with root package name */
    public p.h<g2.c> f3453g;

    /* renamed from: h  reason: collision with root package name */
    public p.d<Layer> f3454h;

    /* renamed from: i  reason: collision with root package name */
    public List<Layer> f3455i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f3456j;

    /* renamed from: k  reason: collision with root package name */
    public float f3457k;

    /* renamed from: l  reason: collision with root package name */
    public float f3458l;

    /* renamed from: m  reason: collision with root package name */
    public float f3459m;
    public boolean n;

    /* renamed from: a  reason: collision with root package name */
    public final u f3448a = new u();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<String> f3449b = new HashSet<>();

    /* renamed from: o  reason: collision with root package name */
    public int f3460o = 0;

    public void a(String str) {
        m2.c.a(str);
        this.f3449b.add(str);
    }

    public float b() {
        return (c() / this.f3459m) * 1000.0f;
    }

    public float c() {
        return this.f3458l - this.f3457k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (r4.substring(0, r4.length() - 1).equalsIgnoreCase(r11) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g2.g d(java.lang.String r11) {
        /*
            r10 = this;
            r7 = r10
            java.util.List<g2.g> r0 = r7.f3452f
            r9 = 6
            int r0 = r0.size()
            r1 = 0
            r9 = 3
            r9 = 0
            r2 = r9
        Lc:
            if (r2 >= r0) goto L4a
            java.util.List<g2.g> r3 = r7.f3452f
            java.lang.Object r9 = r3.get(r2)
            r3 = r9
            g2.g r3 = (g2.g) r3
            java.lang.String r4 = r3.f9716a
            boolean r4 = r4.equalsIgnoreCase(r11)
            r5 = 1
            if (r4 == 0) goto L21
            goto L43
        L21:
            java.lang.String r4 = r3.f9716a
            r9 = 4
            java.lang.String r6 = "\r"
            r9 = 6
            boolean r9 = r4.endsWith(r6)
            r4 = r9
            if (r4 == 0) goto L41
            r9 = 5
            java.lang.String r4 = r3.f9716a
            int r6 = r4.length()
            int r6 = r6 - r5
            java.lang.String r4 = r4.substring(r1, r6)
            boolean r4 = r4.equalsIgnoreCase(r11)
            if (r4 == 0) goto L41
            goto L43
        L41:
            r9 = 0
            r5 = r9
        L43:
            if (r5 == 0) goto L47
            r9 = 4
            return r3
        L47:
            int r2 = r2 + 1
            goto Lc
        L4a:
            r9 = 0
            r11 = r9
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.f.d(java.lang.String):g2.g");
    }

    public Layer e(long j10) {
        return this.f3454h.g(j10, null);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (Layer layer : this.f3455i) {
            sb2.append(layer.a("\t"));
        }
        return sb2.toString();
    }
}
