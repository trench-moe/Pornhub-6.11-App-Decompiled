package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import com.app.pornhub.R;
import l.InterfaceC0186;
import n0.x;

/* loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f7513u = {16842912};

    /* renamed from: m  reason: collision with root package name */
    public boolean f7514m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public boolean f7515t;

    /* loaded from: classes.dex */
    public class a extends n0.a {
        public a() {
        }

        @Override // n0.a
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            this.f13090a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // n0.a
        public void d(View view, o0.b bVar) {
            this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
            bVar.f13479a.setCheckable(CheckableImageButton.this.n);
            bVar.f13479a.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends s0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public boolean f7516j;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7516j = parcel.readInt() == 1;
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f14775c, i10);
            parcel.writeInt(this.f7516j ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.n = true;
        this.f7515t = true;
        x.v(this, new a());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7514m;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.f7514m) {
            int[] iArr = f7513u;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f14775c);
        setChecked(bVar.f7516j);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f7516j = this.f7514m;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.n != z10) {
            this.n = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.n && this.f7514m != z10) {
            this.f7514m = z10;
            refreshDrawableState();
            sendAccessibilityEvent(InterfaceC0186.f43);
        }
    }

    public void setPressable(boolean z10) {
        this.f7515t = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f7515t) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f7514m);
    }
}
