package d0;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Shader f8593a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f8594b;

    /* renamed from: c  reason: collision with root package name */
    public int f8595c;

    public c(Shader shader, ColorStateList colorStateList, int i10) {
        this.f8593a = shader;
        this.f8594b = colorStateList;
        this.f8595c = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01dc, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static d0.c a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.c.a(android.content.res.Resources, int, android.content.res.Resources$Theme):d0.c");
    }

    public boolean b() {
        return this.f8593a != null;
    }

    public boolean c() {
        ColorStateList colorStateList;
        return this.f8593a == null && (colorStateList = this.f8594b) != null && colorStateList.isStateful();
    }

    public boolean d(int[] iArr) {
        if (c()) {
            ColorStateList colorStateList = this.f8594b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f8595c) {
                this.f8595c = colorForState;
                return true;
            }
        }
        return false;
    }
}
