package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f2044c;

    /* renamed from: f  reason: collision with root package name */
    public TabHost.OnTabChangeListener f2045f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2046j;

    /* loaded from: classes.dex */
    public static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0028a();

        /* renamed from: c  reason: collision with root package name */
        public String f2047c;

        /* renamed from: androidx.fragment.app.FragmentTabHost$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0028a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(Parcel parcel) {
            super(parcel);
            this.f2047c = parcel.readString();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("FragmentTabHost.SavedState{");
            m10.append(Integer.toHexString(System.identityHashCode(this)));
            m10.append(" curTab=");
            return android.support.v4.media.b.m(m10, this.f2047c, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f2047c);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2044c = new ArrayList<>();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    public final i0 a(String str, i0 i0Var) {
        if (this.f2044c.size() <= 0) {
            return null;
        }
        Objects.requireNonNull(this.f2044c.get(0));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        if (this.f2044c.size() > 0) {
            Objects.requireNonNull(this.f2044c.get(0));
            throw null;
        }
        this.f2046j = true;
        a(currentTabTag, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2046j = false;
    }

    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCurrentTabByTag(aVar.f2047c);
    }

    @Override // android.view.View
    @Deprecated
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f2047c = getCurrentTabTag();
        return aVar;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(String str) {
        i0 a10;
        if (this.f2046j && (a10 = a(str, null)) != null) {
            a10.d();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f2045f;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f2045f = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
