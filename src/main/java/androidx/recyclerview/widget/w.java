package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class w extends y {
    public w(RecyclerView.l lVar) {
        super(lVar, null);
    }

    @Override // androidx.recyclerview.widget.y
    public int b(View view) {
        return this.f3121a.E(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f3121a.D(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f3121a.C(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int e(View view) {
        return this.f3121a.B(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int f() {
        return this.f3121a.n;
    }

    @Override // androidx.recyclerview.widget.y
    public int g() {
        RecyclerView.l lVar = this.f3121a;
        return lVar.n - lVar.N();
    }

    @Override // androidx.recyclerview.widget.y
    public int h() {
        return this.f3121a.N();
    }

    @Override // androidx.recyclerview.widget.y
    public int i() {
        return this.f3121a.f2831l;
    }

    @Override // androidx.recyclerview.widget.y
    public int j() {
        return this.f3121a.f2832m;
    }

    @Override // androidx.recyclerview.widget.y
    public int k() {
        return this.f3121a.M();
    }

    @Override // androidx.recyclerview.widget.y
    public int l() {
        RecyclerView.l lVar = this.f3121a;
        return (lVar.n - lVar.M()) - this.f3121a.N();
    }

    @Override // androidx.recyclerview.widget.y
    public int n(View view) {
        this.f3121a.S(view, true, this.f3123c);
        return this.f3123c.right;
    }

    @Override // androidx.recyclerview.widget.y
    public int o(View view) {
        this.f3121a.S(view, true, this.f3123c);
        return this.f3123c.left;
    }

    @Override // androidx.recyclerview.widget.y
    public void p(int i10) {
        this.f3121a.W(i10);
    }
}
