package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.app.pornhub.R;
import i8.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: c  reason: collision with root package name */
    public final CheckedTextView f6581c;

    /* renamed from: f  reason: collision with root package name */
    public final CheckedTextView f6582f;

    /* renamed from: j  reason: collision with root package name */
    public final SparseArray<e.f> f6583j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6584m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public p f6585t;

    /* renamed from: u  reason: collision with root package name */
    public w7.o f6586u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f6587w;

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            if (view == trackSelectionView.f6581c) {
                trackSelectionView.f6587w = true;
                trackSelectionView.f6583j.clear();
            } else if (view != trackSelectionView.f6582f) {
                trackSelectionView.f6587w = false;
                Object tag = view.getTag();
                Objects.requireNonNull(tag);
                trackSelectionView.f6583j.get(((c) tag).f6589a);
                Objects.requireNonNull(null);
                throw null;
            } else {
                trackSelectionView.f6587w = false;
                trackSelectionView.f6583j.clear();
            }
            trackSelectionView.a();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f6589a;
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        this.f6583j = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        b bVar = new b(null);
        this.f6585t = new com.google.android.exoplayer2.ui.c(getResources());
        this.f6586u = w7.o.f16943m;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f6581c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f6582f = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    public final void a() {
        this.f6581c.setChecked(this.f6587w);
        this.f6582f.setChecked(!this.f6587w && this.f6583j.size() == 0);
        throw null;
    }

    public final void b() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 3) {
                this.f6581c.setEnabled(false);
                this.f6582f.setEnabled(false);
                return;
            }
            removeViewAt(childCount);
        }
    }

    public boolean getIsDisabled() {
        return this.f6587w;
    }

    public List<e.f> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f6583j.size());
        for (int i10 = 0; i10 < this.f6583j.size(); i10++) {
            arrayList.add(this.f6583j.valueAt(i10));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f6584m != z10) {
            this.f6584m = z10;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.n != z10) {
            this.n = z10;
            if (!z10 && this.f6583j.size() > 1) {
                for (int size = this.f6583j.size() - 1; size > 0; size--) {
                    this.f6583j.remove(size);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f6581c.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(p pVar) {
        Objects.requireNonNull(pVar);
        this.f6585t = pVar;
        b();
    }
}
