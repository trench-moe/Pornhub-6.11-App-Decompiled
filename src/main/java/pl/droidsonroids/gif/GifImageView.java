package pl.droidsonroids.gif;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import pl.droidsonroids.gif.d;

/* loaded from: classes3.dex */
public class GifImageView extends ImageView {

    /* renamed from: c  reason: collision with root package name */
    public boolean f14095c;

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d.a b10 = d.b(this, attributeSet, 0, 0);
        this.f14095c = b10.f14126a;
        int i10 = b10.f14125c;
        if (i10 > 0) {
            super.setImageResource(i10);
        }
        int i11 = b10.d;
        if (i11 > 0) {
            super.setBackgroundResource(i11);
        }
    }

    public GifImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d.a b10 = d.b(this, attributeSet, i10, 0);
        this.f14095c = b10.f14126a;
        int i11 = b10.f14125c;
        if (i11 > 0) {
            super.setImageResource(i11);
        }
        int i12 = b10.d;
        if (i12 > 0) {
            super.setBackgroundResource(i12);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        cVar.a(getDrawable(), 0);
        cVar.a(getBackground(), 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new c(super.onSaveInstanceState(), this.f14095c ? getDrawable() : null, this.f14095c ? getBackground() : null);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (d.d(this, false, i10)) {
            return;
        }
        super.setBackgroundResource(i10);
    }

    public void setFreezesAnimation(boolean z10) {
        this.f14095c = z10;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (d.d(this, true, i10)) {
            return;
        }
        super.setImageResource(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (d.c(this, uri)) {
            return;
        }
        super.setImageURI(uri);
    }
}
