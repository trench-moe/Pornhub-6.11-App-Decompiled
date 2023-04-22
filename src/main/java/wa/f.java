package wa;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.p0;
import cb.k;
import com.app.pornhub.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import ua.j;

/* loaded from: classes.dex */
public abstract class f extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public final wa.c f17423c;

    /* renamed from: f  reason: collision with root package name */
    public final wa.d f17424f;

    /* renamed from: j  reason: collision with root package name */
    public final e f17425j;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f17426m;
    public MenuInflater n;

    /* renamed from: t  reason: collision with root package name */
    public c f17427t;

    /* renamed from: u  reason: collision with root package name */
    public b f17428u;

    /* loaded from: classes2.dex */
    public class a implements e.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            if (f.this.f17428u == null || menuItem.getItemId() != f.this.getSelectedItemId()) {
                c cVar = f.this.f17427t;
                return (cVar == null || cVar.a(menuItem)) ? false : true;
            }
            f.this.f17428u.a(menuItem);
            return true;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(MenuItem menuItem);
    }

    /* loaded from: classes2.dex */
    public static class d extends s0.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public Bundle f17430j;

        /* loaded from: classes2.dex */
        public static class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17430j = parcel.readBundle(classLoader == null ? d.class.getClassLoader() : classLoader);
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f14775c, i10);
            parcel.writeBundle(this.f17430j);
        }
    }

    public f(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(hb.a.a(context, attributeSet, i10, i11), attributeSet, i10);
        e eVar = new e();
        this.f17425j = eVar;
        Context context2 = getContext();
        p0 e10 = j.e(context2, attributeSet, m9.a.f13008h0, i10, i11, 10, 9);
        wa.c cVar = new wa.c(context2, getClass(), getMaxItemCount());
        this.f17423c = cVar;
        wa.d a10 = a(context2);
        this.f17424f = a10;
        eVar.f17418c = a10;
        eVar.f17420j = 1;
        a10.setPresenter(eVar);
        cVar.b(eVar, cVar.f642a);
        getContext();
        eVar.f17418c.R = cVar;
        if (e10.p(5)) {
            a10.setIconTintList(e10.c(5));
        } else {
            a10.setIconTintList(a10.c(16842808));
        }
        setItemIconSize(e10.f(4, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (e10.p(10)) {
            setItemTextAppearanceInactive(e10.m(10, 0));
        }
        if (e10.p(9)) {
            setItemTextAppearanceActive(e10.m(9, 0));
        }
        if (e10.p(11)) {
            setItemTextColor(e10.c(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            cb.g gVar = new cb.g();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                gVar.r(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            gVar.f3929c.f3939b = new ra.a(context2);
            gVar.C();
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.d.q(this, gVar);
        }
        if (e10.p(7)) {
            setItemPaddingTop(e10.f(7, 0));
        }
        if (e10.p(6)) {
            setItemPaddingBottom(e10.f(6, 0));
        }
        if (e10.p(1)) {
            setElevation(e10.f(1, 0));
        }
        getBackground().mutate().setTintList(za.c.b(context2, e10, 0));
        setLabelVisibilityMode(e10.k(12, -1));
        int m10 = e10.m(3, 0);
        if (m10 != 0) {
            a10.setItemBackgroundRes(m10);
        } else {
            setItemRippleColor(za.c.b(context2, e10, 8));
        }
        int m11 = e10.m(2, 0);
        if (m11 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(m11, m9.a.f13007g0);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(za.c.a(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(k.a(context2, obtainStyledAttributes.getResourceId(4, 0), 0).a());
            obtainStyledAttributes.recycle();
        }
        if (e10.p(13)) {
            int m12 = e10.m(13, 0);
            eVar.f17419f = true;
            getMenuInflater().inflate(m12, cVar);
            eVar.f17419f = false;
            eVar.e(true);
        }
        e10.f1055b.recycle();
        addView(a10);
        cVar.f645e = new a();
    }

    private MenuInflater getMenuInflater() {
        if (this.n == null) {
            this.n = new j.f(getContext());
        }
        return this.n;
    }

    public abstract wa.d a(Context context);

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f17424f.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f17424f.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f17424f.getItemActiveIndicatorMarginHorizontal();
    }

    public k getItemActiveIndicatorShapeAppearance() {
        return this.f17424f.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f17424f.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f17424f.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f17424f.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f17424f.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f17424f.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f17424f.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f17424f.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f17426m;
    }

    public int getItemTextAppearanceActive() {
        return this.f17424f.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f17424f.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f17424f.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f17424f.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f17423c;
    }

    public androidx.appcompat.view.menu.j getMenuView() {
        return this.f17424f;
    }

    public e getPresenter() {
        return this.f17425j;
    }

    public int getSelectedItemId() {
        return this.f17424f.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof cb.g) {
            m9.a.D(this, (cb.g) background);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.f14775c);
        this.f17423c.v(dVar.f17430j);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f17430j = bundle;
        this.f17423c.x(bundle);
        return dVar;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        m9.a.C(this, f10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f17424f.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f17424f.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f17424f.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f17424f.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(k kVar) {
        this.f17424f.setItemActiveIndicatorShapeAppearance(kVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f17424f.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f17424f.setItemBackground(drawable);
        this.f17426m = null;
    }

    public void setItemBackgroundResource(int i10) {
        this.f17424f.setItemBackgroundRes(i10);
        this.f17426m = null;
    }

    public void setItemIconSize(int i10) {
        this.f17424f.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f17424f.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f17424f.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f17424f.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f17426m == colorStateList) {
            if (colorStateList != null || this.f17424f.getItemBackground() == null) {
                return;
            }
            this.f17424f.setItemBackground(null);
            return;
        }
        this.f17426m = colorStateList;
        if (colorStateList == null) {
            this.f17424f.setItemBackground(null);
            return;
        }
        this.f17424f.setItemBackground(new RippleDrawable(ab.b.a(colorStateList), null, null));
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f17424f.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f17424f.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f17424f.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f17424f.getLabelVisibilityMode() != i10) {
            this.f17424f.setLabelVisibilityMode(i10);
            this.f17425j.e(false);
        }
    }

    public void setOnItemReselectedListener(b bVar) {
        this.f17428u = bVar;
    }

    public void setOnItemSelectedListener(c cVar) {
        this.f17427t = cVar;
    }

    public void setSelectedItemId(int i10) {
        MenuItem findItem = this.f17423c.findItem(i10);
        if (findItem != null && !this.f17423c.r(findItem, this.f17425j, 0)) {
            findItem.setChecked(true);
        }
    }
}
