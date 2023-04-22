package g;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import g.b;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class d extends b {
    public a D;
    public boolean E;

    /* loaded from: classes.dex */
    public static class a extends b.c {
        public int[][] J;

        public a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[this.f9670g.length];
            }
        }

        @Override // g.b.c
        public void e() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        public int g(int[] iArr) {
            int[][] iArr2 = this.J;
            int i10 = this.f9671h;
            for (int i11 = 0; i11 < i10; i11++) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new d(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

    public d(a aVar) {
    }

    public d(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // g.b
    public void e(b.c cVar) {
        this.f9655c = cVar;
        int i10 = this.f9660u;
        if (i10 >= 0) {
            Drawable d = cVar.d(i10);
            this.f9657j = d;
            if (d != null) {
                c(d);
            }
        }
        this.f9658m = null;
        if (cVar instanceof a) {
            this.D = (a) cVar;
        }
    }

    @Override // g.b
    /* renamed from: f */
    public a b() {
        return new a(this.D, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.E) {
            super.mutate();
            this.D.e();
            this.E = true;
        }
        return this;
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int g10 = this.D.g(iArr);
        if (g10 < 0) {
            g10 = this.D.g(StateSet.WILD_CARD);
        }
        if (!d(g10) && !onStateChange) {
            return false;
        }
        return true;
    }
}
