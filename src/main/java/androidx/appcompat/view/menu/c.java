package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import com.app.pornhub.R;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class c implements i, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public Context f630c;

    /* renamed from: f  reason: collision with root package name */
    public LayoutInflater f631f;

    /* renamed from: j  reason: collision with root package name */
    public e f632j;

    /* renamed from: m  reason: collision with root package name */
    public ExpandedMenuView f633m;
    public i.a n;

    /* renamed from: t  reason: collision with root package name */
    public a f634t;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: c  reason: collision with root package name */
        public int f635c = -1;

        public a() {
            a();
        }

        public void a() {
            e eVar = c.this.f632j;
            g gVar = eVar.f661v;
            if (gVar != null) {
                eVar.i();
                ArrayList<g> arrayList = eVar.f650j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayList.get(i10) == gVar) {
                        this.f635c = i10;
                        return;
                    }
                }
            }
            this.f635c = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public g getItem(int i10) {
            e eVar = c.this.f632j;
            eVar.i();
            ArrayList<g> arrayList = eVar.f650j;
            Objects.requireNonNull(c.this);
            int i11 = i10 + 0;
            int i12 = this.f635c;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayList.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            e eVar = c.this.f632j;
            eVar.i();
            int size = eVar.f650j.size();
            Objects.requireNonNull(c.this);
            int i10 = size + 0;
            return this.f635c < 0 ? i10 : i10 - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = c.this.f631f.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((j.a) view).d(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this.f630c = context;
        this.f631f = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.i
    public int a() {
        return 0;
    }

    public ListAdapter b() {
        if (this.f634t == null) {
            this.f634t = new a();
        }
        return this.f634t;
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(e eVar, boolean z10) {
        i.a aVar = this.n;
        if (aVar != null) {
            aVar.d(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void e(boolean z10) {
        a aVar = this.f634t;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void i(i.a aVar) {
        this.n = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Context context, e eVar) {
        if (this.f630c != null) {
            this.f630c = context;
            if (this.f631f == null) {
                this.f631f = LayoutInflater.from(context);
            }
        }
        this.f632j = eVar;
        a aVar = this.f634t;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void k(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f633m.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean m(l lVar) {
        if (lVar.hasVisibleItems()) {
            f fVar = new f(lVar);
            b.a aVar = new b.a(lVar.f642a);
            c cVar = new c(aVar.getContext(), R.layout.abc_list_menu_item_layout);
            fVar.f666j = cVar;
            cVar.n = fVar;
            e eVar = fVar.f664c;
            eVar.b(cVar, eVar.f642a);
            ListAdapter b10 = fVar.f666j.b();
            AlertController.b bVar = aVar.f496a;
            bVar.n = b10;
            bVar.f488o = fVar;
            View view = lVar.f654o;
            if (view != null) {
                bVar.f479e = view;
            } else {
                bVar.f478c = lVar.n;
                aVar.setTitle(lVar.f653m);
            }
            aVar.f496a.f487m = fVar;
            androidx.appcompat.app.b create = aVar.create();
            fVar.f665f = create;
            create.setOnDismissListener(fVar);
            WindowManager.LayoutParams attributes = fVar.f665f.getWindow().getAttributes();
            attributes.type = 1003;
            attributes.flags |= 131072;
            fVar.f665f.show();
            i.a aVar2 = this.n;
            if (aVar2 != null) {
                aVar2.e(lVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable n() {
        if (this.f633m == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f633m;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f632j.r(this.f634t.getItem(i10), this, 0);
    }
}
