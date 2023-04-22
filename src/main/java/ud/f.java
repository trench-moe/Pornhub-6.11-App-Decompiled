package ud;

import cz.msebera.android.httpclient.HttpVersion;
import cz.msebera.android.httpclient.ProtocolVersion;
import cz.msebera.android.httpclient.message.BasicStatusLine;
import java.util.Locale;
import md.p;
import md.r;

/* loaded from: classes2.dex */
public class f extends a implements md.l {

    /* renamed from: b  reason: collision with root package name */
    public r f15859b;

    /* renamed from: c  reason: collision with root package name */
    public ProtocolVersion f15860c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public String f15861e;

    /* renamed from: f  reason: collision with root package name */
    public pd.a f15862f;

    /* renamed from: g  reason: collision with root package name */
    public final p f15863g;

    /* renamed from: h  reason: collision with root package name */
    public Locale f15864h;

    public f(r rVar, p pVar, Locale locale) {
        this.f15859b = rVar;
        BasicStatusLine basicStatusLine = (BasicStatusLine) rVar;
        this.f15860c = basicStatusLine.a();
        this.d = basicStatusLine.b();
        this.f15861e = basicStatusLine.c();
        this.f15863g = pVar;
        this.f15864h = locale;
    }

    @Override // md.h
    public ProtocolVersion a() {
        return this.f15860c;
    }

    @Override // md.l
    public pd.a b() {
        return this.f15862f;
    }

    @Override // md.l
    public void c(pd.a aVar) {
        this.f15862f = aVar;
    }

    @Override // md.l
    public r g() {
        if (this.f15859b == null) {
            ProtocolVersion protocolVersion = this.f15860c;
            if (protocolVersion == null) {
                protocolVersion = HttpVersion.f8582j;
            }
            int i10 = this.d;
            String str = this.f15861e;
            if (str == null) {
                p pVar = this.f15863g;
                if (pVar != null) {
                    Locale locale = this.f15864h;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    str = pVar.a(i10, locale);
                } else {
                    str = null;
                }
            }
            this.f15859b = new BasicStatusLine(protocolVersion, i10, str);
        }
        return this.f15859b;
    }

    @Override // md.l
    public void h(int i10) {
        l9.e.j(i10, "Status code");
        this.f15859b = null;
        this.d = i10;
        this.f15861e = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g());
        sb2.append(' ');
        sb2.append(this.f15849a);
        if (this.f15862f != null) {
            sb2.append(' ');
            sb2.append(this.f15862f);
        }
        return sb2.toString();
    }
}
