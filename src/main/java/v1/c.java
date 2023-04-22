package v1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class c extends f implements Animatable {

    /* renamed from: f  reason: collision with root package name */
    public b f15926f;

    /* renamed from: j  reason: collision with root package name */
    public Context f15927j;

    /* renamed from: m  reason: collision with root package name */
    public ArgbEvaluator f15928m;
    public final Drawable.Callback n;

    /* loaded from: classes2.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f15930a;

        /* renamed from: b  reason: collision with root package name */
        public g f15931b;

        /* renamed from: c  reason: collision with root package name */
        public AnimatorSet f15932c;
        public ArrayList<Animator> d;

        /* renamed from: e  reason: collision with root package name */
        public p.a<Animator, String> f15933e;

        public b(b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f15930a = bVar.f15930a;
                g gVar = bVar.f15931b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    if (resources != null) {
                        this.f15931b = (g) constantState.newDrawable(resources);
                    } else {
                        this.f15931b = (g) constantState.newDrawable();
                    }
                    g gVar2 = this.f15931b;
                    gVar2.mutate();
                    this.f15931b = gVar2;
                    gVar2.setCallback(callback);
                    this.f15931b.setBounds(bVar.f15931b.getBounds());
                    this.f15931b.f15942t = false;
                }
                ArrayList<Animator> arrayList = bVar.d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.d = new ArrayList<>(size);
                    this.f15933e = new p.a<>(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = bVar.d.get(i10);
                        Animator clone = animator.clone();
                        String orDefault = bVar.f15933e.getOrDefault(animator, null);
                        clone.setTarget(this.f15931b.f15939f.f15987b.f15985p.getOrDefault(orDefault, null));
                        this.d.add(clone);
                        this.f15933e.put(clone, orDefault);
                    }
                    if (this.f15932c == null) {
                        this.f15932c = new AnimatorSet();
                    }
                    this.f15932c.playTogether(this.d);
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f15930a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: v1.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0278c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f15934a;

        public C0278c(Drawable.ConstantState constantState) {
            this.f15934a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f15934a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f15934a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c(null, null, null);
            Drawable newDrawable = this.f15934a.newDrawable();
            cVar.f15937c = newDrawable;
            newDrawable.setCallback(cVar.n);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c(null, null, null);
            Drawable newDrawable = this.f15934a.newDrawable(resources);
            cVar.f15937c = newDrawable;
            newDrawable.setCallback(cVar.n);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c(null, null, null);
            Drawable newDrawable = this.f15934a.newDrawable(resources, theme);
            cVar.f15937c = newDrawable;
            newDrawable.setCallback(cVar.n);
            return cVar;
        }
    }

    public c() {
        this(null, null, null);
    }

    public c(Context context, b bVar, Resources resources) {
        this.f15928m = null;
        a aVar = new a();
        this.n = aVar;
        this.f15927j = context;
        this.f15926f = new b(null, aVar, null);
    }

    @Override // v1.f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f15926f.f15931b.draw(canvas);
        if (this.f15926f.f15932c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getAlpha() : this.f15926f.f15931b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f15926f.f15930a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getColorFilter() : this.f15926f.f15931b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f15937c == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0278c(this.f15937c.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f15926f.f15931b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f15926f.f15931b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.getOpacity() : this.f15926f.f15931b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.c.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.isAutoMirrored() : this.f15926f.f15931b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f15937c;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f15926f.f15932c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.isStateful() : this.f15926f.f15931b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f15926f.f15931b.setBounds(rect);
        }
    }

    @Override // v1.f, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.setLevel(i10) : this.f15926f.f15931b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f15937c;
        return drawable != null ? drawable.setState(iArr) : this.f15926f.f15931b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f15926f.f15931b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
            return;
        }
        g gVar = this.f15926f.f15931b;
        Drawable drawable2 = gVar.f15937c;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(z10);
        } else {
            gVar.f15939f.f15989e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        g gVar = this.f15926f.f15931b;
        Drawable drawable2 = gVar.f15937c;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        gVar.f15941m = colorFilter;
        gVar.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            f0.a.d(drawable, i10);
        } else {
            this.f15926f.f15931b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            f0.a.e(drawable, colorStateList);
        } else {
            this.f15926f.f15931b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            f0.a.f(drawable, mode);
        } else {
            this.f15926f.f15931b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f15926f.f15931b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f15926f.f15932c.isStarted()) {
        } else {
            this.f15926f.f15932c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f15937c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f15926f.f15932c.end();
        }
    }
}
