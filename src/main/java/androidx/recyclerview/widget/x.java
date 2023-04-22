package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class x extends y {
    public x(RecyclerView.l lVar) {
        super(lVar, null);
    }

    @Override // androidx.recyclerview.widget.y
    public int b(View view) {
        return this.f3121a.A(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f3121a.C(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f3121a.D(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int e(View view) {
        return this.f3121a.F(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.y
    public int f() {
        return this.f3121a.f2833o;
    }

    @Override // androidx.recyclerview.widget.y
    public int g() {
        RecyclerView.l lVar = this.f3121a;
        return lVar.f2833o - lVar.L();
    }

    @Override // androidx.recyclerview.widget.y
    public int h() {
        return this.f3121a.L();
    }

    @Override // androidx.recyclerview.widget.y
    public int i() {
        return this.f3121a.f2832m;
    }

    @Override // androidx.recyclerview.widget.y
    public int j() {
        return this.f3121a.f2831l;
    }

    @Override // androidx.recyclerview.widget.y
    public int k() {
        return this.f3121a.O();
    }

    @Override // androidx.recyclerview.widget.y
    public int l() {
        RecyclerView.l lVar = this.f3121a;
        return (lVar.f2833o - lVar.O()) - this.f3121a.L();
    }

    @Override // androidx.recyclerview.widget.y
    public int n(View view) {
        this.f3121a.S(view, true, this.f3123c);
        return this.f3123c.bottom;
    }

    @Override // androidx.recyclerview.widget.y
    public int o(View view) {
        this.f3121a.S(view, true, this.f3123c);
        return this.f3123c.top;
    }

    @Override // androidx.recyclerview.widget.y
    public void p(int i10) {
        this.f3121a.X(i10);
    }
}
