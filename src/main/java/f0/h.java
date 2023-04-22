package f0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class h extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f9350a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f9351b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f9352c;
    public PorterDuff.Mode d;

    public h(h hVar) {
        this.f9352c = null;
        this.d = f.f9343u;
        if (hVar != null) {
            this.f9350a = hVar.f9350a;
            this.f9351b = hVar.f9351b;
            this.f9352c = hVar.f9352c;
            this.d = hVar.d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10 = this.f9350a;
        Drawable.ConstantState constantState = this.f9351b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new g(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new g(this, resources);
    }
}
