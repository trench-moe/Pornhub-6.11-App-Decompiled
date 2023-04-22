package od;

/* loaded from: classes2.dex */
public class a implements Cloneable {

    /* renamed from: j  reason: collision with root package name */
    public static final a f13635j = new a(-1, -1);

    /* renamed from: c  reason: collision with root package name */
    public final int f13636c;

    /* renamed from: f  reason: collision with root package name */
    public final int f13637f;

    public a(int i10, int i11) {
        this.f13636c = i10;
        this.f13637f = i11;
    }

    public Object clone() {
        return (a) super.clone();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("[maxLineLength=");
        m10.append(this.f13636c);
        m10.append(", maxHeaderCount=");
        return android.support.v4.media.a.j(m10, this.f13637f, "]");
    }
}
