package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: c  reason: collision with root package name */
    public e f637c;

    /* renamed from: f  reason: collision with root package name */
    public int f638f = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f639j;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f640m;
    public final LayoutInflater n;

    /* renamed from: t  reason: collision with root package name */
    public final int f641t;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f640m = z10;
        this.n = layoutInflater;
        this.f637c = eVar;
        this.f641t = i10;
        a();
    }

    public void a() {
        e eVar = this.f637c;
        g gVar = eVar.f661v;
        if (gVar != null) {
            eVar.i();
            ArrayList<g> arrayList = eVar.f650j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayList.get(i10) == gVar) {
                    this.f638f = i10;
                    return;
                }
            }
        }
        this.f638f = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public g getItem(int i10) {
        ArrayList<g> l10;
        if (this.f640m) {
            e eVar = this.f637c;
            eVar.i();
            l10 = eVar.f650j;
        } else {
            l10 = this.f637c.l();
        }
        int i11 = this.f638f;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return l10.get(i10);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> l10;
        if (this.f640m) {
            e eVar = this.f637c;
            eVar.i();
            l10 = eVar.f650j;
        } else {
            l10 = this.f637c.l();
        }
        return this.f638f < 0 ? l10.size() : l10.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.n.inflate(this.f641t, viewGroup, false);
        }
        int i11 = getItem(i10).f668b;
        int i12 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f637c.m() && i11 != (i12 >= 0 ? getItem(i12).f668b : i11));
        j.a aVar = (j.a) view;
        if (this.f639j) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
